package com.example.mypractice

import android.content.Context
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.os.Bundle
import android.view.View
import androidx.activity.ComponentActivity
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.mypractice.ui.theme.MypracticeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(MyView(this))
    }
    class MyView(context: Context?) : View(context) {
        var paint: Paint? = null

        init {
            paint = Paint()
        }

        override fun onDraw(canvas: Canvas) {
            super.onDraw(canvas)
            val x = width
            val y = height
            val radius: Int
            radius = 200
            paint?.setStyle(Paint.Style.FILL_AND_STROKE)
            paint?.setColor(Color.WHITE)
            paint?.let { canvas.drawPaint(it) }
            // Use Color.parseColor to define HTML colors
            paint?.setColor(Color.parseColor("#CD5C5C"))
            paint?.let {
                canvas.drawCircle((x / 2).toFloat(), (y / 2).toFloat(), radius.toFloat(),
                    it
                )
                canvas.drawRect(100F, 100F, 500F, 800F, it)
            }
        }
    }

}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview2() {
    MypracticeTheme {
        Greeting("Android")
    }
}


