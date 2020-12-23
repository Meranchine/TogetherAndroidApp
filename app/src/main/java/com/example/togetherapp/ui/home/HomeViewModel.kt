package com.example.togetherapp.ui.home

import android.media.MediaPlayer
import android.view.View
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import java.io.IOException

class HomeViewModel : ViewModel() {
    val TAG = "MainActivity"
    val mediaPlayer = MediaPlayer()
    val musicList = mutableListOf<String>()
    val musicNameList = mutableListOf<String>()
    var current = 0
    var isPause = false
    val Channel_ID = "my channel"
    val Notification_ID = 1


    fun onPlay(v: View) {
        play()
    }

    fun onPause(v: View) {
        if (isPause) {
            mediaPlayer.start()
            isPause = false
        } else {
            mediaPlayer.pause()
            isPause = true
        }
    }

    fun onStop(v: View) {
        mediaPlayer.stop()
    }

    fun onNext(v: View) {
        current++
        if (current >= musicList.size) {
            current = 0
        }
        play()
    }

    fun onPrev(v: View) {
        current--
        if (current < 0) {
            current = musicList.size - 1
        }
        play()
    }

    fun play() {
        if (musicList.size == 0) return
        val path = musicList[current]
        mediaPlayer.reset()
        try {
            mediaPlayer.setDataSource(path)
            mediaPlayer.prepareAsync()
            textView_name.text = musicNameList[current]
            textView_count.text = "${current + 1}/${musicList.size}"
        } catch (e: IOException) {
            e.printStackTrace()
        }
    }

    private val _text = MutableLiveData<String>().apply {
        value = "This is home Fragment"
    }
    val text: LiveData<String> = _text
}