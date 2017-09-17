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
import com.hchooney.qewqs.tourtogether.ColumnItem.ColumnItems;
import com.hchooney.qewqs.tourtogether.R;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class LikeLocationFragment extends Fragment {
    private View view;
    private ArrayList<AccountLikeListItem> likeListItems;
    private AccountLikeListAdapter viewAdapter;
    private LinearLayoutManager layoutManager;

    private RecyclerView recyclerView;

    public LikeLocationFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        this.likeListItems = new ArrayList<AccountLikeListItem>();
        roadColumnData();
        this.layoutManager = new LinearLayoutManager(getContext());
        this.layoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        this.viewAdapter = new AccountLikeListAdapter(this.likeListItems);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_like_location, container, false);
        init_view(view);
        return view;
    }

    private void init_view(View view){
        recyclerView = (RecyclerView) view.findViewById(R.id.likelist_recyclerview);


        recyclerView.setLayoutManager(this.layoutManager);
        recyclerView.setAdapter(this.viewAdapter);

    }

    private void roadColumnData(){
        this.likeListItems.add(new AccountLikeListItem());
        this.likeListItems.add(new AccountLikeListItem());
        this.likeListItems.add(new AccountLikeListItem());
        this.likeListItems.add(new AccountLikeListItem());
        this.likeListItems.add(new AccountLikeListItem());
        this.likeListItems.add(new AccountLikeListItem());
        this.likeListItems.add(new AccountLikeListItem());
        this.likeListItems.add(new AccountLikeListItem());
    }

}
