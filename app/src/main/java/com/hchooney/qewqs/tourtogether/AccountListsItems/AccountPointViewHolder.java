package com.hchooney.qewqs.tourtogether.AccountListsItems;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.hchooney.qewqs.tourtogether.R;


/**
 * Created by qewqs on 2017-09-16.
 */

public class AccountPointViewHolder extends RecyclerView.ViewHolder {

    TextView When;
    TextView How;
    TextView Point;

    public AccountPointViewHolder(View itemView) {
        super(itemView);

        When = (TextView) itemView.findViewById(R.id.account_point_when);
        How = (TextView) itemView.findViewById(R.id.account_point_how);
        Point = (TextView) itemView.findViewById(R.id.account_point_point);
    }
}
