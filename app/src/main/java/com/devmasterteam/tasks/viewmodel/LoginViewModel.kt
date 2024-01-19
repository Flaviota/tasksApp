package com.devmasterteam.tasks.viewmodel

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import com.devmasterteam.tasks.service.repository.PersonRepository

class LoginViewModel(application: Application) : AndroidViewModel(application) {


    //o app n funciona quando eu invoco essa variavel
        private val personRepository = PersonRepository()

    /**
     * Faz login usando API
     */
    fun doLogin(email: String, password: String) {
        personRepository.login(email, password)
    }

    /**
     * Verifica se usuário está logado
     */
    fun verifyLoggedUser() {
    }

}
