package pharmeasytest.com.pharmeasytest;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;

import com.nostra13.universalimageloader.core.ImageLoader;
import com.nostra13.universalimageloader.core.ImageLoaderConfiguration;

public class MainActivity extends FragmentActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageLoaderConfiguration config = new ImageLoaderConfiguration.Builder(this)
        .build();
        ImageLoader.getInstance().init(config);
        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction().
                    add(R.id.childContent, new NewsFragment(), "NewsFragmentTag").
                    commit();
        }


    }
}
