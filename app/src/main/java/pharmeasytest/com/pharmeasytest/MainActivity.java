package pharmeasytest.com.pharmeasytest;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;

import java.util.ArrayList;

import pharmeasytest.com.pharmeasytest.Model.ApiResponse;
import pharmeasytest.com.pharmeasytest.Model.PostModel;
import pharmeasytest.com.pharmeasytest.RestApi.ApiInterface;
import pharmeasytest.com.pharmeasytest.RestApi.RestApiClient;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends FragmentActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


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
                }
            }

            @Override
            public void onFailure(Call<ApiResponse> call, Throwable t) {
                System.out.println("hi th eds");
            }
        });


    }
}
