package com.may.game;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private GameView gameView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        Button bLeft = findViewById(R.id.button_left);
//        bLeft.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//
//            }
//        });
//  上面是方法一，implenents是方法二
       // findView();

        findViewById(R.id.image_down).setOnClickListener(this);
        findViewById(R.id.image_up).setOnClickListener(this);
        findViewById(R.id.image_left).setOnClickListener(this);
        findViewById(R.id.image_right).setOnClickListener(this);
        gameView = findViewById(R.id.game);


    }
//
//    private void findView() {
//        findViewById(R.id.button_left).setOnClickListener(this);
//        findViewById(R.id.button_right).setOnClickListener(this);
//        findViewById(R.id.button_up).setOnClickListener(this);
//        findViewById(R.id.button_down).setOnClickListener(this);
//    }



    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.image_up:
                Log.d("MainActivity","OnClick:up");
                gameView.setPosY(gameView.getPosY()-50);
                gameView.invalidate();
                break;
            case R.id.image_down:
                Log.d("MainActivity","OnClick:down");
                gameView.setPosY(gameView.getPosY()+50);
                gameView.invalidate();
                break;
            case R.id.image_left:
                Log.d("MainActivity","OnClick:left");
                gameView.setPosX(gameView.getPosX()-50);
                gameView.invalidate();
                break;
            case R.id.image_right:
                Log.d("MainActivity","OnClick:right");
                gameView.setPosX(gameView.getPosX()+50);
                gameView.invalidate();
                break;
        }

    }
//    @Override
//    public void onClick(View view) {
//        switch (view.getId()){
//            case R.id.button_up:
//                Log.d("MainActivity","OnClick:up");
//                break;
//            case R.id.button_down:
//                Log.d("MainActivity","OnClick:down");
//                break;
//            case R.id.button_left:
//                Log.d("MainActivity","OnClick:left");
//                break;
//            case R.id.button_right:
//                Log.d("MainActivity","OnClick:right");
//                break;
//        }
//
//    }
}
