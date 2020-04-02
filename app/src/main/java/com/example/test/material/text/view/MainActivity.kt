package com.example.test.material.text.view

import android.content.res.ColorStateList
import android.graphics.drawable.RippleDrawable
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.constraintlayout.widget.ConstraintLayout.LayoutParams
import com.google.android.material.textview.MaterialTextView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        createMaterialTextView()
    }

    private fun createMaterialTextView() {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            MaterialTextView(this).apply {
                text = "test foo bar reproduce the issue"
                layoutParams = LayoutParams(
                    LayoutParams.MATCH_PARENT,
                    LayoutParams.MATCH_PARENT
                )
                setTextIsSelectable(true)

                foreground = RippleDrawable(ColorStateList.valueOf(0xffff0000.toInt()), null, null)
                isClickable = true
                container.addView(this)
            }
        }
    }

}