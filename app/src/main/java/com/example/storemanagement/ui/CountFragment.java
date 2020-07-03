package com.example.storemanagement.ui;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import com.example.storemanagement.R;

public class CountFragment extends Fragment {
    ListView list_shelf;

    public View onCreateView(@NonNull LayoutInflater inflater,
            ViewGroup container, Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_count, container, false);
        list_shelf = root.findViewById(R.id.listView_count_shelf);
        return root;
    }
}
