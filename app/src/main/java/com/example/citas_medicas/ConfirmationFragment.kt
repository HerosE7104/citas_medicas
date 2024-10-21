package com.example.citas_medicas

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.activityViewModels

class ConfirmationFragment : Fragment() {

    private val sharedViewModel: SharedViewModel by activityViewModels()

    // ... (onCreateView)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        view.findViewById<Button>(R.id.confirmAppointmentButton).setOnClickListener {
            sharedViewModel.selectedDoctor.value
            sharedViewModel.selectedDate.value
            sharedViewModel.selectedTime.value
    }
}
}