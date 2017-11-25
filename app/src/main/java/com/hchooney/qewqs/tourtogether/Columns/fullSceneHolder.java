package com.hchooney.qewqs.tourtogether.Columns;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.hchooney.qewqs.tourtogether.R;

/**
 * Created by hooney on 2017. 11. 18..
 */

public class fullSceneHolder extends RecyclerView.ViewHolder {
    public TextView Context;
    public TextView Num;
    public ImageView Image;
    public TextView Date;

    public fullSceneHolder(View itemView) {
        super(itemView);

        this.Context = (TextView) itemView.findViewById(R.id.item_column_fullscene_context);
        this.Image = (ImageView) itemView.findViewById(R.id.item_column_fullscene_imageview);
        this.Num = (TextView) itemView.findViewById(R.id.item_column_fullscene_num);
        this.Date = (TextView) itemView.findViewById(R.id.item_column_fullscene_date);
    }
}
