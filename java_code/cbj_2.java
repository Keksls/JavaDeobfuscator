/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.list.array.TLongArrayList
 */
import com.ankamagames.baseImpl.graphics.isometric.particles.FreeParticleSystem;
import gnu.trove.list.array.TLongArrayList;
import java.util.ArrayList;
import java.util.List;

/*
 * Renamed from cbJ
 */
class cbj_2
extends cbr_1 {
    private static final boolean e = false;
    private static final int f = 2048;
    private static final float g = 1.5f;
    private int h;
    private int i;
    private boolean j = false;
    private long k;
    private boolean l;
    private final ArrayList<FreeParticleSystem> m = new ArrayList();
    private cba_1 n = new cbl_1();
    private final adw_0 o = new adw_0();
    private ccf_2 p;
    private float q;
    private final cbk_2 r;

    protected cbj_2(cbk_2 cbk_22) {
        this.r = cbk_22;
    }

    cbj_2() {
        this.r = new cbk_2();
    }

    public void a(float f2) {
        this.q = f2;
        if (this.p != null) {
            this.p.a(f2);
        }
    }

    public cba_1 b() {
        return this.n;
    }

    public void a(cba_1 cba_12) {
        this.n = cba_12;
    }

    @Override
    void a(ahg_0 ahg_02) {
        super.a(ahg_02);
        if (this.h > 0) {
            return;
        }
        ahq_0 ahq_02 = ahg_02.s();
        aeh_2 aeh_22 = new aeh_2(-18.0f, 18.0f, -18.0f, 18.0f, 0.0f, 54.0f);
        adD adD2 = new adD();
        adD2.a(aeh_22);
        adD2.a(ahq_02);
        this.r.a(adD2);
        aeh_22 = new aeh_2(-18.0f, 18.0f, -18.0f, 18.0f, 0.0f, 18.0f);
        adA adA2 = new adA();
        adA2.a(aeh_22);
        adA2.a(ahq_02);
        this.r.a(adA2);
        aui_1.a().a(adD2);
        aui_1.a().a(adA2);
        this.h = adD2.f();
        this.i = adA2.f();
        aed.a.a(this.o);
        this.o.a(ahq_02);
        this.b = true;
    }

    private void b(boolean bl) {
    }

    private boolean f() {
        return this.p != null;
    }

    @Override
    void a() {
        super.a();
        if (this.h == 0) {
            return;
        }
        auh_1 auh_12 = aui_1.a().b(this.h);
        if (auh_12 != null) {
            auh_12.a(false);
            aui_1.a().b(auh_12);
            auh_12.a();
        }
        this.h = 0;
        auh_12 = aui_1.a().b(this.i);
        if (auh_12 != null) {
            auh_12.a(false);
            aui_1.a().b(auh_12);
            auh_12.a();
        }
        this.i = 0;
        this.b(false);
        if (this.j) {
            this.h();
        }
        aed.a.b(this.o);
        this.b = false;
    }

    private void g() {
        List list = ccm_1.g().b();
        if (list == null) {
            return;
        }
        int n = 86;
        boolean bl = false;
        TLongArrayList tLongArrayList = new TLongArrayList();
        bmr_1 bmr_12 = azu_0.j().k();
        int n2 = list.size();
        for (int k = 0; k < n2; ++k) {
            cch_1 cch_12 = (cch_1)list.get(k);
            long l = Hw.c(cch_12.a(), cch_12.b());
            if (tLongArrayList.contains(l)) continue;
            tLongArrayList.add(l);
            int n3 = cch_12.a() * 18;
            int n4 = cch_12.b() * 18;
            short s2 = yz_0.d(n3, n4, bmr_12.P_().f());
            FreeParticleSystem freeParticleSystem = aij_0.a().a(86, 0);
            freeParticleSystem.a(n3, (float)n4, (float)s2);
            aik_0.a().b(freeParticleSystem);
            this.m.add(freeParticleSystem);
        }
        this.j = true;
    }

    private void h() {
        int n = this.m.size();
        for (int k = 0; k < n; ++k) {
            int n2 = this.m.get(k).ac();
            aik_0.a().a(n2, true);
        }
        this.m.clear();
        this.j = false;
    }

    @Override
    public void a(boolean bl) {
        super.a(bl);
        if (!bl) {
            adD adD2;
            if (this.j) {
                this.h();
            }
            if ((adD2 = (adD)aui_1.a().b(this.h)) != null) {
                adD2.e(400);
            }
        }
    }

    @Override
    void a(ahg_0 ahg_02, float f2, float f3) {
        boolean bl;
        if (!this.b) {
            this.l = true;
            if (this.f()) {
                this.p.c(0.0f);
            }
            return;
        }
        float f4 = this.d.a();
        long l = System.currentTimeMillis();
        if (this.f()) {
            float f5 = l - this.k > 0L ? Math.min(1.0f, (float)(l - this.k) / 10000.0f) : 1.0f;
            this.p.c((this.l ? 1.0f - f5 : f5) * this.e());
        }
        boolean bl2 = bl = f4 <= 0.2f;
        if (bl != this.l) {
            this.k = l;
            this.l = bl;
        }
        if (f4 <= 0.0f) {
            this.a();
            return;
        }
        this.b(true);
        adD adD2 = (adD)aui_1.a().b(this.h);
        adA adA2 = (adA)aui_1.a().b(this.i);
        if (adD2 == null || adA2 == null) {
            return;
        }
        float f6 = f3 * f2;
        adD2.a(-1.5707964f - f6 * 0.7853982f, 0.117809735f * (f6 + 0.3f));
        int n = (int)(this.c && f4 > 0.2f ? 2048.0f * f4 : 0.0f);
        adD2.d(n);
        adA2.d(n);
        adD2.a(1.5f * (1.0f + f4 * 1.5f));
        float f7 = ael_0.a.b();
        if (f7 > 0.7f && this.d.b() < this.d.a() && this.d.b() < 0.2f) {
            if (!this.j && this.c) {
                this.g();
            }
        } else if (this.j) {
            this.h();
        }
        float f8 = this.n.a(f4);
        float f9 = this.n.a(f4, f7);
        this.o.a(f8);
        this.o.b(f9);
        this.o.a(-f6 * (2.0f - f4) * 5.0f, 0.0f);
        this.o.c(this.n.a());
        if (this.f()) {
            this.p.b(f4);
        }
    }
}

