package com.nomadlab.mylistview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import com.nomadlab.mylistview.model.Food;

public class DetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        if (getIntent() != null) {
            // 역직렬화(Deserialization)
            // 직렬화한 데이터를 본래의 객체로 되돌리는 변환을 역직렬화라고 한다.
            Food food = (Food) getIntent().getSerializableExtra("serialObj");
            Log.d("TAG", " foodTitle : " + food.getTitle());
        }
    }
}