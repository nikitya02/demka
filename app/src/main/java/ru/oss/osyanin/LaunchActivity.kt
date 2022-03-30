package ru.oss.osyanin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer

class LaunchActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_launch)
        val timer=object :CountDownTimer(3000, 1000){
            override fun onTick(miltlisUnitilFunished: Long){//Действие во время работы таймера

            }

            override fun onFinish() {//Действие после окончания времени таймера
                //Переход на другой экран
                val intent=Intent(this@LaunchActivity,MainActivity::class.java)
                //Активация перехода
                startActivity(intent)
                //Закрытие окна и удоление даных
                finish()
            }
        }
        timer.start()

    }
}