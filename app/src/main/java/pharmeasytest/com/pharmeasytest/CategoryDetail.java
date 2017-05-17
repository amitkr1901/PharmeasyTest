package pharmeasytest.com.pharmeasytest;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import pharmeasytest.com.pharmeasytest.Model.CategoryModel;

/**
 * Created by amit on 18/05/17.
 */

public class CategoryDetail extends Fragment {

    TextView categoryTitle, categoryDescription;
    CategoryModel categoryModel;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup parent, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.categorydetail, parent, false);
        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        categoryTitle = (TextView) getView().findViewById(R.id.categoryTitle);
        categoryDescription = (TextView) getView().findViewById(R.id.categoryDescription);

        categoryTitle.setText(categoryModel.getTitle());
        categoryDescription.setText(categoryModel.getDescription());


    }

    public void setCategoryDetails(CategoryModel categoryModel) {
        this.categoryModel = categoryModel;
    }
}
