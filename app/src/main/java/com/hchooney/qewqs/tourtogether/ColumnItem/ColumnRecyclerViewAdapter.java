package com.hchooney.qewqs.tourtogether.ColumnItem;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.hchooney.qewqs.tourtogether.R;

import java.util.ArrayList;

/**
 * Created by qewqs on 2017-09-16.
 */

public class ColumnRecyclerViewAdapter extends RecyclerView.Adapter {
    private ArrayList<ColumnItems> columnItemsArrayList;

    public ColumnRecyclerViewAdapter(ArrayList<ColumnItems> data){
        this.columnItemsArrayList = data;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int viewType) {
        View item = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.column_list_item, viewGroup, false);
        return new ColumnItemsViewHolder(item);
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder Holder, int position) {
        ColumnItems columnItems = this.columnItemsArrayList.get(position);
        ColumnItemsViewHolder item = (ColumnItemsViewHolder) Holder;
        //추후 이미지를 추가할것.
        /*item.Thumnail.setImageBitmap();*/
    }

    @Override
    public int getItemCount() {
        return this.columnItemsArrayList.size();
    }
}
