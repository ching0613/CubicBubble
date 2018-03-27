package com.example.wen_cheng.cubicbubble;

import android.content.Intent;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class HomeActivity extends AppCompatActivity {

    public Button buttonMenu,buttonPlay;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        initView();
        onDeclare();
    }

    /*    onDeclare : 宣告區
     *    initView : 繪製函數
     *    bclick : 處理任何按鈕事件
     *    onKeyDown : 監聽返回鍵
     */

    private void onDeclare() {
        buttonMenu = (Button)findViewById(R.id.button);
        buttonPlay = (Button)findViewById(R.id.button2);
    }

    private void initView() {
        ConstraintLayout layout = (ConstraintLayout) findViewById(R.id.root);
        DrawHome view = new DrawHome(this);
        view.invalidate();
        layout.addView(view);
    }


    public void bclick(View view) {
        switch (view.getId()){
            case R.id.button:{
                startActivity(new Intent(this,ChooseActivity.class));
                this.finish();
                break;
            }
            case R.id.button2:{
                startActivity(new Intent(this,GameActivity.class));
                this.finish();
                break;
            }
        }
    }

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if (keyCode == KeyEvent.KEYCODE_BACK) {
            Toast.makeText(HomeActivity.this,
                    "這邊可以做一個提示離開訊息Dialog，或是連按兩次離開",
                    Toast.LENGTH_LONG).show();
            this.finish();
        }
        return false;
    }
}

