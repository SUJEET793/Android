package MyFragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.task.fragmentapp2.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class Diplay_Result extends Fragment {

    public Diplay_Result() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_diplay__result, container, false);
    }
}
