package com.ahmttnstp.instakotlinapp.Home

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.ahmttnstp.instakotlinapp.R

/**
 * Created by ahmttnstp on 20.02.2019.
 */
class CameraFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        var view = inflater?.inflate(R.layout.fragment_camera, container,false)
        return view
    }
}