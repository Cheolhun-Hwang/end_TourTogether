package com.hchooney.qewqs.tourtogether.SettingNotice;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

import com.hchooney.qewqs.tourtogether.R;

/**
 * Created by qewqs on 2017-09-16.
 */

public class NoticeViewHolder extends RecyclerView.ViewHolder {
    TextView Filter;
    TextView Title;
    TextView When;
    ImageButton Showup;

    public NoticeViewHolder(View itemView) {
        super(itemView);

        Filter = (TextView) itemView.findViewById(R.id.Notice_Filter_Textview);
        Title = (TextView) itemView.findViewById(R.id.Notice_Title_Textview);
        When = (TextView) itemView.findViewById(R.id.Notice_WriteDate_Textview);
        Showup = (ImageButton) itemView.findViewById(R.id.Notice_ShowUp_BTN);
    }
}
