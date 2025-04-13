/*
 * Decompiled with CFR 0.152.
 */
public class ddd
implements ahr_1 {
    private static final ddd c = new ddd();
    public static final int a = 170;
    public static final int b = 50;

    public static ddd a() {
        return c;
    }

    @Override
    public boolean a(adt_1 adt_12) {
        switch (adt_12.a()) {
            case 18919: {
                if (azu_0.j().k().bz() != null) {
                    return false;
                }
                if (fpm_0.b().q("splitStackDialog")) {
                    fpm_0.b().o("splitStackDialog");
                }
                dgL dgL2 = (dgL)adt_12;
                fyX fyX2 = fpm_0.b().j();
                int n = ddd.a(dgL2.v(), 170, fyX2.E(), fyX2.G());
                int n2 = ddd.a(dgL2.w(), 50, fyX2.F(), fyX2.G());
                fpm_0.b().a("splitStackDialog", cfi_0.a("splitStackDialog"), null, false, n, n2, 257L, (short)20000);
                short s2 = dgL2.o() != null ? dgL2.o().e() : (short)0;
                short s3 = dgL2.u() > 0 ? dgL2.u() : s2;
                fis_1.a().a("itemToSplit", s3);
                return false;
            }
        }
        return true;
    }

    private static int a(short s2, int n, float f2, float f3) {
        float f4 = (float)n * f3;
        float f5 = Hw.b((float)s2 * f3, 0.0f, f2 - f4);
        return Math.round(f5 / f3);
    }

    @Override
    public long a_() {
        return 0L;
    }

    @Override
    public void a(long l) {
    }

    @Override
    public void a(aav_2 aav_22, boolean bl) {
        if (!bl) {
            fpm_0.b().a("wakfu.split", cjk_0.class);
        }
    }

    @Override
    public void b(aav_2 aav_22, boolean bl) {
        if (!bl) {
            fpm_0.b().e("wakfu.split");
            fpm_0.b().o("splitStackDialog");
            fis_1.a().a("itemToSplit");
        }
    }
}

