/*
 * Decompiled with CFR 0.152.
 */
import java.io.IOException;
import java.util.ArrayList;

class cDx
implements akq_0 {
    private final ArrayList<cdl_0> b = new ArrayList();
    private final ArrayList<amn_1> c = new ArrayList();
    final /* synthetic */ cdw_0 a;

    cDx(cdw_0 cdw_02) {
        this.a = cdw_02;
        this.b.add(cdl_0.b);
        this.b.add(cdl_0.c);
        this.b.add(cdl_0.g);
        this.b.add(cdl_0.f);
        this.b.add(cdl_0.d);
        this.b.add(cdl_0.h);
        this.b.add(cdl_0.i);
        this.b.add(cdl_0.e);
    }

    private cdl_0 c(long l) {
        int n = this.b.size();
        for (int k = 0; k < n; ++k) {
            cdl_0 cdl_02 = this.b.get(k);
            if (!cdl_02.a(l)) continue;
            return cdl_02;
        }
        return null;
    }

    @Override
    public amk_1 a(long l, float f2, int n, long l2, long l3, int n2) {
        return this.a(l, f2, 1.0f, n, l2, l3, n2);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public amk_1 a(long l, float f2, float f3, int n, long l2, long l3, int n2) {
        Object object;
        if (!this.a.e()) {
            return null;
        }
        long l4 = ami_2.a(l);
        cdl_0 cdl_02 = this.c(l4);
        if (cdl_02 == null) {
            return null;
        }
        alp_1 alp_12 = cdl_02.c();
        if (!alp_12.o()) {
            return null;
        }
        bmr_1 bmr_12 = azu_0.j().k();
        if (bmr_12 != null && cdl_02.e()) {
            object = bmr_12.cP();
            if (l4 != 530L) {
                if (object == null) {
                    f2 *= n2 <= 0 ? 1.0f : 0.25f;
                } else {
                    if (((els_0)object).c() != n2) {
                        return null;
                    }
                    if (l4 == 111L) {
                        f2 *= this.a.bU.a();
                    }
                }
            }
        }
        f2 = Hw.b(f2, 0.0f, 1.0f);
        object = new amn_1(aml_1.a().b(), l, f2, f3, n, l2, l3, n2);
        ArrayList<amn_1> arrayList = this.c;
        synchronized (arrayList) {
            this.c.add((amn_1)object);
        }
        return object;
    }

    public amk_1 a(long l, float f2, int n, long l2, long l3, int n2, alo_1 alo_12, int n3) {
        return this.a(l, f2, n, l2, l3, n2, alo_12, n3, true);
    }

    @Override
    public amk_1 a(long l, float f2, int n, long l2, long l3, int n2, alo_1 alo_12, int n3, boolean bl) {
        return this.a(l, f2, 1.0f, n, l2, l3, n2, alo_12, n3, bl);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public amk_1 a(long l, float f2, float f3, int n, long l2, long l3, int n2, alo_1 alo_12, int n3, boolean bl) {
        Object object;
        if (!this.a.e()) {
            return null;
        }
        long l4 = ami_2.a(l);
        cdl_0 cdl_02 = this.c(l4);
        if (cdl_02 == null) {
            return null;
        }
        alu_1 alu_12 = cdl_02.d();
        if (!alu_12.o()) {
            return null;
        }
        bmr_1 bmr_12 = azu_0.j().k();
        if (cdl_02.e()) {
            Object object2 = object = bmr_12 != null ? bmr_12.cP() : null;
            if (l4 != 530L) {
                if (object == null) {
                    f2 *= n2 <= 0 ? 1.0f : 0.25f;
                } else {
                    if (((els_0)object).c() != n2) {
                        return null;
                    }
                    if (l4 == 111L) {
                        f2 *= this.a.bU.a();
                    }
                }
            }
        }
        f2 = Math.max(Math.min(1.0f, f2), 0.0f);
        object = new amn_1(aml_1.a().b(), l, f2, f3, n, l2, l3, n2, alo_12, n3, bl);
        ArrayList<amn_1> arrayList = this.c;
        synchronized (arrayList) {
            this.c.add((amn_1)object);
        }
        return object;
    }

    @Override
    public void a(long l) {
        cdw_0.n().e(l);
    }

    @Override
    public void a(long l, float f2) {
        cdw_0.n().d(l, f2);
    }

    @Override
    public void b(long l) {
        if (this.a.bZ) {
            cdw_0.n().b(l);
        }
    }

    @Override
    public void b(long l, float f2) {
        if (this.a.bZ) {
            cdw_0.n().b(l, f2);
        }
    }

    @Override
    public void a() {
        cdw_0.n().E();
    }

    private void a(amn_1 amn_12) {
        long l;
        amx_1 amx_12;
        long l2 = amn_12.a();
        long l3 = ami_2.a(l2);
        cdl_0 cdl_02 = this.c(l3);
        if (cdl_02 == null) {
            return;
        }
        alp_1 alp_12 = cdl_02.c();
        if (!alp_12.o()) {
            return;
        }
        try {
            amx_12 = alp_12.h().a(l2);
        }
        catch (IOException iOException) {
            cdw_0.S().debug((Object)("Impossible de charger le son d'id " + l2));
            return;
        }
        if (amx_12 == null) {
            cdw_0.T().debug((Object)("Impossible de pr\u00e9parer le son d'id " + l2));
            return;
        }
        amj_1 amj_12 = alp_12.a(amx_12, amn_12.b());
        if (amj_12 == null) {
            return;
        }
        amj_12.c(amn_12.c());
        amj_12.g(amn_12.d());
        int n = amn_12.e();
        if (n == 0) {
            amj_12.b(true);
        } else if (n > 1) {
            amj_12.e(n);
        }
        long l4 = amn_12.f();
        if (l4 != -1L) {
            amj_12.e(l4);
        }
        if ((l = amn_12.g()) != -1L) {
            amj_12.f(l);
        }
        alp_12.a(amj_12);
    }

    private void b(amn_1 amn_12) {
        amx_1 amx_12;
        long l = amn_12.a();
        long l2 = ami_2.a(l);
        cdl_0 cdl_02 = this.c(l2);
        if (cdl_02 == null) {
            return;
        }
        alu_1 alu_12 = cdl_02.d();
        if (!alu_12.o()) {
            return;
        }
        try {
            amx_12 = alu_12.h().a(l);
        }
        catch (IOException iOException) {
            cdw_0.U().debug((Object)("Impossible de charger le son d'id " + l));
            return;
        }
        if (amx_12 == null) {
            cdw_0.V().debug((Object)("Impossible de pr\u00e9parer le son d'id " + l));
            return;
        }
        int n = amn_12.j();
        aly_1 aly_12 = this.a.h(n);
        if (aly_12 == null) {
            cdw_0.W().debug((Object)"Les rollOffs n'ont pas \u00e9t\u00e9 initialis\u00e9s");
            return;
        }
        float f2 = amn_12.c();
        float f3 = amn_12.d();
        alo_1 alo_12 = amn_12.i();
        try {
            alu_12.a(amx_12, f2, f3, alo_12, aly_12.b(), aly_12.c(), aly_12.a(), 0, 0, amn_12.e() == 0, false, amn_12.k(), 0.0f, amn_12.b());
        }
        catch (Exception exception) {
            cdw_0.X().debug((Object)"Exception lev\u00e9e lors de la cr\u00e9ation d'une source positionn\u00e9e", (Throwable)exception);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public void c() {
        ArrayList<amn_1> arrayList = this.c;
        synchronized (arrayList) {
            int n = this.c.size();
            for (int k = 0; k < n; ++k) {
                amn_1 amn_12 = this.c.get(k);
                if (amn_12.i() == null) {
                    this.a(amn_12);
                    continue;
                }
                this.b(amn_12);
            }
            this.c.clear();
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public void a(long l, amj_1 amj_12) {
        if (amj_12 != null) {
            if (amj_12.n()) {
                amj_12.u();
            } else {
                amj_12.a(0.0f, 300.0f);
                amj_12.f(true);
            }
        } else {
            ArrayList<amn_1> arrayList = this.c;
            synchronized (arrayList) {
                for (int k = this.c.size() - 1; k >= 0; --k) {
                    amn_1 amn_12 = this.c.get(k);
                    if (amn_12.b() != l) continue;
                    this.c.remove(k);
                    break;
                }
            }
        }
    }

    @Override
    public void b() {
        if (!this.a.e()) {
            return;
        }
        int n = this.b.size();
        for (int k = 0; k < n; ++k) {
            alp_1 alp_12 = this.b.get(k).c();
            if (alp_12 == null) continue;
            alp_12.x();
        }
    }

    @Override
    public void a(float f2, float f3) {
        if (!this.a.e()) {
            return;
        }
        int n = this.b.size();
        for (int k = 0; k < n; ++k) {
            alp_1 alp_12 = this.b.get(k).c();
            if (alp_12 == null) continue;
            alp_12.g(f2);
            if (f3 == -1.0f) continue;
            alp_12.h(f3);
        }
    }
}

