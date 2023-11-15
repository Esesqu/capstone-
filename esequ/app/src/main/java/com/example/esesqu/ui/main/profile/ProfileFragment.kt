package com.example.esesqu.ui.main.profile

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import com.example.esesqu.R
import com.example.esesqu.common.viewBinding
import com.example.esesqu.databinding.FragmentProfileBinding
import com.example.esesqu.ui.login.AuthViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class ProfileFragment : Fragment(R.layout.fragment_profile) {

    private val binding by viewBinding(FragmentProfileBinding::bind)
    private val viewModel by viewModels<AuthViewModel>()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        with(binding) {

            toolbar.setNavigationOnClickListener {
                findNavController().navigateUp()
            }

            tvUserEmail.text = viewModel.currentUser?.email.toString()

            btnLogout.setOnClickListener {
                viewModel.logout()
                findNavController().navigate(ProfileFragmentDirections.profileToSplash())
            }
        }
    }
}