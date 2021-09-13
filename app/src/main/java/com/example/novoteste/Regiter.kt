package com.example.novoteste

import Database.AppDatabase
import Factory.UserViewModelFactory
import Repository.UserRepository
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.dsts.R
import com.example.dsts.databinding.ActivityRegiterBinding
import view.UserViewModel


class Regiter : AppCompatActivity() {

    private lateinit var binding: ActivityRegiterBinding
    private lateinit var userViewModel: UserViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_regiter)

        binding = DataBindingUtil.setContentView(this, R.layout.activity_regiter)
        val dao = AppDatabase.getDatabase(application).userDao()
        val repository = UserRepository(dao)
        val factory = UserViewModelFactory(repository)
        userViewModel = ViewModelProvider(this, factory).get(UserViewModel::class.java)
        binding.myUserViewModel = userViewModel
        binding.lifecycleOwner = this
       return displayUserList()

    }

    private fun displayUserList() {
         userViewModel.users.observe(this, Observer {
             Log.i("MYTAG", it.toString())
         })
    }

}