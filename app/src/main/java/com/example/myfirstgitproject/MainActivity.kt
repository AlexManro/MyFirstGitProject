package com.example.myfirstgitproject


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.myfirstgitproject.constance.Constance
import com.example.myfirstgitproject.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var bindingClass: ActivityMainBinding


    override fun onCreate(s: Bundle?) {
        super.onCreate(s)
        bindingClass = ActivityMainBinding.inflate(layoutInflater)
        setContentView(bindingClass.root)

        bindingClass.btResult.setOnClickListener{
        bindingClass.imPhoto.visibility = View.VISIBLE

            when(bindingClass.edValue.text.toString()){
                Constance.DIRECTOR -> {
                    bindingClass.tvResult.visibility = View.VISIBLE
                    val tempText = "Get your money: ${Constance.DIRECTOR_MONEY}"
                    if (bindingClass.edPassword.text.toString() == Constance.DIRECTOR_PASSWORD) {
                        bindingClass.tvResult.text = tempText
                        bindingClass.imPhoto.setImageResource(R.drawable.andrey)
                    } else {
                        bindingClass.tvResult.text = "No correct Password"
                    }
                }
                Constance.ENGINER -> {
                    bindingClass.tvResult.visibility = View.VISIBLE
                    val tempText = "Get your money: ${Constance.ENGINER_MONEY}"
                    bindingClass.tvResult.text = tempText
                    if (bindingClass.edPassword.text.toString() == Constance.INGINER_PASSWORD) {
                       bindingClass.tvResult.text = tempText
                        bindingClass.imPhoto.setImageResource(R.drawable.artem)
                    } else {
                        bindingClass.tvResult.text = "No correct Password"
                    }
                }

                Constance.DVORNIK -> {
                    bindingClass.tvResult.visibility = View.VISIBLE
                    val tempText = "Get your money ${Constance.DVORNIK_MONEY}"
                    bindingClass.tvResult.text = tempText
                    if (bindingClass.edPassword.text.toString() == Constance.DVORNIK_PASSWORD) {
                       bindingClass.tvResult.text =  tempText
                        bindingClass.imPhoto.setImageResource(R.drawable.artur)
                    } else {
                        bindingClass.tvResult.text = "No correct Password"
                    }
                }
                else ->{
                    bindingClass.tvResult.visibility = View.VISIBLE
                    bindingClass.tvResult.text = "Error"
                }


            }
        }

    }


}

