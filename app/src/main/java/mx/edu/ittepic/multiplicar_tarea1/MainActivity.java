package mx.edu.ittepic.multiplicar_tarea1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.SeekBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    SeekBar seekBar;
    Button boton;
    TextView avance;
    int seleccion,res;
    String concatenar,total;
    ListView lista;
    String [] arreglazo = new String[21];


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        seekBar = findViewById(R.id.seekBar);
        boton = findViewById(R.id.btn1);
        avance = findViewById(R.id.edtnum);

        lista = findViewById(R.id.lst1);
        seleccion=0;
        concatenar="";
        total="";

        final ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,arreglazo);

        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {

                total="";
                concatenar="";
                avance.setText(""+progress);
                seleccion = progress;


            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        boton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                for (int i=0;i<=20;i++){
                    res=seleccion*i;
                    arreglazo[i]=""+seleccion+"X"+i+"="+res;

                  //  concatenar=""+seleccion+"X"+i+"="+res;
                  //  total=total+"\n"+concatenar;

                }
              //  salida.setText(total);
                lista.setAdapter(adapter);

            }
        });



    }
}
