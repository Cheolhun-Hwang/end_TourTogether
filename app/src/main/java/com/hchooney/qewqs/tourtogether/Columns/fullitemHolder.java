package com.hchooney.qewqs.tourtogether.Columns;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.hchooney.qewqs.tourtogether.R;

/**
 * Created by hooney on 2017. 11. 19..
 */

public class fullitemHolder extends RecyclerView.ViewHolder {
    //public TextView context;
    public ImageView image;

    public fullitemHolder(View itemView) {
        super(itemView);
        //context = (TextView) itemView.findViewById(R.id.item_column_fullitem_context);
        image = (ImageView) itemView.findViewById(R.id.item_column_fullitem_image);
    }
}
