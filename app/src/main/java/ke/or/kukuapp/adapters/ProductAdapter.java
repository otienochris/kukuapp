package ke.or.kukuapp.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import ke.or.kukuapp.R;
import ke.or.kukuapp.model.Product;

public class ProductAdapter extends RecyclerView.Adapter<ProductAdapter.ViewHolder> {

    private List<Product> productList = new ArrayList<>();

    public ProductAdapter(List<Product> productList) {
        this.productList = productList;
        notifyDataSetChanged();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public TextView title, desc;
        public  ImageView image;

        public ViewHolder(View itemView){
            super(itemView);

            title = itemView.findViewById(R.id.productTitle);
            image = itemView.findViewById(R.id.productImage);
            desc = itemView.findViewById(R.id.productDesc);
        }
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        Context context = parent.getContext();

        LayoutInflater layoutInflater = LayoutInflater.from(context);

        View productView = layoutInflater.inflate(R.layout.layout_product, parent, false);

        ViewHolder viewHolder = new ViewHolder(productView);

        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Product product = productList.get(position);

        TextView title = holder.title;
        ImageView imageView = holder.image;
        TextView desc = holder.desc;



        title.setText(product.getTitle());
        desc.setText(product.getDescription());
//        imageView.set
    }

    @Override
    public int getItemCount() {
        return productList.size();
    }
}
