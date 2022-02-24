package com.example.less13.presintation

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.example.less13.R
import kotlinx.android.synthetic.main.fragment_main.*

class MainFragment : Fragment(R.layout.fragment_main) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        btnCreateProfile.setOnClickListener {
            if (!etSort.text.isNullOrEmpty() && !etName.text.isNullOrEmpty()
                && !etAge.text.isNullOrEmpty()
            ) {
                navigateToSecondFragment()
            } else {
                Toast.makeText(requireContext(), "Введите все данные", Toast.LENGTH_SHORT)
                    .show()
            }
        }
    }

    private fun navigateToSecondFragment() {
        val bundle = Bundle()
        bundle.putString("SORT_EXTRA", etSort.text.toString())
        bundle.putString("NAME_EXTRA", etName.text.toString())
        bundle.putString("AGE_EXTRA", etAge.text.toString())

        val fragment = SecondFragment()
        fragment.arguments = bundle

        requireActivity().supportFragmentManager.beginTransaction()
            .replace(R.id.fragmentContainer, fragment)
            .addToBackStack(null)
            .commit()
    }
}

