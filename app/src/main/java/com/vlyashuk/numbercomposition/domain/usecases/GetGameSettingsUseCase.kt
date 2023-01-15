package com.vlyashuk.numbercomposition.domain.usecases

import com.vlyashuk.numbercomposition.domain.entity.GameSettings
import com.vlyashuk.numbercomposition.domain.entity.Level
import com.vlyashuk.numbercomposition.domain.repository.GameRepository

class GetGameSettingsUseCase(
    private val repository: GameRepository
) {
    operator fun invoke(level: Level): GameSettings {
        return repository.getGameSettings(level)
    }
}