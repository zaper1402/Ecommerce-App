package ashir.myapplication;

//import android.content.ClipData;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

//import static android.view.KeyCharacterMap.load;

public class CartAdapter extends RecyclerView.Adapter<CartAdapter.ViewHolder>  {

    List<CartItemClass> itemList;
    Context context;

    public CartAdapter(Context context, ArrayList<CartItemClass> itemList) {
        this.itemList = itemList;
        this.context = context;
    }

    public  void removeItem(int position) {
        itemList.remove(position);
        notifyItemRemoved(position);
    }


    @NonNull
    @Override
    public CartAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View layout = LayoutInflater.from(context).inflate(R.layout.cart_listview_item,parent,false);
        return new CartAdapter.ViewHolder(layout);
    }



    @Override
    public void onBindViewHolder(@NonNull CartAdapter.ViewHolder holder, final int position) {
        holder.name_title.setText(itemList.get(position).getTitle());
        holder.currentPrice.setText(itemList.get(position).getCurrentPrice());
        holder.orignalPrice.setText(itemList.get(position).getOrignalPrice());
        holder.stock.setText(itemList.get(position).getStock());
        holder.deliveryCharge.setText(itemList.get(position).getDeliveryCharge());
        holder.count.setText(itemList.get(position).getCount());
        holder.image.setImageResource(itemList.get(position).getImage());


    //   Glide.with(context)
             //   .load(itemList.get(position).getImage())
             // .into(holder.image);

    }

    @Override
    public int getItemCount() {
        return itemList.size();
    }


    public static  class ViewHolder extends RecyclerView.ViewHolder{
        TextView name_title,currentPrice,orignalPrice,stock,deliveryCharge,count;
        ImageView image;
        CardView cardView;
        public RelativeLayout viewBackground, viewForeground;

        public ViewHolder(View itemView) {
            super(itemView);

            name_title = itemView.findViewById(R.id.textViewTitle);
            currentPrice = itemView.findViewById(R.id.textViewCurrentPrice);
            orignalPrice = itemView.findViewById(R.id.textViewOrignalPrice);
            stock = itemView.findViewById(R.id.textViewStock);
            deliveryCharge = itemView.findViewById(R.id.textViewDeliveryCharge);
            count = itemView.findViewById(R.id.textViewCount);
            image = itemView.findViewById(R.id.imageViewCartItem);
            cardView = itemView.findViewById(R.id.cardViewCart );
            viewBackground = itemView.findViewById(R.id.view_background);
            viewForeground = itemView.findViewById(R.id.view_foreground);
        }
    }

}
