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

public class TrendingListViewAdapter extends RecyclerView.Adapter<TrendingListViewAdapter.ViewHolder> {

    List<TrendingItemClass> itemList;
    Context context;

    public TrendingListViewAdapter(Context context,ArrayList<TrendingItemClass> information) {
        this.itemList = information;
        this.context = context;
    }



    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View layout = LayoutInflater.from(context).inflate(R.layout.trending_listview_item,parent,false);
        return new ViewHolder(layout);
    }



    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, final int position) {
        holder.name_title.setText(itemList.get(position).getTitle());
//        holder.image.setImageResource(itemList.get(position).getImage());
        Picasso.get().load(itemList.get(position).getImage()).resize(128, 128).into(holder.image);
        holder.detail.setText(itemList.get(position).getDetail());
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
        TextView name_title,detail;
        ImageView image;
        CardView cardView;

        public ViewHolder(View itemView) {
            super(itemView);

            name_title = itemView.findViewById(R.id.textViewTrendingITitle);
            image = itemView.findViewById(R.id.imageViewTrendingItem);
            detail = itemView.findViewById(R.id.textViewTrendingDetail);
            cardView = itemView.findViewById(R.id.cardViewTrendingItem );
        }
    }


}
