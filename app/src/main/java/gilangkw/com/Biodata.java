package gilangkw.com;
//Nama : Gilang Kusuma Wijaya
//NIM  : 10116506
//Kelas: AKB-11/IF-11
// Sabtu 6 April 2019

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Biodata extends AppCompatActivity {

    EditText isinama, isiumur;
    Button btnLanjut;
    private String KEY_NAME = "kamu";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_biodata);

        isinama = (EditText) findViewById(R.id.isinama);
        isiumur = (EditText) findViewById(R.id.isiumur);
        btnLanjut = (Button) findViewById(R.id.btnLanjut);

        btnLanjut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            String nama = isinama.getText().toString();
            String umur = isiumur.getText().toString();

            boolean isEmpty = false;

            if ((TextUtils.isEmpty(nama))||(TextUtils.isEmpty(umur))){
                isEmpty=true;
                isinama.setError("Mohon diisi terlebih dahulu kodenya");
            }else {
                Intent lanjut = new Intent(Biodata.this, SayHi.class);
                lanjut.putExtra(KEY_NAME, nama);
                startActivity(lanjut);
            }

            }
        });

    }

    public void biodata(View view) {
    }
}
