package com.csubzero.colormyviews

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setListeners()
    }

    private fun setListeners() {
        val clickableViews: List<View> = listOf(box_one_text, box_two_text, box_three_text, box_four_text, box_five_text, constraint_layout, btn_red, btn_green, btn_yellow)
        for (item in clickableViews){
            item.setOnClickListener{
                makeColoured(it)
            }
        }
    }

    private fun makeColoured(view: View) {
        when(view.id){
            R.id.box_one_text->view.setBackgroundColor(Color.DKGRAY)
            R.id.box_two_text->view.setBackgroundColor(Color.GRAY)
            R.id.box_three_text->view.setBackgroundResource(android.R.color.holo_green_light)
            R.id.box_four_text->view.setBackgroundResource(android.R.color.holo_green_dark)
            R.id.box_five_text->view.setBackgroundResource(android.R.color.holo_green_light)
            R.id.btn_green->box_three_text.setBackgroundResource(R.color.my_green)
            R.id.btn_red->box_four_text.setBackgroundResource(R.color.my_red)
            R.id.btn_yellow->box_five_text.setBackgroundResource(R.color.my_yellow)

            else -> view.setBackgroundColor(Color.LTGRAY)
        }
    }
}