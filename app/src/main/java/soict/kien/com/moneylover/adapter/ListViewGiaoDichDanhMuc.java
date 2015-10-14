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

public class ListViewGiaoDichDanhMuc extends BaseAdapter {

    private ArrayList<object> araylist;
    private int layoutId;
    private int subLayoutId;
    private Activity activity;

    public ListViewGiaoDichDanhMuc(ArrayList<object> araylist, int layoutId, int subLayoutId, Activity activity) {
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

        TextView tv_category = (TextView) view.findViewById(R.id.tv_category);
        TextView tv_sum_revenues = (TextView) view.findViewById(R.id.tv_sum_revenues);
        TextView tv_sum_spend = (TextView) view.findViewById(R.id.tv_sum_spend);

        TextView tv_date = (TextView) subView.findViewById(R.id.tv_date);
        TextView tv_form_pay = (TextView) subView.findViewById(R.id.tv_form_pay);
        TextView tv_record = (TextView) subView.findViewById(R.id.tv_record);

        tv_date.setText(araylist.get(i).getDate());
        tv_form_pay.setText(araylist.get(i).getForm_pay());
        tv_record.setText(araylist.get(i).getRevenues());

        tv_category.setText(araylist.get(i).getCategory());
        tv_sum_revenues.setText(araylist.get(i).getSum_revenues());
        tv_sum_spend.setText(araylist.get(i).getSum_spend());

        layout.addView(subView);

        return view;
    }
}
