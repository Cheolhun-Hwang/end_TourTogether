package com.hchooney.qewqs.tourtogether.MyFragment;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.Toast;

import com.hchooney.qewqs.tourtogether.ColumnItem.ColumnItems;
import com.hchooney.qewqs.tourtogether.ColumnItem.ColumnRecyclerViewAdapter;
import com.hchooney.qewqs.tourtogether.R;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class ColumnFragment extends Fragment {
    private static final String TAG = "ColumnFragment";
    private View view;
    private ArrayList<ColumnItems> columnItemses;
    private ColumnRecyclerViewAdapter viewAdapter;
    //private LinearLayoutManager layoutManager;
    private GridLayoutManager gridLayoutManager;


    private EditText Search;
    private Spinner HowToSearch;
    private RecyclerView recyclerView;
    private LinearLayout List_Layout;

    //meta

    private int Spinner_Sectitem;

    public ColumnFragment() {
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
        view = inflater.inflate(R.layout.fragment_column, container, false);
        init_view(view);

        return view;
    }

    private void init(){
        this.columnItemses = new ArrayList<ColumnItems>();
        roadColumnData();
        /*this.layoutManager = new LinearLayoutManager(getContext());
        this.layoutManager.setOrientation(LinearLayoutManager.VERTICAL);*/
        this.gridLayoutManager = new GridLayoutManager(getContext(), 2);
        this.viewAdapter = new ColumnRecyclerViewAdapter(this.columnItemses);

        Spinner_Sectitem = 0;

    }

    private void init_view(View view){
        recyclerView = (RecyclerView) view.findViewById(R.id.Column_RecyclerView);
        Search = (EditText) view.findViewById(R.id.Column_editText);
        HowToSearch = (Spinner) view.findViewById(R.id.Column_spinner);
        HowToSearch.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int position, long id) {
                if(position == 0){
                    Spinner_Sectitem = 0;
                    Toast.makeText(getContext(), HowToSearch.getSelectedItem().toString(), Toast.LENGTH_SHORT).show();
                }else if(position == 1){
                    Spinner_Sectitem = 1;
                    Toast.makeText(getContext(), HowToSearch.getSelectedItem().toString(), Toast.LENGTH_SHORT).show();
                }else if(position == 2){
                    Spinner_Sectitem = 2;
                    Toast.makeText(getContext(), HowToSearch.getSelectedItem().toString(), Toast.LENGTH_SHORT).show();
                }else{
                    Toast.makeText(getContext(), "잘못된 선택입니다.", Toast.LENGTH_SHORT).show();
                    Log.e(TAG, "Spinner Error");
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
        List_Layout = (LinearLayout) view.findViewById(R.id.Column_ListviewLayout);


        recyclerView.setLayoutManager(this.gridLayoutManager);
        recyclerView.setAdapter(this.viewAdapter);

    }

    private void roadColumnData(){
        columnItemses.add(new ColumnItems("Title_One"));
        columnItemses.add(new ColumnItems("Title_Two"));
        columnItemses.add(new ColumnItems("Title_Three"));
        columnItemses.add(new ColumnItems("Title_Four"));
        columnItemses.add(new ColumnItems("Title_Five"));
        columnItemses.add(new ColumnItems("Title_Six"));
        columnItemses.add(new ColumnItems("Title_Seven"));
        columnItemses.add(new ColumnItems("Title_Eg"));
        columnItemses.add(new ColumnItems("Title_Nine"));
    }
}
