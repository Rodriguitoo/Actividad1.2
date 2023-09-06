package com.unopuntodos.actividad;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        // MOSTRAR MENSAJE EMERGENTE
        Toast.makeText(getApplicationContext(),"Usted a ingresado al sistema", Toast.LENGTH_LONG).show();
        // AQUI SE ENLAZA LA VISTE DEL TEXTVIEW DESDE EL DISEÑO XML
        TextView textViewBienvenida = findViewById(R.id.textView);

        // RECIBIR EL NOMBRE DE USUARIO DESDE LA PRIMERA ACTIVITY
        // ADEMAS SE OBTIENE EL INTENT QUE INICIO LA ACTIVIDAD
        Intent intent = getIntent();
        //AQUI SE VERIFICA QUE EL INTENT NO SEA NULO
        if (intent !=null){
            //OBTENER EL NOMBRE DE USUARIO DEL INTENT
            String username = intent.getStringExtra("username");
            //AQUI SE VERIFICA QUE EL USUARIO NO SEA NULO NI VACIO
            if (username != null && !username.isEmpty()){
                //AQUI MUESTRA EL MENSAJE DE BIENVENIDA CON EL NOMBRE DE USUARIO
                textViewBienvenida.setText("Bienvenid@"  + username);
            }
        }

    }
    public void MenuPrincipal(View view){
        Intent actividad1 = new Intent(this,MainActivity.class);
        startActivity(actividad1);
    }
}