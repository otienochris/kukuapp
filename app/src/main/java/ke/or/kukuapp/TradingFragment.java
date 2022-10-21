package ke.or.kukuapp;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class TradingFragment extends Fragment {

    private TextView txtBuyOrSell;
    private Button btnSell;
    private Button btnBuy;

    public TradingFragment() {
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
        View view = inflater.inflate(R.layout.fragment_trading, container, false);

        txtBuyOrSell = view.findViewById(R.id.textView_BuyOrSell);
        btnBuy = view.findViewById(R.id.btn_buy);
        btnSell = view.findViewById(R.id.btn_sell);

        btnBuy.setOnClickListener(v -> {
            txtBuyOrSell.setText("Browse to buy our products");
        });

        btnSell.setOnClickListener(v -> {
            txtBuyOrSell.setText("Add items to sell on our platform");
        });
        return view;
    }
}