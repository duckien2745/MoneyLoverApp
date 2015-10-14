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


public class FragmentMuonTra_CanTra extends Fragment implements View.OnClickListener {

    private MainActivity mainActivity;
    private ImageView btnAdd;
    private ArrayAdapter<String> adapter;


    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Month m = new Month();

        mainActivity = (MainActivity) getActivity();

        adapter = new ArrayAdapter<>(mainActivity, android.
                R.layout.simple_spinner_dropdown_item, m.month);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_muontra_cantra, container, false);

        final Spinner spinner = (Spinner) view.findViewById(R.id.spCanTra);
        spinner.setAdapter(adapter);

        btnAdd = (ImageView) view.findViewById(R.id.btnAddCanTra);
        btnAdd.setOnClickListener(this);

        ListView listView = (ListView) view.findViewById(R.id.lv_MuonTra_CanTra);
        ListViewAdapterMuonTra lvAdapterMuonTra = new ListViewAdapterMuonTra(ListObj.arrayList, R.layout.item_listview_muontra, mainActivity);
        listView.setAdapter(lvAdapterMuonTra);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                Bundle bundle = new Bundle();
                bundle.putInt("checked", 2);

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
