package com.vlyashuk.numbercomposition.domain.entity

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class GameResult(
    val winner: Boolean,
    val countOfQuestions: Int,
    val gameSettings: Int,
    val countOfRightAnswers: GameSettings
) : Parcelable