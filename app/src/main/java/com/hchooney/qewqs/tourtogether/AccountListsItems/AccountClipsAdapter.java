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

public class AccountClipsAdapter extends RecyclerView.Adapter {
    private ArrayList<AccountClipsItem> clipsItems;

    public AccountClipsAdapter(ArrayList<AccountClipsItem> clipsItems) {
        this.clipsItems = clipsItems;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int viewType) {
        View item = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.account_cliplist_item, viewGroup, false);
        return new AccountClipsViewHolder(item);
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, final int position) {
        AccountClipsItem accountClipsItem = this.clipsItems.get(position);
        AccountClipsViewHolder item = (AccountClipsViewHolder) viewHolder;
        //추후 이미지를 추가할것.
        /*item.Thumnail.setImageBitmap();*/

        item.Remove.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //AccountLikeListItem likeListItem = likeListItems.get(position);
                clipsItems.remove(position);
                notifyDataSetChanged();
            }
        });
    }

    @Override
    public int getItemCount() {
        return this.clipsItems.size();
    }
}
