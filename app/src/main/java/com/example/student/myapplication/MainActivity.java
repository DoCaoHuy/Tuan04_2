package com.example.student.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements View.OnClickListener, AdapterView.OnItemClickListener {

    private TextView txtTen, txtViTri;
    private Button btnThem;
    private ListView lstDS;
    private ArrayList myList;
    private ArrayAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtTen=(TextView)findViewById(R.id.txtName);
        txtViTri=(TextView)findViewById(R.id.txtPosition) ;
        btnThem=(Button)findViewById(R.id.btnNhap);
        lstDS=(ListView)findViewById(R.id.lstDanhSach);


        btnThem.setOnClickListener(this);
        myList=new ArrayList<String>();
        adapter=new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, myList);
        lstDS.setAdapter(adapter);

        lstDS.setOnItemClickListener(this);
    }


    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btnNhap:
                myList.add(txtTen.getText()+"");
                adapter.notifyDataSetChanged();

        }
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        txtViTri.setText("Position:"+position +"; value:"+parent.getItemAtPosition(position).toString()+";");
    }
}
