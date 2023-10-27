package com.example.kotlinio

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import com.example.kotlinio.Data.DataForm
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update

class CobaViewModel: ViewModel() {
    var namaUsr : String by mutableStateOf("")
        private set
    var noTlp : String by mutableStateOf("")
        private set
    var alamatUsr : String by mutableStateOf("")
        private set
    var jenisKl : String by mutableStateOf("")
        private set
    var statusUsr : String by mutableStateOf("")
        private set
    var emailUsr : String by mutableStateOf("")
        private set


    private val _uiState = MutableStateFlow(DataForm())
    val uiState : StateFlow<DataForm> = _uiState.asStateFlow()

    fun BacaData(nm:String,tlp:String,almt:String,jk:String,email:String,stat:String){
        namaUsr=nm;
        noTlp=tlp;
        jenisKl=jk;
        alamatUsr=almt;
        emailUsr=email;
        statusUsr=stat;
    }
    fun setJenisK(pilihJK:String) {
    _uiState.update { currentState -> currentState.copy(sex = pilihJK) }
    }
    fun setStatus(pilihStatus:String) {
        _uiState.update { currentState -> currentState.copy(stat = pilihStatus) }
    }
}