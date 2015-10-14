package soict.kien.com.moneylover.activity;

import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import com.wdullaer.materialdatetimepicker.date.DatePickerDialog;

import java.util.Calendar;

import soict.kien.com.moneylover.R;
import soict.kien.com.moneylover.object.ListObj;
import soict.kien.com.moneylover.object.object;

public class ThemGiaoDichActivity extends AppCompatActivity implements DatePickerDialog.OnDateSetListener, View.OnClickListener {

    public Toolbar toolbar;
    private EditText etDate;
    private EditText etMoneys;
    private EditText etFormPay;
    private EditText etGroup;
    private EditText etNote;
    private object obj;
    private TextView btnSave;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_them_giao_dich);

        toolbar = (Toolbar) findViewById(R.id.toolbar);
        setToolbar(R.layout.toolbar_them_giao_dich);

        etDate = (EditText) findViewById(R.id.etDate);
        etMoneys = (EditText) findViewById(R.id.etMoneys);
        etFormPay = (EditText) findViewById(R.id.etFormPay);
        etGroup = (EditText) findViewById(R.id.etGroup);
        etNote = (EditText) findViewById(R.id.etNote);
        btnSave = (TextView) findViewById(R.id.btnSave);

        etDate.setOnClickListener(this);
        btnSave.setOnClickListener(this);

    }

    public void setData() {
        String date, moneys, formPay, group, note;

        date = etDate.getText().toString();
        moneys = etMoneys.getText().toString();
        formPay = etFormPay.getText().toString();
        group = etGroup.getText().toString();
        note = etNote.getText().toString();

        obj = new object(group, "1.500.000", "1.200.000", moneys, date, formPay);
        ListObj.arrayList.add(obj);

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
        if (view == btnSave) {
            setData();
            finish();
        }
    }
}
