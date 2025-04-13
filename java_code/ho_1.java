/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.annotations.SerializedName
 */
import com.google.gson.annotations.SerializedName;

/*
 * Renamed from HO
 */
class ho_1
extends hm_1 {
    @SerializedName(value="breed")
    private final int a;
    @SerializedName(value="totalDuration")
    private final long b;

    ho_1(hb_1 hb_12, hn_1 hn_12) {
        super("ai.decision.compute.time", hb_12, hn_12);
        this.a = hn_12.a;
        this.b = hn_12.b;
    }
}

