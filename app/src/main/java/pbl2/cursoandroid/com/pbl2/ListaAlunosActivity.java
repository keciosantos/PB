package pbl2.cursoandroid.com.pbl2;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import pbl2.cursoandroid.com.pbl2.modelo.Aluno;
import pbl2.cursoandroid.com.pbl2.suporte.WebClient2;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ListaAlunosActivity extends Activity {
    protected ListView lista;
    Aluno aluno;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_alunos);

        WebClient2 webAlauno = new WebClient2(getApplicationContext());
        webAlauno.listarAluno();



        lista = findViewById(R.id.listaId);
        registerForContextMenu(lista);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(
                getApplicationContext(),
                android.R.layout.simple_expandable_list_item_1,
                android.R.id.text1,


        );
        lista.setAdapter(adapter);



        lista.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> adapter, View view, int posicao, long id) {

                return false;
            }
        });
    }
}
