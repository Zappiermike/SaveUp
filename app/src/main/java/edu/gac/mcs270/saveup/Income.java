package edu.gac.mcs270.saveup;

import java.util.UUID;

public class Income {
    private UUID mId;
    private String mIncomeName;
    private int mIncomeAmount;

    public Income(){
        mId = UUID.randomUUID();

    }
    public UUID getId(){
        return mId;
    }
    public String getIncomeName(){
        return mIncomeName;
    }
    public int getIncomeAmount(){
        return mIncomeAmount;
    }
    public void setIncomeName(String title){
        mIncomeName= title;
    }
    public void setIncomeAmount(int amount){
        mIncomeAmount=amount;
    }
}
