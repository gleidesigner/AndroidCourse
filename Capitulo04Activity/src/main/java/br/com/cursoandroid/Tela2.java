package br.com.cursoandroid;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by gleides.s on 09/05/2014.
 */
public class Tela2 extends MainActivity implements OnClickListener {
    @Override
    protected void onCreate(Bundle icicle) {
        super.onCreate(icicle);
        TextView view = new TextView(this);
        view.setText("Tela 2 btn");
        setContentView(view);

        Intent i = getIntent();
        if(i != null){
            Bundle params = i.getExtras();
            if(params!=null){
                String msg = params.getString("msg");
                Log.i(CATEGORIA, "Mensagem: " + msg);
            }
        }
        Button btn = new Button(this);
        btn.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {

    }
}
