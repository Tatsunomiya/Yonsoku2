package tatsunomiya.com.yonsoku

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_second.*

class SecondActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val value1 = intent.getDoubleExtra("VALUE1", 0.1)
        val value2 = intent.getDoubleExtra("VALUE2", 1.1)

        textView.text = "${value1 + value2}"
    }




}
