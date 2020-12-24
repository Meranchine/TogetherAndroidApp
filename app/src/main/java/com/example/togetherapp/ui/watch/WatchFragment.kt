package com.example.togetherapp.ui.watch

import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.Observer
import com.example.togetherapp.R
import kotlinx.android.synthetic.main.fragment_watch.*

class WatchFragment : Fragment() {

    companion object {
        fun newInstance() = WatchFragment()
    }

    private lateinit var viewModel: WatchViewModel //初始化ViewModel对象

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_watch, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(WatchViewModel::class.java)
        // TODO: Use the ViewModel
        viewModel.seconds.observe(viewLifecycleOwner,Observer{
            val hours = it/3600
            val minutes = (it % 3600)/60
            val secs = it % 60
            timer.text = String.format("%02d:%02d:%02d",hours,minutes,secs)
        })
        start.setOnClickListener {
            viewModel.start()
        }
        stop.setOnClickListener {
            viewModel.stop()
        }
        restart.setOnClickListener {
            viewModel.restart()
        }
    }

}