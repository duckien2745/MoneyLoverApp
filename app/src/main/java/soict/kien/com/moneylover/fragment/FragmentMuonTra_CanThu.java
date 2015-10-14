package soict.kien.com.moneylover.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.Spinner;

import soict.kien.com.moneylover.R;
import soict.kien.com.moneylover.activity.ChiTietGiaoDichActivity;
import soict.kien.com.moneylover.activity.MainActivity;
import soict.kien.com.moneylover.activity.ThemGiaoDichActivity;
import soict.kien.com.moneylover.adapter.ListViewAdapterMuonTra;
import soict.kien.com.moneylover.object.ListObj;
import soict.kien.com.moneylover.object.Month;

/**
 * Created by DucKien2745 on 10/7/2015.
 */
public class FragmentMuonTra_CanThu extends Fragment
        implements View.OnClickListener {

    private MainActivity mainActivity;
    private ListObj arrayObject;
    private ListView listView;
    private ListViewAdapterMuonTra lvAdapterMuonTra;
    private ImageView btnAdd;
    private ArrayAdapter<String> adapter;
    private Month m;


    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        m = new Month();
        mainActivity = (MainActivity) getActivity();
        arrayObject = new ListObj();

        adapter = new ArrayAdapter<>(mainActivity, android.
                R.layout.simple_spinner_dropdown_item, m.month);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_muontra_canthu, container, false);

        final Spinner spinner = (Spinner) view.findViewById(R.id.spCanThu);
        spinner.setAdapter(adapter);

        btnAdd = (ImageView) view.findViewById(R.id.btnAddCanThu);
        btnAdd.setOnClickListener(this);

        listView = (ListView) view.findViewById(R.id.lv_Muontra_CanThu);
        lvAdapterMuonTra = new ListViewAdapterMuonTra(ListObj.arrayList, R.layout.item_listview_muontra, mainActivity);
        listView.setAdapter(lvAdapterMuonTra);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                Bundle bundle = new Bundle();
                bundle.putInt("checked", 1);

                Intent intent = new Intent(getActivity(), ChiTietGiaoDichActivity.class);
                intent.putExtras(bundle);
                startActivity(intent);
            }
        });

        return view;
    }

    @Override
    public void onClick(View view) {
        if (view == btnAdd) {
            Intent intent = new Intent(mainActivity, ThemGiaoDichActivity.class);
            startActivity(intent);
        }
    }
}
