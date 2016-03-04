package com.example.ermesonnobrega.aula06;

import android.app.Application;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ermesonnobrega on 03/03/16.
 */
public class Aula06Application extends Application {


    private List<Planeta> planetas;


    @Override
    public void onCreate() {
        super.onCreate();
        planetas = new ArrayList<>();
        criarPlanetas();


    }

    private void criarPlanetas(){
        planetas.add(new Planeta(R.drawable.mercurio,"Mercurio"));
        planetas.add(new Planeta(R.drawable.venus,"Venus"));
        planetas.add(new Planeta(R.drawable.terra,"Terra"));
        planetas.add(new Planeta(R.drawable.marte,"Marte"));
        planetas.add(new Planeta(R.drawable.jupter,"Jupter"));
        planetas.add(new Planeta(R.drawable.saturno,"Saturno"));
        planetas.add(new Planeta(R.drawable.urano,"Urano"));
        planetas.add(new Planeta(R.drawable.netuno,"Netuno"));

    }

    public List<Planeta> getPlanetas(){
        return planetas;
    }
}
