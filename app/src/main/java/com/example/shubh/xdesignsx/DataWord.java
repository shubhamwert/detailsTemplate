package com.example.shubh.xdesignsx;

public class DataWord {
    private String mTitle;
    private String mDescrip;
    private int mId;

   public DataWord(int Id,String Title,String Descrip){
       mId=Id;
       mTitle=Title;
       mDescrip=Descrip;


   }

    public int getmId() {
        return mId;
    }

    public String getmTitle() {
        return mTitle;
    }

    public String getmDescrip() {
        return mDescrip;
    }
}
