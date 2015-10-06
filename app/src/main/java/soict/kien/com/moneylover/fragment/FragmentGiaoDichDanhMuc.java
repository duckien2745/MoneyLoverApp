package soict.kien.com.moneylover.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;

import soict.kien.com.moneylover.R;
import soict.kien.com.moneylover.activity.MainActivity;
import soict.kien.com.moneylover.adapter.ListViewAdapter;
import soict.kien.com.moneylover.object.Month;
import soict.kien.com.moneylover.object.object;

public class FragmentGiaoDichDanhMuc extends Fragment {
    private ArrayAdapter<String> adapter;
    private Month m;
    private MainActivity mainActivity;
    private ListView lv_Giaodich_danhmuc;
    private object obj;
    private ArrayList<object> arrayList;
    private ImageView img_add;

    @Override

    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        m = new Month();
        mainActivity = (MainActivity) getActivity();

        obj = new object();
        arrayList = new ArrayList<>();

        obj = new object("Mua sắm", "2.500.000", "1.200.000", "2.500.000", "22-12-2015", "Tiền mặt");
        arrayList.add(obj);
        obj = new object("Mua sắm", "2.500.000", "1.200.000", "2.500.000", "22-12-2015", "Tiền mặt");
        arrayList.add(obj);
        obj = new object("Mua sắm", "2.500.000", "1.200.000", "2.500.000", "22-12-2015", "Tiền mặt");
        arrayList.add(obj);
        obj = new object("Mua sắm", "2.500.000", "1.200.000", "2.500.000", "22-12-2015", "Tiền mặt");
        arrayList.add(obj);
        obj = new object("Mua sắm", "2.500.000", "1.200.000", "2.500.000", "22-12-2015", "Tiền mặt");
        arrayList.add(obj);
        obj = new object("Mua sắm", "2.500.000", "1.200.000", "2.500.000", "22-12-2015", "Tiền mặt");
        arrayList.add(obj);
        obj = new object("Mua sắm", "2.500.000", "1.200.000", "2.500.000", "22-12-2015", "Tiền mặt");
        arrayList.add(obj);
        obj = new object("Mua sắm", "2.500.000", "1.200.000", "2.500.000", "22-12-2015", "Tiền mặt");
        arrayList.add(obj);
        obj = new object("Mua sắm", "2.500.000", "1.200.000", "2.500.000", "22-12-2015", "Tiền mặt");
        arrayList.add(obj);

        adapter = new ArrayAdapter<>(mainActivity, android.
                R.layout.simple_spinner_dropdown_item, m.month);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_giaodich_danhmuc, container, false);
        final Spinner spinner = (Spinner) v.findViewById(R.id.sp_danhmuc);
        spinner.setAdapter(adapter);

        lv_Giaodich_danhmuc = (ListView) v.findViewById(R.id.lvGiaodich_DnhMuc);
        ListViewAdapter listViewAdapter = new ListViewAdapter(arrayList, R.layout.item_lv_giaodich_danhmuc, mainActivity);
        lv_Giaodich_danhmuc.setAdapter(listViewAdapter);

        img_add = (ImageView) v.findViewById(R.id.img_add);
        img_add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Fragment_ThemGiaoDich fragment = new Fragment_ThemGiaoDich();
                FragmentManager manager = mainActivity.getSupportFragmentManager();
                FragmentTransaction transaction = manager.beginTransaction();

                transaction.replace(R.id.frame, fragment);
                transaction.commit();
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
