package soict.kien.com.moneylover.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.Toast;

import soict.kien.com.moneylover.R;
import soict.kien.com.moneylover.activity.ChiTietGiaoDichActivity;
import soict.kien.com.moneylover.activity.MainActivity;
import soict.kien.com.moneylover.activity.ThemGiaoDichActivity;
import soict.kien.com.moneylover.adapter.ListViewGiaoDichDanhMuc;
import soict.kien.com.moneylover.object.ListObj;
import soict.kien.com.moneylover.object.Month;

public class FragmentGiaoDich_DanhMuc extends Fragment {
    public ListView lv_Giaodich_danhmuc;
    public ListViewGiaoDichDanhMuc listViewAdapter;
    private ArrayAdapter<String> adapter;
    private Month m;
    private MainActivity mainActivity;

    @Override

    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        m = new Month();

        mainActivity = (MainActivity) getActivity();

        adapter = new ArrayAdapter<>(getActivity(), android.
                R.layout.simple_spinner_dropdown_item, m.month);
    }

    @Override
    public void onResume() {
        super.onResume();
        Log.d("Fragment", "onResume");
        listViewAdapter.notifyDataSetChanged();
        lv_Giaodich_danhmuc.setAdapter(listViewAdapter);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.fragment_giaodich_danhmuc, container, false);
        final Spinner spinner = (Spinner) v.findViewById(R.id.sp_danhmuc);
        spinner.setAdapter(adapter);

        lv_Giaodich_danhmuc = (ListView) v.findViewById(R.id.lvGiaodich_DnhMuc);
        listViewAdapter = new ListViewGiaoDichDanhMuc(ListObj.arrayList, R.layout.item_in_listview_giaodich_danhmuc, R.layout.item_child_in_listview_giaodich_danhmuc, mainActivity);
        lv_Giaodich_danhmuc.setAdapter(listViewAdapter);

        lv_Giaodich_danhmuc.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                Bundle bundle = new Bundle();
                bundle.putInt("checked", 0);
                bundle.putInt("position", i);

                Intent intent = new Intent(mainActivity, ChiTietGiaoDichActivity.class);
                intent.putExtras(bundle);
                startActivity(intent);
            }
        });

        ImageView img_add = (ImageView) v.findViewById(R.id.img_add);
        img_add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(getActivity(), ThemGiaoDichActivity.class);
                startActivity(intent);

            }
        });

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view,
                                       int position, long id) {
                // Get select item
                int sid = spinner.getSelectedItemPosition();
                Toast.makeText(mainActivity.getBaseContext(), "You have selected Month: " + m.month[sid],
                        Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                // TODO Auto-generated method stub
            }
        });

        return v;
    }
}
