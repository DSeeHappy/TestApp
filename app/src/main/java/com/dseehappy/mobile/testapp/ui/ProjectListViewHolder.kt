package com.dseehappy.mobile.testapp.ui

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.dseehappy.mobile.testapp.R
import com.dseehappy.mobile.testapp.data.Project
import com.dseehappy.mobile.testapp.databinding.ProjectListViewItemBinding

class ProjectListViewHolder(private val binding: ProjectListViewItemBinding) : RecyclerView.ViewHolder(binding.root) {
    fun bind(project: Project){

    }

    companion object{
        fun create(parent:ViewGroup): ProjectListViewHolder {
            val view = LayoutInflater.from(parent.context)
                .inflate(R.layout.project_list_view_item,parent,false)
            val binding = ProjectListViewItemBinding.bind(view)
                return ProjectListViewHolder(binding)
        }
    }
}