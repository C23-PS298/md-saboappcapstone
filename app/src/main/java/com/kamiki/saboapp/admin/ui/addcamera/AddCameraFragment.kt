package com.kamiki.saboapp.admin.ui.addcamera

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.kamiki.saboapp.R

class AddCameraFragment : Fragment() {

    companion object {
        fun newInstance() = AddCameraFragment()
    }

    private lateinit var viewModel: AddCameraViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_add_camera, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(AddCameraViewModel::class.java)
        // TODO: Use the ViewModel
    }

}