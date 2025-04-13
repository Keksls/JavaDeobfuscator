/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.annotations.SerializedName
 */
import com.google.gson.annotations.SerializedName;

/*
 * Renamed from GX
 */
class gx_2 {
    @SerializedName(value="ref")
    private final Integer a;
    @SerializedName(value="from_uid")
    private final Long b;
    @SerializedName(value="to_uid")
    private final Long c;

    gx_2(Integer n, Long l, Long l2) {
        this.a = n;
        this.b = l;
        this.c = l2;
    }

    public Long a() {
        return this.b;
    }

    public Integer b() {
        return this.a;
    }

    public Long c() {
        return this.c;
    }
}

