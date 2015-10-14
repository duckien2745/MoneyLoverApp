package soict.kien.com.moneylover.activity;

import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import soict.kien.com.moneylover.R;
import soict.kien.com.moneylover.fragment.FragmentDanhMuc;
import soict.kien.com.moneylover.fragment.FragmentGiaoDich;
import soict.kien.com.moneylover.fragment.FragmentMuonTra;

public class MainActivity extends AppCompatActivity {

    public Toolbar toolbar;
    private NavigationView navigationView;
    private DrawerLayout drawerLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toolbar = (Toolbar) findViewById(R.id.mToolbar);
        setSupportActionBar(toolbar);

        navigationView = (NavigationView) findViewById(R.id.navigation_view);
        drawerLayout = (DrawerLayout) findViewById(R.id.mainDrawer);
        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(MenuItem menuItem) {
                FragmentManager manager = getSupportFragmentManager();
                FragmentTransaction transaction = manager.beginTransaction();

                if (menuItem.isChecked()) {
                    menuItem.setChecked(false);
                } else {
                    menuItem.setChecked(true);
                }
                drawerLayout.closeDrawers();
                switch (menuItem.getItemId()) {
                    case R.id.iGiaodich:
                        toolbar.setTitle(R.string.cash_string);

                        FragmentGiaoDich fg_giaodich = new FragmentGiaoDich();
                        transaction.replace(R.id.frame, fg_giaodich);
                        transaction.commit();

                        return true;
                    case R.id.iVaymuon:
                        toolbar.setTitle(R.string.debts_string);

                        FragmentMuonTra fg_muontra = new FragmentMuonTra();
                        transaction.replace(R.id.frame, fg_muontra);
                        transaction.commit();
                        return true;
                    case R.id.iDanhmuc:
                        toolbar.setTitle(R.string.category_string);

                        FragmentDanhMuc fg_danhmuc = new FragmentDanhMuc();
                        transaction.replace(R.id.frame, fg_danhmuc);
                        transaction.commit();
                        return true;
                    case R.id.iThongke:
                        toolbar.setTitle(R.string.statistics_string);
                        return true;
                    case R.id.iTaikhoan:
                        toolbar.setTitle(R.string.account_string);
                        return true;
                }
                return false;
            }
        });

        ActionBarDrawerToggle drawerToggle = new ActionBarDrawerToggle(this, drawerLayout, toolbar, R.string.openDrawer, R.string.closeDrawer) {

            @Override
            public void onDrawerClosed(View drawerView) {
                super.onDrawerClosed(drawerView);
            }

            @Override
            public void onDrawerOpened(View drawerView) {
                super.onDrawerOpened(drawerView);
            }

        };

        drawerLayout.setDrawerListener(drawerToggle);
        drawerToggle.syncState();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void setToolbar(int res) {
        toolbar.removeAllViews();
        View logo = getLayoutInflater().inflate(res, null);
        logo.setLayoutParams(new ViewGroup.LayoutParams(
                ViewGroup.LayoutParams.MATCH_PARENT,
                ViewGroup.LayoutParams.WRAP_CONTENT));
        toolbar.addView(logo);
        setSupportActionBar(toolbar);

        android.support.v7.app.ActionBar actionBar = getSupportActionBar();
        assert actionBar != null;
        actionBar.setDisplayOptions(android.support.v7.app.ActionBar.DISPLAY_SHOW_CUSTOM);

        if (res == R.layout.toolbar_main) {

        } else if (res == R.layout.toolbar_them_giao_dich) {
            ImageView view = (ImageView) findViewById(R.id.img_back);
            view.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    getSupportFragmentManager().popBackStack(null, FragmentManager.POP_BACK_STACK_INCLUSIVE);
                }
            });
        }

    }
}
