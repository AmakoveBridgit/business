package com.example.assignment3_login_register


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.assignment3_login_register.databinding.ActivityAddContactBinding

class AddContactActivity : AppCompatActivity() {
    lateinit var binding: Login
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = Login.inflate(layoutInflater)
        setContentView(binding.root)
        binding.btButton.setOnClickListener {
            validateContact()
            clearErrors()
        }
    }


    fun validateContact() {
        val name = binding.etFirstname.text.toString()
        val phoneNumber = binding.etPhone.text.toString()
        val email = binding.etEmail.text.toString()
        var error=false
        if (name.isBlank()) {
            binding.tilFirstName.error = " Name required"
            error = true
        }
        if (phoneNumber.isBlank()) {
            binding.tilPhone.error = "Phone Number is required"
            error = true
        }
        if (email.isBlank()) {
            binding.tilEmail.error = "Email  is required"
            error = true

        }

        if (!error) {
            Toast.makeText(
                this, "$name $phoneNumber $email",
                Toast.LENGTH_LONG
            ).show()

        }
    }

    fun clearErrors(){
        binding.tilFirstname.error=null
        binding.tilPhone.error=null
        binding.tilEmail.error=null
    }
}





