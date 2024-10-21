package com.example.citas_medicas

import androidx.fragment.app.viewModels
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class SharedViewModel : ViewModel() {
    var selectedDoctor = MutableLiveData<Doctor>()
    val selectedDate = MutableLiveData<com.google.android.material.datepicker.MaterialDatePicker.InputMode>()
    val selectedTime = MutableLiveData<com.google.android.material.datepicker.MaterialDatePicker.InputMode>()
}
