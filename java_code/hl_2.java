/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.annotations.SerializedName
 */
import com.google.gson.annotations.SerializedName;

/*
 * Renamed from Hl
 */
public class hl_2 {
    @SerializedName(value="id")
    private final Integer a;
    @SerializedName(value="old_uid")
    private final Long b;
    @SerializedName(value="new_uid")
    private final Long c;
    @SerializedName(value="details")
    private final String d;
    @SerializedName(value="quantity")
    private final Integer e;
    @SerializedName(value="kamas")
    private final Long f;
    @SerializedName(value="ogrines")
    private final Long g;

    hl_2(Integer n, Long l, Long l2, String string, Integer n2, Long l3, Long l4) {
        this.a = n;
        this.b = l;
        this.c = l2;
        this.d = string;
        this.e = n2;
        this.f = l3;
        this.g = l4;
    }

    public static hm_2 a() {
        return new hm_2();
    }

    public Integer b() {
        return this.a;
    }

    public Long c() {
        return this.b;
    }

    public Long d() {
        return this.c;
    }

    public String e() {
        return this.d;
    }

    public Integer f() {
        return this.e;
    }

    public Long g() {
        return this.f;
    }

    public Long h() {
        return this.g;
    }
}

