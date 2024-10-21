package com.example.citas_medicas

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.activityViewModels

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [AppointmentDetailsFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class AppointmentDetailsFragment : Fragment() {

    private val sharedViewModel: SharedViewModel by activityViewModels()
    // ... (DatePicker, TimePicker, etc.)

    // ... (onCreateView)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        view.findViewById<Button>(R.id.confirmButton).setOnClickListener {view

            sharedViewModel.selectedDoctor.value

        }
}
}