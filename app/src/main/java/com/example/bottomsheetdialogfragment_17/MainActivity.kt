package com.example.bottomsheetdialogfragment_17

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.widget.Button
import android.widget.LinearLayout
import android.widget.Toast
import com.google.android.material.bottomsheet.BottomSheetDialog

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button = findViewById<Button>(R.id.button)

        button.setOnClickListener {

            val bottomSheetDialog = BottomSheetDialog(
                this@MainActivity, R.style.BottomSheetDialogTheme
            )

            val bottomSheetView = LayoutInflater.from(applicationContext).inflate(
                R.layout.bottom_sheet,
                findViewById<LinearLayout>(R.id.bottomSheet)
            )

            bottomSheetView.findViewById<View>(R.id.buttonShare).setOnClickListener {
                Toast.makeText(this, "Share...", Toast.LENGTH_LONG).show()
                bottomSheetDialog.dismiss()
            }

            bottomSheetDialog.setContentView(bottomSheetView)
            bottomSheetDialog.show()

        }
    }
}