package view

import Model.User
import Repository.UserRepository
import androidx.databinding.Bindable
import androidx.databinding.Observable
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch


class UserViewModel(private val repository: UserRepository) : ViewModel(), Observable {

    val users = repository.allUser

    @Bindable
    val inputEmail = MutableLiveData<String>()

    @Bindable
    val inputPassword = MutableLiveData<String>()

    @Bindable
    val inputConfirmPassword = MutableLiveData<String>()

    @Bindable
    val ButtonSave = MutableLiveData<String>()

    @Bindable
    val ButtonLogar = MutableLiveData<String>()

    init {
        ButtonLogar.value = "Logar"
    }

    init {
        ButtonSave.value = "Salvar"
    }


    fun saveUser(): String {
        try {
            val email = inputEmail.value!!
            val password = inputConfirmPassword.value!!
            val confirmPassword = inputConfirmPassword.value!!

            val verificar = verificarPasswords(password, confirmPassword)

            if (verificar == true) {
                insert(User(id=0, email, password))
                inputEmail.value = null
                inputPassword.value = null
                inputConfirmPassword.value = null
            }
            return "User Register Sucess"
        }catch (error: Error){
            return "Error in Register"
        }
    }

    fun verificarPasswords(password: String, ConfirmPassword: String ): Boolean{
        if (password == ConfirmPassword) return true
        else false

        return false
    }

    fun insert(user: User) = viewModelScope.launch {
        val newRowId = repository.insert(user)
    }

    fun update(user: User) = viewModelScope.launch {
        repository.update(user)
    }

    fun delete(user: User) = viewModelScope.launch {
        repository.delete(user)
    }

    override fun addOnPropertyChangedCallback(callback: Observable.OnPropertyChangedCallback?) {

    }

    override fun removeOnPropertyChangedCallback(callback: Observable.OnPropertyChangedCallback?) {

    }


}