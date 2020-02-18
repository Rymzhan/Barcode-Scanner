package com.example.dimash.barcodescanner.ui.handbook

import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import com.example.dimash.barcodescanner.R

class HandbookFragment : Fragment() {

    companion object {
        fun newInstance() = HandbookFragment()
    }

    private lateinit var viewModel: HandbookViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.handbook_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(HandbookViewModel::class.java)
        // TODO: Use the ViewModel
    }

}
