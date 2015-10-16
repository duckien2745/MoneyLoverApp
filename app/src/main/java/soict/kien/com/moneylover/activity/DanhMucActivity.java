package soict.kien.com.moneylover.activity;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

import soict.kien.com.moneylover.R;
import soict.kien.com.moneylover.adapter.ViewPagerAdapter;
import soict.kien.com.moneylover.fragment.FragmentDanhMuc_Chi;
import soict.kien.com.moneylover.fragment.FragmentDanhMuc_Thu;

/**
 * Created by DucKien2745 on 10/11/2015.
 */
public class DanhMucActivity extends AppCompatActivity implements View.OnClickListener {
    private ImageView btnBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_danhmuc);

        View toolbar = findViewById(R.id.include_toolbar_acDanhmuc);
        btnBack = (ImageView) toolbar.findViewById(R.id.img_back_danhmuc);

        final ViewPager viewPager = (ViewPager) findViewById(R.id.viewpager_acDanhMuc);
        setupViewPager(viewPager);
        TabLayout tabLayout = (TabLayout) findViewById(R.id.tabLayout_acDanhMuc);
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

    }

    private void setupViewPager(ViewPager viewPager) {

        ViewPagerAdapter adapter = new ViewPagerAdapter(getSupportFragmentManager());
        adapter.addFrag(new FragmentDanhMuc_Thu(), "Thu");
        adapter.addFrag(new FragmentDanhMuc_Chi(), "Chi");
        viewPager.setAdapter(adapter);

    }

    @Override
    public void onClick(View view) {
        if (view == btnBack) {
            finish();
        }
    }
}
