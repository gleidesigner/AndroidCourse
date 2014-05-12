package br.com.cursoandroid;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;


public class MainActivity extends Activity {
    protected static final String CATEGORIA = "livro";
    @Override
    protected void onCreate(Bundle icicle) {
        super.onCreate(icicle);
        Log.i(CATEGORIA, getClassName() + ".onCreate() chamado: " + icicle);
        TextView view = new TextView(this);
        view.setText("Exemplo do ciclo de vida.\n Consulte os logs no LogCat.");
        setContentView(view);

        /*setContentView(R.layout.activity_main);*/

    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i(CATEGORIA, getClassName() + ".onStart() chamado.");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i(CATEGORIA, getClassName() + ".onRestart() chamado.");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i(CATEGORIA, getClassName() + ".onResume() chamado.");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i(CATEGORIA, getClassName() + ".onPause() chamado.");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i(CATEGORIA, getClassName() + ".onStop() chamado.");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i(CATEGORIA, getClassName() + ".onDestroy() chamado.");
    }
    private String getClassName() {
        /**
         * Retorna o nome da classe sem o pacote
         */
        String str = getClass().getName();
        return str.substring(str.lastIndexOf("."));
    }
}
