package com.agustinbergomi.timepicker_dialogo;

import androidx.appcompat.app.AppCompatActivity;

import android.app.TimePickerDialog;
import android.os.Bundle;
import android.widget.TimePicker;

import java.util.Calendar;

public class MainActivity extends AppCompatActivity {
    TimePickerDialog.OnTimeSetListener dialogListener = new TimePickerDialog
            .OnTimeSetListener() {
        @Override
        public void onTimeSet(TimePicker timePicker, int i, int i1) {
        }
    };
    Calendar cal = Calendar.getInstance();
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        showTimeDialog();
    }
//    creamos el metodo show time dialog que crea una instancia de la clase Time Picker Dialog.
//    Ese objeto lo creamos con los parametros que pide el constructor. En este caso contexto, un listener que detecta la seleccion del horario elegido, fecha y hora, formato de hora y despues se llama a show para q muestre el dialogo
    public void showTimeDialog(){
        new TimePickerDialog(MainActivity.this,dialogListener, cal.get(Calendar.HOUR_OF_DAY), cal.get(Calendar.MINUTE), false).show(); {};
    }
}