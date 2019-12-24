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
        button2.setOnClickListener(this)
        button3.setOnClickListener(this)

        button4.setOnClickListener(this)


    }


    override fun onClick(v: View) {


        when(v.id) {

            R.id.button1 -> plus()

            R.id.button2 -> hiku()

            R.id.button3 ->  kake()

            R.id.button4 -> waru()

        }










    }

    fun plus(){
        try {


            val resolve = editText1.getText().toString().toDouble()
            val resolve2 = editText2.getText().toString().toDouble()

            val data = Bundle()

            data.putString("button", "A")


            Log.d("tashunomiya", "エラーです")

            val intent = Intent(this, SecondActivity::class.java)

            intent.putExtra("VALUE1", resolve)
            intent.putExtra("VALUE2", resolve2)
            intent.putExtras(data)


            startActivity(intent)


        }catch(e: Exception) {
            Log.d("tashunomiya", "エラーです")
            

        }


    }


    fun hiku(){
        try {


            val resolve = editText1.getText().toString().toDouble()
            val resolve2 = editText2.getText().toString().toDouble()

            val data = Bundle()

            data.putString("button", "B");


            Log.d("tashunomiya", "エラーです")

            val intent = Intent(this, SecondActivity::class.java)

            intent.putExtra("VALUE1", resolve)
            intent.putExtra("VALUE2", resolve2)
            intent.putExtras(data)



            startActivity(intent)


        }catch(e: Exception) {
            Log.d("tashunomiya", "エラーです")


        }


    }


    fun kake(){
        try {


            val resolve = editText1.getText().toString().toDouble()
            val resolve2 = editText2.getText().toString().toDouble()


            val data = Bundle()

            data.putString("button", "C");


            Log.d("tashunomiya", "エラーです")

            val intent = Intent(this, SecondActivity::class.java)

            intent.putExtra("VALUE3", resolve)
            intent.putExtra("VALUE3", resolve2)
            intent.putExtras(data)


            startActivity(intent)


        }catch(e: Exception) {
            Log.d("tashunomiya", "エラーです")


        }


    }


    fun waru(){
        try {


            val resolve = editText1.getText().toString().toDouble()
            val resolve2 = editText2.getText().toString().toDouble()



            val data = Bundle()

            data.putString("button", "D");


            Log.d("tashunomiya", "エラーです")

            val intent = Intent(this, SecondActivity::class.java)

            intent.putExtra("VALUE1", resolve)
            intent.putExtra("VALUE2", resolve2)
            intent.putExtras(data)


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