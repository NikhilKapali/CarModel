package com.example.carmodel;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    EditText make,year,color,price,engine;
    String getMake,getYear,getColor,getPrice,getEngine,str1,str2;
    Button create;
    TextView setresult;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initializeViews();
    }
    public void initializeViews(){
        make=findViewById(R.id.ed_car);
        year=findViewById(R.id.ed_year);
        color=findViewById(R.id.ed_colour);
        price=findViewById(R.id.ed_price);
        engine=findViewById(R.id.ed_size);
        setresult=findViewById(R.id.txt_result);
        create=findViewById(R.id.btn_create);
        create.setOnClickListener(this);
    }
    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btn_create:
                VehicleModel model = new VehicleModel(make.getText().toString(),
                        year.getText().toString(),color.getText().toString(),
                        price.getText().toString(),engine.getText().toString());
                setresult.setText("This is Vehicle no.1" + ""+setresult.getText() +"\r\n"+model.toString()+"\r\n");

        }
    }
}
