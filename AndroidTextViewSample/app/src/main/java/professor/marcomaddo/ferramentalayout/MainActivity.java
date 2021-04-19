package professor.marcomaddo.ferramentalayout;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import professor.marcomaddo.ferramentelayout.R;

public class MainActivity extends AppCompatActivity {

    TextView txtTitulo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtTitulo = findViewById(R.id.txtTitulo);

        txtTitulo.setText("Retrato");


    }
}