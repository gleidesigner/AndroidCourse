package br.com.cursoandroid;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

/**
 * Created by gleides.s on 09/05/2014.
 */
public class ExemploCicloVidaAbrirTela extends MainActivity implements OnClickListener{
    @Override
    protected void onCreate(Bundle icicle) {
        super.onCreate(icicle);
        Button btn = new Button(this);
        btn.setText("Click para abrir");
        btn.setOnClickListener(this);
        setContentView(btn);
    }

    @Override
    public void onClick(View view) {
        Intent intent = new Intent(this,Tela2.class);
        intent.putExtra("msg", "olá tudo bem? como vai?");
        startActivity(intent);

    }
}
