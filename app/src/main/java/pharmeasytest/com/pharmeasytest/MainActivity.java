package pharmeasytest.com.pharmeasytest;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;

import pharmeasytest.com.pharmeasytest.Fragments.CityFragment;

public class MainActivity extends FragmentActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction().
                    add(R.id.childContent, new CityFragment(), "CityFragmentTag").
                    commit();
        }
    }
}
