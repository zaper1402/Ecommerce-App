package ashir.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.app.AppCompatDelegate;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;


public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerviewTrending,recyclerviewCategory,recyclerviewOffers;
    RecyclerView.LayoutManager layoutManager;
    RecyclerView.Adapter adapter;
    TextView textCart;
    ArrayList<TrendingItemClass> list= new ArrayList<>();
    ArrayList<CategoryItemClass> categoryList = new ArrayList<>();
    ArrayList<OffersItemClass> offerList = new ArrayList<>();
    TextView textViewCategories;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerviewTrending = (RecyclerView) findViewById(R.id.recyclerViewTrending);
        recyclerviewCategory = (RecyclerView) findViewById(R.id.recyclerViewCategory);
        recyclerviewOffers = (RecyclerView) findViewById(R.id.recyclerViewOffers);


        textViewCategories=(TextView)findViewById(R.id.textViewCategories);
        textCart = (TextView)findViewById(R.id.textViewCart);

        textCart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, CartActivity.class);
                startActivity(intent);
            }
        });

        list.add(new TrendingItemClass(R.drawable.apparel,"T-Shirt","under Rs 799"));
        list.add(new TrendingItemClass(R.drawable.classic,"Casual Shoes","under Rs 1999"));
        list.add(new TrendingItemClass(R.drawable.clotheseyewear,"Sneakers","under Rs 599"));
        list.add(new TrendingItemClass(R.drawable.apparel,"T-Shirt","under Rs 799"));
        list.add(new TrendingItemClass(R.drawable.clotheseyewear,"Casual Shoes","under Rs 1999"));
        list.add(new TrendingItemClass(R.drawable.apparel,"Sneakers","under Rs 599"));
        list.add(new TrendingItemClass(R.drawable.classic,"Casual Shoes","under Rs 1999"));
        list.add(new TrendingItemClass(R.drawable.clotheseyewear,"Sneakers","under Rs 599"));
        list.add(new TrendingItemClass(R.drawable.apparel,"T-Shirt","under Rs 799"));
        list.add(new TrendingItemClass(R.drawable.classic,"T-Shirt","under Rs 799"));
        list.add(new TrendingItemClass(R.drawable.clotheseyewear,"Casual Shoes","under Rs 1999"));
        list.add(new TrendingItemClass(R.drawable.classic,"Sneakers","under Rs 599"));


       layoutManager = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);
        recyclerviewTrending.setLayoutManager(layoutManager);
        adapter = new TrendingListViewAdapter(MainActivity.this, list);
        recyclerviewTrending.setAdapter(adapter);

        categoryList.add(new CategoryItemClass(R.drawable.clotheseyewear,"Sneakers"));
        categoryList.add(new CategoryItemClass(R.drawable.apparel,"T-Shirt"));
        categoryList.add(new CategoryItemClass(R.drawable.classic,"Casual Shoes"));
        categoryList.add(new CategoryItemClass(R.drawable.apparel,"T-Shirt"));
        categoryList.add(new CategoryItemClass(R.drawable.classic,"Casual Shoes"));
        categoryList.add(new CategoryItemClass(R.drawable.clotheseyewear,"Sneakers"));


        recyclerviewCategory.setLayoutManager(new GridLayoutManager(this, 3));
        adapter = new CategoryListViewAdapter(this, categoryList);
        recyclerviewCategory.setAdapter(adapter);

        offerList.add(new OffersItemClass(R.drawable.sunglasses,"78% OFF","Rs 488","Rs 1999","5000+ SOLD","24 people just ordered"));
        offerList.add(new OffersItemClass(R.drawable.dslr,"28% OFF","Rs 14888","Rs 19999","5000+ SOLD","24 people just ordered"));
        offerList.add(new OffersItemClass(R.drawable.sunglasses,"78% OFF","Rs 488","Rs 1999","5000+ SOLD","24 people just ordered"));
        offerList.add(new OffersItemClass(R.drawable.dslr,"28% OFF","Rs 14888","Rs 19999","5000+ SOLD","24 people just ordered"));
        offerList.add(new OffersItemClass(R.drawable.sunglasses,"78% OFF","Rs 488","Rs 1999","5000+ SOLD","24 people just ordered"));

        layoutManager = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);
        recyclerviewOffers.setLayoutManager(layoutManager);
        adapter = new OffersListViewAdapter(MainActivity.this, offerList);
        recyclerviewOffers.setAdapter(adapter);

        textViewCategories.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,ViewCategory.class);
                startActivity(intent);
            }
        });

        textViewCategories.setSelected(true);

    }
    @Override
    public void onBackPressed() {
        Intent i = new Intent(this,LoginActivity.class);
        startActivity(i);
        finish();
        super.onBackPressed();
    }
}
