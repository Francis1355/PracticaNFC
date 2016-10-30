package com.example.francisco.practicanfc;

import android.nfc.NfcAdapter;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private TextView txtVNFC;
    private NfcAdapter NfcAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtVNFC = (TextView) findViewById(R.id.textView_explanation);
        NfcAdapter = NfcAdapter.getDefaultAdapter(this);


    }

    public void on(View v){
        if (!NfcAdapter.isEnabled()) {
            txtVNFC.setText("NFC is Disabled.");
        } else {
            txtVNFC.setText("NFC is Enabled");
            Toast.makeText(getApplicationContext(),"Turned on",Toast.LENGTH_LONG).show();
        }

    }
}
