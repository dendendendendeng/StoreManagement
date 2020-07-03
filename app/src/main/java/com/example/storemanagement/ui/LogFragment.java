package com.example.storemanagement.ui;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import com.example.storemanagement.R;

public class LogFragment extends Fragment {
    
    EditText editName;
    EditText editPassword;
    Button button_comfirm;

    public View onCreateView(@NonNull LayoutInflater inflater,
            ViewGroup container, Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_log, container, false);
        editName = root.findViewById(R.id.editText_log_name);
        editPassword=root.findViewById(R.id.editText_log_password);
        button_comfirm = root.findViewById(R.id.button_log_comfirm);
        return root;
    }
}
