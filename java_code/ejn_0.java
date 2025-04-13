/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from eJn
 */
class ejn_0
extends eKp {
    final /* synthetic */ ejm_0 a;

    ejn_0(ejm_0 ejm_02) {
        this.a = ejm_02;
    }

    @Override
    public fiz<fio_0> a(epq_2 epq_22, eKq eKq2, short s2) {
        fiz<fio_0> fiz2 = eKr.a.a(epq_22, eKq2, s2);
        fiO fiO2 = epq_22.dz();
        for (fio_0 fio_02 : fiz2) {
            short s3;
            short s4;
            if (fiO2 != null) {
                s4 = fiO2.b() == -1 ? epq_22.dt() : fiO2.b();
                s3 = (short)Math.min(fio_02.c(), s4);
            } else {
                s3 = fio_02.c();
            }
            s4 = Hw.a(s3, oh_0.a.b(), oh_0.a.a());
            fio_02.c(s4);
        }
        return fiz2;
    }
}

