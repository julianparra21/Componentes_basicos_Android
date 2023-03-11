package com.App.my_first_app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*

class MainActivity : AppCompatActivity() {

    var campoNombre: EditText? = null
    var check1: CheckBox? = null
    var check2: CheckBox? = null
    var radio1: RadioButton? =null
    var radio2: RadioButton? =null
    var swichE: Switch? = null
    var toggle: ToggleButton? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        check1 = findViewById(R.id.check1)
        check2 = findViewById(R.id.check2)

        radio1 = findViewById(R.id.radio1)
        radio2 = findViewById(R.id.radio2)

        swichE = findViewById(R.id.switch1)

        toggle = findViewById(R.id.toggle1)

        var button1: Button = findViewById(R.id.button1)
        button1.setOnClickListener { enviar() }




    }

    private fun enviar() {
        //editText
        campoNombre = findViewById(R.id.txtNombre)
        var nombre = campoNombre?.text.toString()


        //radioButton

        var message: String = "Seleccionado: "
            if (radio1?.isChecked == true) {
                message += "Radio 1 \n"
            }
        if (radio2?.isChecked == true) {
                message += "Radio 2 \n"
            }




        //checkBox
        var cad: String = "Seleccionado: "

        if(check1?.isChecked == true){
            cad += "Opcion 1 \n"
        }

        if(check2?.isChecked == true){
            cad += "Opcion 2 \n"
        }

        //toggle
        var cad3:String = "toggle: "

        if(toggle?.isChecked == true){
            cad3 += "Activo"
        }else{
            cad3 += "Inactivo"
        }


        //switch
        var cad2:String = "switch: "

        if(swichE?.isChecked == true){
            cad2 += "Activo"
        }else{
            cad2 += "Inactivo"
        }

        Toast.makeText(this, "hola: $nombre \n $message   $cad\n  $cad2 \n $cad3 ", Toast.LENGTH_SHORT).show()



    }





}