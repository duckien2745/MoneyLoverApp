package soict.kien.com.moneylover.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import soict.kien.com.moneylover.R;

/**
 * Created by DucKien2745 on 10/6/2015.
 */
public class Fragment_ThemGiaoDich extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_them_giao_dich, container, false);
    }
}
