package com.itchihuahuaii.ejemplo6;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    TextView lbRes;
    EditText edit1,edit2,edit3,edit4,edit5,edit6,edit7,edit8;
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        lbRes =(TextView)findViewById(R.id.lbRes);
        btn = (Button)findViewById(R.id.btn);
        edit1=(EditText)findViewById(R.id.edit1);
        edit2=(EditText)findViewById(R.id.edit2);
        edit3=(EditText)findViewById(R.id.edit3);
        edit4=(EditText)findViewById(R.id.edit4);
        edit5=(EditText)findViewById(R.id.edit5);
        edit6=(EditText)findViewById(R.id.edit6);
        edit7=(EditText)findViewById(R.id.edit7);
        edit8=(EditText)findViewById(R.id.edit8);
        btn.setOnClickListener(this);    }

    public void onClick(View v){
        if(v.getId()==R.id.btn){
            double PA1 = Double.parseDouble(edit1.getText().toString());
            double PA2 = Double.parseDouble(edit2.getText().toString());
            double PA3 = Double.parseDouble(edit3.getText().toString());
            double PA4 = Double.parseDouble(edit4.getText().toString());
            double PB1 = Double.parseDouble(edit5.getText().toString());
            double PB2 = Double.parseDouble(edit6.getText().toString());
            double PB3 = Double.parseDouble(edit7.getText().toString());
            double PB4 = Double.parseDouble(edit8.getText().toString());
            double PPA= 0.20*PA1 + 0.20 * PA2 + 0.25 * PA3 + 0.35 * PA4;
            double PPB=0.20 * PB1 + 0.20 * PB2 + 0.25 * PB3 + 0.35 * PB4;
            double min = (10.5-.30*PPA-.35*PPB)/.35;
            double pro = (PPA + PPB) / 2;
            if(min>0) {
                lbRes.setText("Necesitas minimo " + min + " para pasar");
            }else{
                lbRes.setText("Tu promedio es :"+ pro + " Aprobaste :)");
            }
        }
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
