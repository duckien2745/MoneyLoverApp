package soict.kien.com.moneylover.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import soict.kien.com.moneylover.R;
import soict.kien.com.moneylover.activity.MainActivity;
import soict.kien.com.moneylover.adapter.ListViewDanhMuc;
import soict.kien.com.moneylover.object.CategoryList;

/**
 * Created by DucKien2745 on 10/7/2015.
 */
public class FragmentDanhMuc_Chi extends Fragment {
    private MainActivity activity;
    private CategoryList list;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        activity = (MainActivity) getActivity();
        list = new CategoryList();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_danhmuc_chi, container, false);

        ListView listViewChi = (ListView) view.findViewById(R.id.lv_Danhmuc_Chi);
        ListViewDanhMuc adapter = new ListViewDanhMuc(R.layout.item_danmuc_listview, getActivity(), list.listCategoryChi);
        listViewChi.setAdapter(adapter);

        listViewChi.setOnItemClickListener(new AdapterView.OnItemClickListener() {
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
}
