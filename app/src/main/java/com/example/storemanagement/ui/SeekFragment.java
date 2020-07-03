package com.example.storemanagement.ui;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import com.example.storemanagement.R;

public class SeekFragment extends Fragment {
    EditText editText_ID;
    TextView textView_result;
    Button button_comfirm;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_seek, container, false);
        editText_ID = root.findViewById(R.id.editText_Good_ID);
        textView_result = root.findViewById(R.id.textView_seek_result);
        button_comfirm = root.findViewById(R.id.button_seek_comfirm);
        return root;
    }

}
