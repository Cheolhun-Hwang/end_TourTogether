package com.hchooney.qewqs.tourtogether.AccountListsItems;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Toast;

import com.hchooney.qewqs.tourtogether.R;

/**
 * Created by qewqs on 2017-09-16.
 */

public class AccountClipsViewHolder extends RecyclerView.ViewHolder{
    ImageView Thumnail;
    ImageButton Remove;

    public AccountClipsViewHolder(final View itemView) {
        super(itemView);

        Thumnail = (ImageView) itemView.findViewById(R.id.Clipse_Thumnail);
        Remove = (ImageButton) itemView.findViewById(R.id.Clips_remove);
        itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int itemPosition = getLayoutPosition();
                Toast.makeText(itemView.getContext(), "Item ID : " + itemPosition, Toast.LENGTH_SHORT).show();
            }
        });
    }

}
