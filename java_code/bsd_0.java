/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.annotations.SerializedName
 */
import com.google.gson.annotations.SerializedName;

/*
 * Renamed from bSD
 */
public class bsd_0 {
    @SerializedName(value="id")
    private final int a;
    @SerializedName(value="quantity")
    private final int b;
    @SerializedName(value="amount")
    private final double c;

    public bsd_0(bsa_0 bsa_02) {
        this.a = (Integer)bsa_02.a();
        this.b = 1;
        this.c = bsa_02.s();
    }
}

