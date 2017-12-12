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
import pbl2.cursoandroid.com.pbl2.modelo.Sessao;

/**
 * Created by keciosantos on 12/12/17.
 */

public class SessaoAdapter extends BaseAdapter {

    List<Sessao> sessoes;
    Activity activity;

    public SessaoAdapter(List<Sessao> sessoes, Activity activity) {
        this.sessoes = sessoes;
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
        Sessao sessao = sessoes.get(i);

        LayoutInflater inflater = activity.getLayoutInflater();
        View linha = inflater.inflate(R.layout.itens, null);

        TextView nome = (TextView) linha.findViewById(R.id.NomeId);
        nome.setText(sessao.getNomeTutor());

        return linha;
    }
}
