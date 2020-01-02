package com.example.pencaksilat;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView rvPencakSilat;
    private ArrayList<Pencak> list = new ArrayList<>();

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.profil, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId()==R.id.item_about){
            startActivity(new Intent(this, aboutme.class));
        }
        return true;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if(getSupportActionBar() !=null){
            getSupportActionBar().setTitle("Pencak Silat Di Indonesia");
        }

        rvPencakSilat = findViewById(R.id.rv_pencak);
        rvPencakSilat.setHasFixedSize(true);

        list.addAll(PencakData.getListData());
        showRecycleList();
    }
    private void showRecycleList(){
        rvPencakSilat.setLayoutManager(new LinearLayoutManager(this));
        CardPencakAdapter cardPencakAdapter = new CardPencakAdapter(this, list);
        rvPencakSilat.setAdapter(cardPencakAdapter);
    }
}
