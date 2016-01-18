package com.hyojoo.android20160118_oohaahhae;

import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Window;

import com.hyojoo.android20160118_oohaahhae.fragment.MainFragment;

public class MainActivity extends FragmentActivity {
    private FragmentTransaction mFrgTransaction= null;

    private MainFragment mMain= null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void onResume(){
        super.onResume();
        makeView();
        moveFragment();
    }
    @Override
    public void onPause(){ super.onPause(); }

    private void makeView(){
        mMain= new MainFragment();
    }

    public void moveFragment(){
        mFrgTransaction= getSupportFragmentManager().beginTransaction();
        mFrgTransaction.add(R.id.container, mMain);
        mFrgTransaction.commit();
    }
}