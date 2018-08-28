package upeu.edu.pe.mvp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements Main.Vista{
    private Main.Presentador presentador;
    private Button button;
    private EditText edt1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        presentador = new FactorialPresentador(this);
        edt1 = (EditText) findViewById(R.id.txtn);
        button = (Button) findViewById(R.id.btnc);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                presentador.calcularFactorial(edt1.getText().toString());
            }
        });
    }

    @Override
    public void mostrarResultado(String r) {
        Toast.makeText(getApplicationContext(), "Factorial:"+r, Toast.LENGTH_LONG).show();
    }
}
