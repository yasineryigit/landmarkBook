package com.example.landmarkbook;

import android.graphics.Bitmap;

public class Vaybe {

    private Bitmap chosenImage;
    private static Vaybe vaybe;

    private Vaybe(){

    }

    //bu metod her halükarda bir singleton objesi döndürür
    public static Vaybe getInstance(){
        //halihazırda singleton objesi yoksa oluştur
        if(vaybe==null){
            vaybe = new Vaybe();
        }

        return vaybe;


    }

    public Bitmap getChosenImage() {
        return chosenImage;
    }

    public void setChosenImage(Bitmap chosenImage) {
        this.chosenImage = chosenImage;
    }



}
