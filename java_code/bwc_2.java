/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bWC
 */
public class bwc_2
implements ajh_1 {
    public static final String a = "name";
    public static final String b = "isMonster";
    public static final String d = "items";
    public static final String e = "hasItems";
    private final boolean f;
    private final acy_2<bwd_2> g = new acy_2();

    public bwc_2(fgy_0 fgy_02, boolean bl) {
        this.f = bl;
        fgb_0 fgb_02 = fgc_0.a.a(fgy_02.B());
        if (this.f) {
            for (int n : fgb_02.a()) {
                this.g.a(n, new bwb_2(n, fgb_02.a(n), fgb_02.b(n)));
            }
        } else {
            for (int n : fgb_02.b()) {
                this.g.a(n, new bwf_2(n, fgb_02.e(n), fgb_02.f(n)));
            }
        }
    }

    @Override
    public String[] d() {
        return null;
    }

    @Override
    public Object b(String string) {
        if (string.equals(a)) {
            return this.f ? bae.h().a("protector.ecosystem.monster.category", new Object[0]) : bae.h().a("protector.ecosystem.resource.category", new Object[0]);
        }
        if (string.equals(b)) {
            return this.f;
        }
        if (string.equals(d)) {
            return this.g;
        }
        if (string.equals(e)) {
            return this.g.d() != 0;
        }
        return null;
    }

    public bwd_2 a(int n) {
        return this.g.g(n);
    }
}

