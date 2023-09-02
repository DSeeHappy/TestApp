package com.dseehappy.mobile.testapp.data

import kotlinx.coroutines.flow.flowOf

object ProjectRepository {

    val projects = flowOf(
        listOf(
            Project(name = "test 1",completed = false),
            Project(name = "test 2",completed = false),
            Project(name = "test 3",completed = false),
            Project(name = "test 4",completed = false),
            Project(name = "test 5",completed = false),
            Project(name = "test 6",completed = false),
            Project(name = "test 7",completed = false),
            Project(name = "test 8",completed = false),
            Project(name = "test 9",completed = false),
            Project(name = "test 10",completed = false),
        )
    )
}