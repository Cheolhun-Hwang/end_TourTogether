package com.hchooney.qewqs.tourtogether.AccountListsItems;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.hchooney.qewqs.tourtogether.R;

import java.util.ArrayList;

/**
 * Created by qewqs on 2017-09-16.
 */

public class AccountLikeListAdapter extends RecyclerView.Adapter {
    private ArrayList<AccountLikeListItem> likeListItems;

    public AccountLikeListAdapter(ArrayList<AccountLikeListItem> likeListItems) {
        this.likeListItems = likeListItems;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View item = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.account_likelist_item, viewGroup, false);
        return new AccountLikeListViewHolder(item);
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, final int position) {
        AccountLikeListItem accountLikeListItem = this.likeListItems.get(position);
        AccountLikeListViewHolder item = (AccountLikeListViewHolder) viewHolder;
        //추후 이미지를 추가할것.
        /*item.Thumnail.setImageBitmap();*/

        item.Remove.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //AccountLikeListItem likeListItem = likeListItems.get(position);
                likeListItems.remove(position);
                notifyDataSetChanged();
            }
        });
    }

    @Override
    public int getItemCount() {
        return this.likeListItems.size();
    }
}
