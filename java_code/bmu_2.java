/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bmU
 */
final class bmu_2
implements erk_2<bol_0> {
    private final bmr_1 a;
    private bol_0 b;

    bmu_2(bmr_1 bmr_12) {
        this.a = bmr_12;
    }

    public bol_0 a() {
        return this.b;
    }

    private void b() {
        bmr_1 bmr_12 = bzf_1.a();
        if (bmr_12 != null && bmr_12.a_() != this.a.a_()) {
            return;
        }
        bOQ.a().a(this.a.cH());
        fis_1.a().a("osamodasSymbiot", bOQ.a());
        fis_1.a().a("osamodasSymbiot", "capturedCreatures");
        if (azu_0.j().c(dbJ.a())) {
            dbJ.a().c();
        }
    }

    @Override
    public void a(bol_0 bol_02) {
        this.b = bol_02;
        this.b();
    }

    @Override
    public void c(byte by) {
        eqy_1 eqy_12 = this.b.a((int)by);
        if (eqy_12.e() == null || eqy_12.e().isEmpty()) {
            String string = bae.h().a(7, (long)eqy_12.f(), new Object[0]);
            eqy_12.a(string);
            clq_0 clq_02 = new clq_0();
            clq_02.a(this.a.a_());
            clq_02.a(by);
            clq_02.a(string);
            clq_02.a(false);
            azu_0.j().K().c(clq_02);
        }
        fis_1.a().a((ajf_1)bOQ.a(), bOQ.g);
    }

    @Override
    public void d(byte by) {
        clp_0 clp_02 = new clp_0();
        clp_02.a(by);
        clp_02.a(this.a.a_());
        azu_0.j().K().c(clp_02);
        fis_1.a().a((ajf_1)bOQ.a(), bOQ.g);
    }

    @Override
    public void cI() {
        bmr_1 bmr_12 = bzf_1.a();
        if (bmr_12 != null && bmr_12.a_() != this.a.a_()) {
            return;
        }
        bOQ.a().a(this.b);
        fis_1.a().a("osamodasSymbiot", bOQ.a());
    }

    @Override
    public /* synthetic */ erp_2 dQ() {
        return this.a();
    }
}

