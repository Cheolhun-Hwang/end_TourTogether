package com.hchooney.qewqs.tourtogether.Columns;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.hchooney.qewqs.tourtogether.R;

import java.util.ArrayList;

/**
 * Created by hooney on 2017. 11. 19..
 */

public class fullitemAdapter extends RecyclerView.Adapter {
    private Context context;
    private ArrayList<ColumnItem> list;

    public fullitemAdapter(Context context, ArrayList<ColumnItem> list) {
        this.context = context;
        this.list = list;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_column_fullitem,parent,false);
        fullitemHolder holder = new fullitemHolder(v);
        return holder;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        fullitemHolder hold = (fullitemHolder) holder;

        //hold.context.setText(list.get(position).getContext());

    }

    @Override
    public int getItemCount() {
        return this.list.size();
    }
}
