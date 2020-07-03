package com.example.storemanagement.ui;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ListView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import com.example.storemanagement.R;

public class PickFragment extends Fragment {
    ListView list_order;
    Button button_import;

    public View onCreateView(@NonNull LayoutInflater inflater,
            ViewGroup container, Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_pick, container, false);
        list_order = root.findViewById(R.id.listView_order);
        button_import = root.findViewById(R.id.button_pick_import);
        return root;
    }
}
