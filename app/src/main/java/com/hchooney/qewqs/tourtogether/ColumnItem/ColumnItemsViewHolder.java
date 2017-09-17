package com.hchooney.qewqs.tourtogether.ColumnItem;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.hchooney.qewqs.tourtogether.R;

/**
 * Created by qewqs on 2017-09-16.
 */

public class ColumnItemsViewHolder extends RecyclerView.ViewHolder {

    ImageView Thumnail;

    public ColumnItemsViewHolder(final View itemView) {
        super(itemView);

        Thumnail = (ImageView) itemView.findViewById(R.id.ColumnItem_Thumnail);

        itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int itemPosition = getLayoutPosition();
                Toast.makeText(itemView.getContext(), "Item ID : " + itemPosition, Toast.LENGTH_SHORT).show();
            }
        });
    }
}
