package com.example.myproject.ui
import CallBack
import Controller
import android.content.ContentValues.TAG
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.util.Log
import android.widget.Toast
import androidx.core.content.ContextCompat
import com.example.myproject.R
import com.example.myproject.databinding.ActivityMainBinding
import kotlin.math.log

class MainActivity : AppCompatActivity(), CallBack {
    val lawan by lazy {
        arrayListOf(
            binding.ibatu2,
            binding.ikertas2,
            binding.igunting2,
        )
    }
        private lateinit var binding: ActivityMainBinding
        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            binding = ActivityMainBinding.inflate(layoutInflater)
            setContentView(binding.root)

            val controller = Controller(this)

            val kita = arrayListOf(
                binding.ibatu1,
                binding.ikertas1,
                binding.igunting1,
                binding.irefresh,
                binding.textstatus
            )

            kita.forEachIndexed { index, imageView ->
                imageView.setOnClickListener {
                 randomAnimation()
                    binding.ibatu1.setOnClickListener {
                        Log.d(TAG, "Batu")
                        Toast.makeText(this, imageView.contentDescription, Toast.LENGTH_SHORT).show()
                        binding.ibatu1.imageTintMode
                        binding.ibatu1.setBackgroundColor(ContextCompat.getColor(this,R.color.baby_blue))
                    }
                    binding.ikertas1.setOnClickListener {
                        Log.d(TAG, "Kertas")
                        Toast.makeText(this, "Kertas", Toast.LENGTH_SHORT).show()
                        binding.ikertas1.imageTintMode
                        binding.ikertas1.setBackgroundColor(ContextCompat.getColor(this,R.color.baby_blue))
                    }
                    binding.igunting1.setOnClickListener {
                        Log.d(TAG, "Gunting")
                        Toast.makeText(this, "Gunting", Toast.LENGTH_SHORT).show()
                        binding.igunting1.imageTintMode
                        binding.igunting1.setBackgroundColor(ContextCompat.getColor(this,R.color.baby_blue))
                    }
                }

            }

        }

        fun randomAnimation(){
            lawan.forEach {
                Handler(Looper.getMainLooper()).postDelayed({
                //    it.setBackgroundResource(R.drawable.bg_rounded)
                    it.backgroundTintList = ContextCompat.getColorStateList(this, R.color.blue)
                },1000)
                binding.ibatu2.setOnClickListener {
                    Log.d(TAG, "Click Button Batu")
                }
                binding.ikertas2.setOnClickListener {
                    Log.d(TAG, "Click Button Kertas")
                }
                binding.igunting2.setOnClickListener {
                    Log.d(TAG, "Click Button Gunting")
                }
                binding.textstatus.setOnClickListener {
                    Log.d(TAG, "Click Button status")
                }
                binding.irefresh.setOnClickListener {
                    Log.d(TAG, "Click Button Refresh")
                }
            }
        }
        override fun tampilkanHasil(result: String) {
            binding.textstatus.text = result
        }
    }


