package edu.gac.mcs270.saveup;

import java.util.UUID;

public class Bills {

    private UUID mId;
    private String mTitle;
    private int mPrice;
    private boolean mAcheived;

    public Bills(){
        mId = UUID.randomUUID();
    }

    public UUID getId(){
        return mId;
    }

    public String getTitle(){
        return mTitle;
    }

    public void setTitle(String title){
        mTitle = title;
    }

    public int getPrice(){
        return mPrice;
    }

    public void setPrice(int price){
        mPrice = price;
    }

    public boolean isAcheived(){
        return mAcheived;
    }

    public void setAcheived(boolean acheived){
        mAcheived = acheived;
    }
}
