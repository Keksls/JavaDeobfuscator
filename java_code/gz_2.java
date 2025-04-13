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
 * Renamed from GZ
 */
public class gz_2
extends he_2 {
    @Expose(serialize=false)
    private static final String b = "service.character.change-color";
    @SerializedName(value="account_id")
    private final long c;
    @SerializedName(value="character_id")
    private final long d;
    @SerializedName(value="old_appearance")
    private final hi_2 e;
    @SerializedName(value="new_appearance")
    private final hi_2 f;

    public gz_2(long l, long l2, hi_2 hi_22, hi_2 hi_23, String string) {
        this.c = l;
        this.d = l2;
        this.e = hi_22;
        this.f = hi_23;
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

    public hi_2 d() {
        return this.e;
    }

    public hi_2 e() {
        return this.f;
    }
}

