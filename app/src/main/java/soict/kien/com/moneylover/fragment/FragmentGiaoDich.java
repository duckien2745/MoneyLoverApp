package soict.kien.com.moneylover.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import soict.kien.com.moneylover.R;
import soict.kien.com.moneylover.activity.MainActivity;
import soict.kien.com.moneylover.adapter.ViewPagerAdapter;

//import android.view.ViewGroup;

/**
 * Created by DucKien2745 on 10/2/2015.
 */
public class FragmentGiaoDich extends android.support.v4.app.Fragment {

    private MainActivity mainActivity;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        mainActivity = (MainActivity) getActivity();
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_giaodich, container, false);

        final ViewPager viewPager = (ViewPager) view.findViewById(R.id.viewpager_GiaoDich);
        setupViewPager(viewPager);

        TabLayout tabLayout = (TabLayout) view.findViewById(R.id.tabLayout_Giaodich);
        tabLayout.setupWithViewPager(viewPager);
        tabLayout.setOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                viewPager.setCurrentItem(tab.getPosition());

            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });


        return view;
    }

    private void setupViewPager(ViewPager viewPager) {
        ViewPagerAdapter adapter = new ViewPagerAdapter(mainActivity.getSupportFragmentManager());
        adapter.addFrag(new FragmentGiaoDichThoiGian(), "Thoi Gian");
        adapter.addFrag(new FragmentGiaoDichDanhMuc(), "Danh Muc");
        viewPager.setAdapter(adapter);

    }
}
