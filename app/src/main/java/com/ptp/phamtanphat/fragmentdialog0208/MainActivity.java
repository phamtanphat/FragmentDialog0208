package com.ptp.phamtanphat.fragmentdialog0208;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements SendData {

    Button btndialog;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btndialog = findViewById(R.id.buttonshowdialog);
        btndialog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                DiaLogFragment diaLogFragment = new DiaLogFragment();
                diaLogFragment.show(getFragmentManager(),"Dialog");
            }
        });
    }

    @Override
    public void ChangeText(String text) {
        btndialog.setText(text);
    }
}
