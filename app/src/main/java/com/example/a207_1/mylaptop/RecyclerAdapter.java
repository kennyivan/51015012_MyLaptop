package com.example.a207_1.mylaptop;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

/**
 * Created by 207-1 on 27/02/2018.
 */

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.MyViewHolder>{
    List<Specification> menu;
    private LayoutInflater inflater;
    private Context context;

    public RecyclerAdapter(Context context, List<Specification> itemmenu) {
        this.context = context;
        inflater = LayoutInflater.from(context);
        this.menu = itemmenu;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.list_spec,parent,false);
        MyViewHolder holder = new MyViewHolder(view);
        return null;
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        Specification current = menu.get(position);
        holder.setData(current,position);
        holder.setListeners();

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        TextView name,kode,harga;
        int position;
        Specification current;

        View itemView;

        public MyViewHolder(View itemView) {
            super(itemView);

            this.itemView = itemView;

            name = (TextView) itemView.findViewById(R.id.tv_name);
            kode = (TextView) itemView.findViewById(R.id.tv_id);
            harga = (TextView) itemView.findViewById(R.id.tv_harga);
        }

        public void setData(Specification current, int position) {
            this.name.setText(current.getNama());
            this.kode.setText(current.getId_item());
            this.harga.setText(current.getHarga());

            this.position = position;
            this.current = current;
        }

        public void setListeners() {

        }
    }
}
