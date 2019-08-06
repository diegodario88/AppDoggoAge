package com.lgn.idadedecachorro;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {


    private EditText editText;
    private TextView textView;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText = findViewById(R.id.campoIdadeDog);
        textView = findViewById(R.id.textIdade);
        button = findViewById(R.id.btnCalcular);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String idadeDog = editText.getText().toString();
                if (idadeDog.isEmpty()) {
                    textView.setText("Campo vazio, por favor preencha");
                } else {
                    int idadeDogInt = Integer.parseInt(idadeDog);
                    int resultado = idadeDogInt * 7;
                    textView.setText("O dog tem " + resultado + " anos humanos. ");
                }
            }
        });

    }

}
