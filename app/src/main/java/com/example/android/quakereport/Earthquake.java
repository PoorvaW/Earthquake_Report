package com.example.android.quakereport;

public class Earthquake {
    private String mLocation;
    private Double mMagnitude;
    private long mTimeInMilliseconds;
    private String mUrl;

    public Earthquake(Double mMagnitude, String mLocation, long mTimeInMilliseconds,String mUrl) {
        this.mMagnitude = mMagnitude;
        this.mLocation = mLocation;
        this.mTimeInMilliseconds = mTimeInMilliseconds;
        this.mUrl=mUrl;
    }

    public Double getmMagnitude() {
        return mMagnitude;
    }

    public String getmLocation() {
        return mLocation;
    }

    public long getmTimeInMilliseconds() {
        return mTimeInMilliseconds;
    }

    public String getmUrl() {
        return mUrl;
    }
}
