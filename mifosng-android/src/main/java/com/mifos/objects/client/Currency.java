package com.mifos.objects.client;

import android.os.Parcel;
import android.os.Parcelable;

import androidx.annotation.NonNull;

import com.google.gson.annotations.SerializedName;
import com.mifos.api.local.MifosBaseModel;
import com.mifos.api.local.MifosDatabase;
import com.raizlabs.android.dbflow.annotation.Column;
import com.raizlabs.android.dbflow.annotation.ModelContainer;
import com.raizlabs.android.dbflow.annotation.PrimaryKey;
import com.raizlabs.android.dbflow.annotation.Table;

/**
 * Created by Rajan Maurya on 05/07/16.
 */
@Table(database = MifosDatabase.class, name = "ClientChargeCurrency")
@ModelContainer
public class Currency extends MifosBaseModel implements Parcelable {


    @PrimaryKey
    @SerializedName("code")
    public String code;

    @Column
    @SerializedName("name")
    String name;

    @Column
    @SerializedName("decimalPlaces")
    Integer decimalPlaces;

    @Column
    @SerializedName("inMultiplesOf")
    Integer inMultiplesOf;

    @Column
    @SerializedName("displaySymbol")
    String displaySymbol;

    @Column
    @SerializedName("nameCode")
    String nameCode;

    @Column
    @SerializedName("displayLabel")
    String displayLabel;


    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getDecimalPlaces() {
        return decimalPlaces;
    }

    public void setDecimalPlaces(Integer decimalPlaces) {
        this.decimalPlaces = decimalPlaces;
    }

    public Integer getInMultiplesOf() {
        return inMultiplesOf;
    }

    public void setInMultiplesOf(Integer inMultiplesOf) {
        this.inMultiplesOf = inMultiplesOf;
    }

    public String getDisplaySymbol() {
        return displaySymbol;
    }

    public void setDisplaySymbol(String displaySymbol) {
        this.displaySymbol = displaySymbol;
    }

    public String getNameCode() {
        return nameCode;
    }

    public void setNameCode(String nameCode) {
        this.nameCode = nameCode;
    }

    public String getDisplayLabel() {
        return displayLabel;
    }

    public void setDisplayLabel(String displayLabel) {
        this.displayLabel = displayLabel;
    }

    @NonNull
    @Override
    public String toString() {
        return "Currency{" +
                "code='" + code + '\'' +
                ", name='" + name + '\'' +
                ", decimalPlaces=" + decimalPlaces +
                ", inMultiplesOf=" + inMultiplesOf +
                ", displaySymbol='" + displaySymbol + '\'' +
                ", nameCode='" + nameCode + '\'' +
                ", displayLabel='" + displayLabel + '\'' +
                '}';
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.code);
        dest.writeString(this.name);
        dest.writeValue(this.decimalPlaces);
        dest.writeValue(this.inMultiplesOf);
        dest.writeString(this.displaySymbol);
        dest.writeString(this.nameCode);
        dest.writeString(this.displayLabel);
    }

    public Currency() {
    }

    protected Currency(Parcel in) {
        this.code = in.readString();
        this.name = in.readString();
        this.decimalPlaces = (Integer) in.readValue(Integer.class.getClassLoader());
        this.inMultiplesOf = (Integer) in.readValue(Integer.class.getClassLoader());
        this.displaySymbol = in.readString();
        this.nameCode = in.readString();
        this.displayLabel = in.readString();
    }

    public static final Parcelable.Creator<Currency> CREATOR = new Parcelable.Creator<Currency>() {
        @Override
        public Currency createFromParcel(Parcel source) {
            return new Currency(source);
        }

        @Override
        public Currency[] newArray(int size) {
            return new Currency[size];
        }
    };
}