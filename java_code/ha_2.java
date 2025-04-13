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
 * Renamed from Ha
 */
public class ha_2
extends he_2 {
    @Expose(serialize=false)
    private static final String b = "service.character.change-breed";
    @SerializedName(value="account_id")
    private final long c;
    @SerializedName(value="character_id")
    private final long d;
    @SerializedName(value="old_breed")
    private final int e;
    @SerializedName(value="new_breed")
    private final int f;

    public ha_2(long l, long l2, int n, int n2, String string) {
        this.c = l;
        this.d = l2;
        this.e = n;
        this.f = n2;
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

    public int d() {
        return this.e;
    }

    public int e() {
        return this.f;
    }
}

