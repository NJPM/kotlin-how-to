package com.example.kotlinhowto.data

import com.example.kotlinhowto.R
import com.example.kotlinhowto.model.Affirmation

class Datasource() {
    fun loadAffirmations(): List<Affirmation> {
        return listOf<Affirmation>(
            Affirmation(R.string.roll, R.drawable.img_5197),
            Affirmation(R.string.calculate_tip, R.drawable.img_5197),
        )
    }
}