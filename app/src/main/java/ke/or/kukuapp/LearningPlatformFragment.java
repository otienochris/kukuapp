package ke.or.kukuapp;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class LearningPlatformFragment extends Fragment {

    private Spinner topicSpinner;
    private TextView txtSelectedTopic;

    public LearningPlatformFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_learning_platform, container, false);

        topicSpinner = view.findViewById(R.id.spinner);
        txtSelectedTopic = view.findViewById(R.id.txt_selectedTopic);

        topicSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                txtSelectedTopic.setText(parent.getItemAtPosition(position).toString());
                Toast.makeText(parent.getContext(), parent.getItemAtPosition(position).toString() + " selected.", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        return view;
    }
}