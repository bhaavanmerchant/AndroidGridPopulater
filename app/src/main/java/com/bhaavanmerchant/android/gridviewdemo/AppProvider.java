package com.bhaavanmerchant.android.gridviewdemo;

import java.util.ArrayList;

/**
 * Created by bmerch1 on 5/26/15.
 */
public class AppProvider {

    ArrayList<AppModel> apps = new ArrayList<>();
    public ArrayList<AppModel> getApps() {
        AppModel app1 = new AppModel();
        app1.name = "ABC";
        app1.publisherName = "jh";
        apps.add(app1);
        AppModel app4 = new AppModel();
        app4.name = "adf";
        app4.publisherName = "afds";
        apps.add(app4);
        AppModel app2 = new AppModel();
        app2.name = "fdas";
        app2.publisherName = "fasd";
        apps.add(app2);
        AppModel app3 = new AppModel();
        app3.name = "gdfs";
        app3.publisherName = "gasd";
        apps.add(app3);

        return apps;

    }
}
