package com.task.datatransferfrag.fragments;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.task.datatransferfrag.R;

/**
 * A simple {@link Fragment} subclass.
 *
 */
public class EmployeeBsicDetailFragments extends Fragment {

    public EmployeeBsicDetailFragments() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_employee_bsic_detail_fragments, container, false);
    }
}
