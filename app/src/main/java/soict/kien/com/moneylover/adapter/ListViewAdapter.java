package soict.kien.com.moneylover.adapter;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

import soict.kien.com.moneylover.R;
import soict.kien.com.moneylover.object.object;

public class ListViewAdapter extends BaseAdapter {

    private ArrayList<object> araylist;
    private int layoutId;
    private int subLayoutId;
    private Activity activity;

    private TextView tv_category;
    private TextView tv_sum_targets;
    private TextView tv_sum_record;
    private TextView tv_date;
    private TextView tv_form_pay;
    private TextView tv_record;

    public ListViewAdapter(ArrayList<object> araylist, int layoutId, int subLayoutId, Activity activity) {
        this.araylist = araylist;
        this.layoutId = layoutId;
        this.subLayoutId = subLayoutId;
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

        View subView = activity.getLayoutInflater().inflate(subLayoutId, null);

        LinearLayout layout = (LinearLayout) view.findViewById(R.id.item_lvGiaodich_Danhmuc);

        tv_category = (TextView) view.findViewById(R.id.tv_category);
        tv_sum_record = (TextView) view.findViewById(R.id.tv_sum_record);
        tv_sum_targets = (TextView) view.findViewById(R.id.tv_sum_targexts);

        tv_date = (TextView) subView.findViewById(R.id.tv_date);
        tv_form_pay = (TextView) subView.findViewById(R.id.tv_form_pay);
        tv_record = (TextView) subView.findViewById(R.id.tv_record);

        tv_date.setText(araylist.get(i).getDate());
        tv_form_pay.setText(araylist.get(i).getForm_pay());
        tv_record.setText(araylist.get(i).getRecord());

        tv_category.setText(araylist.get(i).getCategory());
        tv_sum_record.setText(araylist.get(i).getSum_record());
        tv_sum_targets.setText(araylist.get(i).getSum_targets());

        layout.addView(subView);

        return view;
    }
}
