package edu.gac.mcs270.saveup;

import java.util.Date;
import java.util.UUID;

public class Other {

    private UUID mId;
    private String mTitle;
    private Date mDate;
    private Integer mCost;

    public Other(){
        mId = UUID.randomUUID();
        mDate = new Date();
    }

    public UUID getId() {
        return mId;
    }

    public void setId(UUID id) {
        mId = id;
    }

    public String getTitle() {
        return mTitle;
    }

    public void setTitle(String title) {
        mTitle = title;
    }

    public Date getDate() {
        return mDate;
    }

    public void setDate(Date date) {
        mDate = date;
    }

    public Integer getCost() {
        return mCost;
    }

    public void setCost(Integer cost) {
        mCost = cost;
    }
}
