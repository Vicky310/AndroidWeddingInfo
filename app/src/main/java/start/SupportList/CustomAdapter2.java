package start.SupportList;


import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import start.R;

public class CustomAdapter2 extends BaseAdapter {

    private LayoutInflater lInflater;
    private List<ItemObject2> listStorage;
   // Context context;


    public CustomAdapter2(Context context, List<ItemObject2> customizedListView) {
        lInflater =(LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        listStorage = customizedListView;
    }


    @Override
    public int getCount() {
        return listStorage.size();
    }

    @Override
    public Object getItem(int position) {
        return position;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        ViewHolder listViewHolder;

        if(convertView == null){
            listViewHolder = new ViewHolder();

            convertView =  lInflater.inflate(R.layout.supportlisttype, parent, false);

            listViewHolder.textInListView = (TextView)convertView.findViewById(R.id.textView);
            listViewHolder.textInListView2 = (TextView)convertView.findViewById(R.id.textView2);
            listViewHolder.imageInListView = (ImageView)convertView.findViewById(R.id.imgview);
            listViewHolder.imageInListView1 = (ImageView)convertView.findViewById(R.id.imgview1);
            listViewHolder.imageInListView2 = (ImageView)convertView.findViewById(R.id.imgview2);
            convertView.setTag(listViewHolder);
        }else{
            listViewHolder = (ViewHolder)convertView.getTag();
        }
        listViewHolder.textInListView.setText(listStorage.get(position).getName());
        listViewHolder.textInListView2.setText(listStorage.get(position).getName2());
        listViewHolder.imageInListView.setImageResource(listStorage.get(position).getImageId());
        listViewHolder.imageInListView1.setImageResource(listStorage.get(position).getImageId1());
        listViewHolder.imageInListView2.setImageResource(listStorage.get(position).getImageId2());


        final ViewHolder finalHolder = listViewHolder;

        listViewHolder.imageInListView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String myText = finalHolder.textInListView2.getText().toString();
                Intent sharingIntent = new Intent(Intent.ACTION_SEND);
                sharingIntent.setType("text/plain");
                sharingIntent.putExtra(Intent.EXTRA_SUBJECT, "The app");
                sharingIntent.putExtra(Intent.EXTRA_TEXT,myText);
                v.getContext().startActivity(Intent.createChooser(sharingIntent, "Share via"));
            }
        });

        listViewHolder.imageInListView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String myText = finalHolder.textInListView2.getText().toString();
                Intent smsIntent = new Intent(Intent.ACTION_VIEW, Uri.fromParts("sms",myText,null));
                smsIntent.putExtra("sms_body"  , "Hi ");
                v.getContext().startActivity(smsIntent);

            }
        });


        listViewHolder.imageInListView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String myText = finalHolder.textInListView2.getText().toString();
                Intent icall=new Intent(Intent.ACTION_DIAL);
;               icall.setData(Uri.parse("tel:"+myText));
                v.getContext().startActivity(icall);

            }
        });


        return convertView;
    }

    static class ViewHolder{

        TextView textInListView,textInListView2;
        ImageView imageInListView,imageInListView1,imageInListView2;
    }
}