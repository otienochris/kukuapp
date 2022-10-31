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
    private TextView txtSelectedTopic, topicContent;
    private String content1 = "Poultry breeds come in a variety of shapes, sizes and colors. Families looking to produce eggs or meat are encouraged to start with common breeds of chickens. \n" +
            "\n" +
            "Determine what you’d like to gain from your flock. If you want fresh eggs, consider: White Leghorn hybrids (white eggs), Plymouth Barred Rocks (brown eggs),  Rhode Island Reds (brown eggs), Blue Andalusians (white eggs) or Ameraucanas/Easter Eggers (blue eggs). Cornish Cross chickens grow quickly and are best suited for meat production. If you’re hoping to produce both eggs and meat, consider dual-purposed breeds like Plymouth Barred Rock, Sussex or Buff Orpingtons. Exotic breeds are best for show or pets.";

    private String content2 = "Keep baby chicks in a warm, draft-free shelter, called a brooder. The brooder should: be completely enclosed with a bottom surface that can be covered with bedding; and have a heating lamp. Avoid square corners in the brooding area to prevent chicks from being trapped in the corner should the birds huddle in one area.\n" +
            "\n" +
            "Each chick needs at least 2 to 3 square feet of floor space for the first six weeks. Set the brooder temperature to 90 degrees Fahrenheit for the first week and then gradually reduce heat by 5 degrees Fahrenheit each week until reaching a minimum of 55 degrees Fahrenheit. Be sure to have a spacious, clean coop ready for the chicks once the supplemental heat source is no longer required. Through all stages, always provide plenty of fresh clean water that is changed daily.";
    private String content4 = "Before new chicks arrive – and throughout the growing process – be sure to keep their environment clean. Young chicks are susceptible to early health risks, so disinfect all materials prior to use and then weekly.\n" +
            "\n" +
            "The correct household disinfectants can work well. Make sure to read the directions to ensure your disinfectant is safe to use and doesn’t leave a residual film. A mixture of 10 percent bleach and 90 percent water can work well, if the cleaner is rinsed thoroughly following cleaning.";
    private String content3 = "Strong chicks equal healthy hens. For long-term success, follow our Flock Strong™ Feeding Program. Under this program, you will simply need one complete starter-grower feed for day 1 through first egg; and one complete layer feed for when hens start laying around week 18.\n" +
            "\n" +
            "Start chicks strong with a complete starter-grower feed. Chicks require 38 unique nutrients from day one. To provide all of these nutrients, choose a complete starter-grower feed that includes Chick Strong™ System. \n" +
            "\n" +
            "For chicks who will later lay eggs, select a feed that has 18 percent protein, like Purina® Start & Grow®  or Purina® Organic starter-grower. For meat birds and mixed flocks, choose a complete feed with 20 percent protein, like Purina® Flock Raiser® Crumbles.";

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
        topicContent = view.findViewById(R.id.txt_topicContent);

        topicSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                txtSelectedTopic.setText(parent.getItemAtPosition(position).toString());
                switch (position){
                    case 0:
                        topicContent.setText(content1);
                        break;
                    case 1:
                        topicContent.setText(content2);
                        break;
                    case 2:
                        topicContent.setText(content3);
                        break;
                    case 3:
                        topicContent.setText(content4);
                        break;
                    default:
                        topicContent.setText(content1);
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        return view;
    }
}