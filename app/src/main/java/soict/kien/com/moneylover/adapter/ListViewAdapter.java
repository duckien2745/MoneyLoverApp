package soict.kien.com.moneylover.adapter;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

import soict.kien.com.moneylover.R;
import soict.kien.com.moneylover.object.object;

/**
 * Created by DucKien2745 on 10/5/2015.
 */
public class ListViewAdapter extends BaseAdapter {

    private ArrayList<object> araylist;
    private int layoutId;
    private Activity activity;

    private TextView tv_category;
    private TextView tv_sum_targets;
    private TextView tv_sum_record;
    private TextView tv_date;
    private TextView tv_form_pay;
    private TextView tv_record;

    public ListViewAdapter(ArrayList<object> araylist, int layoutId, Activity activity) {
        this.araylist = araylist;
        this.layoutId = layoutId;
        this.activity = activity;
    }

    @Override
    public int getCount() {
        return araylist.size();
    }

    @Override
    public Object getItem(int i) {
        return araylist.get(i);
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

        tv_category = (TextView) view.findViewById(R.id.tv_category);
        tv_sum_record = (TextView) view.findViewById(R.id.tv_sun_record);
        tv_sum_targets = (TextView) view.findViewById(R.id.tv_sum_targexts);

        tv_date = (TextView) view.findViewById(R.id.tv_date);
        tv_form_pay = (TextView) view.findViewById(R.id.tv_form_pay1);
        tv_record = (TextView) view.findViewById(R.id.tv_record);

        tv_category.setText(araylist.get(i).getCategory());
        tv_sum_record.setText(araylist.get(i).getSum_record());
        tv_sum_targets.setText(araylist.get(i).getSum_targets());

        tv_date.setText(araylist.get(i).getDate());
        tv_form_pay.setText(araylist.get(i).getForm_pay());
        tv_record.setText(araylist.get(i).getRecord());

        return view;
    }
}
