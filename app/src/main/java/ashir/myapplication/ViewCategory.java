package ashir.myapplication;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.support.v4.graphics.drawable.RoundedBitmapDrawable;
import android.support.v4.graphics.drawable.RoundedBitmapDrawableFactory;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class ViewCategory extends AppCompatActivity {
    GridView gridView1,gridView2,gridView3,gridView4;
    ImageView back_category;
    TextView textviewCart;
    String str[] ={"Mobile", "Laptop","Fashion","Appliances","Jewellery"};
  int icons[]={R.drawable.mobile,R.drawable.electronic,R.drawable.menfashion, R.drawable.homeappliances,R.drawable.rings};


    //final com.github.siyamed.shapeimageview.CircularImageView photo = (com.github.siyamed.shapeimageview.CircularImageView) convertView.findViewById(R.id.imageView_icon);


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_category);


    gridView1=(GridView)findViewById(R.id.gridView1);
    gridView2=(GridView)findViewById(R.id.gridView2);
    gridView3=(GridView)findViewById(R.id.gridView3);
    textviewCart=(TextView)findViewById(R.id.textViewCart);
    gridView4=(GridView)findViewById(R.id.gridView4);
    back_category=(ImageView)findViewById(R.id.category_back);

    GridAdapter adapter =new GridAdapter(this, icons, str);
    gridView1.setAdapter(adapter);
    gridView2.setAdapter(adapter);
    gridView3.setAdapter(adapter);
    gridView4.setAdapter(adapter);
     /*Context mContext = getApplicationContext();

       Resources mResources = getResources();

        mImageView = (ImageView) findViewById(R.id.imageView_icon);


        final Bitmap srcBitmap = BitmapFactory.decodeResource(mResources, R.drawable.sapphire);

        mImageView.setImageBitmap(srcBitmap);

        int srcBitmapWidth = srcBitmap.getWidth();
                int srcBitmapHeight = srcBitmap.getHeight();

                int borderWidth = 25;
                int shadowWidth = 10;

                int dstBitmapWidth = Math.min(srcBitmapWidth, srcBitmapHeight) + borderWidth * 2;
                float radius = Math.min(srcBitmapWidth,srcBitmapHeight)/2;

                Bitmap dstBitmap = Bitmap.createBitmap(dstBitmapWidth, dstBitmapWidth, Bitmap.Config.ARGB_8888);

                Canvas canvas = new Canvas(dstBitmap);

                canvas.drawColor(Color.WHITE);

                canvas.drawBitmap(srcBitmap, (dstBitmapWidth - srcBitmapWidth) / 2, (dstBitmapWidth - srcBitmapHeight) / 2, null);
        Paint paint = new Paint();


                paint.setStyle(Paint.Style.STROKE);
                paint.setStrokeWidth(borderWidth * 2);
                paint.setColor(Color.WHITE);

                canvas.drawCircle(canvas.getWidth() / 2, canvas.getHeight() / 2, canvas.getWidth() / 2, paint);

                paint.setColor(Color.LTGRAY);
                paint.setStrokeWidth(shadowWidth);

                canvas.drawCircle(canvas.getWidth() / 2, canvas.getHeight() / 2, canvas.getWidth() / 2, paint);
                RoundedBitmapDrawable roundedBitmapDrawable = RoundedBitmapDrawableFactory.create(mResources, dstBitmap);


                roundedBitmapDrawable.setCircular(true);

  roundedBitmapDrawable.setAntiAlias(true);

                mImageView.setImageDrawable(roundedBitmapDrawable);*/

                back_category.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent i = new Intent(ViewCategory.this, MainActivity.class);
                        startActivity(i);
                    }
                });
                textviewCart.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent i = new Intent(ViewCategory.this, CartActivity.class);
                        startActivity(i);

                    }
                });
            }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
    }
}
