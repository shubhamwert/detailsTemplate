package com.example.shubh.xdesignsx;

import java.util.ArrayList;
import java.util.List;

public class DataSet {

    public static String[] mTitle={"Title1","Title2","Title3"};

    public static String[] mDescription={"descrip1","descrip2","descript2"};
    public static ArrayList<DataWord> arrayList=new ArrayList<>();

public static void dataInit(){
arrayList.add(new DataWord(1,"adsads","21212"));
    arrayList.add(new DataWord(1,"adewfwa","21212"));
    arrayList.add(new DataWord(1,"adsafaefawds","21212"));
    arrayList.add(new DataWord(1,"awfawef11231dsads","21212"));
    arrayList.add(new DataWord(1,"ad123123sads","21212"));
    arrayList.add(new DataWord(1,"4324fdfasd","21212"));
    for (int i=0;i<1000;i++){
        arrayList.add(new DataWord(i,"helloTestData"+i," "+i+21212));

    }
}


}
