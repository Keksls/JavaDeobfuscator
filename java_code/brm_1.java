/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from brM
 */
public class brm_1
implements ajh_1 {
    public static final String a = "name";
    public static final String b = "isMapAvailable";
    public static final String d = "instanceName";
    private final String e;
    private final int f;
    private final long g;

    public brm_1(int n, long l, String string) {
        this.e = string;
        this.f = n;
        this.g = l;
    }

    public brm_1(fgv_0<?> fgv_02) {
        this.f = fgv_02.e();
        this.e = bae.h().a(66, (long)fgv_02.e(), new Object[0]);
        this.g = fgv_02.f();
    }

    @Override
    public String[] d() {
        return null;
    }

    @Override
    public Object b(String string) {
        if (string.equals(a)) {
            return this.e;
        }
        if (string.equals(b)) {
            if (azu_0.j().c(cXX.a())) {
                return false;
            }
            bLP bLP2 = blf_1.a(this.g, true);
            String string2 = bLP2 != null ? bLP2.b() : null;
            bLP bLP3 = blf_1.a(this.f, this.g);
            string2 = bLP3 != null ? bLP3.b() : string2;
            return string2 != null && cd_0.b(string2);
        }
        if (d.equals(string)) {
            return bae.h().a(77, this.g, new Object[0]);
        }
        return null;
    }

    public String a() {
        return this.e;
    }

    public int b() {
        return this.f;
    }

    public long c() {
        return this.g;
    }
}

