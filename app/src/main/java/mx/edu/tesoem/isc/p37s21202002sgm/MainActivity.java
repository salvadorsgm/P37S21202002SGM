package mx.edu.tesoem.isc.p37s21202002sgm;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    EditText txtnum1,txtnum2;
    Button btnsuma,btnresta,btnmultiplicar,divicion;

    TextView resultado;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        txtnum1 = findViewById(R.id.txtnum1);
        txtnum2 = findViewById(R.id.txtnum2);

        resultado = findViewById(R.id.resultado);

        btnsuma = findViewById(R.id.btnsuma);
        btnresta =findViewById(R.id.btnresta);
        btnmultiplicar=findViewById(R.id.btnmultiplicar);
        divicion=findViewById(R.id.divicion);

        btnsuma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int num1 = Integer.parseInt(txtnum1.getText().toString());
                int num2 = Integer.parseInt(txtnum2.getText().toString());
                resultado.setText(resultado.getText().toString()+" "+ (num1 + num2));
            }
        });

        btnresta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int num1= Integer.parseInt(txtnum1.getText().toString());
                int num2=Integer.parseInt(txtnum2.getText().toString());
                resultado.setText(resultado.getText().toString()+" "+(num1-num2));

            }
        });
        btnmultiplicar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int num1=Integer.parseInt(txtnum1.getText().toString());
                int num2=Integer.parseInt(txtnum2.getText().toString());
                resultado.setText(resultado.getText().toString()+""+(num1*num2));

            }
        });
        divicion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int num1=Integer.parseInt(txtnum1.getText().toString());
                int num2=Integer.parseInt(txtnum2.getText().toString());
                txtnum1.setText("");
                resultado.setText("Resultado");
                resultado.setText(resultado.getText().toString()+" "+(num1/num2));

            }
        });



    }
}