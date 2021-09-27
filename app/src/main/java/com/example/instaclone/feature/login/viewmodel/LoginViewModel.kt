package com.example.instaclone.feature.login.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class LoginViewModel @Inject constructor() {

    private val _loginEnabled = MutableLiveData(false)
    val loginEnabled: LiveData<Boolean>
        get() = _loginEnabled

    private val _userName = MutableLiveData<String>()
    val userName: LiveData<String>
        get() = _userName

    private val _password = MutableLiveData<String>()
    val password: LiveData<String>
        get() = _password
}
