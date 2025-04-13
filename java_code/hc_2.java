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
 * Renamed from Hc
 */
public class hc_2
extends he_2 {
    @Expose(serialize=false)
    private static final String b = "service.character.migrate";
    @SerializedName(value="origin_account_id")
    private final long c;
    @SerializedName(value="target_account_id")
    private final long d;
    @SerializedName(value="character_id")
    private final long e;

    public hc_2(long l, long l2, long l3, String string) {
        this.c = l;
        this.d = l2;
        this.e = l3;
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

    public long d() {
        return this.e;
    }
}

