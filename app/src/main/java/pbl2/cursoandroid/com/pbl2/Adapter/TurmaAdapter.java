package pbl2.cursoandroid.com.pbl2.Adapter;

import android.annotation.TargetApi;
import android.app.Activity;
import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

import pbl2.cursoandroid.com.pbl2.R;
import pbl2.cursoandroid.com.pbl2.modelo.Turma;

/**
 * Created by keciosantos on 12/12/17.
 */

public class TurmaAdapter extends BaseAdapter {

    List<Turma> turmas;
    Activity activity;

    public TurmaAdapter(List<Turma> turmas, Activity activity) {
        this.turmas = turmas;
        this.activity = activity;
    }

    @Override
    public int getCount() {
        return 0;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @TargetApi(Build.VERSION_CODES.HONEYCOMB)
    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        Turma turma = turmas.get(i);

        LayoutInflater inflater = activity.getLayoutInflater();
        View linha = inflater.inflate(R.layout.itens, null);

        TextView nome = (TextView) linha.findViewById(R.id.NomeId);
        nome.setText(turma.getNome());

        return linha;
    }
}
