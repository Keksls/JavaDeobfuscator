/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;

/*
 * Renamed from bTM
 */
public class btm_2
implements ajh_1 {
    public static final String a = "elements";
    public static final String b = "name";
    public static final String d = "openned";
    public static final String[] e = new String[]{"elements", "openned"};
    private boolean g;
    private final int h;
    private final btu_2 i;
    final ArrayList<ajf_1> f = new ArrayList();

    @Override
    public String[] d() {
        return e;
    }

    public btm_2(btu_2 btu_22, int n) {
        this.i = btu_22;
        this.h = n;
    }

    @Override
    public Object b(String string) {
        if (string.equals(a)) {
            return this.f;
        }
        if (string.equals(b)) {
            switch (this.i) {
                case a: {
                    return btc_2.a().b(this.h);
                }
                case b: {
                    return btc_2.a().a(this.h);
                }
                case c: {
                    return btc_2.a().a(this.h);
                }
            }
        }
        if (string.equals(d)) {
            return this.g;
        }
        return null;
    }

    public void a(ajf_1 ajf_12) {
        if (this.f.contains(ajf_12)) {
            return;
        }
        this.f.add(ajf_12);
    }

    public int a() {
        return btc_2.a().c(this.h);
    }

    public void b() {
        this.g = !this.g;
        fis_1.a().a((ajf_1)this, d);
    }

    public int c() {
        return this.h;
    }

    public boolean e() {
        return this.g;
    }

    public int f() {
        return this.f.size();
    }
}

