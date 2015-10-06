package soict.kien.com.moneylover.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import soict.kien.com.moneylover.R;

/**
 * Created by DucKien2745 on 10/3/2015.
 */
public class FragmentGiaoDichThoiGian extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_giaodich_thoigian, container, false);

    }
}
