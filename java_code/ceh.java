/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.annotations.SerializedName
 */
import com.google.gson.annotations.SerializedName;

public class ceh
extends ceg {
    @SerializedName(value="popup_id")
    private String a;
    @SerializedName(value="click_type")
    private String b;

    @Override
    protected void a(Object[] objectArray) {
        this.a = (String)objectArray[0];
        this.b = (String)objectArray[1];
    }
}

