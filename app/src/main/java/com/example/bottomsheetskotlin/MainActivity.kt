package com.example.bottomsheetskotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.google.android.material.bottomsheet.BottomSheetDialogFragment
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
   private lateinit var modalBottomSheet: ModalBottomSheet

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        modalBottomSheet.show(supportFragmentManager,ModalBottomSheet.TAG)


        tvHello?.text="hello world will be repalced"
    }
}

