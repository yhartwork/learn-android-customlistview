package com.example.learncustomlistview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import java.util.ArrayList;
import java.util.HashMap;

public class MainActivity extends AppCompatActivity {

    ListView listView;
    SimpleAdapter adapter;
    HashMap<String, String> map;
    ArrayList<HashMap<String, String>> mylist;
    String[] jdl;
    String[] ktr;
    String[] img;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView = (ListView)findViewById(R.id.list_view);
        jdl = new String[] {
                "Sampokong","Waterpark","Mangkang","Wonderia","Gereja Blenduk"
        };
        ktr = new String[]{
                "Tempat Wisata","Tempat Wisata","Tempat Wisata","Tempat Wisata","Tempat Wisata","Tempat Wisata"
        };
        img = new String[]{
                Integer.toString(R.drawable.sampokong),Integer.toString(R.drawable.waterpark),Integer.toString(R.drawable.mangkang),
                Integer.toString(R.drawable.wonderia),Integer.toString(R.drawable.gerejablenduk)
        };
        mylist = new ArrayList<HashMap<String, String>>();

        for (int i=0; i<jdl.length; i++){
            map = new HashMap<String, String>();
            map.put("judul", jdl[i]);
            map.put("Keterangan", ktr[i]);
            map.put("Gambar", img[i]);
            mylist.add(map);
        }
        adapter = new SimpleAdapter(this, mylist, R.layout.list_item,
                new String[]{"judul", "Keterangan", "Gambar"}, new int[]{R.id.txt_judul,(R.id.txt_keterangan),(R.id.img)});
        listView.setAdapter(adapter);


    }
}