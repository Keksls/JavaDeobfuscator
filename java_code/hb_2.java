/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.annotations.Expose
 *  com.google.gson.annotations.SerializedName
 */
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/*
 * Renamed from Hb
 */
public class hb_2
extends he_2 {
    @Expose(serialize=false)
    private static final String b = "service.character.change-sex";
    @SerializedName(value="account_id")
    private final long c;
    @SerializedName(value="character_id")
    private final long d;
    @SerializedName(value="old_sex")
    private final String e;
    @SerializedName(value="new_sex")
    private final String f;

    public hb_2(long l, long l2, byte by, byte by2, String string) {
        this.c = l;
        this.d = l2;
        this.e = by == 0 ? "M" : "F";
        this.f = by2 == 0 ? "M" : "F";
        this.a = new hf_2(b, string);
    }

    @Override
    public String a() {
        return b;
    }

    public long b() {
        return this.c;
    }

    public long c() {
        return this.d;
    }

    public String d() {
        return this.e;
    }

    public String e() {
        return this.f;
    }
}

