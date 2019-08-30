package com.example.tugas_2_recycle_view;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class List_Adapter extends RecyclerView.Adapter<List_Adapter.ViewHolder> {

    private List<list_name> listNames;

    public static class ViewHolder extends RecyclerView.ViewHolder{
        public TextView tvJudul, tvTime, tvIsi;
        public ImageView ivIcon;

        public ViewHolder(View v) {
            super(v);
            tvIsi = (TextView) v.findViewById(R.id.tv_isi);
            tvJudul = (TextView) v.findViewById(R.id.tv_judul);
            tvTime = (TextView) v.findViewById(R.id.tv_time);
            ivIcon = (ImageView) v.findViewById(R.id.iv_icon);

        }

    }
    public List_Adapter(List<list_name> listNames) { this.listNames = listNames; }

    @Override
    public List_Adapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.view_rv_list, parent, false);
        ViewHolder vh = new ViewHolder(v);
        return vh;
    }
    @Override
    public void onBindViewHolder(List_Adapter.ViewHolder holder, int position) {

        list_name listName = listNames.get(position);
        holder.tvIsi.setText(String.valueOf(listName.getIsi()));
        holder.tvJudul.setText(listName.getJudul());
        holder.tvTime.setText(listName.getTime());
        holder.ivIcon.setImageResource(listName.getPic());
    }

    @Override
    public int getItemCount() {
        return listNames.size();
    }
}
