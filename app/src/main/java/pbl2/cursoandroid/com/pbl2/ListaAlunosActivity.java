package pbl2.cursoandroid.com.pbl2;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import pbl2.cursoandroid.com.pbl2.modelo.Aluno;

public class ListaAlunosActivity extends Activity {
    protected ListView lista;
    Aluno aluno;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_alunos);

        lista = findViewById(R.id.listaId);
        registerForContextMenu(lista);


        lista.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> adapter, View view, int posicao, long id) {

                return false;
            }
        });
    }
}
