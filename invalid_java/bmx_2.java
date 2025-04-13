/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bmx
 */
final class bmx_2
extends eqk_2 {
    private final pg_2 b;
    final /* synthetic */ bmr_1 a;

    bmx_2(bmr_1 bmr_12, pg_2 pg_22) {
        this.a = bmr_12;
        this.b = pg_22;
        this.b.a().a(this);
    }

    @Override
    public void a() {
        bmr_1.ee().error((Object)(this.getClass().getSimpleName() + " shouldn't be serialized client-side"));
    }

    @Override
    public void b() {
        this.a.do.n();
        for (tf_1 tf_12 : this.b.c.a) {
            tc_2 tc_22 = tf_12.a;
            exg_2 exg_22 = this.a.do.d(tc_22.a);
            if (exg_22 == null) {
                exg_22 = new bHe(0L, 0, exb_1.o, 0);
                if (!exg_22.b(tc_22)) {
                    bmr_1.ef().error((Object)("Erreur lors de la r\u00e9cup\u00e9ration du bag uniqueId=" + tc_22.a + ", on ignore les bags restants"));
                    return;
                }
                this.a.do.c(exg_22);
                exg_22.b(bvm_2.a);
            } else {
                exg_22.k();
                exg_22.b(tc_22);
            }
            exg_22.c();
        }
        fis_1.a().a((ajf_1)this.a.da(), this.a.da().d());
        if (cZI.A()) {
            cZI.a().u();
        }
    }
}

