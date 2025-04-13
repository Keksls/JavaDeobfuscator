/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.annotations.SerializedName
 */
import com.google.gson.annotations.SerializedName;

/*
 * Renamed from Hj
 */
public class hj_2 {
    @SerializedName(value="service.node.name")
    private static final String a = ot_2.a.a();
    @SerializedName(value="id")
    private Long b;
    @SerializedName(value="metadata")
    private hf_2 c;
    @SerializedName(value="from")
    private hp_2 d;
    @SerializedName(value="to")
    private hp_2 e;
    @SerializedName(value="content")
    private hl_2 f;
    @SerializedName(value="misc")
    private hn_2 g;

    public hj_2(long l, String string, String string2, hp_2 hp_22, hp_2 hp_23, hl_2 hl_22, hn_2 hn_22) {
        this.b = l;
        this.d = hp_22;
        this.e = hp_23;
        this.f = hl_22;
        this.g = hn_22;
        this.c = new hf_2(string, string2);
    }

    public static hk_2 a() {
        return new hk_2();
    }

    public Long b() {
        return this.b;
    }

    public hf_2 c() {
        return this.c;
    }

    public hp_2 d() {
        return this.d;
    }

    public hp_2 e() {
        return this.e;
    }

    public hl_2 f() {
        return this.f;
    }

    public hn_2 g() {
        return this.g;
    }
}

