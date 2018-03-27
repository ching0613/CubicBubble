package com.example.wen_cheng.cubicbubble;

import android.content.Intent;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

public class ChooseActivity extends AppCompatActivity {

    public ImageButton back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose);
        initView();
        onDeclare();
    }

     /*    onDeclare : 宣告區
     *    initView : 繪製函數
     *    bclick : 處理任何按鈕事件
     *    onKeyDown : 監聽返回鍵
     */

    private void onDeclare() {
        back = (ImageButton)findViewById(R.id.imageButton);
    }

    private void initView() {
        ConstraintLayout layout = (ConstraintLayout) findViewById(R.id.menu);
        DrawChoose view = new DrawChoose(this);
        view.invalidate();
        layout.addView(view);
    }

    public void bclick(View view) {
        switch (view.getId()){
            case R.id.imageButton:{
                startActivity(new Intent(this,HomeActivity.class));
                this.finish();
                break;
            }
            case R.id.button3:{
                break;
            }
            case R.id.button4:{
                break;
            }
            case R.id.button5:{
                break;
            }
        }
    }

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if (keyCode == KeyEvent.KEYCODE_BACK) {
            startActivity(new Intent(this,HomeActivity.class));
            this.finish();
        }
        return false;
    }
}
