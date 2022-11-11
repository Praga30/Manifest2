
package com.example.manifest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var numer=1
                if (numer==1)
                {
                findViewById<Button>(R.id.nastepny).setOnClickListener {
                findViewById<ImageView>(R.id.obrazki).setImageResource(R.drawable.image2)
                numer=2
                }
                findViewById<Button>(R.id.poprzedni).setOnClickListener {
                findViewById<ImageView>(R.id.obrazki).setImageResource(R.drawable.image3)
                numer=3
                }
                }else {
                if (numer==2)
                {
                    findViewById<Button>(R.id.nastepny).setOnClickListener {
                        findViewById<ImageView>(R.id.obrazki).setImageResource(R.drawable.image3)
                        numer=3
                    }
                    findViewById<Button>(R.id.poprzedni).setOnClickListener {
                        findViewById<ImageView>(R.id.obrazki).setImageResource(R.drawable.image1)
                        numer=1
                    }
                }else {
                      findViewById<Button>(R.id.nastepny).setOnClickListener {
                          findViewById<ImageView>(R.id.obrazki).setImageResource(R.drawable.image1)
                          numer=1
                      }
                        findViewById<Button>(R.id.poprzedni).setOnClickListener {
                            findViewById<ImageView>(R.id.obrazki).setImageResource(R.drawable.image2)
                            numer=2
                        }
                      }
                }



    }
    }


