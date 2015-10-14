package soict.kien.com.moneylover.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import soict.kien.com.moneylover.R;
import soict.kien.com.moneylover.activity.MainActivity;
import soict.kien.com.moneylover.adapter.ListViewDanhMuc;
import soict.kien.com.moneylover.object.CategoryList;

public class FragmentDanhMuc_Thu extends Fragment {

    private MainActivity activity;
    private CategoryList list;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        activity = (MainActivity) getActivity();
        list = new CategoryList();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_danhmuc_thu, container, false);

        ListView listViewThu = (ListView) view.findViewById(R.id.lv_Danhmuc_Thu);
        ListViewDanhMuc adapter = new ListViewDanhMuc(R.layout.item_danmuc_listview, activity, list.listCategoryThu);
        listViewThu.setAdapter(adapter);

        return view;
    }
}
