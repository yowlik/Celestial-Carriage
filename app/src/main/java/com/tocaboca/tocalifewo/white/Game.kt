package com.tocaboca.tocalifewo.white

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import com.tocaboca.tocalifewo.R
import com.tocaboca.tocalifewo.databinding.ActivityGameBinding

class Game : AppCompatActivity() {


    val roll=mutableListOf<String>("1","2","3")
    var scr=0


    lateinit var binding: ActivityGameBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityGameBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.b1.setOnClickListener {
            val i2:String ="1"
            val i=roll.random()
            binding.pl.setImageResource(R.drawable.snake)
            check(i,binding.en)
            if(i2==i){
                scr++
                binding.score.text="${scr}"
            }

        }
        binding.b2.setOnClickListener {
            val i2:String="2"
            val i=roll.random()
            binding.pl.setImageResource(R.drawable.scrop)
            check(i,binding.en)
            if(i2==i){
                scr++
                binding.score.text="${scr}"
            }
        }
        binding.b3.setOnClickListener {
            val i2:String="3"
            binding.pl.setImageResource(R.drawable.relic)
            val i=roll.random()
            check(i,binding.en)
            if(i2==i){
                scr++
                binding.score.text="${scr}"
            }
        }



    }

    fun check(i:String,im: ImageView) {
        if (i == "1") {
            im.setImageResource(R.drawable.snake)
        } else if (i == "2") {
            im.setImageResource(R.drawable.scrop)

        } else {
            im.setImageResource(R.drawable.relic)
        }
    }

}