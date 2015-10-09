package soict.kien.com.moneylover.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import soict.kien.com.moneylover.R;
import soict.kien.com.moneylover.activity.MainActivity;
import soict.kien.com.moneylover.adapter.ViewPagerAdapter;

/**
 * Created by DucKien2745 on 10/7/2015.
 */
public class FragmentMuonTra extends Fragment {
    private MainActivity mainActivity;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        mainActivity = (MainActivity) getActivity();

        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_muontra, container, false);

        final ViewPager viewPager = (ViewPager) view.findViewById(R.id.viewpager_MuonTra);
        setupViewPager(viewPager);
        return view;
    }

    private void setupViewPager(ViewPager viewPager) {

        ViewPagerAdapter adapter = new ViewPagerAdapter(mainActivity.getSupportFragmentManager());
        adapter.addFrag(new FragmentMuonTra_CanTra(), "Cần trả");
        adapter.addFrag(new FragmentMuonTra_CanThu(), "Cần Thu");
        viewPager.setAdapter(adapter);

    }
}
