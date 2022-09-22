package es.joseljg.cuadrado_22_23;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText edt_numero = null;
    private TextView txt_resultado = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edt_numero = (EditText) findViewById(R.id.edt_numero);
        txt_resultado = (TextView) findViewById(R.id.txt_resultado);
    }

    public void calcular_el_cuadrado(View view)
    {
        // primero hay que coger el número del EditText y calcular su cuadrado
        String texto = String.valueOf(edt_numero.getText());
        long numero = 0;

        if(! texto.isEmpty())
        {
            numero = Long.valueOf(texto);

        }

        if(numero > 10000)
        {
            edt_numero.setError("escribe un numero menor que 10000");
            return;
        }
        /*
        try{
            numero = Integer.valueOf(texto);
        }
        catch (NumberFormatException e)
        {
            numero = 0;
        }
        */

        long resultado = numero * numero;
        if(resultado > 1000)
        {
            ((TextView)txt_resultado).setTextSize(80);
        }

        // hay que mostrar el resultado en el textview txt_resultado
        txt_resultado.setText(String.valueOf(resultado));
    }
}