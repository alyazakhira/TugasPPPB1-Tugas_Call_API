package com.example.tugascallapi;

import com.google.gson.annotations.SerializedName;

public class Activities {
    @SerializedName("type")
    private String actType;

    @SerializedName("activity")
    private String actDesc;

    @SerializedName("participants")
    private int actParticipant;

    public String getActType() {
        return actType;
    }

    public String getActDesc() {
        return actDesc;
    }

    public int getActParticipant() {
        return actParticipant;
    }
}
