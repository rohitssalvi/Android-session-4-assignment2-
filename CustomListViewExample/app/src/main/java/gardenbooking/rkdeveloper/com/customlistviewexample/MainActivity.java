package gardenbooking.rkdeveloper.com.customlistviewexample;

import android.app.ListActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends ListActivity {

String [] name={"Rohit","Divya","Khushal","Leo"};
String [] phone={"916618267","9799953377","946152286","9460727131"};
ArrayList<Data> list=new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    for (int i=0;i<name.length;i++)
    {
        Data da=new Data();
        da.setName(name[i]);
        da.setPhoneNumber(Long.parseLong(phone[i]));
        list.add(da);
    }

    CustomAdaptorForList adapter=new CustomAdaptorForList(this,list);
        setListAdapter(adapter);



    }
}
