package com.hchooney.qewqs.tourtogether.AccountListsItems;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.hchooney.qewqs.tourtogether.R;

/**
 * Created by qewqs on 2017-09-16.
 */

public class AccountLikeListViewHolder extends RecyclerView.ViewHolder {

    TextView LocationTitle;
    TextView Cate;
    TextView Address;
    ImageButton Remove;

    ImageView LocationThumnail;

    public AccountLikeListViewHolder(final View itemView) {
        super(itemView);
        LocationTitle = (TextView) itemView.findViewById(R.id.account_point_point);
        Cate = (TextView) itemView.findViewById(R.id.account_likelist_category);
        Address = (TextView) itemView.findViewById(R.id.account_point_how);
        Remove = (ImageButton) itemView.findViewById(R.id.account_likelist_remove);

        itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int itemPosition = getLayoutPosition();
                Toast.makeText(itemView.getContext(), "Item ID : " + itemPosition, Toast.LENGTH_SHORT).show();
            }
        });
    }
}
