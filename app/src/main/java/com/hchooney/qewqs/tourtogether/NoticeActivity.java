package com.hchooney.qewqs.tourtogether;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageButton;

import com.hchooney.qewqs.tourtogether.AccountListsItems.AccountLikeListItem;
import com.hchooney.qewqs.tourtogether.SettingNotice.NoticeAdapter;
import com.hchooney.qewqs.tourtogether.SettingNotice.NoticeItems;

import java.util.ArrayList;

public class NoticeActivity extends AppCompatActivity {

    private final String TAG = "NoticeActivity";

    private ArrayList<NoticeItems> noticeItemsArrayList;
    private NoticeAdapter viewAdapter;
    private LinearLayoutManager layoutManager;


    private ImageButton back;
    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notice);


        this.noticeItemsArrayList = new ArrayList<NoticeItems>();
        roadColumnData();
        this.layoutManager = new LinearLayoutManager(getApplicationContext());
        this.layoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        this.viewAdapter = new NoticeAdapter(this.noticeItemsArrayList);


        init_view();
    }

    private void init_view(){
        recyclerView = (RecyclerView) findViewById(R.id.Notice_RecyclerView);
        back = (ImageButton) findViewById(R.id.Notice_Close);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });


        recyclerView.setLayoutManager(this.layoutManager);
        recyclerView.setAdapter(this.viewAdapter);

    }

    private void roadColumnData(){
        this.noticeItemsArrayList.add(new NoticeItems());
        this.noticeItemsArrayList.add(new NoticeItems());
        this.noticeItemsArrayList.add(new NoticeItems());
        this.noticeItemsArrayList.add(new NoticeItems());
        this.noticeItemsArrayList.add(new NoticeItems());
        this.noticeItemsArrayList.add(new NoticeItems());
        this.noticeItemsArrayList.add(new NoticeItems());
        this.noticeItemsArrayList.add(new NoticeItems());
        this.noticeItemsArrayList.add(new NoticeItems());
        this.noticeItemsArrayList.add(new NoticeItems());
    }
}
