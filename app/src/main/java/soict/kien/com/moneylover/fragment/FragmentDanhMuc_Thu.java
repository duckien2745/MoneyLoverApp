package soict.kien.com.moneylover.fragment;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
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
        list = new CategoryList();
        Log.d("Log: ", "OnCreate");
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        Log.d("Log: ", "OnCreateView");

        View view = inflater.inflate(R.layout.fragment_danhmuc_thu, container, false);

        ListView listViewThu = (ListView) view.findViewById(R.id.lv_Danhmuc_Thu);
        ListViewDanhMuc adapter = new ListViewDanhMuc(R.layout.item_danmuc_listview, getActivity(), list.listCategoryThu);
        listViewThu.setAdapter(adapter);

        listViewThu.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                String namCategory = list.listCategoryThu.get(i).getCateggoryName();
                Intent intent = new Intent();
                intent.putExtra("CATEGORY", namCategory);
                getActivity().setResult(2, intent);
                getActivity().finish();
            }
        });

        return view;
    }

    @Override
    public void onAttach(Activity activity) {
        Log.d("Log: ", "OnAttach");

        super.onAttach(activity);

    }
}
