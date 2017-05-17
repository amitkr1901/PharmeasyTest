package pharmeasytest.com.pharmeasytest;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

import pharmeasytest.com.pharmeasytest.Model.CategoryModel;

class DrawerListAdapter extends BaseAdapter {

    Context mContext;
    ArrayList<CategoryModel> categoryModelArrayList;

    public DrawerListAdapter(Context context, ArrayList<CategoryModel> categoryModelArrayList) {
        mContext = context;
        this.categoryModelArrayList = categoryModelArrayList;
    }

    @Override
    public int getCount() {
        return categoryModelArrayList.size();
    }

    @Override
    public Object getItem(int position) {
        return categoryModelArrayList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view;

        if (convertView == null) {
            LayoutInflater inflater = (LayoutInflater) mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            view = inflater.inflate(R.layout.drawerlayout, null);
        } else {
            view = convertView;
        }

        TextView categoryTitle = (TextView) view.findViewById(R.id.categoryTitle);

        categoryTitle.setText(categoryModelArrayList.get(position).getTitle());

        return view;
    }
}