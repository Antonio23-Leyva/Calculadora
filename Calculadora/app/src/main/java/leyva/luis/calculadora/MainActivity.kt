package leyva.luis.calculadora
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import org.mozilla.javascript.Context
import org.mozilla.javascript.Scriptable



class MainActivity : AppCompatActivity() {

  // Declaracion de botones
    lateinit var btn0:Button
    lateinit var btn1:Button
    lateinit var btn2:Button
    lateinit var btn3:Button
    lateinit var btn4:Button
    lateinit var btn5:Button
    lateinit var btn6:Button
    lateinit var btn7:Button
    lateinit var btn8:Button
    lateinit var btn9:Button
    lateinit var btnSuma:Button
    lateinit var btnResta:Button
    lateinit var btnMultiplicacion:Button
    lateinit var btnDivision:Button
    lateinit var btnBorrar:Button
    lateinit var btnResultado:Button

    lateinit var txtInput: TextView
    lateinit var txtOnput: TextView
    lateinit var process: String
    lateinit var rhino: Context
    private lateinit var scriptable: Scriptable


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        txtInput = findViewById(R.id.tv_resultado)
        txtOnput = findViewById(R.id.tv_resultado2)

        btn0 = findViewById(R.id.btn_0)
        btn1 = findViewById(R.id.btn_1)
        btn2 = findViewById(R.id.btn_2)
        btn3 = findViewById(R.id.btn_3)
        btn4 = findViewById(R.id.btn_4)
        btn5 = findViewById(R.id.btn_5)
        btn6 = findViewById(R.id.btn_6)
        btn7 = findViewById(R.id.btn_7)
        btn8 = findViewById(R.id.btn_8)
        btn9 = findViewById(R.id.btn_9)
        btnSuma = findViewById(R.id.btn_suma)
        btnResta = findViewById(R.id.btn_resta)
        btnDivision = findViewById(R.id.btn_division)
        btnMultiplicacion = findViewById(R.id.btn_multi)
        btnBorrar = findViewById(R.id.btn_borrar)
        btnResultado = findViewById(R.id.btn_result)



        btn_0.setOnClickListener {
        process = txtInput.getText().toString()
        txtInput.setText(process + "0")
    }
        btn_1.setOnClickListener {
        process = txtInput.getText().toString()
        txtInput.setText(process + "1")
    }
        btn_2.setOnClickListener {
        process = txtInput.getText().toString()
        txtInput.setText(process + "2")
    }
        btn_3.setOnClickListener {
        process = txtInput.getText().toString()
        txtInput.setText(process + "3")
    }
        btn_4.setOnClickListener {
        process = txtInput.getText().toString()
        txtInput.setText(process + "4")
    }
        btn_5.setOnClickListener {
        process = txtInput.getText().toString()
        txtInput.setText(process + "5")
    }
        btn_6.setOnClickListener {
        process = txtInput.getText().toString()
        txtInput.setText(process + "6")
    }
        btn_7.setOnClickListener {
        process = txtInput.getText().toString()
        txtInput.setText(process + "7")
    }
        btn_8.setOnClickListener {
        process = txtInput.getText().toString()
        txtInput.setText(process + "8")
    }
        btn_9.setOnClickListener {
        process = txtInput.getText().toString()
        txtInput.setText(process + "9")
    }
        btn_suma.setOnClickListener {
        process = txtInput.getText().toString()
        txtInput.setText(process + "+")
    }
        btn_resta.setOnClickListener {
        process = txtInput.getText().toString()
        txtInput.setText(process + "-")
    }
        btn_multi.setOnClickListener {
        process = txtInput.getText().toString()
        txtInput.setText(process + "*")
    }
        btn_division.setOnClickListener {
        process = txtInput.getText().toString()
        txtInput.setText(process + "/")
    }

        btn_borrar.setOnClickListener{
        process = txtInput.getText().toString()
            txtInput.setText(" ")
            txtOnput.setText(" ")
        }

        btn_result.setOnClickListener{
                process = txtInput.text.toString()
                rhino = Context.enter()
                rhino.optimizationLevel = -1
                var finalResult = ""
                finalResult = try {
                    scriptable = rhino.initStandardObjects()
                    rhino.evaluateString(scriptable, process, "javascript", 1, null).toString()
                } catch (e: Exception) {
                    "0"
                }
                txtOnput.text = finalResult


        }

}


}















