package com.vlyashuk.numbercomposition.domain.repository

import com.vlyashuk.numbercomposition.domain.entity.GameSettings
import com.vlyashuk.numbercomposition.domain.entity.Level
import com.vlyashuk.numbercomposition.domain.entity.Question

interface GameRepository {

    fun generateQuestion(
        maxSumValue: Int,
        countOfOptions: Int
    ): Question

    fun getGameSettings(level: Level): GameSettings
}