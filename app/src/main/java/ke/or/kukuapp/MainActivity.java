package ke.or.kukuapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {

    private Spinner topicSpinner;
    private Button btnTransact;
    private Button btnLearn;
    private FragmentManager fragmentManager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fragmentManager = getSupportFragmentManager();

        btnTransact = findViewById(R.id.btn_transact);
        btnLearn = findViewById(R.id.btn_learn);


        btnTransact.setOnClickListener(v -> {
            fragmentManager.beginTransaction()
                    .setReorderingAllowed(true)
                    .replace(R.id.fragmentContainerView, TradingFragment.class, null)
                    .addToBackStack("trading")
                    .commit();
        });

        btnLearn.setOnClickListener(v -> {
            fragmentManager.beginTransaction()
                    .setReorderingAllowed(true)
                    .replace(R.id.fragmentContainerView, LearningPlatformFragment.class, null)
                    .addToBackStack("learning")
                    .commit();
        });

    }
}