package com.hchooney.qewqs.tourtogether.Columns;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.hchooney.qewqs.tourtogether.R;

import java.util.ArrayList;

/**
 * Created by hooney on 2017. 11. 18..
 */

public class fullSceneAdapter extends RecyclerView.Adapter {

    private Context context;
    private ArrayList<ColumnItem> list;


    // Allows to remember the last item shown on screen
    private int lastPosition = -1;

    public fullSceneAdapter(Context context, ArrayList<ColumnItem> list) {
        this.context = context;
        this.list = list;

    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_column_fullscene,parent,false);
        fullSceneHolder holder = new fullSceneHolder(v);
        return holder;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, final int position) {
        fullSceneHolder hold = (fullSceneHolder) holder;
        hold.Context.setText(list.get(position).getContext());
        hold.Date.setText(list.get(position).getDate());
        hold.Num.setText((position+1) + " of " + list.size());
        //image for ficasso
        GradientDrawable drawable=
                (GradientDrawable) context.getDrawable(R.drawable.image_round);
        hold.Image.setBackground(drawable);
        hold.Image.setClipToOutline(true);

        hold.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(context, "ID : " + list.get(position).getID(), Toast.LENGTH_SHORT).show();
            }
        });


    }

    @Override
    public int getItemCount() {
        return this.list.size();
    }
}
