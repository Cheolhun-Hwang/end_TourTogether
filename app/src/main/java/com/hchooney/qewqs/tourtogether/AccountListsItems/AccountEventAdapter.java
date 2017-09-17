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

public class AccountEventAdapter extends RecyclerView.Adapter {

    private ArrayList<AccountEventItem> eventItems;

    public AccountEventAdapter(ArrayList<AccountEventItem> eventItems) {
        this.eventItems = eventItems;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View item = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.account_eventlist_item, viewGroup, false);
        return new AccountEventViewHolder(item);
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int position) {
        AccountEventItem eventItem = this.eventItems.get(position);
        AccountEventViewHolder item = (AccountEventViewHolder) viewHolder;
        //추후 이미지를 추가할것.
        /*item.Thumnail.setImageBitmap();*/
    }

    @Override
    public int getItemCount() {
        return this.eventItems.size();
    }
}
