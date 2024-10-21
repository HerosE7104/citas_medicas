package com.example.citas_medicas

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.activityViewModels
import androidx.navigation.fragment.findNavController


class DoctorSelectionFragment() : Fragment() {

    private val sharedViewModel: SharedViewModel by activityViewModels()


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_doctor_selection1, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        var adapter = DoctorAdapter().apply {

            setOnItemClickListener({
                sharedViewModel.selectedDoctor
                findNavController().navigate(R.id.action_doctorSelectionFragment_to_appointmentDetailsFragment)
            })
        }
    }

    private fun DoctorAdapter(): Any {
        TODO("Not yet implemented")
    }
}

private fun Any.setOnItemClickListener(any: Any) {
    TODO("Not yet implemented")
}
