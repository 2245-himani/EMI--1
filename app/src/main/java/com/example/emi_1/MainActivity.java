package com.example.emi_1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

 TextView rs, r, m;

    TextView cacy;

    TextView pa, ir, to, ra;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rs = findViewById(R.id.edtxR);
        r = findViewById(R.id.edtTxi);
        m = findViewById(R.id.edTxm);

        cacy = findViewById(R.id.txVwclcy);
        pa = findViewById(R.id.txttotal);
        ir = findViewById(R.id.EdtmtINT);
        to = findViewById(R.id.EdttTA);
        ra = findViewById(R.id.edtrat);

        cacy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                float pr = Float.parseFloat(rs.getText().toString());
                float ri = Float.parseFloat(r.getText().toString());
                float mt = Float.parseFloat(m.getText().toString());
//                float clcy = Float.parseFloat(cacy.getText().toString());

                ri = ri / (12 * 100);
                float ans = 1.0f;
                for (int i = 0; i < mt; i++) {
                    ans = ans * (1 + ri);
                }
                float emi = pr * ri * (ans / (ans - 1));

                int total = (int) (emi * ri);

            }
        });
    }
}