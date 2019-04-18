package com.unikom.armannugraha.bloodshare;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.support.v7.widget.Toolbar;

import java.util.ArrayList;
import java.util.List;

/**
 * Nama: Arman Nugraha
 * Nim: 10116916
 * Kelas: AKB 14K
 * Created_at: 18-04-2019
 */

public class Register extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        requestWindowFeature(Window.FEATURE_NO_TITLE); //will hide the title
        getSupportActionBar().hide(); // hide the title bar

        setContentView(R.layout.activity_register);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        toolbar.setTitle("Register");

        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent registerPage = new Intent(v.getContext(), Login.class);
                startActivity(registerPage);
            }
        });

        ArrayList<Spinner> dropdown = new ArrayList<Spinner>();
        dropdown.add((Spinner) findViewById(R.id.bloodtype));
        dropdown.add((Spinner) findViewById(R.id.reshus));
        dropdown.add((Spinner) findViewById(R.id.job));

        for (Spinner item : dropdown) {
            ArrayAdapter<Integer> adapter = new ArrayAdapter<Integer>(
                    this,
                    android.R.layout.simple_spinner_item,
                    this.getParameterDropdown()
            );

            item.setAdapter(adapter);
        }
    }

    private List getParameterDropdown() {
        List<String> spinnerArray = new ArrayList<>();
        spinnerArray.add("Item 1");
        spinnerArray.add("Item 2");
        spinnerArray.add("Item 3");

        return spinnerArray;
    }

    public void onClickAlmost(View view) {
        Intent almostPage = new Intent(this, AlmostThere.class);
        startActivity(almostPage);
    }
}
