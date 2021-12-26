package com.nomadlab.mylistview.adapter;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import com.bumptech.glide.Glide;
import com.nomadlab.mylistview.R;
import com.nomadlab.mylistview.model.Food;

import java.util.ArrayList;

public class FoodListAdapter extends BaseAdapter {

    ArrayList<Food> data;
    Context context; // LayoutInflater 사용하기 위해 전달 받음

    public FoodListAdapter(ArrayList<Food> data, Context context) {
        this.data = data;
        this.context = context;
    }

    /*전체 갯수를 알아야 adapter 가 조정할 수 있다.*/
    @Override
    public int getCount() {
        return data.size();
    }

    // 데이터 하나를 알려 준다.
    @Override
    public Object getItem(int i) {
        Log.d("TAG", "getItem i : " + i);
        return data.get(i);
    }

    // 목록의 각 행에 대해 고유한 ID를 정의하는 메소드를 구현합니다 .
    // 간단하게 하기 위해 항목의 위치를 보통 ID로 사용하면 됩니다.
    @Override
    public long getItemId(int i) {
        return i;
    }

    // 레이아웃 파일과 데이터를 활용해서 각각 뷰를 그려준다.
//    @Override
//    public View getView(int i, View view, ViewGroup viewGroup) {
//
//
//        Log.d("TAG", "getView i : " + i);
//        // 그리고자 하는 아이템 하나(xml 이용)
//        LayoutInflater inflater = LayoutInflater.from(context);
//        View itemView = inflater.inflate(R.layout.item_food, null);
//        ImageView imageView = itemView.findViewById(R.id.thumbnailImageView);
//        TextView titleTextView = itemView.findViewById(R.id.titleTextView);
//        TextView subTitleView = itemView.findViewById(R.id.subTitleTextView);
//        TextView detailTextView = itemView.findViewById(R.id.detailTextView);
//
//        Food food = data.get(i);
//
//        Glide.with(context)
//                .load(food.getThumbnail())
//                .centerCrop()
//                .into(imageView);
//
//        titleTextView.setText(food.getTitle());
//        subTitleView.setText(food.getSubTitle());
//        detailTextView.setText(food.getDetail());
//
//        return itemView;
//    }

    // 성능 개선 -> viewHolder 개념 추가
    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        View itemView;
        FoodListViewHolder viewHolder;
        // view 가 한번도 만들어 지지 않았다면
        if (view == null) {
            viewHolder = new FoodListViewHolder();
            LayoutInflater inflater = LayoutInflater.from(context);
            itemView = inflater.inflate(R.layout.item_food, null);
            viewHolder.imageView = itemView.findViewById(R.id.thumbnailImageView);
            viewHolder.titleTextView = itemView.findViewById(R.id.titleTextView);
            viewHolder.subTitleView = itemView.findViewById(R.id.subTitleTextView);
            viewHolder.detailTextView = itemView.findViewById(R.id.detailTextView);
            // 중요 ~
            // 찾을 수 있도록 태그를 달아 놓는다.
            itemView.setTag(viewHolder);
        } else {
            viewHolder = (FoodListViewHolder) view.getTag();
            itemView = view;
        }

        Food food = data.get(i);
        Glide.with(context)
                .load(food.getThumbnail())
                .centerCrop()
                .into(viewHolder.imageView);

        viewHolder.titleTextView.setText(food.getTitle());
        viewHolder.subTitleView.setText(food.getSubTitle());
        viewHolder.detailTextView.setText(food.getDetail());

        return itemView;
    }
}
