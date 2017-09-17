package com.hchooney.qewqs.tourtogether.AccountListsItems;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.hchooney.qewqs.tourtogether.R;

/**
 * Created by qewqs on 2017-09-16.
 */

public class AccountEventViewHolder extends RecyclerView.ViewHolder {
    ImageView Event_Thumnail;

    TextView Title;
    TextView DeadLine;
    TextView Who;

    public AccountEventViewHolder(final View itemView) {
        super(itemView);

        Event_Thumnail = (ImageView) itemView.findViewById(R.id.EventItem_Thumnail);
        Title = (TextView) itemView.findViewById(R.id.EventItem_Title);
        DeadLine = (TextView) itemView.findViewById(R.id.EventItem_When);
        Who = (TextView) itemView.findViewById(R.id.EventItem_Who);

        itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int itemPosition = getLayoutPosition();
                Toast.makeText(itemView.getContext(), "Item ID : " + itemPosition, Toast.LENGTH_SHORT).show();
            }
        });
    }
}
