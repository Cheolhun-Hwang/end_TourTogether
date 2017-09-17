package com.hchooney.qewqs.tourtogether;

import android.app.DatePickerDialog;
import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class SheetActivity extends AppCompatActivity {
    private static final String TAG = "SheetActivity";

    private TextView textView1;
    private TextView textView2;
    private TextView textView3;
    private TextView textView4;

    private TextView Needs_TItle;
    private TextView Needs_age;
    private TextView Needs_sex;

    private TextView Choise_title;
    private TextView Choise_sub1;
    private TextView Choise_sub2;

    private RadioGroup Needs_RG;
    private RadioButton Needs_man;
    private RadioButton Needs_woman;

    private Button Needs_DatePickerBTN;

    private EditText Choise_Email_Edittext;

    private ImageButton Sheets_Complete_IMGBTN;

    private int age_year;
    private int age_month;
    private int age_day;

    private int mYear, mMonth, mDay;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sheet);

        init();
        Event();

    }


    private void init(){
        textView1 = (TextView) findViewById(R.id.Sheet_textView1);
        textView1.setTypeface(Typeface.createFromAsset(getAssets(), "HoonMakdaeyunpilR.ttf"));
        textView2 = (TextView) findViewById(R.id.Sheet_textView2);
        textView2.setTypeface(Typeface.createFromAsset(getAssets(), "HoonMakdaeyunpilR.ttf"));
        textView3 = (TextView) findViewById(R.id.Sheet_textView3);
        textView3.setTypeface(Typeface.createFromAsset(getAssets(), "HoonMakdaeyunpilR.ttf"));
        textView4 = (TextView) findViewById(R.id.Sheet_textView4);
        textView4.setTypeface(Typeface.createFromAsset(getAssets(), "HoonMakdaeyunpilR.ttf"));
        Needs_TItle = (TextView) findViewById(R.id.Sheet_needs_title);
        Needs_TItle.setTypeface(Typeface.createFromAsset(getAssets(), "HoonMakdaeyunpilR.ttf"));
        Needs_age = (TextView) findViewById(R.id.Sheet_needs_ages);
        Needs_age.setTypeface(Typeface.createFromAsset(getAssets(), "HoonMakdaeyunpilR.ttf"));
        Needs_sex = (TextView) findViewById(R.id.Sheet_needs_sex);
        Needs_sex.setTypeface(Typeface.createFromAsset(getAssets(), "HoonMakdaeyunpilR.ttf"));
        Needs_RG = (RadioGroup) findViewById(R.id.Sheet_needs_RG);
        Needs_man = (RadioButton) findViewById(R.id.Sheet_needs_RB_man);
        Needs_woman = (RadioButton) findViewById(R.id.Sheet_needs_RB_woman);
        Needs_DatePickerBTN = (Button) findViewById(R.id.Sheet_datepicker_btn);

        Choise_title = (TextView) findViewById(R.id.Sheet_choise_title);
        Choise_title.setTypeface(Typeface.createFromAsset(getAssets(), "HoonMakdaeyunpilR.ttf"));
        Choise_sub1 = (TextView) findViewById(R.id.Sheet_choise_sub1);
        Choise_sub2 = (TextView) findViewById(R.id.Sheet_choise_sub2);
        Choise_Email_Edittext = (EditText) findViewById(R.id.Sheet_choise_Emailedittext);

        Sheets_Complete_IMGBTN = (ImageButton) findViewById(R.id.Sheet_complete);

        Calendar cal = new GregorianCalendar();
        mYear = cal.get(Calendar.YEAR);
        mMonth = cal.get(Calendar.MONTH);
        mDay = cal.get(Calendar.DAY_OF_MONTH);
    }

    private void Event(){
        Needs_DatePickerBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d(TAG, "Date Picker on");
                //DatePickerDialog DPD = new DatePickerDialog(SheetActivity.this, mDateSetListener, mYear, mMonth, mDay);
                DatePickerDialog DPD = new DatePickerDialog(SheetActivity.this, android.R.style.Theme_Holo_Light_Dialog, mDateSetListener, mYear, mMonth, mDay);
                DPD.setTitle("생년월일을 선택해주세요.");
                DPD.getWindow().setBackgroundDrawableResource(R.color.alpha);
                DPD.show();

            }
        });

        Sheets_Complete_IMGBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!(Needs_DatePickerBTN.getText().equals("날짜를 선택해주세요."))){
                    if (!(Needs_man.isChecked()) && !(Needs_woman.isChecked()) ){
                        Toast.makeText(getApplicationContext(), "성별을 선택해주세요.", Toast.LENGTH_SHORT).show();
                    }else{
                        Toast.makeText(getApplicationContext(), "사용자 정보를 저장하였습니다..", Toast.LENGTH_SHORT).show();
                        Intent intent = new Intent(SheetActivity.this, MainActivity.class);
                        startActivity(intent);
                        finish();
                    }
                }else{
                    Toast.makeText(getApplicationContext(), "언제 태어났는지 선택해주세요.", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    DatePickerDialog.OnDateSetListener mDateSetListener = new DatePickerDialog.OnDateSetListener() {
        @Override
        public void onDateSet(DatePicker datePicker, int year, int month, int day) {
            mYear = year;
            mMonth = month;
            mDay = day;
            age_year = year;
            age_month = month+1;
            age_day = day;

            Needs_DatePickerBTN.setText(age_year + " / " + age_month + " / " + age_day);
        }
    };
}
