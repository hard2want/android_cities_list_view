package com.example.mycities;

//import android.support.v7.app.AppCompatActivity;
// import the android.app.ListActivity
import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

// add
import android.net.Uri;

// add
import android.telephony.PhoneStateListener;
import android.telephony.TelephonyManager;

// change the extends default to ListActivity
public class MainActivity extends ListActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // comment out the following default line
//        setContentView(R.layout.activity_main);

        // create a string array and fill it with content
        String[] city = {"Chicago", "Dublin", "Watercolor", "Charlottesville", "Vienna", "New Orleans", "Park City", "Call Duke"};

        // set a list adapter that sets your content to the array
        setListAdapter(new ArrayAdapter<String>(this, R.layout.activity_main, R.id.city, city));

    } // end onCreate()

    // go to the top menu and select Code > Override Methods > onListItemClick
    @Override
    protected void onListItemClick(ListView l, View v, int position, long id) {
        // comment out the default line
//        super.onListItemClick(l, v, position, id);

        switch (position) {
            case 0:
//                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.chicagotribune.com/")));
                startActivity(new Intent(MainActivity.this, ChicagoActivity.class));
                break;
            case 1:
//                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.visitdublin.com/")));
                startActivity(new Intent(MainActivity.this, DublinActivity.class));
                break;
            case 2:
//                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.watercolorresort.com/")));
                startActivity(new Intent(MainActivity.this, WatercolorActivity.class));
                break;
            case 3:
//                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.charlottesville.org/")));
                startActivity(new Intent(MainActivity.this, CvilleActivity.class));
                break;
            case 4:
//                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.wien.info/en")));
                startActivity(new Intent(MainActivity.this, ViennaActivity.class));
                break;
            case 5:
//                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.neworleans.com/")));
                startActivity(new Intent(MainActivity.this, NoActivity.class));
                break;
            case 6:
//                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.visitparkcity.com/")));
                startActivity(new Intent(MainActivity.this, ParkCityActivity.class));
                break;
            case 7:
                try {
                    startActivity(new Intent(Intent.ACTION_DIAL, Uri.parse("tel:3126187730")));
//                    Intent callIntent = new Intent(Intent.ACTION_CALL);
//                    callIntent.setData(Uri.parse("tel:7733986433")); // Gustavo's phone number
//                    startActivity(callIntent);
                } catch (SecurityException s) {
                    System.out.println("Error Message ==>  " + s);
                } // end try/catch
                break;
        } // end switch
    } // end onListItemClick()
} // end MainActivity {}
