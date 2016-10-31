package com.example.tanti.utsmopro;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    SessionManager session;
//    int[] gambar={
//            R.drawable.black_forest,
//            R.drawable.chantilly_cake,
//            R.drawable.choco_rain,
//            R.drawable.choconut_forest,
//            R.drawable.tiramisu,
//            R.drawable.opera_cake,
//            R.drawable.raindow_cake,
//            R.drawable.tar
//    };
int[] gambar={
        R.drawable.black_forest,
        R.drawable.chantilly_cake,
        R.drawable.choco_rain,
        R.drawable.choconut_forest,
        R.drawable.torte,
       R.drawable.opera_cake,
        R.drawable.raindow_cake,
       R.drawable.tar
};

    ListView list;

    String[] judul ={
            "Black Forest",
            "Chantilly",
            "Choco Rain ",
            "Choconut Forest",
            "Torte",
           "Opera",
            "Rainbow",
            "Tar"
    };
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        session = new SessionManager(getApplicationContext());
        Toast.makeText(getApplicationContext(), "User Login Status: " + session.isLoggedIn(), Toast.LENGTH_LONG).show();
        session.checkLogin();

        // Inisialisasi CustomAdapter dengan Array yang telah dibuat
        CustomAdapter adapter = new CustomAdapter(this, gambar, judul);

        // Inisialisasi ListView
        list = (ListView) findViewById(R.id.ListGambar);

        // set Adapter ke dalam ListView
        list.setAdapter(adapter);

        // action ketika ListView di klik
        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
                // TODO Auto-generated method stub

                // String untuk mengambil judul pada Listview
                String Slecteditem = judul[position];
                String apa = Slecteditem;
                Intent iOri= new Intent(MainActivity.this, PesanCake.class);
                iOri.putExtra("param",apa);
                startActivity(iOri);


                // menampilkan judul dengan Toast
                Toast.makeText(getApplicationContext(), Slecteditem, Toast.LENGTH_SHORT).show();
            }
        });
    }
}
