package com.example.covidappb1.ui.country;

import android.os.Parcel;
import android.os.Parcelable;

public class CovidCountry implements Parcelable {
    String mCovidCountry, mTodayCases, mDeaths, mTodayDeaths, mRecovered, mActive, mCritical;
    int mCases;
    public CovidCountry(String mCovidCountry, int mCases, String mTodayCases, String mDeaths, String mTodayDeaths, String mRecovered, String mActive, String mCritical) {
        this.mCovidCountry = mCovidCountry;
        this.mCases = mCases;
        this.mTodayCases = mTodayCases;
        this.mDeaths = mDeaths;
        this.mTodayDeaths = mTodayDeaths;
        this.mRecovered = mRecovered;
        this.mActive = mActive;
        this.mCritical = mCritical;
    }

    public String getmCovidCountry() {
        return mCovidCountry;
    }

    public int getmCases() {
        return mCases;
    }

    public String getmTodayCases() {
        return mTodayCases;
    }

    public String getmDeaths() {
        return mDeaths;
    }

    public String getmTodayDeaths() {
        return mTodayDeaths;
    }

    public String getmRecovered() {
        return mRecovered;
    }

    public String getmActive() {
        return mActive;
    }

    public String getmCritical() {
        return mCritical;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.mCovidCountry);
        dest.writeInt(this.mCases);
        dest.writeString(this.mTodayCases);
        dest.writeString(this.mDeaths);
        dest.writeString(this.mTodayDeaths);
        dest.writeString(this.mRecovered);
        dest.writeString(this.mActive);
        dest.writeString(this.mCritical);
    }

    protected CovidCountry(Parcel in) {
        this.mCovidCountry = in.readString();
        this.mCases = in.readInt();
        this.mTodayCases = in.readString();
        this.mDeaths = in.readString();
        this.mTodayDeaths = in.readString();
        this.mRecovered = in.readString();
        this.mActive = in.readString();
        this.mCritical = in.readString();
    }

    public static final Parcelable.Creator<CovidCountry> CREATOR = new Parcelable.Creator<CovidCountry>() {
        @Override
        public CovidCountry createFromParcel(Parcel source) {
            return new CovidCountry(source);
        }

        @Override
        public CovidCountry[] newArray(int size) {
            return new CovidCountry[size];
        }
    };
}
