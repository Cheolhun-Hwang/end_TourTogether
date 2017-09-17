package com.hchooney.qewqs.tourtogether.SettingNotice;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.hchooney.qewqs.tourtogether.R;

import java.util.ArrayList;

/**
 * Created by qewqs on 2017-09-16.
 */

public class NoticeAdapter extends RecyclerView.Adapter {
    private ArrayList<NoticeItems> noticeItemses;
    private Context myContext;

    public NoticeAdapter(ArrayList<NoticeItems> noticeItemses) {
        this.noticeItemses = noticeItemses;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        myContext = viewGroup.getContext();
        View item = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.notice_list_item, viewGroup, false);
        return new NoticeViewHolder(item);
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, final int position) {
        NoticeItems noticeItems = this.noticeItemses.get(position);
        NoticeViewHolder item = (NoticeViewHolder) viewHolder;
        //추후 이미지를 추가할것.
        /*item.Thumnail.setImageBitmap();*/

        item.Filter.setText(noticeItems.getFilter());
        item.Title.setText(noticeItems.getTitle());
        item.When.setText(noticeItems.getWhen());
        item.Showup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(myContext, "ID : " + position, Toast.LENGTH_SHORT).show();
            }
        });


    }

    @Override
    public int getItemCount() {
        return this.noticeItemses.size();
    }
}
