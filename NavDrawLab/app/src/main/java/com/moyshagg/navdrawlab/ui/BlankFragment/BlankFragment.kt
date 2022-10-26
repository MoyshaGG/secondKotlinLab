package com.moyshagg.navdrawlab.ui.BlankFragment

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.moyshagg.navdrawlab.R
import com.moyshagg.navdrawlab.databinding.FragmentBlankBinding
import com.moyshagg.navdrawlab.databinding.FragmentGalleryBinding
import com.moyshagg.navdrawlab.ui.gallery.GalleryViewModel

class BlankFragment : Fragment() {

    private var _binding: FragmentBlankBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val galleryViewModel =
            ViewModelProvider(this).get(BlankViewModel::class.java)

        _binding = FragmentBlankBinding.inflate(inflater, container, false)
        val root: View = binding.root

        val textView: TextView = binding.textBlank
        galleryViewModel.text.observe(viewLifecycleOwner) {
            textView.text = it
        }
        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}