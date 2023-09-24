package com.febri.coba2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.febri.coba2.Fragmen.FirstFragment;
import com.febri.coba2.Fragmen.SecondFragment;

public class fragmentActivity extends AppCompatActivity {

    FirstFragment firstFragment = new FirstFragment();
    SecondFragment secondFragment = new SecondFragment();

    Button btnfragment1,btnfragment2,btnfragment3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragment);

        btnfragment1 = (Button) findViewById(R.id.firstfragment);
        btnfragment2 = (Button) findViewById(R.id.secondfragment);
        btnfragment3 = (Button) findViewById(R.id.thirdfragment);

        btnfragment1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getSupportFragmentManager()
                        .beginTransaction()
                        .replace(R.id.frame_babi,firstFragment).commit();
            }
        });

        btnfragment2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getSupportFragmentManager()
                        .beginTransaction()
                        .replace(R.id.frame_babi, secondFragment).commit();
            }
        });

    }
    public void loadFragment(Fragment fragment){

        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fm.beginTransaction();
        fragmentTransaction.replace(R.id.frame_babi,fragment);
        fragmentTransaction.commit();

    }

}