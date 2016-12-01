package com.example.android.myappportfolio;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void exibirInfo(View view) {
        Button bt = (Button) view;
        Toast.makeText(this, "Este botão irá lançar o aplicativo: " + bt.getText().toString(), Toast.LENGTH_SHORT).show();
    }
}
