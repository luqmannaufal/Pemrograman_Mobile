package com.example.pencaksilat;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

public class CardPencakAdapter extends RecyclerView.Adapter <CardPencakAdapter.ListViewHolder>{
    private ArrayList<Pencak> listPencak;
    private Context context;

    public CardPencakAdapter(Context context, ArrayList<Pencak> listPencak){
        this.listPencak = listPencak;
        this.context = context;
    }
    @NonNull
    @Override
    public ListViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_row_pencak, parent, false);
        return new ListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ListViewHolder holder, int position) {
        final Pencak pencak = listPencak.get(position);
        Glide.with(holder.itemView.getContext())
                .load(pencak.getPhoto())
                .apply(new RequestOptions().fitCenter())
                .into(holder.imgPhoto);

        holder.cv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, DetailListPencak.class);
                intent.putExtra("pencak_id", pencak.getId());
                context.startActivity(intent);
            }
        });
    }
    @Override
    public int getItemCount() {
        return listPencak.size();
    }

    public class ListViewHolder extends RecyclerView.ViewHolder {
        ImageView imgPhoto;
        TextView tvName, tvDesc;
        CardView cv;

        public ListViewHolder(@NonNull View itemView) {
            super(itemView);
            imgPhoto = itemView.findViewById(R.id.img_pencak_list);
            tvName = itemView.findViewById(R.id.nama_pencak_list);
            tvDesc = itemView.findViewById(R.id.desc_pencak_list);
            cv = itemView.findViewById(R.id.cardview_item);
        }
    }
}
