/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.annotations.SerializedName
 */
import com.google.gson.annotations.SerializedName;

/*
 * Renamed from GV
 */
public class gv_2 {
    @SerializedName(value="server_id")
    private final String a;
    @SerializedName(value="date")
    private final String b;
    @SerializedName(value="from")
    private final gw_2 c;
    @SerializedName(value="to")
    private final gw_2 d;
    @SerializedName(value="type")
    private final String e;
    @SerializedName(value="external")
    private final Long f;
    @SerializedName(value="instance")
    private final Long g;
    @SerializedName(value="item")
    private final gx_2 h;
    @SerializedName(value="quantity")
    private final Short i;
    @SerializedName(value="kama")
    private final Long j;

    public gv_2(String string, String string2, Long l, Long l2, String string3, Long l3, Long l4, String string4, String string5, Long l5, Long l6, Integer n, Long l7, Long l8, Short s2, Long l9) {
        this.a = string;
        this.b = string2;
        this.c = new gw_2(l, l2, string3);
        this.d = new gw_2(l3, l4, string4);
        this.e = string5;
        this.f = l5;
        this.g = l6;
        this.h = new gx_2(n, l7, l8);
        this.i = s2;
        this.j = l9;
    }

    public String a() {
        return this.a;
    }

    public String b() {
        return this.b;
    }

    public Long c() {
        return this.c.a();
    }

    public Long d() {
        return this.c.b();
    }

    public String e() {
        return this.c.c();
    }

    public Long f() {
        return this.d.a();
    }

    public Long g() {
        return this.d.b();
    }

    public String h() {
        return this.d.c();
    }

    public String i() {
        return this.e;
    }

    public Long j() {
        return this.f;
    }

    public Long k() {
        return this.g;
    }

    public Integer l() {
        return this.h.b();
    }

    public Long m() {
        return this.h.a();
    }

    public Long n() {
        return this.h.c();
    }

    public Short o() {
        return this.i;
    }

    public Long p() {
        return this.j;
    }
}

