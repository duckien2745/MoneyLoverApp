package soict.kien.com.moneylover.activity;

import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;

import com.wdullaer.materialdatetimepicker.date.DatePickerDialog;

import java.util.Calendar;

import soict.kien.com.moneylover.R;

public class ThemGiaoDichActivity extends AppCompatActivity implements DatePickerDialog.OnDateSetListener, View.OnClickListener {

    public Toolbar toolbar;
    private EditText etDate;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_them_giao_dich);

        toolbar = (Toolbar) findViewById(R.id.toolbar);
        setToolbar(R.layout.toolbar_them_giao_dich);

        etDate = (EditText) findViewById(R.id.etDate);
        etDate.setOnClickListener(this);

    }

    public void setToolbar(int res) {

        toolbar.removeAllViews();

        View logo = getLayoutInflater().inflate(res, null);
        logo.setLayoutParams(new ViewGroup.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT));
        toolbar.addView(logo);
        setSupportActionBar(toolbar);

        ActionBar actionBar = getSupportActionBar();
        assert actionBar != null;
        actionBar.setDisplayOptions(ActionBar.DISPLAY_SHOW_CUSTOM);

        if (res == R.layout.toolbar_main) {

        } else if (res == R.layout.toolbar_them_giao_dich) {
            ImageView view = (ImageView) findViewById(R.id.img_back);
            view.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Log.d("CLick", "Back");
                    finish();
                }
            });
        }
    }


    @Override
    public void onDateSet(DatePickerDialog view, int year, int monthOfYear, int dayOfMonth) {
        String date = dayOfMonth + "-" + (++monthOfYear) + "-" + year;
        etDate.setText(date);
    }

    @Override
    public void onClick(View view) {
        if (view == etDate) {
            Calendar now = Calendar.getInstance();
            DatePickerDialog dpd = DatePickerDialog.newInstance(
                    ThemGiaoDichActivity.this,
                    now.get(Calendar.YEAR),
                    now.get(Calendar.MONTH),
                    now.get(Calendar.DAY_OF_MONTH)
            );
            dpd.show(getFragmentManager(), "Datepickerdialog");
        }
    }
}
