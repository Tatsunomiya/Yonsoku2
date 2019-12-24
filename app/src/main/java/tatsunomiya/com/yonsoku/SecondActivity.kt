package tatsunomiya.com.yonsoku

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_second.*


class SecondActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)


        var button = intent.getStringExtra("button")


          val value1 = intent.getDoubleExtra("VALUE1", 5.5)
          val value2 = intent.getDoubleExtra("VALUE2", 1.1)

        when (button) {

            "A" -> textView.text = "${value1 + value2}"


            "B" -> textView.text = "${value1 - value2}"

            "C" -> textView.text = "${value1 * value2}"



            "D" -> textView.text = "${value1 / value2}"


        }


    }
}





