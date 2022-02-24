package com.example.less13.presintation.utils

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import com.example.less13.R

fun FragmentManager.navigateTo(fragment: Fragment, addToBackStack: Boolean = false) {
    if (addToBackStack) {
        this.beginTransaction().addToBackStack(null)
            .replace(R.id.fragmentContainer, fragment).commit()
    } else {
        this.beginTransaction().replace(R.id.fragmentContainer, fragment).commit()
    }
}