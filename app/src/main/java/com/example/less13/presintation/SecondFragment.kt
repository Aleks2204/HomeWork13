package com.example.less13.presintation

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.example.less13.R
import kotlinx.android.synthetic.main.fragment_second.*

class SecondFragment : Fragment(R.layout.fragment_second) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

        val tvSortText = arguments?.getString("SORT_EXTRA")
        tvSort.text = "$tvSortText"
        val tvNameText = arguments?.getString("NAME_EXTRA")
        tvName.text = "$tvNameText"
        val tvAgeText = arguments?.getString("AGE_EXTRA")
        tvAge.text = "$tvAgeText"
    }
}