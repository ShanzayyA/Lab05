package com.uottawa.myapplication

import androidx.test.platform.app.InstrumentationRegistry
import androidx.test.ext.junit.runners.AndroidJUnit4

import org.junit.Test
import org.junit.runner.RunWith

import org.junit.Assert.*

import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.databse.DataSnapshot;
import com.google.firebase.databse.DatabaseError;
import com.google.firebase.databse.DatabaseReference;
import com.google.firebase.databse.FirebaseDatabase;
import com.google.firebase.databse.ValueEventListener;

import java.util.ArrayList;
import java.util.List;

/**
 * Instrumented test, which will execute on an Android device.
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
@RunWith(AndroidJUnit4::class)
class ExampleInstrumentedTest {
    @Test
    fun useAppContext() {
        // Context of the app under test.
        val appContext = InstrumentationRegistry.getInstrumentation().targetContext
        assertEquals("com.uottawa.myapplication", appContext.packageName)
        DatabaseReference databaseProducts;
        databaseProducts = FirebaseDatabase.getInstance().getReference("products");

        protected void onStart();
            super.onStart();
            databaseProducts.addValueEventListener(new ValueEventListener()){

                @Override
                public void onDataChange(DataSnapshot datasnapshot );
                    products.clear();
                    for (DataSnapshot postSnapshot : dataSnapshot.getChildren());
                        Product product = postSnapshot.getValue(Products.class);
                        products.add(product);
                        ProductList productsAdapter = new ProductList(MainActivity.this, products);
                        listViewProducts.setAdapter(productsAdapter);

            }
            @Override
            public void onCanelled(DatabaseError databaseError){

            }

            public void addProduct(){
                String name = editTextName.getText().toString().trim();
                double price =Double.parseDouble(String.valueOf(editTextPrice.getText().getString()));
                if (!TextUtils.isEmpty(name)){
                    String id = databaseProducts.push().getKey();
                    Product product = new Product(id, name, price);
                    databaseProducts.child(id).setValue(product);

                    editTextName.setText("");
                    editTextPrice.setText("""""");
                    Toast.makeText(this, "Product Added", Toast.LENGHT_LONG).show();
                }else {
                    Toast.makeText(this, "Please enter a name", Toast.LENGHT_LONG).show()
                }

            private void updateProducts(String id, String name, double price){
                DatabaseReference dR = FirebaseDatabase.getInstance().getReference("products").child(id);
                Product product = new Product(id, name, price);
                dR.setValue(product);

                Toast.makeText(getApplicationContext(), "Product Updated", Toast.LENGTH_LONG).show();

            }
            private boolean deleteProduct(String id){
                DatabaseReference dR = FirebaseDatabase.getInstance().getReference("products").child(id);
                dR.removeValue();
                Toast.makeText(getApplicationContext(), "Product Deleted", Toast.LENGTH_LONG).show();

                return true;


             }



            }


    }
}