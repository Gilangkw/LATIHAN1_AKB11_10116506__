package gilangkw.com;
//Nama : Gilang Kusuma Wijaya
//NIM  : 10116506
//Kelas: AKB-11/IF-11
// Sabtu 6 April 2019

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class SayHi extends AppCompatActivity {

    private String KEY_NAME ="kamu";
    private  String nama;
    TextView sayhi;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_say_hi);

        sayhi = (TextView) findViewById(R.id.sayhai);
        Bundle extras =getIntent().getExtras();
        nama=extras.getString(KEY_NAME);
        sayhi.setText("Beres! Sekarang "+nama+" udah bisa ngecek penggunaan HP mu tiap hari buat bantu kamu ngatur waktu :)");

    }
}
