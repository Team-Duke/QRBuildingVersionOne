package com.example.gary.qrbuildingversionone;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {

    Button Abbey, Bishops, Cathedral, Deans, Gibney, Knights, Monks, Session, Temple;

    //Above Variables declared.

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Abbey = (Button) findViewById(R.id.Abbeybutton);
        Abbey.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Opening", Toast.LENGTH_SHORT).show();
            }

        });
        Bishops = (Button) findViewById(R.id.Bishopsbutton);
        Bishops.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Opening", Toast.LENGTH_SHORT).show();
            }
        });
        Cathedral = (Button) findViewById(R.id.Cathedralbutton);
        Cathedral.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Opening", Toast.LENGTH_SHORT).show();
            }
        });
        Deans = (Button) findViewById(R.id.Deansbutton);
        Deans.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Opening", Toast.LENGTH_SHORT).show();
            }
        });
        Gibney = (Button) findViewById(R.id.Gibneybutton);
        Gibney.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Opening", Toast.LENGTH_SHORT).show();
            }
        });
        Knights = (Button) findViewById(R.id.Knightsbutton);
        Knights.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Opening", Toast.LENGTH_SHORT).show();
            }
        });
        Monks = (Button) findViewById(R.id.Monksbutton);
        Monks.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Opening", Toast.LENGTH_SHORT).show();
            }
        });
        Session = (Button) findViewById(R.id.Sessionbutton);
        Session.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Opening", Toast.LENGTH_SHORT).show();
            }
        });
        Temple = (Button) findViewById(R.id.Templebutton);
        Temple.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Opening", Toast.LENGTH_SHORT).show();
            }
        });
    }
    //Above Variable called linked to button via id. On click toast states opening.
    private void abbeyClick()
    {

        startActivity(new Intent("AbbeyWindow"));

    }

    private void bishopsClick()
    {

        startActivity(new Intent("BishopsWindow"));

    }
    private void cathedralClick()
    {

        startActivity(new Intent("CathedralWindow"));

    }
    private void deansClick()
    {

        startActivity(new Intent("DeansWindow"));

    }
    private void gibneyClick()
    {

        startActivity(new Intent("GibneyWindow"));

    }
    private void knightsClick()
    {

        startActivity(new Intent("KnightsWindow"));



    }
    private void monksClick()
    {

        startActivity(new Intent("MonksWindow"));

    }

    private void sessionsClick()
    {

        startActivity(new Intent("SessionsWindow"));

    }

    private void templeClick()
    {

        startActivity(new Intent("TempleWindow"));

    }

    // Above is private class to call each window.

    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.Abbeybutton:

                abbeyClick();

                break;
            case R.id.Bishopsbutton:

                bishopsClick();

                break;
            case R.id.Cathedralbutton:

                cathedralClick();

                break;
            case R.id.Deansbutton:

                deansClick();

                break;

            case R.id.Gibneybutton:

                gibneyClick();

                break;

            case R.id.Knightsbutton:

                knightsClick();

                break;

            case R.id.Monksbutton:

                monksClick();

                break;

            case R.id.Sessionsbutton:

                sessionsClick();

                break;

            case R.id.Templebutton:

                templeClick();

                break;

        }

        //Above on click calls class in switch statements.

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
