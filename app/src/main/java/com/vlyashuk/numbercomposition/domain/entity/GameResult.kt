package com.vlyashuk.numbercomposition.domain.entity

import java.io.Serializable

data class GameResult(
    val winner: Boolean,
    val countOgRightAnswers: Int,
    val countOfQuestions: Int,
    val gameSettings: GameSettings
) : Serializable