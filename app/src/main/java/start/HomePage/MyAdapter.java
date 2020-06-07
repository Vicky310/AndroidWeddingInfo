package start.HomePage;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Collections;
import java.util.List;

import start.R;

/**
 * Created by user-- on 19-03-2016.
 */
public class MyAdapter extends RecyclerView.Adapter<MyAdapter.View_Holder> {


    List<MyHolder> list = Collections.emptyList();
    Context context;
    ClickListener clicklistener = null;
    public MyAdapter(List<MyHolder> list, Context context) {
        this.list = list;
        this.context = context;
    }



    @Override
    public View_Holder onCreateViewHolder(ViewGroup parent, int i) {

      View v= LayoutInflater.from(parent.getContext()).inflate(R.layout.cardview, parent, false);
      //holder
       View_Holder pholder=new View_Holder(v);
        return pholder;
    }

    @Override
    public void onBindViewHolder(View_Holder pholder, final int i) {

        pholder.desc.setText(list.get(i).dec);
        pholder.imge.setImageResource(list.get(i).img);




    }
    public void setClickListener(ClickListener clicklistener ) {
        this.clicklistener = clicklistener ;
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    @Override
    public void setHasStableIds(boolean hasStableIds) {
        super.setHasStableIds(hasStableIds);
    }

    @Override
    public long getItemId(int position) {
        return super.getItemId(position);
    }

    @Override
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
    }
    public class View_Holder  extends RecyclerView.ViewHolder implements View.OnClickListener {

        TextView desc;
        ImageView imge;


        public View_Holder(View itemView) {

            super(itemView);

            desc = (TextView) itemView.findViewById(R.id.info_text);
            imge = (ImageView) itemView.findViewById(R.id.imageV);
            itemView.setOnClickListener(this);

        }

        @Override
        public void onClick(View v) {
            if (clicklistener != null) {
                clicklistener.itemClicked(v, getAdapterPosition());
            }
        }
    }
}
