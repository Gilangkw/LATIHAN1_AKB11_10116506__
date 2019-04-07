package gilangkw.com;
//Nama : Gilang Kusuma Wijaya
//NIM  : 10116506
//Kelas: AKB-11/IF-11
//Sabtu 6 April 2019


import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);
    }

    public void mulaiii(View view) {
        Intent cet = new Intent(MainActivity.this, LoginCode.class);
        startActivity(cet);
    }
}
