package com.hchooney.qewqs.tourtogether.MyFragment;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.hchooney.qewqs.tourtogether.AccountListsItems.AccountLikeListAdapter;
import com.hchooney.qewqs.tourtogether.AccountListsItems.AccountLikeListItem;
import com.hchooney.qewqs.tourtogether.AccountListsItems.AccountPointAdapter;
import com.hchooney.qewqs.tourtogether.AccountListsItems.AccountPointItem;
import com.hchooney.qewqs.tourtogether.R;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class PointFragment extends Fragment {
    private View view;
    private ArrayList<AccountPointItem> pointItems;
    private AccountPointAdapter viewAdapter;
    private LinearLayoutManager layoutManager;

    private RecyclerView recyclerView;

    public PointFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        this.pointItems = new ArrayList<AccountPointItem>();
        roadColumnData();
        this.layoutManager = new LinearLayoutManager(getContext());
        this.layoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        this.viewAdapter = new AccountPointAdapter(this.pointItems);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_point, container, false);
        init_view(view);
        return view;
    }

    private void init_view(View view){
        recyclerView = (RecyclerView) view.findViewById(R.id.Point_RecyclerView);


        recyclerView.setLayoutManager(this.layoutManager);
        recyclerView.setAdapter(this.viewAdapter);

    }

    private void roadColumnData(){
        this.pointItems.add(new AccountPointItem(true));
        this.pointItems.add(new AccountPointItem(true));
        this.pointItems.add(new AccountPointItem(false));
        this.pointItems.add(new AccountPointItem(true));
        this.pointItems.add(new AccountPointItem(false));
        this.pointItems.add(new AccountPointItem(true));
        this.pointItems.add(new AccountPointItem(false));
        this.pointItems.add(new AccountPointItem(true));
    }

}
