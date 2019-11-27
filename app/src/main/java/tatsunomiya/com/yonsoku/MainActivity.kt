package tatsunomiya.com.yonsoku

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        button1.setOnClickListener(this)
    }


    override fun onClick(v: View) {


        when(v.id) {

            R.id.button1 -> plus()

        }










    }

    fun plus(){
        try {


            val resolve = editText1.getText().toString().toDouble()
            val resolve2 = editText2.getText().toString().toDouble()



            Log.d("tashunomiya", "エラーです")

            val intent = Intent(this, SecondActivity::class.java)

            intent.putExtra("VALUE1", resolve)
            intent.putExtra("VALUE2", resolve2)



            startActivity(intent)


        }catch(e: Exception) {
            Log.d("tashunomiya", "エラーです")
            

        }


    }


//    private fun tasi() {
//        var a1 = Integer.parseInt(editText1.getText().toString())
//        var a2 = Integer.parseInt(editText2.getText().toString())
//
//        Log.d("tatsunomiya" , "$a1 + $a2 ")
//
//
//    }
}