package net.idekreasi.forecast;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    private TextView kelembapanudara;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ListView listView = (ListView) findViewById(R.id.nextDay);
        listView.setAdapter(new MainAdapter());
    }

    private class MainAdapter extends BaseAdapter {

        private String[] arrayString = {"Cerah", "Berawan", "Hujan", "Badai", "Cerah Berawan"};
        private String[] arraySuhu = {"30", "27", "24", "20", "28"};

        @Override
        public int getCount() {
            return arrayString.length;
        }

        @Override
        public Object getItem(int position) {
            return null;
        }

        @Override
        public long getItemId(int i) {
            return 0;
        }

        @Override
        public View getView(int position, View view, ViewGroup viewGroup) {
            LayoutInflater inflater = LayoutInflater.from(getBaseContext());
            view = inflater.inflate(R.layout.item_forecast, viewGroup, false);

            TextView textView = (TextView) view.findViewById(R.id.cuaca_kam);
            textView.setText(arrayString[position]);

            TextView suhu = (TextView) view.findViewById(R.id.suhu);
            suhu.setText(arraySuhu[position]);
            return view;
        }
    }

}
