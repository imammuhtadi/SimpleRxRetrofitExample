package com.imammuhtadi.simplerxretrofitexample.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.imammuhtadi.simplerxretrofitexample.R;
import com.imammuhtadi.simplerxretrofitexample.model.Result;

import java.util.List;

public class MemeAdapter extends RecyclerView.Adapter<MemeAdapter.ViewHolder>{

    private List<Result> results;

    public MemeAdapter(List<Result> results) {
        this.results = results;
    }

    @Override
    public MemeAdapter.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.meme_list, viewGroup, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(MemeAdapter.ViewHolder viewHolder, int i) {

        Glide.with(viewHolder.img.getContext()).load(results.get(i).getImageUrl()).into(viewHolder.img);
        viewHolder.genID.setText("Generator ID : " + results.get(i).getGeneratorID()+"");
        viewHolder.name.setText("Name : " + results.get(i).getDisplayName()+"");
        viewHolder.urlName.setText("URL Name : " + results.get(i).getUrlName()+"");

    }

    @Override
    public int getItemCount() {
        return results.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder{
        TextView genID, name, urlName;
        ImageView img;
        ViewHolder(View view) {
            super(view);
            img = (ImageView) itemView.findViewById(R.id.img);
            genID = (TextView) itemView.findViewById(R.id.gen_id);
            name = (TextView) itemView.findViewById(R.id.name);
            urlName = (TextView) itemView.findViewById(R.id.url_name);
        }
    }
}