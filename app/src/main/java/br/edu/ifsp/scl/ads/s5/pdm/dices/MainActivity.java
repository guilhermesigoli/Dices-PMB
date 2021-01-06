package br.edu.ifsp.scl.ads.s5.pdm.dices;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    private ImageView imageView;
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageView = (ImageView) findViewById(R.id.resultadoIv);
        textView = findViewById(R.id.resultadoTv);

    }

    public void onClick(View view) {
            int resultado = new Random(System.currentTimeMillis()).nextInt(6) + 1;
            textView.setText(resultado);
            // Gerando nome da imagem
            String resultadoImagem = "dice_" + resultado;
            int dice = MainActivity.this.getResources().getIdentifier(resultadoImagem, "drawable", MainActivity.this.getPackageName());
            imageView.setImageResource(dice);
    }
}