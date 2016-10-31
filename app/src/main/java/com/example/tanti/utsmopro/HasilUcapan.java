package com.example.tanti.utsmopro;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by tanti on 26/10/16.
 */
public class HasilUcapan extends AppCompatActivity {


SessionManager session;
    @BindView(R.id.txtCake) TextView _tampilCake ;
    @BindView(R.id.txtTeman) TextView _tampilTeman ;
    @BindView(R.id.txtUcapan) TextView _tampilUcapan ;

    @BindView(R.id.txtPengirim) TextView _tampilPengirim ;

    String cake,teman, ucapan , pengirim;
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.halaman_hasil);

        ButterKnife.bind(this);

        Bundle c = getIntent().getExtras();

        cake = c.getString("kirimCake");
        teman = c.getString("kirimTo");
        ucapan = c.getString("kirimPesan");
        pengirim = c.getString("kirimPengirim");

        _tampilCake.setText(cake);
        _tampilTeman.setText(teman);
        _tampilUcapan.setText(ucapan);
        _tampilPengirim.setText(pengirim);

        ImageView gambar = (ImageView)findViewById(R.id.gambarKue);

        if (_tampilCake.getText().equals("Black Forest"))
        {
            gambar.setImageResource(R.drawable.black_forest);
        }else  if (_tampilCake.getText().equals("Chantilly"))
        {
            gambar.setImageResource(R.drawable.chantilly_cake);
        }else  if (_tampilCake.getText().equals("Choco Rain"))
        {
            gambar.setImageResource(R.drawable.choco_rain);
        }else  if (_tampilCake.getText().equals("Choconut Forest"))
        {
            gambar.setImageResource(R.drawable.choconut_forest);
        }else  if (_tampilCake.getText().equals("Torte"))
        {
            gambar.setImageResource(R.drawable.torte);
        }else  if (_tampilCake.getText().equals("Opera"))
        {
            gambar.setImageResource(R.drawable.opera_cake);
        }else  if (_tampilCake.getText().equals("Rainbow"))
        {
            gambar.setImageResource(R.drawable.raindow_cake);
        }else  if (_tampilCake.getText().equals("Tar"))
        {
            gambar.setImageResource(R.drawable.tar);
        }


    }
}
