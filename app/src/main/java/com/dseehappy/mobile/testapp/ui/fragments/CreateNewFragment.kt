package com.dseehappy.mobile.testapp.ui.fragments

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.dseehappy.mobile.testapp.R
import com.dseehappy.mobile.testapp.viewmodels.CreateNewViewModel

class CreateNewFragment : Fragment() {

    companion object {
        fun newInstance() = CreateNewFragment()
    }

    private lateinit var viewModel: CreateNewViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_create_new, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(CreateNewViewModel::class.java)
        // TODO: Use the ViewModel
    }

}