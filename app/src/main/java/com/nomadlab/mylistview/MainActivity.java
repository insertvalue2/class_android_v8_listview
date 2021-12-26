package com.nomadlab.mylistview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.nomadlab.mylistview.adapter.FoodListAdapter;
import com.nomadlab.mylistview.model.Food;

import java.util.ArrayList;

/*
*   1. 리스트로 만들고 싶은 아이템 리스트를 준비한다. (XML, 데이터)
*   2. 코드에서 인플레이터를 준비한다.
*   3. 인플레이터로 아이템 하나에 해당하는 뷰를 만들어 준다.
*   4. 위에서 만든 뷰를 컨테이너 뷰에 붙여 준다.
*
*   ListView
*   1. 리스트로 만들고 싶은 아이템의 리스트를 준비한다.
*   2. Adapter 를 이용한다.
*
*   AddView 와 ListView 의 차이점
*   1. 만드는 방식이 다르다.
*   2. 그리는 방식이 다르다. (가장 큰 차이점)
*       - AddView 는 리스의 갯수와 상관없이 한번에 다 그린다.
*       - ListView 보여지는 부분 + 알파만 한번에 그리고 필요한 경우(스크롤시) 더 그린다.
*
* */
public class MainActivity extends AppCompatActivity {

    FoodListAdapter foodListAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // get sample data
        ArrayList<Food> foods =  Food.getSampleData();
        foodListAdapter = new FoodListAdapter(foods, this);
        ListView listView = findViewById(R.id.foodListView);

        listView.setAdapter(foodListAdapter);

        // 이벤트 리스너 사용방법
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Log.d("TAG", " selected Id : " + i);
                Intent intent = new Intent(view.getContext(), DetailActivity.class);
                // 직렬화(Serialization)란?
                // 네트워크를 통해 다른 곳으로 전송할 수 있는 형식이나 파일에 저장할 수 있는 형식으로 객체를 변환하는 것을 말한다.
                // object 를 intent 로 전달하기 위해서는 직렬화 처리를 해야 한다.
                intent.putExtra("serialObj", foods.get(i));
                startActivity(intent);
            }
        });
    }
}