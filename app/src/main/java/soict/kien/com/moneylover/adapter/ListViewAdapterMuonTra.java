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
 * Created by DucKien2745 on 10/9/2015.
 */
public class ListViewAdapterMuonTra extends BaseAdapter {

    private ArrayList<object> araylist;
    private int layoutId;
    private Activity activity;

    private TextView tv_cantra;
    private TextView tv_CanPhaiTra;
    private TextView tv_trangthai;

    public ListViewAdapterMuonTra(ArrayList<object> araylist, int layoutId, Activity activity) {
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
        tv_cantra = (TextView) view.findViewById(R.id.tv_ConLai);
        tv_CanPhaiTra = (TextView) view.findViewById(R.id.tv_CanThu);
        tv_trangthai = (TextView) view.findViewById(R.id.tv_TrangThaiCanThu);

        tv_cantra.setText(araylist.get(i).getSum_revenues());
        tv_CanPhaiTra.setText(araylist.get(i).getSum_revenues());
        tv_trangthai.setText("Đã trả " + araylist.get(i).getSum_spend() + " VND");

        return view;
    }
}
