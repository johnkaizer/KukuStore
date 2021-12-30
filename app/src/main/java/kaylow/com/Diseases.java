package kaylow.com;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Diseases extends AppCompatActivity {
    String items[] = new String [] {"FOWL POX", "FOWL TYPHOID", "NEWCASTLE","GUMBORO","FOWL CHOLERA","MAREK'S DISEASE","COCCIDIOSIS","AVIAN INFLUENZA","TAPEWORMS","AVIAN POX","INFECTIOUS BRONCITIS"," MYCOPLASMOSIS","NECTROTIC ENTRETIS","INFECTIOUS CORYZA"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_diseases);
        ListView listView = (ListView) findViewById(R.id.listdiseases);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,items);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
                String str= listView.getAdapter().getItem(position).toString();
                Intent intent = new Intent(getApplicationContext(),diseases1.class);
                intent.putExtra("key-position",position);
                intent.putExtra("diseases",str);
                startActivity(intent);
            }
        });
    }
}