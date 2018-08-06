package android.ejercicios.upv.ejercicio2_ciclo_de_vida;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class Ciclo_Vida extends AppCompatActivity {

    StringBuilder mensajes = new StringBuilder();
    TextView visor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ciclo_vida);
        visor = findViewById(R.id.visor);
        visor.setText(mensajes.toString());
    }

    private void log(String text) {
        Log.d("CicloVida", text);
        mensajes.append(text + "\n");
        visor.setText(mensajes.toString());
    }

    @Override
    public void onResume() {
        super.onResume();
        log("Se ha llamado a onResume()");
    }

    @Override
    public void onPause() {
        super.onPause();
        log("Se ha llamado a onPause()");
    }

    @Override
    public void onStop() {
        super.onStop();
        log("Se ha llamado a onStop()");
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        log("Se ha llamado a onDestroy()");
    }
}
