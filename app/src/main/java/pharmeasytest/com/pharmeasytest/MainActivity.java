package pharmeasytest.com.pharmeasytest;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;
import android.widget.RelativeLayout;

import com.nostra13.universalimageloader.core.ImageLoader;
import com.nostra13.universalimageloader.core.ImageLoaderConfiguration;

import java.util.ArrayList;

import pharmeasytest.com.pharmeasytest.Model.ApiResponse;
import pharmeasytest.com.pharmeasytest.Model.CategoryModel;
import pharmeasytest.com.pharmeasytest.Model.PostModel;
import pharmeasytest.com.pharmeasytest.RestApi.ApiInterface;
import pharmeasytest.com.pharmeasytest.RestApi.RestApiClient;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends FragmentActivity {

    DrawerLayout mDrawerLayout;
    RelativeLayout mDrawerPane;
    ListView mDrawerList;
    Button openNavigation;
    ArrayList<CategoryModel> categoryModelArrayList;
    ActionBarDrawerToggle mDrawerToggle;

    boolean isDrawerOpen = false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageLoaderConfiguration config = new ImageLoaderConfiguration.Builder(this)
                .build();
        ImageLoader.getInstance().init(config);
        openNavigation = (Button) findViewById(R.id.openNavigation);

        // DrawerLayout
        mDrawerLayout = (DrawerLayout) findViewById(R.id.drawerLayout);

        // Populate the Navigtion Drawer with options
        mDrawerPane = (RelativeLayout) findViewById(R.id.drawerPane);
        mDrawerList = (ListView) findViewById(R.id.navList);

        final ApiInterface apiService =
                RestApiClient.getClient().create(ApiInterface.class);

        Call<ApiResponse> call = apiService.getGeo();
        call.enqueue(new Callback<ApiResponse>() {
            @Override
            public void onResponse(Call<ApiResponse> call, Response<ApiResponse> response) {
                ArrayList<PostModel> responseList = response.body().getPostModelList();

                if (responseList == null) {

                    final AlertDialog alertDialog = new AlertDialog.Builder(
                            MainActivity.this).create();

                    alertDialog.setTitle("Alert Dialog");
                    alertDialog.setMessage("Something went wrong while fetching data");
                    alertDialog.setButton("OK", new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int which) {
                            alertDialog.dismiss();
                        }
                    });

                    alertDialog.show();
                } else {
//                    Now you use the data to display wherever you want.
                    NewsFragment newsFragment = new NewsFragment();
                    newsFragment.setPostModelArrayList(responseList);
                    getSupportFragmentManager().beginTransaction().
                            add(R.id.childContent, newsFragment, "NewsFragmentTag").addToBackStack("news").
                            commit();
                    categoryModelArrayList = responseList.get(0).getCategoryModel();
                    DrawerListAdapter adapter = new DrawerListAdapter(MainActivity.this, categoryModelArrayList);
                    mDrawerList.setAdapter(adapter);

                }
            }

            @Override
            public void onFailure(Call<ApiResponse> call, Throwable t) {
                System.out.println("hi th eds");
            }
        });

        openNavigation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                toggleMenu();
            }
        });


        // Drawer Item click listeners
        mDrawerList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                selectItemFromDrawer(position);
            }
        });

        mDrawerToggle = new ActionBarDrawerToggle(this, mDrawerLayout, R.string.drawer_open, R.string.drawer_close) {
            @Override
            public void onDrawerOpened(View drawerView) {
                super.onDrawerOpened(drawerView);
                isDrawerOpen = true;
                invalidateOptionsMenu();
            }

            @Override
            public void onDrawerClosed(View drawerView) {
                super.onDrawerClosed(drawerView);
                isDrawerOpen = false;
                invalidateOptionsMenu();
            }
        };

        mDrawerLayout.setDrawerListener(mDrawerToggle);


    }

    public void toggleMenu() {
            mDrawerLayout.openDrawer(GravityCompat.START);
    }


    private void selectItemFromDrawer(int position) {
        CategoryDetail categoryDetail = new CategoryDetail();
        categoryDetail.setCategoryDetails(categoryModelArrayList.get(0));

        getSupportFragmentManager().beginTransaction().
                replace(R.id.childContent, categoryDetail, "CategoryDetail").
                commit();

        mDrawerList.setItemChecked(position, true);
        setTitle(categoryModelArrayList.get(position).getTitle());

        // Close the drawer
        mDrawerLayout.closeDrawer(mDrawerPane);
    }

}
