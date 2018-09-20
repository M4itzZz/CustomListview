package com.example.opilane.customlistview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.ArrayMap;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    String [] listviewTitle=new String[]{
            "Henry VIII","Edward VI", "Mary I", "Elizabeth I","James I","Charles I","Charles II","James II"
    };
    int [] listviewImage = new int[]{
            R.drawable.henry, R.drawable.edward, R.drawable.bloody_mary, R.drawable.elizabeth,
            R.drawable.james, R.drawable.charles, R.drawable.charles_sec, R.drawable.james_sec
    };

    String[] listviewContent=new String[]{
            "King from 1509 to 1547","King from 1547 to 1553",
            "Queen from 1553 to 1558", "Queen from 1558 to 1603",
            "King from 1603 to 1625", "King from 1625 to 1649",
            "King from 1660 to 1685", "King from 1685 to 1688"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        List<ArrayMap<String, String>> list=new ArrayList<ArrayMap<String, String>>();
        for(int i=0; i<8;i++){
            ArrayMap<String, String> arrayMap = new ArrayMap<>();
            arrayMap.put("listview_title", listviewTitle[i]);
            arrayMap.put("listview_content", listviewContent[i]);
            arrayMap.put("listview_image", Integer.toString(listviewImage[i]));
        }
        String[] from={"listview_image", "listview_title", "listview_content"};
        int[] to ={R.id.listview_image, R.id.listview_item_title, R.id.listview_item_content};

        SimpleAdapter simpleAdapter=new SimpleAdapter(getBaseContext(), list, R.layout.listview_activity, from, to);
        ListView listView=findViewById(R.id.ListView);
        listView.setAdapter(simpleAdapter);
    }
}
