package com.crisspian.fragment_guide_01;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;

import com.crisspian.fragment_guide_01.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

        private ActivityMainBinding binging;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binging = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binging.getRoot());

        binging.button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            showFragment();
            }
        });


        
    }
        private void showFragment() {
            //generamos instancia del fragmento gracias al factorymetodo//

            FirstFragment firstFragment = FirstFragment.newInstance("", "");
            //obtener instancias de fragment manager//
            FragmentManager fragmentManager =getSupportFragmentManager();
            //Obtenenemos e instanciamos la
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            //añadir fragmento y lo asosiamos al contenedor donde se mostrara
            fragmentTransaction.add(R.id.textF ,firstFragment).addToBackStack(null).commit();


        }

}