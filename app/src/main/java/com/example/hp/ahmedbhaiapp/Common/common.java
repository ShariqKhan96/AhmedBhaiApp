package com.example.hp.ahmedbhaiapp.Common;

import com.example.hp.ahmedbhaiapp.Model.Cloth;

import java.util.ArrayList;

/**
 * Created by hp on 6/15/2018.
 */

public class common {

    public static ArrayList<Cloth> arrayList = new ArrayList<>();
    public static String sharedPreferences = "SharedPreferences";
    public static String nameField = "name";


    public static ArrayList<Cloth> initList() {
        for (int i = 0; i < 10; i++) {
            arrayList.add(new Cloth("Dress shirt", "Medium", "Black", "cotton", "25$", ""));
        }

        return arrayList;
    }
}
