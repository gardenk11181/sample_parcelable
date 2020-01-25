package com.gardenlab.myapplication;

import android.os.Parcel;
import android.os.Parcelable;

public class SimpleData implements Parcelable {
    int num;
    String msg;

    public SimpleData(int num, String msg) {
        this.num = num;
        this.msg = msg;
    }

    public SimpleData(Parcel src) {
        this.num = src.readInt();
        this.msg = src.readString();
    }

    public static final Parcelable.Creator CREATOR = new Parcelable.Creator() {

        public SimpleData createFromParcel(Parcel in) {
            return new SimpleData(in);
        }

        public SimpleData[] newArray(int size) {
            return new SimpleData[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(num);
        dest.writeString(msg);
    }
}
