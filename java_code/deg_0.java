/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from deg
 */
class deg_0
extends esn_1 {
    deg_0(esl_1 esl_12) {
        super(esl_12);
    }

    public void a(short s2, int n, short s3, short s4, long l, long l2) {
        try {
            this.a((esd_1)new cdj_1(l, s2, n, s3, s4), l2);
        }
        catch (eto_2 eto_22) {
            ddZ.c.error((Object)("Probl\u00e8me dr'ajout du groupe refId=" + s2 + "en x=" + s3 + ", y=" + s4 + " uid=" + l), (Throwable)eto_22);
        }
    }

    public void a(long l) {
        try {
            this.e(l);
            this.b(l);
        }
        catch (eto_2 eto_22) {
            ddZ.c.error((Object)("Probl\u00e8me de suppression du batiment uid=" + l), (Throwable)eto_22);
        }
    }

    private void e(long l) {
        esh_1 esh_12 = this.d(l);
        esh_12.h().forEach(esf_12 -> esh_12.b(esf_12.a()));
    }
}

