package com.febri.coba2;

import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;


import androidx.recyclerview.widget.RecyclerView;

public class recycleAdapter extends RecyclerView.Adapter<recycleAdapter.MahasiswaViewHolder>{

    ArrayList<model> datalist;

    public class MahasiswaViewHolder extends RecyclerView.ViewHolder {

        private TextView txtNama,txtNpm,txtNohp;
        private ImageView gambar;
        public MahasiswaViewHolder( View itemView) {

            super(itemView);
            txtNama =  itemView.findViewById(R.id.txt_nama_mahasiswa);
            txtNpm =  itemView.findViewById(R.id.txt_npm_mahasiswa);
            txtNohp =  itemView.findViewById(R.id.txt_nohp_mahasiswa);
            gambar = itemView.findViewById(R.id.gambar);
        }
    }

    public recycleAdapter(ArrayList<model> datalist){

        this.datalist = datalist;
    }

    @Override
    public recycleAdapter.MahasiswaViewHolder onCreateViewHolder( ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.list_itemnya,parent,false);
        return new MahasiswaViewHolder(view);
    }

    @Override
    public void onBindViewHolder( recycleAdapter.MahasiswaViewHolder holder, int position) {
        holder.txtNama.setText(datalist.get(position).getNama());
        holder.txtNpm.setText(datalist.get(position).getNpm());
        holder.txtNohp.setText(datalist.get(position).getNohp());
        holder.gambar.setImageResource(datalist.get(position).getGambar());
    }

    @Override
    public int getItemCount() {

        return  (datalist != null) ? datalist.size() : 0 ;

    }


}
