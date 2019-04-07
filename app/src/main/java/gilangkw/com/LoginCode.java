package gilangkw.com;
//Nama : Gilang Kusuma Wijaya
//NIM  : 10116506
//Kelas: AKB-11/IF-11
// Sabtu 6 April 2019

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class LoginCode extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_code);

    }

    public void mulai(View view) {
        Intent klik = new Intent(LoginCode.this, Biodata.class);
        startActivity(klik);
    }
}