package com.eecm.weather

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Switch
import android.widget.TextView
import android.widget.Toast
import android.view.View;
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private var textViewCidade: TextView? = null
    private var textViewTemperatura: TextView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        textViewCidade = findViewById<TextView>(R.id.textViewCidade)
        textViewTemperatura = findViewById<TextView>(R.id.textViewTemp)


        var id: String = ""
        var button = findViewById<Button>(R.id.button)
        var button2 = findViewById<Button>(R.id.button2)
        var button3 = findViewById<Button>(R.id.button3)
        var button4 = findViewById<Button>(R.id.button4)
        var button5 = findViewById<Button>(R.id.button5)
        var button6 = findViewById<Button>(R.id.button6)
        var button7 = findViewById<Button>(R.id.button7)
        var button8 = findViewById<Button>(R.id.button8)
        var button9 = findViewById<Button>(R.id.button9)
        var button10 = findViewById<Button>(R.id.button10)

        button2.isEnabled = false;
        button5.isEnabled = false;
        button7.isEnabled = false;
        button6.isEnabled = false;
        button10.isEnabled = false;

        var switch2 = findViewById<Switch>(R.id.switch2)
        var switch5 = findViewById<Switch>(R.id.switch5)
        var switch7 = findViewById<Switch>(R.id.switch7)
        var switch6 = findViewById<Switch>(R.id.switch6)
        var switch10 = findViewById<Switch>(R.id.switch10)



        // Set an checked change listener for switch button
        switch2.setOnCheckedChangeListener { buttonView, isChecked ->
            if (isChecked) {
                // The switch is enabled/checked
                button2.isEnabled = true;

            } else {
                button2.isEnabled = false;
                //button2.setVisibility(View.VISIBLE);
            }
        }

        switch5.setOnCheckedChangeListener { buttonView, isChecked ->
            if (isChecked) {
                // The switch is enabled/checked
                button5.isEnabled = true;

            } else {
                button5.isEnabled = false;
                //button2.setVisibility(View.VISIBLE);
            }
        }

        switch7.setOnCheckedChangeListener { buttonView, isChecked ->
            if (isChecked) {
                // The switch is enabled/checked
                button7.isEnabled = true;

            } else {
                button7.isEnabled = false;
                //button2.setVisibility(View.VISIBLE);
            }
        }

        switch6.setOnCheckedChangeListener { buttonView, isChecked ->
            if (isChecked) {
                // The switch is enabled/checked
                button6.isEnabled = true;

            } else {
                button6.isEnabled = false;
                //button2.setVisibility(View.VISIBLE);
            }
        }

        switch10.setOnCheckedChangeListener { buttonView, isChecked ->
            if (isChecked) {
                // The switch is enabled/checked
                button10.isEnabled = true;

            } else {
                button10.isEnabled = false;
                //button2.setVisibility(View.VISIBLE);
            }
        }


        // BOTOES

        button2.setOnClickListener {

            id = "3402655"
            Thread {
                val cidade = CidadeClimaService.getClimaCidade(id)
                runOnUiThread {
                    textViewCidade?.text = cidade?.name.toString()
                    textViewTemperatura?.text = cidade?.main?.temp.toString()
                }
            }.start()
        }

        button.setOnClickListener {

            id = "3385131"
            Thread {
                var cidade = CidadeClimaService.getClimaCidade(id)
                runOnUiThread {
                    textViewCidade?.text = cidade?.name.toString()
                    textViewTemperatura?.text = cidade?.main?.temp.toString()
                }
            }.start()

        }
        button3.setOnClickListener {

            id = "3386622"
            Thread {
                var cidade = CidadeClimaService.getClimaCidade(id)
                runOnUiThread {
                    textViewCidade?.text = cidade?.name.toString()
                    textViewTemperatura?.text = cidade?.main?.temp.toString()
                }
            }.start()
        }

        button4.setOnClickListener {

            id = "4055815"
            Thread {
                var cidade = CidadeClimaService.getClimaCidade(id)
                runOnUiThread {
                    textViewCidade?.text = cidade?.name.toString()
                    textViewTemperatura?.text = cidade?.main?.temp.toString()
                }
            }.start()
        }

        button5.setOnClickListener {

            id = "3451190"
            Thread {
                var cidade = CidadeClimaService.getClimaCidade(id)
                runOnUiThread {
                    textViewCidade?.text = cidade?.name.toString()
                    textViewTemperatura?.text = cidade?.main?.temp.toString()
                }
            }.start()
        }

        button6.setOnClickListener {

            id = "3582383"
            Thread {
                var cidade = CidadeClimaService.getClimaCidade(id)
                runOnUiThread {
                    textViewCidade?.text = cidade?.name.toString()
                    textViewTemperatura?.text = cidade?.main?.temp.toString()
                }
            }.start()
        }

        button7.setOnClickListener {

            id = "3448439"
            Thread {
                var cidade = CidadeClimaService.getClimaCidade(id)
                runOnUiThread {
                    textViewCidade?.text = cidade?.name.toString()
                    textViewTemperatura?.text = cidade?.main?.temp.toString()
                }
            }.start()
        }

        button8.setOnClickListener {

            id = "3387115"
            Thread {
                var cidade = CidadeClimaService.getClimaCidade(id)
                runOnUiThread {
                    textViewCidade?.text = cidade?.name.toString()
                    textViewTemperatura?.text = cidade?.main?.temp.toString()
                }
            }.start()
        }

        button9.setOnClickListener {

            id = "3397277"
            Thread {
                var cidade = CidadeClimaService.getClimaCidade(id)
                runOnUiThread {
                    textViewCidade?.text = cidade?.name.toString()
                    textViewTemperatura?.text = cidade?.main?.temp.toString()
                }
            }.start()
        }

        button10.setOnClickListener {

            id = "3882428"
            Thread {
                var cidade = CidadeClimaService.getClimaCidade(id)
                runOnUiThread {
                    textViewCidade?.text = cidade?.name.toString()
                    textViewTemperatura?.text = cidade?.main?.temp.toString()
                }
            }.start()
        }

    }
}
