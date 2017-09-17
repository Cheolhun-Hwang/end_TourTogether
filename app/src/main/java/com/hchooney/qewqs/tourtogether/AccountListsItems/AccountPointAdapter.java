package com.hchooney.qewqs.tourtogether.AccountListsItems;

import android.graphics.Color;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.hchooney.qewqs.tourtogether.R;

import java.util.ArrayList;

/**
 * Created by qewqs on 2017-09-16.
 */

public class AccountPointAdapter extends RecyclerView.Adapter {
    private ArrayList<AccountPointItem> pointItems;

    public AccountPointAdapter(ArrayList<AccountPointItem> pointItems) {
        this.pointItems = pointItems;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int position) {
        View item = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.account_pointlist_item, viewGroup, false);
        return new AccountPointViewHolder(item);
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int position) {
        AccountPointItem pointItem = this.pointItems.get(position);
        AccountPointViewHolder item = (AccountPointViewHolder) viewHolder;
        //추후 이미지를 추가할것.
        /*item.Thumnail.setImageBitmap();*/

        item.When.setText("2017.00.00");                                        //pointItem.getWhen();
        item.How.setText("해당 포인트는 댓글 작성을 통해 얻었습니다.");       //pointItem.getHow();
        if(pointItem.isAddOrSub()){
            //true is add
            item.Point.setText("+ " + " 0 " + "P");
            item.Point.setTextColor(Color.parseColor("#01579B"));
        }else{
            //false is sub
            item.Point.setText("- " + " 0 " + "P");
            item.Point.setTextColor(Color.parseColor("#D32F2F"));
        }
    }

    @Override
    public int getItemCount() {
        return this.pointItems.size();
    }
}
