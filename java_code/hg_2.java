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
 * Renamed from Hg
 */
public class hg_2
extends he_2 {
    @Expose(serialize=false)
    private static final String b = "service.guild.change-blazon";
    @SerializedName(value="account_id")
    private final long c;
    @SerializedName(value="character_id")
    private final long d;
    @SerializedName(value="guild_id")
    private final long e;
    @SerializedName(value="old_blazon")
    private final long f;
    @SerializedName(value="new_blazon")
    private final long g;

    public hg_2(long l, long l2, long l3, long l4, long l5, String string) {
        this.c = l;
        this.d = l2;
        this.e = l3;
        this.f = l4;
        this.g = l5;
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

    public long e() {
        return this.f;
    }

    public long h() {
        return this.g;
    }
}

