package soict.kien.com.moneylover.activity;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

import soict.kien.com.moneylover.R;
import soict.kien.com.moneylover.object.ListObj;

public class ChiTietGiaoDichActivity extends Activity implements View.OnClickListener {

    private View layout_Chitiet_tra, layout_Chitiet_thu, layout_Chitiet_button, layout_content_Chitiet, toolbarChitietGd;
    private Button btnLuu, btnHuy;
    private ImageView btnBack;
    private EditText etMoney, etDate, etFormPay, etNote, etCategory;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chitiet_giaodich);

        layout_Chitiet_tra = findViewById(R.id.include_Chitiet_tra);
        layout_Chitiet_thu = findViewById(R.id.include_Chitiet_muon);
        layout_Chitiet_button = findViewById(R.id.include_Chitiet_button);
        toolbarChitietGd = findViewById(R.id.include_toolbar_chi_tiet_giao_dich);
        layout_content_Chitiet = findViewById(R.id.include_content_Chitiet);

        btnLuu = (Button) layout_Chitiet_button.findViewById(R.id.btnLuu);
        btnHuy = (Button) layout_Chitiet_button.findViewById(R.id.btnHuy);
        btnBack = (ImageView) toolbarChitietGd.findViewById(R.id.btn_back_chitietgiaodich);

        etMoney = (EditText) layout_content_Chitiet.findViewById(R.id.etChitietMoneys);
        etDate = (EditText) layout_content_Chitiet.findViewById(R.id.etChitietDate);
        etFormPay = (EditText) layout_content_Chitiet.findViewById(R.id.etChitietPayForm);
        etNote = (EditText) layout_content_Chitiet.findViewById(R.id.etChitietNote);
        etCategory = (EditText) layout_content_Chitiet.findViewById(R.id.etChitietCategory);

        btnLuu.setOnClickListener(this);
        btnHuy.setOnClickListener(this);
        btnBack.setOnClickListener(this);

        Bundle bundle = getIntent().getExtras();
        Integer position = bundle.getInt("position");
        Log.d("Position", position + "");
        etMoney.setText(ListObj.arrayList.get(position).getMoney());
        etDate.setText(ListObj.arrayList.get(position).getDate());
        etFormPay.setText(ListObj.arrayList.get(position).getForm_pay());
        etNote.setText(ListObj.arrayList.get(position).getNote());
        etCategory.setText(ListObj.arrayList.get(position).getCategory());


        Integer value = bundle.getInt("checked");
        if (value == 1) {
            layout_Chitiet_tra.setVisibility(View.GONE);
        } else if (value == 2) {
            layout_Chitiet_thu.setVisibility(View.GONE);
        } else {
            layout_Chitiet_tra.setVisibility(View.GONE);
            layout_Chitiet_thu.setVisibility(View.GONE);
        }

    }

    @Override
    public void onClick(View view) {

        if (view == btnHuy) {
            finish();
        } else if (view == btnBack) {
            finish();
        }
    }

}

