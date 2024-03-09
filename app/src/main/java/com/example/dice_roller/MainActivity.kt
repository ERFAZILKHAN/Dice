package com.example.dice_roller

import android.os.Bundle
import android.widget.ImageView
import androidx.activity.ComponentActivity
import com.example.dice_roller.databinding.ActivityMainBinding
import java.util.Random


class MainActivity : ComponentActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit  var diceImage :ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.Button.setOnClickListener {
            diceRoller()
        }

        diceImage = binding.diceImage
    }

    private fun diceRoller() {

        val drawableResource = when(Random().nextInt(6)+1){

            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else-> R.drawable.dice_6

        }

        diceImage.setImageResource(drawableResource)
    }
}