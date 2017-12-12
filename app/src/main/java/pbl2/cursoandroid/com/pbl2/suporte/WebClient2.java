package pbl2.cursoandroid.com.pbl2.suporte;

import android.content.Context;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonArrayRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 * Created by keciosantos on 12/12/17.
 */

public class WebClient2 { String baseUrl = "http://raelpx.pythonanywhere.com";
    String url;
    RequestQueue requestQueue;

    public WebClient2(Context context) {
        requestQueue = Volley.newRequestQueue(context);
    }

    public void teste (){
        url = baseUrl + "/api/alunos";

        JsonArrayRequest arrayRequest = new JsonArrayRequest(Request.Method.GET, url,
                new Response.Listener<JSONArray>() {
                    @Override
                    public void onResponse(JSONArray response) {
                        System.out.println("tamanho do array de resposta"+ response.length());
                        if (response.length() > 0) {
                            for (int i = 0; i < response.length(); i++) {
                                try {
                                    JSONObject jsonObject = response.getJSONObject(i);
                                    System.out.println(jsonObject.get("nome"));
                                    System.out.println(jsonObject.get("semestre"));
                                } catch (JSONException e) {
                                    System.out.println(e);
                                }
                            }
                        } else {
                            System.out.println("Deu ruim");
                        }
                    }
                },
                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {

                    }
                }
        );

        requestQueue.add(arrayRequest);
        System.out.println(requestQueue.toString());
    }
}