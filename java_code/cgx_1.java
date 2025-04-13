/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cgX
 */
public class cgx_1
implements adx_1<csl_0> {
    @Override
    public boolean a(csl_0 csl_02) {
        long l = csl_02.b();
        bnh_1 bnh_12 = (bnh_1)euw_2.a.d(l);
        if (bnh_12 == null) {
            return false;
        }
        if (!bnh_12.dP().isPresent()) {
            return false;
        }
        bnh_12.fk().a(csl_02.c(), csl_02.d());
        return false;
    }

    @Override
    public int a() {
        return 12111;
    }
}

