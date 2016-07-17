package net.idekreasi.forecast;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.BaseAdapter;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView kelembapanudara;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        kelembapanudara = (TextView) findViewById(R.id.kelembapanudara);
        kelembapanudara.setText("500");
    }

    private class cuacaAdapter extends BaseAdapter {

    }

}
