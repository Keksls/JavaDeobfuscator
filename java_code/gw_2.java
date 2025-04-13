/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.annotations.SerializedName
 */
import com.google.gson.annotations.SerializedName;

/*
 * Renamed from GW
 */
class gw_2 {
    @SerializedName(value="account")
    private final Long a;
    @SerializedName(value="character")
    private final Long b;
    @SerializedName(value="ip")
    private final String c;

    gw_2(Long l, Long l2, String string) {
        this.a = l;
        this.b = l2;
        this.c = string;
    }

    public Long a() {
        return this.a;
    }

    public Long b() {
        return this.b;
    }

    public String c() {
        return this.c;
    }
}

