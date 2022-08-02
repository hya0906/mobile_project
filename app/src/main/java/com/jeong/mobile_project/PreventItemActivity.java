package com.jeong.mobile_project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class PreventItemActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_prevent_item);
        Button btn_buy = findViewById(R.id.Button_Buy);
        Button btn_back = findViewById(R.id.Button_Back);
        Intent intent = getIntent();
        String link = intent.getStringExtra("link");
        Integer image = intent.getIntExtra("image",10);
        String title = intent.getStringExtra("title");

        ImageView itemimage = (ImageView) findViewById(R.id.imageItem);
        TextView itemtext = (TextView) findViewById(R.id.itemtext);

        itemimage.setImageResource(image);
        itemtext.setText(title);

        btn_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
        btn_buy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse(link));
                startActivity(i);
            }
        });

    }
    @Override //메뉴를 붙이는
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.menu1,menu);
        return true;
    }
}