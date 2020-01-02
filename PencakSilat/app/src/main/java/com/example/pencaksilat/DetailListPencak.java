package com.example.pencaksilat;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

public class DetailListPencak extends AppCompatActivity {
    private int PencakSilat_id;
    ImageView imgDetail;
    TextView tvName, tvDesc;
    private ArrayList<Pencak> listPencak = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_list_pencak);

        PencakSilat_id = getIntent().getIntExtra("pencak_id", 0);
        tvName = findViewById(R.id.nama_pencak);
        tvDesc = findViewById(R.id.desc_detail);
        imgDetail = findViewById(R.id.img_detail);

        listPencak.addAll(PencakData.getListData());

        setLayout();
    }

    void setLayout(){
        tvName.setText(listPencak.get(PencakSilat_id).getName());
        tvDesc.setText(listPencak.get(PencakSilat_id).getDescription());
        Glide.with(this)
                .load(listPencak.get(PencakSilat_id).getPhoto())
                .apply(new RequestOptions().fitCenter())
                .into(imgDetail);
    }
}
