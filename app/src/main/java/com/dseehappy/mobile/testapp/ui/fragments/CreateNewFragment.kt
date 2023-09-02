package com.dseehappy.mobile.testapp.ui.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.dseehappy.mobile.testapp.R
import com.dseehappy.mobile.testapp.viewmodels.CreateNewViewModel

class CreateNewFragment : Fragment() {

    companion object {
        fun newInstance() = CreateNewFragment()
    }

    private val createNewViewModel: CreateNewViewModel by viewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_create_new, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

    }

}