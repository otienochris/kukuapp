package ke.or.kukuapp;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import ke.or.kukuapp.adapters.ProductAdapter;
import ke.or.kukuapp.model.Product;

public class TradingFragment extends Fragment {

    private TextView txtBuyOrSell;
    private Button btnSell;
    private Button btnBuy;
    private List<Product> productsList = new ArrayList<>();

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

        RecyclerView rvProducts = view.findViewById(R.id.rvProducts);
        productsList = createProductList();

        btnBuy.setOnClickListener(v -> {
            txtBuyOrSell.setText("");
            ProductAdapter productAdapter = new ProductAdapter(productsList);
            rvProducts.setAdapter(productAdapter);
            rvProducts.setLayoutManager(new LinearLayoutManager(container.getContext()));
        });

        btnSell.setOnClickListener(v -> {
            txtBuyOrSell.setText("Add items to sell on our platform");
            ProductAdapter productAdapter = new ProductAdapter(new ArrayList<>());
            rvProducts.setAdapter(productAdapter);
            rvProducts.setLayoutManager(new LinearLayoutManager(container.getContext()));
        });
        return view;
    }

    private List<Product> createProductList() {
        Product product1 = new Product("Chicken Feeds", 12.00, "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSvd7C1mLGADpmRzbZgwNOuUSXpdNhmhp0SBQ&usqp=CAU", "Unlike ListView, there is no way to add or remove items directly through the RecyclerView adapter. You need to make changes to the data source directly and notify the adapter of any changes. Also, whenever adding or removing elements, always make changes to the existing list.");
        Product product2 = new Product("Chicken Med Value Pack", 12.00, "","Unlike ListView, there is no way to add or remove items directly through the RecyclerView adapter. You need to make changes to the data source directly and notify the adapter of any changes. Also, whenever adding or removing elements, always make changes to the existing list.");
        Product product3 = new Product("Eggs", 12.00, "","Unlike ListView, there is no way to add or remove items directly through the RecyclerView adapter. You need to make changes to the data source directly and notify the adapter of any changes. Also, whenever adding or removing elements, always make changes to the existing list.");
        Product product4 = new Product("Chicken Meds", 12.00, "","Unlike ListView, there is no way to add or remove items directly through the RecyclerView adapter. You need to make changes to the data source directly and notify the adapter of any changes. Also, whenever adding or removing elements, always make changes to the existing list.");
        List<Product> products = new ArrayList<>();
        products.add(product1);
        products.add(product2);
        return products;
    }
}