package com.unopuntodos.actividad;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.view.View;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText editTextUsername;
    private EditText editTextContraseña;
    // CONTRASEÑA FIJA PARA ESTA ACTIVIDAD
    private static final String CORRECT_PASSWORD = "hola";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    // AQUI SE ASOCIAN ELEMENTOS DE LA INTERFAZ DE USUARIO CON VARIABLES
        editTextUsername = findViewById(R.id.editTextText);
        editTextContraseña = findViewById(R.id.editTextText2);
        Button buttonSubmit = findViewById(R.id.button);
    // AHORA SE CONFIGURA EL ONCLICK LISTENER PARA QUE EL BOTON FUNCIONE
        buttonSubmit.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // AQUI SE OBTIENE EL NOMBRE DE USUARIO Y CONTRASEÑA
                String username = editTextUsername.getText().toString();
                String contraseña = editTextContraseña.getText().toString();

                // Verificar la contraseña
                if (contraseña.equals(CORRECT_PASSWORD)) {
                    // EN CASO DE LA CONTRASEÑA ESTE CORRECTA SE INICIA LA SEGUNDA ACTIVIDAD
                    Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                    intent.putExtra("username", username);
                    startActivity(intent);
                } else {
                    // CONTRASEÑA INCORRECTA, SE MOSTRARA UN MENSAJE DE QUE ESTA MALA
                    Toast.makeText(MainActivity.this, "Contraseña incorrecta", Toast.LENGTH_SHORT).show();
                }
            }

        }));
    }
    public void ingresarSistema(View view){
        Intent actividad2 = new Intent(this,MainActivity2.class);
        startActivity(actividad2);
    }
}