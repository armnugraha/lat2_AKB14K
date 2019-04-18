package com.unikom.armannugraha.bloodshare;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;

/**
 * Nama: Arman Nugraha
 * Nim: 10116916
 * Kelas: AKB 14K
 * Created_at: 18-04-2019
 */

public class VerifyAccount extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //start hide titlebar & status bar
        requestWindowFeature(Window.FEATURE_NO_TITLE); //will hide the title
        getSupportActionBar().hide(); // hide the title bar
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN); //enable full screen
        setContentView(R.layout.activity_verify_account);
        //end hide titlebar & status bar
    }

    public void onClickUser(View view) {
        Intent userPage = new Intent(this, UserHome.class);
        startActivity(userPage);
    }
}
