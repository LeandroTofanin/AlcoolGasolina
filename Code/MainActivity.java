package br.com.leandro.alcoolgasolina2;

import android.support.v7.app.AppCompatActivity;


import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText precoAlcool;
    private EditText precoGasolina;
    private Button btnCalcular;
    private TextView resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //recuperação dos itens
        precoAlcool = (EditText) findViewById(R.id.txtAlcool);
        precoGasolina = (EditText) findViewById(R.id.txtGasolina);
        btnCalcular = (Button) findViewById(R.id.btnCalcular);
        resultado = (TextView) findViewById(R.id.txtResultado);

        btnCalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //recuparação dos valores
                String txtPrecoAlcool = precoAlcool.getText().toString();
                String txtPrecoGasolina = precoGasolina.getText().toString();

                //conversão para double
                Double valorAlcool = Double.parseDouble(txtPrecoAlcool);
                Double valorGasolina = Double.parseDouble(txtPrecoGasolina);
                double res = valorAlcool / valorGasolina;


                if(res <= 0.7){
                    resultado.setText("É Melhor utilizar o Álcool");
               }
               else{
                    resultado.setText("É Melhor utilizar a Gasolina");
               }
            }
        });

    }
}
