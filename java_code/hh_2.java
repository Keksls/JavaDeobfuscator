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
 * Renamed from Hh
 */
public class hh_2
extends he_2 {
    @Expose(serialize=false)
    private static final String b = "service.guild.rename";
    @SerializedName(value="account_id")
    private final long c;
    @SerializedName(value="character_id")
    private final long d;
    @SerializedName(value="guild_id")
    private final long e;
    @SerializedName(value="old_name")
    private final String f;
    @SerializedName(value="new_name")
    private final String g;

    public hh_2(long l, long l2, long l3, String string, String string2, String string3) {
        this.c = l;
        this.d = l2;
        this.e = l3;
        this.f = string;
        this.g = string2;
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

    public long d() {
        return this.e;
    }

    public String e() {
        return this.f;
    }

    public String h() {
        return this.g;
    }
}

