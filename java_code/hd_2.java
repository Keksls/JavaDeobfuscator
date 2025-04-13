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
 * Renamed from Hd
 */
public class hd_2
extends he_2 {
    @Expose(serialize=false)
    private static final String b = "service.character.rename";
    @SerializedName(value="account_id")
    private final long c;
    @SerializedName(value="character_id")
    private final long d;
    @SerializedName(value="old_name")
    private final String e;
    @SerializedName(value="new_name")
    private final String f;

    public hd_2(long l, long l2, String string, String string2, String string3) {
        this.c = l;
        this.d = l2;
        this.e = string;
        this.f = string2;
        this.a = new hf_2(b, string3);
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

