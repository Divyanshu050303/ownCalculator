package com.example.owncalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    var isNewop=true
    var oldNumber=""
    var op=""
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


    }

    fun numberEvent(view: View) {
        if (isNewop)
            text.setText("")
        isNewop=false
        var buclick=text.text.toString()
        val buselect=view as Button
        when(buselect.id){
            btn1.id -> {
                buclick=""
                buclick += "1"}
            btn2.id->{
                buclick=""
                buclick+="2"}
            btn3.id->{
                buclick=""
                buclick+="3"}
            btn4.id->{
                buclick=""
                buclick+="4"}
            btn5.id->{
                buclick=""
                buclick+="5"}
            btn6.id->{
                buclick=""
                buclick+="6"}
            btn7.id->{
                buclick=""
                buclick+="7"}
            btn8.id->{
                buclick=""
                buclick+="8"}
            btn9.id->{
                buclick=""
                buclick+="9"}
            btn0.id->{
                buclick=""
                buclick+="0"}
            btnPoint.id->{
                buclick=""
                buclick+="."}
        }
        text.text = buclick


    }

    fun operatorEvent(view: View) {
        isNewop=true
        oldNumber=text.text.toString()
        val buselect=view as Button
        when(buselect.id){

            btnMultiply.id ->{op+="*"}
            btnPlus.id ->{op+="+"}
            btnSubtract.id ->{op+="-"}
            btnDivide.id ->{op+="/"}

        }


    }

    fun equalEvent(view: View) {
        val newnumber=text.text.toString()
        var result=0.0
        when(op){
            "+" ->{
                result = oldNumber.toDouble() + newnumber.toDouble()
                op=""
            }

            "-" ->{result= oldNumber.toDouble() - newnumber.toDouble()
                op=""}
            "/" ->{result= oldNumber.toDouble() / newnumber.toDouble()
                op=""}
            "*" ->{result= oldNumber.toDouble() * newnumber.toDouble()
                op=""}
        }
        text.setText(result.toString())


    }

    fun acEvent(view: View) {
        text.text = "0"
    }


    fun operatorpercentage(view:View) {
        val no=text.text.toString().toDouble()/100
        text.text = no.toString()
        isNewop=true
    }
}