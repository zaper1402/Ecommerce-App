package ashir.myapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class GridAdapter extends BaseAdapter {
    private Context context;
    private int[] icons;
    private String Text[];
    public GridAdapter(Context context,int[] icons,String text[]){
        this.icons=icons;
        this.context=context;
        this.Text=text;

    }

    @Override
    public int getCount() {
        return Text.length;
    }

    @Override
    public Object getItem(int position) {
        return Text[position];
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View gridView=convertView;
        if (convertView==null){

            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
             gridView=inflater.inflate(R.layout.custom_grid,null );

        }
        ImageView icon=(ImageView)gridView.findViewById(R.id.imageView_icon);
        TextView text=(TextView)gridView.findViewById(R.id.textview);
             icon.setImageResource(icons[position]);
             text.setText(Text[position]);

        return gridView;
    }
}
