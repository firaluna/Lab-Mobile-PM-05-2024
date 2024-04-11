package com.example.tgsprak3;

import java.util.ArrayList;import java.util.ArrayList;

//menyediakan sumber data dalam bentuk daftar model yang digunakan dalam aplikasi.
//Method generateDummyModel() digunakan untuk menghasilkan daftar model-model "dummy" yang kemudian disimpan dalam ArrayList models.
public class DataSource {
    public static ArrayList<Model> models = generateDummyModel();

    private static ArrayList<Model> generateDummyModel(){
        ArrayList<Model> models = new ArrayList<>();
        models.add(new Model(R.drawable.joyprofil,R.drawable.joy, "_imyour_joy", "halo",R.drawable.joystory, "300", "10"));
        models.add(new Model(R.drawable.gyjprofil,R.drawable.gyjpost, "goyounjung", "halo",R.drawable.gyjstory, "543", "200"));
        models.add(new Model(R.drawable.shnprofil,R.drawable.shnpost, "oohsehun", "halo",R.drawable.shnstory, "5213", "12"));
        models.add(new Model(R.drawable.jjhprofil,R.drawable.jjhpost, "_jeongjaehyun", "halo",R.drawable.jjhstory, "900", "0"));
        models.add(new Model(R.drawable.gmsprofil,R.drawable.gmspost, "solo", "halo",R.drawable.gmsstory, "1000", "0"));
        models.add(new Model(R.drawable.ldhprofil,R.drawable.ldhpost, "ldh_sky", "halo",R.drawable.ldhstory, "300", "10"));
        models.add(new Model(R.drawable.lmjprofil,R.drawable.lmjpost, "morilla_lmj", "halo",R.drawable.lmjstory, "90", "2341"));
        models.add(new Model(R.drawable.mgyprofil,R.drawable.mgypost, "mkayoung", "halo",R.drawable.mgystory, "800", "800"));
        models.add(new Model(R.drawable.kykprofil,R.drawable.kykpost, "aksakfn12", "halo",R.drawable.kykstory, "7625", "983"));
        models.add(new Model(R.drawable.hhjprofil,R.drawable.hhjpost, "hanhyojoo222", "halo",R.drawable.hhjstory, "0", "901"));

        return models;
    }
}
