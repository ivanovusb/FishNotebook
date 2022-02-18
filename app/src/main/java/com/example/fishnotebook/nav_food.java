package com.example.fishnotebook;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.fishnotebook.databinding.FragmentHomeBinding;
import com.example.fishnotebook.ui.home.HomeViewModel;


public class nav_food extends Fragment {

    private HomeViewModel homeViewModel;
    private FragmentHomeBinding binding;


    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}