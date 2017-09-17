package com.hchooney.qewqs.tourtogether.MyFragment;


import android.os.Bundle;

import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.hchooney.qewqs.tourtogether.AccountListsItems.AccountClipsAdapter;
import com.hchooney.qewqs.tourtogether.AccountListsItems.AccountClipsItem;
import com.hchooney.qewqs.tourtogether.AccountListsItems.AccountEventAdapter;
import com.hchooney.qewqs.tourtogether.AccountListsItems.AccountEventItem;
import com.hchooney.qewqs.tourtogether.AccountListsItems.AccountLikeListAdapter;
import com.hchooney.qewqs.tourtogether.AccountListsItems.AccountLikeListItem;
import com.hchooney.qewqs.tourtogether.R;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class EventListFragment extends Fragment {
    private View view;
    private ArrayList<AccountEventItem> eventItems;
    private AccountEventAdapter viewAdapter;
    private GridLayoutManager gridLayoutManager;

    private RecyclerView recyclerView;


    public EventListFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        init();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_event_list, container, false);
        init_view(view);
        return view;
    }

    private void init(){
        this.eventItems = new ArrayList<AccountEventItem>();
        roadColumnData();
        this.gridLayoutManager = new GridLayoutManager(getContext(), 2);
        this.viewAdapter = new AccountEventAdapter(this.eventItems);

    }

    private void init_view(View view){
        recyclerView = (RecyclerView) view.findViewById(R.id.Event_RecyclerView);


        recyclerView.setLayoutManager(this.gridLayoutManager);
        recyclerView.setAdapter(this.viewAdapter);

    }

    private void roadColumnData(){
        this.eventItems.add(new AccountEventItem());
        this.eventItems.add(new AccountEventItem());
        this.eventItems.add(new AccountEventItem());
        this.eventItems.add(new AccountEventItem());
        this.eventItems.add(new AccountEventItem());
        this.eventItems.add(new AccountEventItem());
        this.eventItems.add(new AccountEventItem());
        this.eventItems.add(new AccountEventItem());
        this.eventItems.add(new AccountEventItem());
    }

}
