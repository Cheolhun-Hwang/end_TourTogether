package com.hchooney.qewqs.tourtogether.Fragment;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;

import com.hchooney.qewqs.tourtogether.Columns.AutofitGridManager;
import com.hchooney.qewqs.tourtogether.Columns.ColumnItem;
import com.hchooney.qewqs.tourtogether.Columns.fullSceneAdapter;
import com.hchooney.qewqs.tourtogether.Columns.fullitemAdapter;
import com.hchooney.qewqs.tourtogether.R;

import java.util.ArrayList;

public class ColumnFragment extends Fragment {
    private View view;

    private RecyclerView recyclerView;
    private ArrayList<ColumnItem> list;
    private LinearLayoutManager linearLayoutManager;

    private ImageButton fliper;
    private boolean flag_fliper;

    public ColumnFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_column, container, false);
        init();
        return view;
    }

    private void init(){
        flag_fliper = false;
        list = new ArrayList<ColumnItem>();
        setData();
        recyclerView = (RecyclerView) view.findViewById(R.id.column_recyclerview);
        recyclerView.setHasFixedSize(true);
        linearLayoutManager = new LinearLayoutManager(getContext(), LinearLayoutManager.HORIZONTAL, false);

        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setAdapter(new fullSceneAdapter(getContext(), list));



    }

    private void setData(){
        list.add(new ColumnItem("1", "Column One", "첫번째 칼럼의 내용 부분입니다.", "2017-01-11", "None"));
        list.add(new ColumnItem("2", "Column Two", "두번째 칼럼의 내용 부분입니다.", "2017-01-12", "None"));
        list.add(new ColumnItem("3", "Column Three", "세번째 칼럼의 내용 부분입니다.", "2017-01-13", "None"));
        list.add(new ColumnItem("4", "Column Four", "네번째 칼럼의 내용 부분입니다.", "2017-01-14", "None"));
        list.add(new ColumnItem("5", "Column Five", "다섯번째 칼럼의 내용 부분입니다.", "2017-01-15", "None"));
        list.add(new ColumnItem("6", "Column Six", "여섯번째 칼럼의 내용 부분입니다.", "2017-01-16", "None"));
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);

    }

    @Override
    public void onDetach() {
        super.onDetach();

    }

}
