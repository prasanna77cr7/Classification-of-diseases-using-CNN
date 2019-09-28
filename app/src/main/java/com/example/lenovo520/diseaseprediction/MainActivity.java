package com.example.lenovo520.diseaseprediction;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;
import android.view.MotionEvent;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;
import com.special.ResideMenu.ResideMenu;
import com.special.ResideMenu.ResideMenuItem;

import static android.widget.GridLayout.LEFT;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private ResideMenu resideMenu;
    private MainActivity mContext;
    private ResideMenuItem itemHome;
    private ResideMenuItem itemProfile;
    CardView card1,card2,card3,card4,card5;

    /**
     * Called when the activity is first created.
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mContext = this;
        setUpMenu();
        card1=(CardView) findViewById(R.id.card1);
        card2=(CardView) findViewById(R.id.card12);
        card3=(CardView) findViewById(R.id.card13);
        card4=(CardView) findViewById(R.id.card14);
        card5=(CardView) findViewById(R.id.card2);

        card1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, SkinActivity.class);
                startActivity(i);
            }
        });
        card2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, EyeActivity.class);
                startActivity(i);
            }
        });
        card3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, MouthActivity.class);
                startActivity(i);
            }
        });
        card4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, NailActivity.class);
                startActivity(i);
            }
        });
        card5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, DoctorActivity.class);
                startActivity(i);
            }
        });
    }

    private void setUpMenu() {

        // attach to current activity;
        resideMenu = new ResideMenu(this);
        resideMenu.setBackground(R.drawable.menu_background);
        resideMenu.attachToActivity(this);
        resideMenu.setMenuListener(menuListener);
        //valid scale factor is between 0.0f and 1.0f. leftmenu'width is 150dip.
        resideMenu.setScaleValue(0.6f);

        // create menu items;
        itemHome     = new ResideMenuItem(this, R.drawable.icon_home,     "Home");
        itemProfile  = new ResideMenuItem(this, R.drawable.icon_profile,  "Profile");

        itemHome.setOnClickListener(this);
        itemProfile.setOnClickListener(this);

        resideMenu.addMenuItem(itemHome, ResideMenu.DIRECTION_LEFT);
        resideMenu.addMenuItem(itemProfile, ResideMenu.DIRECTION_LEFT);
        // You can disable a direction by setting ->
        // resideMenu.setSwipeDirectionDisable(ResideMenu.DIRECTION_RIGHT);

        findViewById(R.id.title_bar_left_menu).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                resideMenu.openMenu(ResideMenu.DIRECTION_LEFT);
            }
        });
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent ev) {
        return resideMenu.dispatchTouchEvent(ev);
    }

    @Override
    public void onClick(View view) {

        if (view == itemHome){

        }else if (view == itemProfile){

        }

        resideMenu.closeMenu();
    }

    private ResideMenu.OnMenuListener menuListener = new ResideMenu.OnMenuListener() {
        @Override
        public void openMenu() {
            Toast.makeText(mContext, "Menu is opened!", Toast.LENGTH_SHORT).show();
        }

        @Override
        public void closeMenu() {
            Toast.makeText(mContext, "Menu is closed!", Toast.LENGTH_SHORT).show();
        }
    };

    // What good method is to access resideMenu？
    public ResideMenu getResideMenu(){
        return resideMenu;
    }
  /*  editText.setDrawableClickListener(new DrawableClickListener() {


        public void onClick(DrawablePosition target) {
            switch (target) {
                case LEFT:
                    //Do something here
                    break;

                default:
                    break;
            }
        }

    });*/
}
