package com.dseehappy.mobile.testapp.ui.fragments

import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import com.dseehappy.mobile.testapp.data.Project
import com.dseehappy.mobile.testapp.ui.ProjectListViewHolder

class ProjectListAdapter : ListAdapter<Project, ProjectListViewHolder>(PROJECT_LIST_COMPARATOR) {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProjectListViewHolder {
        return ProjectListViewHolder.create(parent)
    }

    override fun onBindViewHolder(holder: ProjectListViewHolder, position: Int) {
        TODO("Not yet implemented")
    }

    companion object {
        private val PROJECT_LIST_COMPARATOR = object : DiffUtil.ItemCallback<Project>() {
            override fun areItemsTheSame(oldItem: Project, newItem: Project): Boolean =
                oldItem.name == newItem.name

            override fun areContentsTheSame(oldItem: Project, newItem: Project): Boolean =
                oldItem == newItem
        }
    }
}