package com.example.shbae.myparcelable;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by shbae on 2017-10-11.
 */

public class TestData implements Parcelable {


    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {

    }
}
