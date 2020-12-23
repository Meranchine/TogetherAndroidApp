package com.example.togetherapp.ui.weather_main

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelProviders
import com.example.togetherapp.R
import kotlinx.android.synthetic.main.fragment_weather.*

class WeatherFragment : Fragment() {

//    private lateinit var weatherViewModel: WeatherViewModel
//
//    override fun onCreateView(
//            inflater: LayoutInflater,
//            container: ViewGroup?,
//            savedInstanceState: Bundle?
//    ): View? {
//        weatherViewModel =
//                ViewModelProviders.of(this).get(WeatherViewModel::class.java)
//        val root = inflater.inflate(R.layout.fragment_weather, container, false)
//        val textView: TextView = root.findViewById(R.id.text_dashboard)
//        weatherViewModel.text.observe(viewLifecycleOwner, Observer {
//            textView.text = it
//        })
//        return root
//    }
//
//    override fun onActivityCreated(savedInstanceState: Bundle?) {
//        super.onActivityCreated(savedInstanceState)
//
//        weatherViewModel = ViewModelProvider(this, ViewModelProvider.AndroidViewModelFactory(application)).get(CityViewModel::class.java)
//        weatherViewModel .cities.observe(this, Observer {
//            val cities =it
//            val adapter= ArrayAdapter<CityItem>(this,android.R.layout.simple_list_item_1,cities)
//            listView.adapter=adapter
//            listView.setOnItemClickListener { adapterView, view, position, l ->
//                val cityCode= cities[position].city_code
//                val intent = Intent(this,WeatherFragment2::class.java)
//                intent.putExtra("city_code",cityCode)
//                startActivity(intent)
//            }
//        })
//    }
}