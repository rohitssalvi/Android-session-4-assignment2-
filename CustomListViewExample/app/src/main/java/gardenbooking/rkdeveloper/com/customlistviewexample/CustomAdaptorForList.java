package gardenbooking.rkdeveloper.com.customlistviewexample;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

/**
 * Created by ROHIT on 7/10/2016.
 */


public class CustomAdaptorForList extends BaseAdapter {

    ArrayList<Data> listData;
    Context c;

    public CustomAdaptorForList(Context c,ArrayList<Data> list)
    {
       this.c=c;
        listData=list;
    }

    @Override
    public int getCount() {
        return listData.size();
    }

    @Override
    public Object getItem(int position) {
        return listData.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder;

        if(convertView==null)
        {
            LayoutInflater infalter=(LayoutInflater)c.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView=infalter.inflate(R.layout.custom_layout,parent,false);
           holder=new ViewHolder();
            holder.TvName=(TextView)convertView.findViewById(R.id.tvname);
            holder.TvPhone=(TextView)convertView.findViewById(R.id.tvphone);
            convertView.setTag(holder);

        }
        else
        {
            holder=(ViewHolder)convertView.getTag();

        }


        holder.TvName.setText(listData.get(position).getName());
        holder.TvPhone.setText(String.valueOf(listData.get(position).getPhoneNumber()));
        return convertView;
    }

   class ViewHolder{
      TextView TvName,TvPhone;
  }
}
