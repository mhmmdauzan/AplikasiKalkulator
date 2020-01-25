package id.ac.poliban.mi.auzan.aplikasikalkulator;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText etAngka1 = findViewById(R.id.etAngka1);
        final EditText etAngka2 = findViewById(R.id.etAngka2);
        Button btTambah = findViewById(R.id.btTambah);
        Button btKurang = findViewById(R.id.btKurang);
        Button btKali = findViewById(R.id.btKali);
        Button btBagi = findViewById(R.id.btBagi);
        Button btClear = findViewById(R.id.btClear);
        final TextView tvHasil = findViewById(R.id.tvHasil);

        btTambah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double a = Double.parseDouble(etAngka1.getText().toString());
                double b = Double.parseDouble(etAngka2.getText().toString());
                double hasill = a+b;

                tvHasil.setText(String.valueOf(hasill));

            }
        });
        btKali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double a = Double.parseDouble(etAngka1.getText().toString());
                double b = Double.parseDouble(etAngka2.getText().toString());
                double hasill = a*b;

                tvHasil.setText(String.valueOf(hasill));

            }
        });
        btKurang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double a = Double.parseDouble(etAngka1.getText().toString());
                double b = Double.parseDouble(etAngka2.getText().toString());
                double hasill = a-b;

                tvHasil.setText(String.valueOf(hasill));

            }
        });
        btBagi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double a = Double.parseDouble(etAngka1.getText().toString());
                double b = Double.parseDouble(etAngka2.getText().toString());
                double hasill = a/b;

                tvHasil.setText(String.valueOf(hasill));

            }
        });

        btClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            etAngka1.getText().clear();
            etAngka2.getText().clear();
            tvHasil.setText(String.valueOf("HASIL"));
            }
        });


    }
}
