package kaylow.com;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.github.barteksc.pdfviewer.PDFView;

public class diseases1 extends AppCompatActivity {
    TextView t1;
    PDFView pdfView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_diseases1);
        t1 = findViewById(R.id.textviewdiseases);
        t1.setText(getIntent().getExtras().getString("diseases"));

        pdfView = findViewById(R.id.pdfView);

        int disease_position=getIntent().getIntExtra("key-position",0);

        if (disease_position==0){
            pdfView.fromAsset("Fowlpox.pdf").load();
        }
        else if (disease_position==1){
            pdfView.fromAsset("FowlTyphoid.pdf").load();
        }
        else if (disease_position==2){
            pdfView.fromAsset("Newcastle.pdf").load();
        }
        else if (disease_position==3){
            pdfView.fromAsset("Gumboro.pdf").load();
        }
        else if (disease_position==4){
            pdfView.fromAsset("Cholera.pdf").load();
        }
        else if (disease_position==5){
            pdfView.fromAsset("Mareks.pdf").load();
        }
        else if (disease_position==6){
            pdfView.fromAsset("Cocci.pdf").load();
        }
        else if (disease_position==7){
            pdfView.fromAsset("Avian.pdf").load();
        }else if (disease_position==8){
            pdfView.fromAsset("Tapeworm.pdf").load();
        }
        else if (disease_position==9){
            pdfView.fromAsset("Cholera.pdf").load();
        }
        else if (disease_position==10){
            pdfView.fromAsset("Infectious.pdf").load();
        }
        else if (disease_position==11){
            pdfView.fromAsset("Cholera.pdf").load();
        }
        else if (disease_position==12){
            pdfView.fromAsset("Cholera.pdf").load();
        }
        else if (disease_position==13){
            pdfView.fromAsset("Cholera.pdf").load();
        }

    }
}