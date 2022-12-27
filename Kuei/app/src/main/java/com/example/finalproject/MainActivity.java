package com.example.finalproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.GridView;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    class Data{
        int photo;
        String name ;
    }
    private ImageButton imageButton;

    public class MyAdapter extends BaseAdapter {
        private MainActivity.Data[] data;
        private int view;


        public MyAdapter(MainActivity.Data[] data, int view){
            this.data = data;
            this.view = view;
        }

        @Override
        public int getCount() {
            return data.length;
        }

        @Override
        public Object getItem(int position) {
            return data[position];
        }

        @Override
        public long getItemId(int position) {
            return 0;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {

            convertView = getLayoutInflater().inflate(view,parent,false);
            TextView name = convertView.findViewById(R.id.stagename);
            name.setText(data[position].name);
            ImageView imageView = convertView.findViewById(R.id.imageButton);
            imageView.setImageResource(data[position].photo);
            return convertView;
        }
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String[] transNameArray = new String[]{"修身養性","歡樂唱跳","新聞八卦"};
        int[] transPhotoIdArray = new int[]{R.drawable.stage1,R.drawable.stage2,R.drawable.stage3};

        Data[] transData = new Data[transNameArray.length];
        for (int i=0;i<transData.length;i++){
            transData[i] = new Data();
            transData[i].name = transNameArray[i];
            transData[i].photo = transPhotoIdArray[i];
        }

        MyAdapter transAdapter = new MyAdapter(transData,R.layout.stage_list);

        Spinner spinner = findViewById(R.id.stage);
        spinner.setAdapter(transAdapter);  //

        imageButton = findViewById(R.id.imageButton);
        imageButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View vv) {
                startActivityForResult(new Intent(MainActivity.this,test.class),1);
            }
        });
    }
}