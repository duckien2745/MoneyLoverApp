package soict.kien.com.moneylover.adapter;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

import soict.kien.com.moneylover.R;
import soict.kien.com.moneylover.object.CategoryObj;

/**
 * Created by DucKien2745 on 10/11/2015.
 */
public class ListViewDanhMuc extends BaseAdapter {

    private int layoutId;
    private Activity activity;
    private ArrayList<CategoryObj> list;

    public ListViewDanhMuc(int layoutId, Activity activity, ArrayList<CategoryObj> list) {
        this.layoutId = layoutId;
        this.activity = activity;
        this.list = list;
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int i) {
        return list.get(i);
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            LayoutInflater inflater = activity.getLayoutInflater();
            view = inflater.inflate(layoutId, null);
        }

        ImageView icon = (ImageView) view.findViewById(R.id.ic_danhMuc);
        TextView categoryName = (TextView) view.findViewById(R.id.tv_categoryName);

        icon.setImageResource(list.get(i).getIcon());
        categoryName.setText(list.get(i).getCateggoryName());

        return view;
    }
}
