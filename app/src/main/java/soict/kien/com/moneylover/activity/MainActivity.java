package soict.kien.com.moneylover.activity;

import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import soict.kien.com.moneylover.R;

public class MainActivity extends AppCompatActivity {

    private Toolbar toolbar;
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
                if (menuItem.isChecked()) {
                    menuItem.setChecked(false);
                } else {
                    menuItem.setChecked(true);
                }
                drawerLayout.closeDrawers();
                switch (menuItem.getItemId()) {
                    case R.id.iGiaodich:
                        Toast.makeText(getApplicationContext(), "Giao dịch Selected", Toast.LENGTH_SHORT).show();
                        return true;
                    case R.id.iVaymuon:
                        Toast.makeText(getApplicationContext(), "Vay Mượn Selected", Toast.LENGTH_SHORT).show();
                        return true;
                    case R.id.iDanhmuc:
                        Toast.makeText(getApplicationContext(), "Danh mục Selected", Toast.LENGTH_SHORT).show();
                        return true;
                    case R.id.iThongke:
                        Toast.makeText(getApplicationContext(), "Thống kê Selected", Toast.LENGTH_SHORT).show();
                        return true;
                    case R.id.iTaikhoan:
                        Toast.makeText(getApplicationContext(), "Tài Khoản Selected", Toast.LENGTH_SHORT).show();
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
}
