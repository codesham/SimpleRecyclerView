package com.shyamkumarbora.recycleexample;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.MyViewHolder> {
    private List<String> mList;
    public View mView;
    public RecyclerViewAdapter(List<String> mList){
        this.mList = mList;
    }
    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
         mView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.text_view_layout,parent,false);
        MyViewHolder myViewHolder = new MyViewHolder(mView);
        return myViewHolder;
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        holder.mVersionNameTextView.setText(mList.get(position));
    }

    @Override
    public int getItemCount() {
        return mList.size();
    }
    public class MyViewHolder extends RecyclerView.ViewHolder{
        public TextView mVersionNameTextView;
        public MyViewHolder(View itemView) {
            super(itemView);
            mVersionNameTextView = itemView.findViewById(R.id.version_name_tv);
        }
    }
}
