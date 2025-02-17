package org.sopt.hapdongseminar_29th.Event

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import org.sopt.hapdongseminar_29th.R
import org.sopt.hapdongseminar_29th.databinding.FragmentMainEvent3Binding

class MainEvent3 : Fragment() {
    private var _binding: FragmentMainEvent3Binding? = null
    private val binding get() = _binding ?: error("FollowersBinding error")
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_main_event3, container, false)
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

}