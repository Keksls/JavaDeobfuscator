/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from ccz
 */
public class ccz_1
extends ccg_1 {
    private fgj_0 b;

    @Override
    public void a(ahm ahm2) {
        bMn bMn2 = ccz_1.c(ahm2);
        if (bMn2 == null) {
            return;
        }
        this.b = new cca_1(this, ahm2);
        bMn2.a(this.b);
        this.b.a(bMn2, bMn2.D());
    }

    @Override
    public void b(ahm ahm2) {
        bMn bMn2 = ccz_1.c(ahm2);
        if (bMn2 == null) {
            return;
        }
        bMn2.b(this.b);
        this.b = null;
    }

    private static bMn c(ahm ahm2) {
        bmf_0 bmf_02 = bme_0.a.a(ahm2.G(), ahm2.H());
        if (bmf_02 == null) {
            a.error((Object)("Aucun Territoire d\u00e9fini pour l'\u00e9l\u00e9ment " + ahm2));
            return null;
        }
        return (bMn)bmf_02.h();
    }
}

