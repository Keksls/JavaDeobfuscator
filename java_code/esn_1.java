/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from eSn
 */
public class esn_1 {
    private final est_1 a;

    public esn_1(esl_1 esl_12) {
        this.a = (est_1)esl_12;
    }

    public esl_1 a() {
        return this.a;
    }

    public final void a(esm_2 esm_22) {
        if (this.a.c() != null) {
            throw new eto_2(esz_1.e, "Le Havre-monde a d\u00e9j\u00e0 une guilde");
        }
        this.a.a(esm_22);
    }

    public final void b(esm_2 esm_22) {
        this.a.a(esm_22);
    }

    protected final ese_1 a(esd_1 esd_12, long l) {
        etw_2 etw_22 = esd_12.g();
        esh_1 esh_12 = new esh_1(etw_22, esd_12.c(), esd_12.e(), l, esd_12.h(), esd_12.i());
        this.a(esh_12);
        return esh_12;
    }

    public final void a(ese_1 ese_12) {
        if (ese_12.a() == null) {
            throw new eto_2(esz_1.l, "Aucune d\u00e9finition pour le b\u00e2timent");
        }
        if (this.a.a(ese_12.b()) != null) {
            throw new eto_2(esz_1.t, "Le b\u00e2timent existe d\u00e9j\u00e0");
        }
        this.a.a(ese_12);
    }

    public final void b(long l) {
        ese_1 ese_12 = this.a.a(l);
        if (ese_12 == null) {
            throw new eto_2(esz_1.r, "Le b\u00e2timent n'existe pas");
        }
        if (ese_12.f()) {
            throw new eto_2(esz_1.B, "Il existe encore des \u00e9l\u00e9ments li\u00e9s \u00e0 ce b\u00e2timent");
        }
        this.a.b(l);
    }

    protected final void a(long l, long l2, long l3) {
        esh_1 esh_12 = (esh_1)this.a.a(l);
        if (esh_12 == null) {
            throw new eto_2(esz_1.r, "Le b\u00e2timent n'existe pas " + l);
        }
        if (esh_12.a(l2) != null) {
            throw new eto_2(esz_1.A, "L'\u00e9l\u00e9ment existe d\u00e9j\u00e0");
        }
        esh_12.a(new esg_1(l2, l3));
    }

    protected void a(esd_1 esd_12, esq_2 esq_22) {
        etw_2 etw_22 = esd_12.g();
        long l = esd_12.c();
        short s2 = esd_12.h();
        short s3 = esd_12.i();
        etw_22.a(new eso_2(this, s2, s3, l, esq_22));
    }

    protected final void c(long l) {
        etx_1 etx_12 = new etx_1(l);
        this.a.a(etx_12);
        long l2 = etx_12.a();
        esh_1 esh_12 = (esh_1)this.a.a(l2);
        if (esh_12 == null) {
            throw new eto_2(esz_1.r, "Le b\u00e2timent n'existe pas");
        }
        if (esh_12.a(l) == null) {
            throw new eto_2(esz_1.z, "L'\u00e9l\u00e9ment n'existe pas");
        }
        esh_12.b(l);
    }

    protected final void a(long l, int n) {
        esh_1 esh_12 = (esh_1)this.a.a(l);
        if (esh_12 == null) {
            throw new eto_2(esz_1.r, "Le b\u00e2timent n'existe pas");
        }
        etw_2 etw_22 = esh_12.a();
        if (n != 0 && !etw_22.b(n)) {
            throw new eto_2(esz_1.w, "Impossible d'\u00e9quipper l'item " + n);
        }
        esh_12.a(n);
    }

    public final esa_2 a(short s2, short s3) {
        esc_2 esc_22 = new esc_2(s2, s3);
        this.a(esc_22);
        return esc_22;
    }

    protected final esa_2 a(short s2, short s3, short s4, short s5, short s6, short s7) {
        esc_2 esc_22 = new esc_2(s2, s3, s4, s5, s6, s7);
        this.a(esc_22);
        return esc_22;
    }

    protected final void a(esa_2 esa_22) {
        if (this.a.a(esa_22.a(), esa_22.b()) != null) {
            throw new eto_2(esz_1.H, "La partition existe d\u00e9j\u00e0");
        }
        this.a.a(esa_22);
    }

    public final void b(short s2, short s3, short s4, short s5, short s6, short s7) {
        esc_2 esc_22 = (esc_2)this.a.a(s2, s3);
        if (esc_22 == null) {
            throw new eto_2(esz_1.G, "La partition n'existe pas");
        }
        boolean bl = esc_22.a(s4, s5, s6, s7);
        if (bl) {
            this.a.b(esc_22);
        }
    }

    public final void a(int n) {
        if (n < 0) {
            throw new eto_2(esz_1.K, "Impossible de rajouter une quantit\u00e9 de resources n\u00e9gative");
        }
        est_1 est_12 = (est_1)this.a();
        est_12.c().a(Math.min(50000000, Hw.e((long)(est_12.f() + n))));
    }

    protected final void b(int n) {
        if (n < 0) {
            throw new eto_2(esz_1.K, "Impossible de supprimer une quantit\u00e9 de resources n\u00e9gative");
        }
        est_1 est_12 = (est_1)this.a();
        if (est_12.f() - n < 0) {
            throw new eto_2(esz_1.K, "Impossible de descendre en dessous de 0 ressources");
        }
        est_12.c().a(Hw.f((long)(est_12.f() - n)));
    }

    public final void c(int n) {
        if (n < 0) {
            throw new eto_2(esz_1.K, "Impossible de d\u00e9finir une quantit\u00e9 de resources n\u00e9gative");
        }
        est_1 est_12 = (est_1)this.a();
        est_12.c().a(n);
    }

    public esh_1 d(long l) {
        return (esh_1)this.a.a(l);
    }

    protected long b() {
        return this.a.a();
    }

    public String toString() {
        return "HavenWorldController{m_world=" + this.a + "}";
    }
}

