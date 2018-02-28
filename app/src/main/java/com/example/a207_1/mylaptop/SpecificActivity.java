package com.example.a207_1.mylaptop;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class SpecificActivity extends AppCompatActivity {
    private TextView nama,kode,spec_processor,spec_vga,spec_ram,spec_ssd,spec_resolusi;
    Specification spek;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_specific);
        spek=getIntent().getParcelableExtra("data");
        nama=(TextView) findViewById(R.id.tv_nama1);
        kode=(TextView) findViewById(R.id.tv_kode1);
        spec_processor= (TextView) findViewById(R.id.spec_processor);
        spec_vga= (TextView) findViewById(R.id.spec_vga);
        spec_ram= (TextView) findViewById(R.id.spec_ram);
        spec_ssd= (TextView) findViewById(R.id.spec_ssd);
        spec_resolusi= (TextView) findViewById(R.id.spec_resolusi);
        nama.setText(spek.getNama());
        kode.setText(spek.getId_item());
        spec_processor.setText(spek.getProcessor());
        spec_vga.setText(spek.getVga());
        spec_ram.setText(spek.getRam());
        spec_ssd.setText(spek.getSsd());
        spec_resolusi.setText(spek.getResolusi());
    }
}
