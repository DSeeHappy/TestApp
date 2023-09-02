package com.dseehappy.mobile.testapp.ui.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import com.dseehappy.mobile.testapp.R
import com.dseehappy.mobile.testapp.data.ProjectRepository
import com.dseehappy.mobile.testapp.data.UserPreferencesRepository
import com.dseehappy.mobile.testapp.databinding.FragmentProjectListBinding
import com.dseehappy.mobile.testapp.viewmodels.ProjectListViewModel
import com.dseehappy.mobile.testapp.viewmodels.ProjectListViewModelFactory

/**
 * A simple [Fragment] subclass as the default destination in the navigation.
 */
class ProjectListFragment : Fragment() {

    private var _binding: FragmentProjectListBinding? = null
    private val adapter = ProjectListAdapter()

    private val viewModel : ProjectListViewModel by viewModels{
        ProjectListViewModelFactory(ProjectRepository, UserPreferencesRepository.getInstance(requireContext()))
    }

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        _binding = FragmentProjectListBinding.inflate(inflater, container, false)
        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.createNewFab.setOnClickListener {
            findNavController().navigate(R.id.action_ProjectListFragment_to_CreateNewFragment)
        }


    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}