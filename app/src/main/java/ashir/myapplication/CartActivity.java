package ashir.myapplication;

import android.content.Intent;
//import android.graphics.Canvas;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.helper.ItemTouchHelper;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
//import android.widget.Toolbar;

import java.util.ArrayList;

public class CartActivity extends AppCompatActivity implements RecyclerItemTouchHelper.RecyclerItemTouchHelperListener {
    //Toolbar toolbar;
    TextView textSkip,textActionBartitle,textviewCategories;
    ImageView backBtn;
    RecyclerView cartRecyclerView;
    RecyclerView.LayoutManager layoutManager;
    CartAdapter adapter;
    ArrayList<CartItemClass> list= new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cart);

        cartRecyclerView = findViewById(R.id.recyclerViewCart);
        textSkip = findViewById(R.id.textTool);
        backBtn = findViewById(R.id.signinBack);
        textActionBartitle = findViewById(R.id.textViewActionBartitle);
        textviewCategories=(TextView)findViewById(R.id.textViewCategories);

        textSkip.setVisibility(View.GONE);
        textActionBartitle.setVisibility(View.VISIBLE);
        textActionBartitle.setText(getString(R.string.Cart));

        textviewCategories.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(CartActivity.this,ViewCategory.class);
                startActivity(intent);
            }
        });

        backBtn.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent=new Intent(CartActivity.this,MainActivity.class);
            startActivity(intent);
            }
        });

        list.add(new CartItemClass(R.drawable.casual,"T-Shirt","Rs 799","Rs 1800","in Stock","(include delivery charge:48rs)","2"));
        list.add(new CartItemClass(R.drawable.casual,"T-Shirt","Rs 799","Rs 1800","in Stock","(include delivery charge:48rs)","2"));
        list.add(new CartItemClass(R.drawable.casual,"T-Shirt","Rs 799","Rs 1800","only 2 items left","(include delivery charge:48rs)","3"));
        list.add(new CartItemClass(R.drawable.casual,"T-Shirt","Rs 799","Rs 1800","in Stock","(include delivery charge:48rs)","2"));
        list.add(new CartItemClass(R.drawable.casual,"T-Shirt","Rs 799","Rs 1800","in Stock","(include delivery charge:48rs)","2"));
        list.add(new CartItemClass(R.drawable.casual,"T-Shirt","Rs 799","Rs 1800","only 2 items left","(include delivery charge:48rs)","2"));
        list.add(new CartItemClass(R.drawable.casual,"T-Shirt","Rs 799","Rs 1800","in Stock","(include delivery charge:48rs)","2"));

        layoutManager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
        cartRecyclerView.setLayoutManager(layoutManager);
        adapter = new CartAdapter(CartActivity.this, list);
        cartRecyclerView.setAdapter(adapter);

        ItemTouchHelper.SimpleCallback itemTouchHelperCallback = new RecyclerItemTouchHelper(0, ItemTouchHelper.LEFT,this);
        new ItemTouchHelper(itemTouchHelperCallback).attachToRecyclerView(cartRecyclerView);


    }

    public void onSwiped(RecyclerView.ViewHolder viewHolder, int direction, int position) {
        if (viewHolder instanceof CartAdapter.ViewHolder) {
            adapter.removeItem(viewHolder.getAdapterPosition());
        }
    }




}
