package org.geeksforgeeks.slideanimation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.transition.Slide
import android.transition.TransitionManager
import android.view.Gravity
import android.view.View
import android.widget.Button
import android.widget.RelativeLayout
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val mRelativeLayout = findViewById<RelativeLayout>(R.id.relative_layout_1)
        val mButtonLeft = findViewById<Button>(R.id.button_1)
        val mButtonRight = findViewById<Button>(R.id.button_2)
        val mTextView1 = findViewById<TextView>(R.id.text_view_1)
        val mTextView2 = findViewById<TextView>(R.id.text_view_2)

        mButtonLeft.setOnClickListener {
            val mSlideLeft = Slide()
            mSlideLeft.slideEdge = Gravity.START
            TransitionManager.beginDelayedTransition(mRelativeLayout, mSlideLeft)
            mTextView1.visibility = View.VISIBLE
        }

        mButtonRight.setOnClickListener {
            val mSlideRight = Slide()
            mSlideRight.slideEdge = Gravity.END
            TransitionManager.beginDelayedTransition(mRelativeLayout, mSlideRight)
            mTextView2.visibility = View.VISIBLE
        }
    }
}