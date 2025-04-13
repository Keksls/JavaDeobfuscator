/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.annotations.SerializedName
 */
import com.google.gson.annotations.SerializedName;

/*
 * Renamed from HQ
 */
class hq_1
extends hk_1 {
    @SerializedName(value="instance")
    private final long a;

    hq_1(hp_1 hp_12) {
        super("instance.count", hp_12);
        this.a = hp_12.a;
    }
}

