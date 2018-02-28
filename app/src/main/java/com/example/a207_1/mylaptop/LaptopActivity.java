package com.example.a207_1.mylaptop;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

public class LaptopActivity extends AppCompatActivity {
    private TextView tv_nama,tv_kode,tv_harga;
    private String z;
    private LinearLayout ll;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_laptop);

        tv_nama = (TextView) findViewById(R.id.tv_nama);
        tv_kode = (TextView) findViewById(R.id.tv_kode);
        tv_harga = (TextView) findViewById(R.id.tv_harga);
        ll = (LinearLayout) findViewById(R.id.ll);

            final Specification specification = new Specification("00001");
            tv_nama.setText(specification.getNama());
            tv_kode.setText(specification.getId_item());
            tv_harga.setText(specification.getHarga());
        ll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LaptopActivity.this,SpecificActivity.class);
                intent.putExtra("data",specification);
                startActivity(intent);
            }
        });

    }
}
