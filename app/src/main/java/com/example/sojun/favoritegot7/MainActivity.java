package com.example.sojun.favoritegot7;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements CompoundButton.OnCheckedChangeListener, View.OnClickListener{
    // 멤버 필드
    TextView textquest;
    CheckBox checkSelect;
    RadioGroup rg;
    RadioButton radiojb, radioJinyoung, radioyoungjae;
    Button butok;
    ImageView imgvgot;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        checkSelect=(CheckBox)findViewById(R.id.checkbox_select);
        rg=(RadioGroup) findViewById(R.id.rg);
        radiojb=(RadioButton)findViewById(R.id.radio_jb);
        radioJinyoung=(RadioButton)findViewById(R.id.radio_jinyoung);
        radioyoungjae=(RadioButton)findViewById(R.id.radio_youngjae);
        butok=(Button)findViewById(R.id.but_ok);
        imgvgot=(ImageView)findViewById(R.id.imgv_got7);

        checkSelect.setOnCheckedChangeListener(this);
        butok.setOnClickListener(this);
    } //end onCreate

    @Override
    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
        if(checkSelect.isChecked()){
            textquest.setVisibility(buttonView.VISIBLE);
            rg.setVisibility(buttonView.VISIBLE);
            butok.setVisibility(buttonView.VISIBLE);
            imgvgot.setVisibility(buttonView.VISIBLE);
        }else{
            textquest.setVisibility(buttonView.INVISIBLE);
            rg.setVisibility(buttonView.INVISIBLE);
            butok.setVisibility(buttonView.INVISIBLE);
            imgvgot.setVisibility(buttonView.INVISIBLE);
        }
    }

    @Override
    public void onClick(View v) {
        switch (rg.getCheckedRadioButtonId()){
            case R.id.radio_jb:
                imgvgot.setImageResource(R.drawable.got7_jb);
                break;
            case R.id.radio_jinyoung:
                imgvgot.setImageResource(R.drawable.got7_jinyoung);
                break;
            case R.id.radio_youngjae:
                imgvgot.setImageResource(R.drawable.got7_youngjae);
                break;
            default:
                Toast.makeText(this, "라디오 버튼이 하나도 선택이 안되었군요.",Toast.LENGTH_SHORT).show();
        }
    }
 } //end onClick
