/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.annotations.SerializedName
 */
import com.google.gson.annotations.SerializedName;

/*
 * Renamed from Ih
 */
class ih_2
extends hm_1 {
    @SerializedName(value="message")
    private final int a;
    @SerializedName(value="totalDuration")
    private final long b;

    ih_2(hb_1 hb_12, ig_2 ig_22) {
        super("network.message.compute.time", hb_12, ig_22);
        this.a = ig_22.a;
        this.b = ig_22.b;
    }
}

