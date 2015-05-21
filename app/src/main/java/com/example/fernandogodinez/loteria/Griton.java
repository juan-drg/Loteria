package com.example.fernandogodinez.loteria;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;

import java.util.ArrayList;
import java.util.Collections;


public class Griton extends ActionBarActivity {

    public ArrayList<String> cartas;
    public ArrayList<String> jugadas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_griton);

        //inicializamos la variable jugadas.

        jugadas= new ArrayList<String>();
            //creamos un array para las cartas -----------------.
            cartas = new ArrayList<String>();
            cartas.add("gallo");        //1
            cartas.add("arbol");        //2
            cartas.add("melon");        //3
            cartas.add("valiente");     //4
            cartas.add("gorrito");      //5
            cartas.add("muerte");       //6
            cartas.add("pera");         //7
            cartas.add("bandera");      //8
            cartas.add("bandolon");     //9
            cartas.add("violoncello");  //10
            cartas.add("garza");        //11
            cartas.add("diablito");     //12
            cartas.add("pajaro");       //13
            cartas.add("mano");         //14
            cartas.add("bota");         //15
            cartas.add("luna");         //16
            cartas.add("cotorro");      //17
            cartas.add("borracho");     //18
            cartas.add("negrito");      //19
            cartas.add("corazon");      //20
            cartas.add("sandia");       //21
            cartas.add("tambor");       //22
            cartas.add("dama");         //23
            cartas.add("camaron");      //24
            cartas.add("jaras");        //25
            cartas.add("musico");       //26
            cartas.add("araña");        //27
            cartas.add("soldado");      //28
            cartas.add("estrella");     //29
            cartas.add("cazo");         //30
            cartas.add("mundo");        //31
            cartas.add("apache");       //32
            cartas.add("nopal");        //33
            cartas.add("catrin");       //34
            cartas.add("alacran");      //35
            cartas.add("rosa");         //36
            cartas.add("calavera");     //37
            cartas.add("campana");      //38
            cartas.add("cantarito");    //39
            cartas.add("venado");       //40
            cartas.add("sol");          //41
            cartas.add("corona");       //42
            cartas.add("chalupa");      //43
            cartas.add("pino");         //44
            cartas.add("paraguas");     //45
            cartas.add("pescado");      //46
            cartas.add("palma");        //47
            cartas.add("maceta");       //48
            cartas.add("arpa");         //49
            cartas.add("rana");         //50
            cartas.add("sirena");       //51
            cartas.add("escalera");     //52
            cartas.add("botella");      //53
            cartas.add("barril");       //54
            // finaliza la iniciacion de la baraja -------.

            //revolvemos la baraja.
            Collections.shuffle(cartas);

            //obtenemos una carta.

            String carta_siguiente = cartas.remove(0);

            //añadimos la carta jugada a el arreglo para ver cuales ya salieron
            jugadas.add(carta_siguiente);

            //obtenemos la view donde ira la imagen.
            ImageView cartaView;
            cartaView = (ImageView) findViewById(R.id.View_carta);

            //asignamos la carta a la view.
            int res_imagen = this.getResources().getIdentifier("drawable/" + carta_siguiente, null, this.getPackageName());
            cartaView.setImageResource(res_imagen);

    }



    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_griton, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public boolean nextCard(View view){
        //condicional para ver que el arreglo no este vacio
        if(!cartas.isEmpty()) {
            //obtenemos otra carta
            String carta_siguiente = cartas.remove(0);

            //añadimos la carta jugada a el arreglo para ver cuales ya salieron
            jugadas.add(carta_siguiente);

            //obtenemos la view donde ira la imagen.
            ImageView cartaView;
            cartaView = (ImageView) findViewById(R.id.View_carta);

            //asignamos la carta a la view.
            int res_imagen = this.getResources().getIdentifier("drawable/" + carta_siguiente, null, this.getPackageName());
            cartaView.setImageResource(res_imagen);
        }
        return true;
    }

}
