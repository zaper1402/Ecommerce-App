package ashir.myapplication;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.List;

public class OffersListViewAdapter extends RecyclerView.Adapter<OffersListViewAdapter.ViewHolder> {
    List<OffersItemClass> itemList;
    Context context;

    public OffersListViewAdapter(Context context, ArrayList<OffersItemClass> information) {
        this.itemList = information;
        this.context = context;
    }



    @NonNull
    @Override
    public OffersListViewAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View layout = LayoutInflater.from(context).inflate(R.layout.offers_listview_item,parent,false);
        return new OffersListViewAdapter.ViewHolder(layout);
    }



    @Override
    public void onBindViewHolder(@NonNull OffersListViewAdapter.ViewHolder holder, final int position) {
        holder.off.setText(itemList.get(position).getOff());
        Picasso.get().load(itemList.get(position).getImage()).resize(160, 128).into(holder.image);
//        holder.image.setImageResource(itemList.get(position).getImage());
        holder.currentPrice.setText(itemList.get(position).getCurrentPrice());
        holder.orignalPrice.setText(itemList.get(position).getOrignalPrice());
        holder.sold.setText(itemList.get(position).getSold());
        holder.ordered.setText(itemList.get(position).getOrdered());

        holder.cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }



    @Override
    public int getItemCount() {
        return itemList.size();
    }



    public static  class ViewHolder extends RecyclerView.ViewHolder{
        TextView off,currentPrice,orignalPrice,sold,ordered;
        ImageView image;
        CardView cardView;

        public ViewHolder(View itemView) {
            super(itemView);

            off = itemView.findViewById(R.id.textViewOff);
            currentPrice = itemView.findViewById(R.id.textViewCurrentPrice);
            orignalPrice = itemView.findViewById(R.id.textViewOrignalPrice);
            sold = itemView.findViewById(R.id.textViewItemsSold);
            ordered = itemView.findViewById(R.id.textViewOrdered);
            image = itemView.findViewById(R.id.imageViewOffers);
            cardView = itemView.findViewById(R.id.cardViewOffersItem);
        }
    }

}
