package pbl2.cursoandroid.com.pbl2.converter;

import org.json.JSONException;
import org.json.JSONStringer;

import java.util.List;

import pbl2.cursoandroid.com.pbl2.modelo.Turma;

/**
 * Created by keciosantos on 12/12/17.
 */

public class TurmaConverter {
    public String toJSON(List<Turma> turmas){
        JSONStringer js = new JSONStringer();
        try{
            js.object().key("list").array();
            js.object().key("turma").array();
            for (Turma turma:turmas){
                js.key("nome").value(turma.getNome());
                js.key("idSessao").value(turma.getIdSessao());
                js.endObject();
            }
            js.endArray().endObject();
            js.endArray().endObject();
        }catch (JSONException e){
            e.printStackTrace();
        }
        return js.toString();
    }
}
