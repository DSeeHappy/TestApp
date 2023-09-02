package com.dseehappy.mobile.testapp.viewmodels

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.dseehappy.mobile.testapp.data.Project
import com.dseehappy.mobile.testapp.data.ProjectRepository
import com.dseehappy.mobile.testapp.data.UserPreferencesRepository


data class ProjectListUiModel(
    val projects: List<Project>,
    val showCompleted: Boolean
)

class ProjectListViewModel(
    repository: ProjectRepository,
    private val userPreferencesRepository: UserPreferencesRepository
): ViewModel() {
}

class ProjectListViewModelFactory(
    private val repository: ProjectRepository,
    private val userPreferencesRepository: UserPreferencesRepository
) : ViewModelProvider.Factory {

    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(ProjectListViewModel::class.java)) {
            @Suppress("UNCHECKED_CAST")
            return ProjectListViewModel(repository, userPreferencesRepository) as T
        }
        throw IllegalAccessException("Unknown ViewModel class")
    }
}