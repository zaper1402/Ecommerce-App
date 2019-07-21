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

public class CategoryListViewAdapter extends RecyclerView.Adapter<CategoryListViewAdapter.ViewHolder>  {

    List<CategoryItemClass> itemList;
    Context context;

    public CategoryListViewAdapter(Context context, ArrayList<CategoryItemClass> itemList) {
        this.itemList = itemList;
        this.context = context;
    }



    @NonNull
    @Override
    public CategoryListViewAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View layout = LayoutInflater.from(context).inflate(R.layout.category_listview_item,parent,false);
        return new CategoryListViewAdapter.ViewHolder(layout);
    }



    @Override
    public void onBindViewHolder(@NonNull CategoryListViewAdapter.ViewHolder holder, final int position) {
        holder.name_title.setText(itemList.get(position).getTitle());
        Picasso.get().load(itemList.get(position).getImage()).resize(128, 128).into(holder.image);
//        holder.image.setImageResource(itemList.get(position).getImage());
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
        TextView name_title;
        ImageView image;
        CardView cardView;

        public ViewHolder(View itemView) {
            super(itemView);

            name_title = itemView.findViewById(R.id.categoryName);
            image = itemView.findViewById(R.id.categoryItemImage);
            cardView = itemView.findViewById(R.id.cardViewCategoryItem );
        }
    }


}
