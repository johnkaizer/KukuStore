package kaylow.com;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private CardView card1, card2, card3, card4, card5, card6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        card1 = (CardView) findViewById(R.id.card1);
        card2 = (CardView) findViewById(R.id.card2);
        card3 = (CardView) findViewById(R.id.card3);
        card4 = (CardView) findViewById(R.id.card4);
        card5 = (CardView) findViewById(R.id.card5);
        card6 = (CardView) findViewById(R.id.card6);

        card1.setOnClickListener(this);
        card2.setOnClickListener(this);
        card3.setOnClickListener(this);
        card4.setOnClickListener(this);
        card5.setOnClickListener(this);
        card6.setOnClickListener(this);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_item,menu);
        return true;
    }

    @Override
    public void onClick(View view) {
        Intent i;

        switch (view.getId()) {
            case R.id.card1:
                i = new Intent(this, Breeds.class);
                startActivity(i);
                break;
            case R.id.card2:
                i = new Intent(this, Diseases.class);
                startActivity(i);
                break;
            case R.id.card3:
                i = new Intent(this, Vaccine.class);
                startActivity(i);
                break;
            case R.id.card4:
                i = new Intent(this, Feeds.class);
                startActivity(i);
                break;
            case R.id.card5:
                i = new Intent(this, Info.class);
                startActivity(i);
                break;
            case R.id.card6:
                i = new Intent(this, Tips.class);
                startActivity(i);
                break;
        }
    }
}