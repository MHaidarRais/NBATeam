package com.rais.haidar.nbateam;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

public class ListTeamAdapter extends RecyclerView.Adapter<ListTeamAdapter.CategoryViewHolder>
    {
        private Context context;
        private ArrayList<NbaTeam> listTeam;

        public ListTeamAdapter(MainActivity mainActivity) {
        }


        public ArrayList<NbaTeam> getListTeam() {
            return listTeam;
        }

        public void setContext(Context context) {
            this.context = context;
        }

        public void setListTeam(ArrayList<NbaTeam> listTeam) {
            this.listTeam = listTeam;
        }



    @NonNull
    @Override
    public CategoryViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {

        View itemRow = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.cell, viewGroup, false);
        return new CategoryViewHolder(itemRow);

    }

    @Override
    public void onBindViewHolder(@NonNull CategoryViewHolder categoryViewHolder, int position) {
        categoryViewHolder.tvNama.setText(getListTeam().get(position).getName());
        categoryViewHolder.tvLoc.setText(getListTeam().get(position).getLocation());
        Glide.with(context)
                .load(listTeam.get(position).getPhoto())
                .into(categoryViewHolder.imgCell);
    }


    @Override
    public int getItemCount() {
        return getListTeam().size();
    }

    public class CategoryViewHolder extends RecyclerView.ViewHolder {
        TextView tvNama;
        TextView tvLoc;
        ImageView imgCell;
            public CategoryViewHolder(@NonNull View itemView) {
            super(itemView);
            tvNama = itemView.findViewById(R.id.tvName);
            tvLoc = itemView.findViewById(R.id.tvLoc);
            imgCell = itemView.findViewById(R.id.imgCell);
        }
    }
}
