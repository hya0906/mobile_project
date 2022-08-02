package com.jeong.mobile_project;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class DistanceActivity extends AppCompatActivity {

    TextView text_distance;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_distance);

        Toolbar toolbar = (Toolbar)findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayShowCustomEnabled(true); // Custom Actionbar를 사용하기 위해 CustomEnabled을 true
        actionBar.setDisplayShowTitleEnabled(false); // 액션바에 표시되는 제목의 표시유무를 설정합니다.

        text_distance = (TextView)findViewById(R.id.btn_distance);
        text_distance.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://ncov.mohw.go.kr/socdisBoardView.do?brdId=6&brdGubun=1"));
                startActivity(intent);
            }
        });
    }

    @Override //메뉴를 붙이는
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.menu1,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        Intent intent;
        switch (item.getItemId()){
            case R.id.menu1:
                intent = new Intent(this, SideEffectActivity.class);
                startActivity(intent);
                break;
            case R.id.menu2:
                intent = new Intent(this, KindActivity.class);
                startActivity(intent);
                break;
            case R.id.menu4:
                intent = new Intent(this, PreventEquipmentsActivity.class);
                startActivity(intent);
                break;
        }
        return super.onOptionsItemSelected(item);
    }
}