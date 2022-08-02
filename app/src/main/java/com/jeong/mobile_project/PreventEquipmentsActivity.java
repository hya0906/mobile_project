package com.jeong.mobile_project;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class PreventEquipmentsActivity extends AppCompatActivity {
    public ImageView itemimage;
    public TextView itemtext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_prevent_equipments);

        Toolbar toolbar = (Toolbar)findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayShowCustomEnabled(true); // Custom Actionbar를 사용하기 위해 CustomEnabled을 true
        actionBar.setDisplayShowTitleEnabled(false); // 액션바에 표시되는 제목의 표시유무를 설정합니다.
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
            case R.id.menu3:
                intent = new Intent(this,DistanceActivity.class);
                startActivity(intent);
                break;
            case R.id.menu2:
                intent = new Intent(this, KindActivity.class);
                startActivity(intent);
                break;
        }
        return super.onOptionsItemSelected(item);
    }
    public void onClick(View v){
        Intent intent = new Intent(this, PreventItemActivity.class);
        switch (v.getId()){
            case R.id.Button1:
                intent.putExtra("link","https://smartstore.naver.com/wjttl-mask/products/5443299838");
                intent.putExtra("image",R.drawable.mask);
                intent.putExtra("title","방역마스크");
                break;
            case R.id.Button2:
                intent.putExtra("link","https://search.shopping.naver.com/catalog/23268253491?cat_id=50006879&frm=NVSCPRO&query=%EC%86%90+%EC%86%8C%EB%8F%85%EC%A0%9C&NaPm=ct%3Dkoeo5e9k%7Cci%3Da5184988e2c4f9e7ab34ed3f63a4411874b8d5c2%7Ctr%3Dsls%7Csn%3D95694%7Chk%3D14ca9adc096ef097770c35c592478102b9d2a37e");
                intent.putExtra("image",R.drawable.sanitizer);
                intent.putExtra("title","손 소독제");
                break;
            case R.id.Button3:
                intent.putExtra("link","https://search.shopping.naver.com/catalog/18757848855?cat_id=50009660&frm=NVSCPRO&query=%EC%86%90+%EC%86%8C%EB%8F%85+%ED%8B%B0%EC%8A%88&NaPm=ct%3Dkoeob174%7Cci%3D2baaf1b17b115da1dce98bdb92552303fb9ddf71%7Ctr%3Dsls%7Csn%3D95694%7Chk%3Dce0528981fc5bd80511c973e4ec74fe64b1ae5ed");
                intent.putExtra("image",R.drawable.tissue);
                intent.putExtra("title","손 소독 티슈");
                break;
            case R.id.Button4:
                intent.putExtra("link","https://search.shopping.naver.com/catalog/22859121449?query=%EC%82%B4%EA%B7%A0%20%EC%8A%A4%ED%94%84%EB%A0%88%EC%9D%B4&NaPm=ct%3Dkoeodwlc%7Cci%3D2fabfa7bc6d066ac3d9e3c244d93c54a9a9f026a%7Ctr%3Dslsl%7Csn%3D95694%7Chk%3D7bbf1b53e38ddfb88b2f60c0c6eb804deb4637e1");
                intent.putExtra("image",R.drawable.spray);
                intent.putExtra("title","살균 스프레이");
                break;
            case R.id.Button5:
                intent.putExtra("link","https://smartstore.naver.com/tings/products/5125370271?NaPm=ct%3Dkoeohrhc%7Cci%3Ddcacf9f2fe3ef61bf534e10a1941f27148d6ba00%7Ctr%3Dslsl%7Csn%3D1137930%7Chk%3D1d458747a41ba09595f8b1ad330221f4c30bee4a");
                intent.putExtra("image",R.drawable.simplesanitizer);
                intent.putExtra("title","휴대용 손 소독제");
                break;
            case R.id.Button6:
//                itemimage.setImageResource(R.drawable.sensor);
//                itemtext.setText("붙이는 체온계");
                intent.putExtra("link","https://search.shopping.naver.com/catalog/25159249279?cat_id=50002047&frm=NVSCPRO&query=%EB%A9%94%EB%94%94%EC%8A%A4%ED%82%A8%EC%84%BC%EC%84%9C&NaPm=ct%3Dkoeoocd4%7Cci%3D0b77f22e3796f8bf9dfa6fdc94f8a93c813fb68a%7Ctr%3Dsls%7Csn%3D95694%7Chk%3Daaf22e49f386fbef352926b33d973b31478b9bbb");
                intent.putExtra("image",R.drawable.sensor);
                intent.putExtra("title","붙이는 체온계");
                break;
        }
        startActivity(intent);
    }

}