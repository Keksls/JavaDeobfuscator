/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 */
import com.google.common.collect.Lists;
import java.util.EnumSet;

/*
 * Renamed from fhJ
 */
public enum fhj_0 implements aqk_2
{
    a(0, "No ideal rain", new Yf[0]),
    b(1, "No rain", Yf.a),
    c(2, "Light rain", Yf.b),
    d(3, "Heavy rain or storm", Yf.c, Yf.d);

    private final int e;
    private final String f;
    private final EnumSet<Yf> g = EnumSet.noneOf(Yf.class);

    private fhj_0(int n2, String string2, Yf ... yfArray) {
        this.e = n2;
        this.f = string2;
        if (yfArray.length > 0) {
            this.g.addAll(Lists.newArrayList((Object[])yfArray));
        }
    }

    public static fhj_0 a(int n) {
        fhj_0[] fhj_0Array;
        for (fhj_0 fhj_02 : fhj_0Array = fhj_0.values()) {
            if (fhj_02.e != n) continue;
            return fhj_02;
        }
        throw new IllegalArgumentException("Not found " + n);
    }

    public EnumSet<Yf> a() {
        return this.g;
    }

    @Override
    public String d() {
        return String.valueOf(this.e);
    }

    @Override
    public String e() {
        return this.name();
    }

    @Override
    public String f() {
        return this.f;
    }
}

