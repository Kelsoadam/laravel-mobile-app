package com.mobilelaravelapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.app.Activity;
import android.content.Intent;
import android.widget.Button;

public class MainActivity extends Activity {

    Button btnViewProducts;
    Button btnNewProduct;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_screen);

        // Buttons
        btnViewProducts = (Button) findViewById(R.id.btnViewProducts);
        btnNewProduct = (Button) findViewById(R.id.btnCreateProduct);
        // view products click event
        btnViewProducts.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Launching All products Activity
                Intent i = new Intent(getApplicationContext(), AllProductsActivity.class);
                startActivity(i);
            }
        });
        // view products click event
        btnNewProduct.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Launching create new product activity
                Intent i = new Intent(getApplicationContext(), NewProductActivity.class);
                startActivity(i);
            }
        });
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main_screen, menu);
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