package pbl2.cursoandroid.com.pbl2;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class TurmaActivity extends Activity {

    private ImageView addTurma;
    private ImageView buscarTurma;
    private ImageView addSessao;
    private ImageView buscarSessao;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_turma);

        addTurma = findViewById(R.id.imgaddTurma);
        buscarTurma = findViewById(R.id.imgBuscaTurmaId);
        addSessao = findViewById(R.id.imgAddSessaoId);
        buscarSessao = findViewById(R.id.imgBuscarSessao);

        addTurma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(TurmaActivity.this, FormularioTurma.class));
            }
        });

        buscarTurma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(TurmaActivity.this, ListaTurmaActivity.class));
            }
        });
        addSessao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(TurmaActivity.this, FormularioSessao.class));
            }
        });

        buscarSessao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(TurmaActivity.this, ListaSessaoActivity.class));
            }
        });
    }
}
