/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.set.hash.TLongHashSet
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.NotNull
 */
import com.ankamagames.framework.graphics.engine.Anm2.Anm;
import gnu.trove.set.hash.TLongHashSet;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.apache.log4j.Logger;
import org.jetbrains.annotations.NotNull;

public class biS {
    private static final Logger b = Logger.getLogger(biS.class);
    private static final boolean c = false;
    final biI d;
    bjj_0 e = null;
    private bjz_0 f;
    private bjw g;
    private bjb_0 h;
    private bkd_0 i;
    private bjh j;
    private bjs_0 k;
    private bjo l;
    private bjP m;
    private bjV n;
    private bjN o;
    private bjm_0 p;
    private agh_0 q;
    private bjZ r;
    private bjL s;
    private bje t;
    private bjx_0 u;
    private bjJ v;
    private final TLongHashSet w = new TLongHashSet();
    private String x;

    public biS(biI biI2) {
        assert (biI2 != null);
        this.d = biI2;
    }

    public bjy_0 a() {
        return this.g == null ? null : (bjy_0)this.g.c();
    }

    public biI b() {
        return this.d;
    }

    public void a(ejh_0 ejh_02, boolean bl) {
        Iterator<rg_0> iterator;
        if (ejh_02 instanceof eja_0) {
            iterator = ((eja_0)ejh_02).aF().t();
        } else {
            if (ejh_02.f() == null) {
                return;
            }
            iterator = ((efh_0)ejh_02.f()).S();
        }
        this.a(ejh_02, bl, iterator);
    }

    public void b(ejh_0 ejh_02, boolean bl) {
        efh_0 efh_02 = (efh_0)ejh_02.f();
        if (ejh_02.bt_() == efc_0.b.a()) {
            Iterator<rg_0> iterator = ((eja_0)ejh_02).aF().t();
            this.b(ejh_02, bl, iterator);
            return;
        }
        if (efh_02 == null) {
            return;
        }
        if (!this.w.contains(ejh_02.c())) {
            return;
        }
        List<rg_0> list = efh_02.X();
        if (list == null) {
            return;
        }
        int n = list.size();
        for (int k = 0; k < n; ++k) {
            rg_0 rg_02 = list.get(k);
            if (efh_02.f(rg_02)) {
                this.a(ejh_02, bl, rg_02);
            }
            if (!efh_02.g(rg_02)) continue;
            this.b(ejh_02, bl, rg_02);
        }
        this.w.remove(ejh_02.c());
    }

    public void c(ejh_0 ejh_02, boolean bl) {
        if (ejh_02 instanceof eja_0) {
            return;
        }
        efh_0 efh_02 = (efh_0)ejh_02.f();
        if (efh_02 == null) {
            return;
        }
        if (this.w.contains(ejh_02.c())) {
            return;
        }
        List<rg_0> list = efh_02.X();
        if (list == null) {
            return;
        }
        int n = list.size();
        for (int k = 0; k < n; ++k) {
            rg_0 rg_02 = list.get(k);
            if (efh_02.i(rg_02)) {
                this.a(ejh_02, bl, rg_02);
            }
            if (!efh_02.j(rg_02)) continue;
            this.b(ejh_02, bl, rg_02);
        }
        this.w.add(ejh_02.c());
    }

    private void a(Rk rk) {
        adm_0 adm_02 = new adm_0();
        adm_02.a(rk.i(), rk.h());
        adm_02.a(new adO(rk.e(), rk.f(), rk.g()));
        adm_02.a(rk.j());
        ace_0 ace_02 = ans_0.D().c();
        adm_02.a(ace_02.b());
        aui_1.a().a(adm_02);
    }

    private void a(rf_0 rf_02) {
        cdw_0.n().d(rf_02.e());
    }

    private void a(efh_0 efh_02, ra_0 ra_02) {
        if (this.o == null) {
            this.o = new bjN();
        }
        this.o.b(this.d, new bjo_0(efh_02, ra_02.e(), ra_02.f(), ra_02.d()));
    }

    private void b(efh_0 efh_02, ra_0 ra_02) {
        if (this.o == null) {
            return;
        }
        this.o.c(this.d, new bjo_0(efh_02, ra_02.e(), ra_02.f(), ra_02.d()));
        if (this.o.b()) {
            this.o = null;
        }
    }

    private void a(String string, efh_0 efh_02) {
        if (this.e == null) {
            this.e = new bjj_0();
        }
        this.e.b(this.d, new bjl_0(efh_02, string));
        this.d.bQ().a(this.d);
        this.x = this.d.ab();
        this.d.g("AnimStatique");
        this.d.a(new biT(this));
    }

    private void b(String string, efh_0 efh_02) {
        if (this.e == null) {
            return;
        }
        bjl_0 bjl_02 = (bjl_0)this.e.c();
        bjl_0 bjl_03 = this.e.a(new bjl_0(efh_02, string));
        this.d.g(this.x);
        if (this.d.k("AnimTransEffect-Fin")) {
            this.d.e("AnimTransEffect-Fin");
            this.d.a(new biU(this, bjl_02, bjl_03));
        } else {
            this.d.e(this.x);
            this.e.a(bjl_02, bjl_03, this.d);
            if (this.e.b()) {
                this.e = null;
            }
        }
    }

    public void c() {
        this.x = null;
    }

    private void a(float[] fArray, String string, efh_0 efh_02) {
        int n = Anm.b(string);
        if (this.f == null) {
            this.f = new bjz_0();
        }
        this.f.b(this.d, new bja_0(efh_02, fArray, n));
    }

    private void b(float[] fArray, String string, efh_0 efh_02) {
        if (this.f == null) {
            return;
        }
        int n = Anm.b(string);
        this.f.c(this.d, new bja_0(efh_02, fArray, n));
        if (this.f.b()) {
            this.f = null;
        }
    }

    private void a(String string, String string2, ejh_0 ejh_02) {
    }

    private void a(ejh_0 ejh_02) {
    }

    private void a(int n, int n2, ArrayList<Rx> arrayList, efh_0 efh_02) {
        bjd_0 bjd_02;
        if (this.h == null) {
            this.h = new bjb_0();
        }
        if (!this.h.b(bjd_02 = new bjd_0(efh_02, arrayList, n, n2))) {
            this.h.b(this.d, bjd_02);
        }
    }

    private void b(int n, int n2, ArrayList<Rx> arrayList, efh_0 efh_02) {
        if (this.h == null) {
            return;
        }
        this.h.c(this.d, new bjd_0(efh_02, arrayList, n, n2));
        if (this.h.b()) {
            this.h = null;
        }
    }

    private void a(String string, int n, String[] stringArray, efh_0 efh_02) {
        bjy_0 bjy_02;
        if (this.g == null) {
            this.g = new bjw();
        }
        if (!this.g.b(bjy_02 = new bjy_0(efh_02, string, n, stringArray))) {
            this.g.b(this.d, bjy_02);
        }
    }

    private void b(String string, int n, String[] stringArray, efh_0 efh_02) {
        if (this.g == null) {
            return;
        }
        this.g.c(this.d, new bjy_0(efh_02, string, n, stringArray));
        if (this.g.b()) {
            this.g = null;
        }
    }

    private void a(boolean bl, String[] stringArray, efh_0 efh_02) {
        if (this.i == null) {
            this.i = new bkd_0();
        }
        this.i.b(this.d, new bke_0(efh_02, bl, stringArray));
    }

    private void b(boolean bl, String[] stringArray, efh_0 efh_02) {
        if (this.i == null) {
            return;
        }
        this.i.c(this.d, new bke_0(efh_02, bl, stringArray));
        if (this.i.b()) {
            this.i = null;
        }
    }

    private void c(String string, efh_0 efh_02) {
        if (this.j == null) {
            this.j = new bjh();
        }
        this.j.b(this.d, new bji(efh_02, string));
    }

    private void d(String string, efh_0 efh_02) {
        if (this.j == null) {
            return;
        }
        this.j.c(this.d, new bji(efh_02, string));
        if (this.j.b()) {
            this.j = null;
        }
    }

    private void e(String string, efh_0 efh_02) {
        if (this.k == null) {
            this.k = new bjs_0();
        }
        this.k.b(this.d, new bju(efh_02, string));
    }

    private void f(String string, efh_0 efh_02) {
        if (this.k == null) {
            return;
        }
        this.k.c(this.d, new bju(efh_02, string));
        if (this.k.b()) {
            this.k = null;
        }
    }

    private void g(String string, efh_0 efh_02) {
        if (this.l == null) {
            this.l = new bjo();
        }
        this.l.b(this.d, new bjq(efh_02, string));
    }

    private void h(String string, efh_0 efh_02) {
        if (this.l == null) {
            return;
        }
        this.l.c(this.d, new bjq(efh_02, string));
        if (this.l.b()) {
            this.l = null;
        }
    }

    private void i(String string, efh_0 efh_02) {
        if (this.p == null) {
            this.p = new bjm_0();
        }
        this.p.b(this.d, new bjn_0(efh_02, string));
    }

    private void j(String string, efh_0 efh_02) {
        if (this.p == null) {
            return;
        }
        this.p.c(this.d, new bjn_0(efh_02, string));
        if (this.p.b()) {
            this.p = null;
        }
    }

    public void a(int n, boolean bl, RH rH, boolean bl2, aff_1 aff_12, ejh_0 ejh_02) {
        this.a(n, bl, rH, bl2, aff_12, (efh_0)ejh_02.f());
    }

    public void a(int n, boolean bl, RH rH, boolean bl2, aff_1 aff_12, efh_0 efh_02) {
        if (this.n == null) {
            this.n = new bjV();
        }
        this.n.a(this.d, efh_02, n, rH, aff_12, bl, bl2);
    }

    private void b(int n, boolean bl, RH rH, boolean bl2, aff_1 aff_12, ejh_0 ejh_02) {
        if (this.n == null) {
            return;
        }
        this.n.b(this.d, (efh_0)ejh_02.f(), n, rH, aff_12, bl, bl2);
        if (this.n.b()) {
            this.n = null;
        }
    }

    private void a(boolean bl) {
        if (this.n == null) {
            return;
        }
        this.n.a(bl);
    }

    public void d() {
        this.a(true);
    }

    public void e() {
        this.a(false);
    }

    public bjV f() {
        if (this.n == null) {
            this.n = new bjV();
        }
        return this.n;
    }

    private void a(ejh_0 ejh_02, String string, String string2, String string3) {
        bkb_0.a(ejh_02, string, string2, string3);
    }

    private void a(String string, String string2, String string3) {
        bkb_0.a(string, string2, string3);
    }

    private void a(float f2) {
        this.d.g(f2);
    }

    private void b(float f2) {
        this.d.h(f2);
    }

    private void a(String string, String string2, efh_0 efh_02) {
        if (this.m == null) {
            this.m = new bjP();
        }
        this.m.b(this.d, new bjq_0(efh_02, string, string2));
    }

    private void b(String string, String string2, efh_0 efh_02) {
        if (this.m == null) {
            return;
        }
        this.m.c(this.d, new bjq_0(efh_02, string, string2));
        if (this.m.b()) {
            this.m = null;
        }
    }

    private void a(afm_0 afm_02, afm_0 afm_03) {
        if (this.q != null) {
            this.q.b(this.d);
        }
        this.q = new agh_0(this.d.aZ(), afn_0.a().a(afm_02), afn_0.a().a(afm_03));
        this.d.a(this.q);
    }

    private void a(String string, String string2) {
        if (this.q != null && this.d.aZ() == this.q) {
            this.q.b(this.d);
        }
        this.q = null;
    }

    private void a(efh_0 efh_02) {
        if (this.s == null) {
            this.s = new bjL();
        }
        this.s.b(this.d, new bjM(efh_02));
    }

    private void b(efh_0 efh_02) {
        if (this.s == null) {
            return;
        }
        this.s.c(this.d, new bjM(efh_02));
        if (this.s.b()) {
            this.s = null;
        }
    }

    private void a(efh_0 efh_02, String string, boolean bl) {
        if (this.r == null) {
            this.r = new bjZ();
        }
        this.r.b(this.d, new bka_0(efh_02, string, bl));
    }

    private void b(efh_0 efh_02, String string, boolean bl) {
        if (this.r == null) {
            return;
        }
        this.r.c(this.d, new bka_0(efh_02, string, bl));
        if (this.r.b()) {
            this.r = null;
        }
    }

    private void a(ejh_0 ejh_02, boolean bl, Iterator<rg_0> iterator) {
        if (!iterator.hasNext() || this.w.contains(ejh_02.c())) {
            return;
        }
        while (iterator.hasNext()) {
            rg_0 rg_02 = iterator.next();
            this.a(ejh_02, bl, rg_02);
        }
        this.w.add(ejh_02.c());
    }

    private void a(ejh_0 ejh_02, boolean bl, rg_0 rg_02) {
        if (!biS.a(ejh_02, rg_02)) {
            return;
        }
        switch (rg_02.a()) {
            case b: {
                rc_0 rc_02 = (rc_0)rg_02;
                aff_1 aff_12 = bl ? ejh_02.j() : null;
                this.a(rc_02.e(), rc_02.f(), rc_02.g(), rc_02.d(), aff_12, ejh_02);
                break;
            }
            case k: {
                re_0 re_02 = (re_0)rg_02;
                this.a(ejh_02, re_02.e(), re_02.f(), re_02.g());
            }
            default: {
                this.a((efh_0)ejh_02.f(), rg_02);
            }
        }
    }

    private void a(efh_0 efh_02, rg_0 rg_02) {
        switch (rg_02.a()) {
            case b: {
                rc_0 rc_02 = (rc_0)rg_02;
                this.a(rc_02.e(), rc_02.f(), rc_02.g(), rc_02.d(), null, efh_02);
                break;
            }
            case c: {
                ra_0 ra_02 = (ra_0)rg_02;
                this.a(efh_02, ra_02);
                break;
            }
            case d: {
                Rp rp = (Rp)rg_02;
                this.a(rp.e(), efh_02);
                break;
            }
            case e: {
                Rk rk = (Rk)rg_02;
                this.a(rk);
                break;
            }
            case a: {
                rf_0 rf_02 = (rf_0)rg_02;
                this.a(rf_02);
                break;
            }
            case g: {
                Rt rt = (Rt)rg_02;
                this.a(rt.e(), rt.f(), efh_02);
                break;
            }
            case f: {
                Rv rv = (Rv)rg_02;
                this.a(rv.e(), rv.g(), rv.f(), efh_02);
                break;
            }
            case r: {
                Rw rw = (Rw)rg_02;
                this.a(rw.f(), rw.g(), rw.e(), efh_02);
                break;
            }
            case h: {
                Ro ro = (Ro)rg_02;
                this.c(ro.e(), efh_02);
                break;
            }
            case i: {
                Rn rn = (Rn)rg_02;
                this.e(rn.e(), efh_02);
                break;
            }
            case s: {
                Rm rm = (Rm)rg_02;
                this.g(rm.e(), efh_02);
                break;
            }
            case m: {
                Rl rl = (Rl)rg_02;
                this.i(rl.e(), efh_02);
                break;
            }
            case j: {
                RG rG = (RG)rg_02;
                this.a(rG.e(), rG.f(), efh_02);
                break;
            }
            case l: {
                rb_0 rb_02 = (rb_0)rg_02;
                this.a(rb_02.e(), rb_02.f(), efh_02);
                break;
            }
            case n: {
                Rz rz = (Rz)rg_02;
                this.a(rz.e());
                break;
            }
            case o: {
                Rr rr = (Rr)rg_02;
                this.a(afm_0.valueOf(rr.e()), afm_0.valueOf(rr.f()));
                break;
            }
            case p: {
                rd_0 rd_02 = (rd_0)rg_02;
                this.a(efh_02, rd_02.f(), rd_02.e());
                break;
            }
            case q: {
                this.a(efh_02);
                break;
            }
            case u: {
                Rj rj = (Rj)rg_02;
                this.a(efh_02, rj);
                break;
            }
            case t: {
                Rs rs = (Rs)rg_02;
                this.a(efh_02, rs.e());
                break;
            }
            case v: {
                Rq rq = (Rq)rg_02;
                this.a(efh_02, rq.e());
            }
        }
    }

    private void b(ejh_0 ejh_02, boolean bl, Iterator<rg_0> iterator) {
        if (!iterator.hasNext() || !this.w.contains(ejh_02.c())) {
            return;
        }
        while (iterator.hasNext()) {
            rg_0 rg_02 = iterator.next();
            this.b(ejh_02, bl, rg_02);
        }
        this.w.remove(ejh_02.c());
    }

    private void b(ejh_0 ejh_02, boolean bl, rg_0 rg_02) {
        if (!biS.a(ejh_02, rg_02)) {
            return;
        }
        switch (rg_02.a()) {
            case b: {
                rc_0 rc_02 = (rc_0)rg_02;
                aff_1 aff_12 = bl ? ejh_02.j() : null;
                this.b(rc_02.e(), rc_02.f(), rc_02.g(), rc_02.d(), aff_12, ejh_02);
                break;
            }
            default: {
                this.b((efh_0)ejh_02.f(), rg_02);
            }
        }
    }

    private void b(efh_0 efh_02, rg_0 rg_02) {
        switch (rg_02.a()) {
            case c: {
                ra_0 ra_02 = (ra_0)rg_02;
                this.b(efh_02, ra_02);
                break;
            }
            case e: {
                break;
            }
            case a: {
                break;
            }
            case d: {
                Rp rp = (Rp)rg_02;
                this.b(rp.e(), efh_02);
                break;
            }
            case g: {
                Rt rt = (Rt)rg_02;
                this.b(rt.e(), rt.f(), efh_02);
                break;
            }
            case f: {
                Rv rv = (Rv)rg_02;
                this.b(rv.e(), rv.g(), rv.f(), efh_02);
                break;
            }
            case r: {
                Rw rw = (Rw)rg_02;
                this.b(rw.f(), rw.g(), rw.e(), efh_02);
                break;
            }
            case h: {
                Ro ro = (Ro)rg_02;
                this.d(ro.e(), efh_02);
                break;
            }
            case i: {
                Rn rn = (Rn)rg_02;
                this.f(rn.e(), efh_02);
                break;
            }
            case s: {
                Rm rm = (Rm)rg_02;
                this.h(rm.e(), efh_02);
                break;
            }
            case m: {
                Rl rl = (Rl)rg_02;
                this.j(rl.e(), efh_02);
                break;
            }
            case j: {
                RG rG = (RG)rg_02;
                this.b(rG.e(), rG.f(), efh_02);
                break;
            }
            case k: {
                re_0 re_02 = (re_0)rg_02;
                this.a(re_02.e(), re_02.f(), re_02.g());
                break;
            }
            case l: {
                rb_0 rb_02 = (rb_0)rg_02;
                this.b(rb_02.e(), rb_02.f(), efh_02);
                break;
            }
            case n: {
                Rz rz = (Rz)rg_02;
                this.b(rz.e());
                break;
            }
            case o: {
                Rr rr = (Rr)rg_02;
                this.a(rr.e(), rr.f());
                break;
            }
            case p: {
                rd_0 rd_02 = (rd_0)rg_02;
                this.b(efh_02, rd_02.f(), rd_02.e());
                break;
            }
            case q: {
                this.b(efh_02);
                break;
            }
            case u: {
                Rj rj = (Rj)rg_02;
                this.b(efh_02, rj);
                break;
            }
            case t: {
                Rs rs = (Rs)rg_02;
                this.b(efh_02, rs.e());
                break;
            }
            case v: {
                Rq rq = (Rq)rg_02;
                this.b(efh_02, rq.e());
                break;
            }
        }
    }

    public void a(bjw_1 bjw_12) {
        abc_2<efh_0> abc_22 = bjw_12.q();
        for (efh_0 efh_02 : abc_22) {
            if (efh_02.j() != efc_0.eq.a() || !this.a(efh_02.Q())) continue;
            int n = efh_02.a(0, (short)0, eFb.a);
            fie_0 fie_02 = fih_0.a().a(n);
            if (fie_02 == null) continue;
            ArrayList<efh_0> arrayList = fie_02.e((short)0);
            for (efh_0 efh_03 : arrayList) {
                if (!this.a(efh_03.Q())) continue;
                List<rg_0> list = efh_03.X();
                for (rg_0 rg_02 : list) {
                    this.a(efh_03, rg_02);
                }
            }
        }
    }

    public boolean a(apc_2 apc_22) {
        byte by = this.d.bI().gX();
        if (apc_22 != null && !apc_22.b(this.d.bI(), this.d.bI(), this.d.bI(), null)) {
            return false;
        }
        apc_2 apc_23 = biS.b(apc_22);
        return apc_23 == null || ((exS)apc_23).d() == by;
    }

    private static apc_2 b(apc_2 apc_22) {
        apc_2 apc_23;
        aot_1 aot_12;
        if (apc_22 == null) {
            return null;
        }
        if (apc_22 instanceof exS) {
            return apc_22;
        }
        if (apc_22 instanceof aos_1) {
            aot_12 = (aos_1)apc_22;
            apc_23 = biS.b(((aos_1)aot_12).b());
            if (apc_23 != null) {
                return apc_23;
            }
            apc_23 = biS.b(((aos_1)aot_12).d());
            if (apc_23 != null) {
                return apc_23;
            }
        }
        if (apc_22 instanceof aor_1) {
            aot_12 = (aor_1)apc_22;
            apc_23 = biS.b(((aor_1)aot_12).b());
            if (apc_23 != null) {
                return apc_23;
            }
            apc_23 = biS.b(((aor_1)aot_12).d());
            if (apc_23 != null) {
                return apc_23;
            }
        }
        return null;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static boolean a(ejh_0 ejh_02, rg_0 rg_02) {
        if (!rg_02.c()) return true;
        long l = ejh_02.i().a_();
        ans_0.D();
        if (l != ans_0.F().k().a_()) return false;
        return true;
    }

    public void a(biI biI2) {
        this.w.clear();
        if (this.e != null) {
            this.e.a(biI2);
            this.e = null;
        }
        if (this.f != null) {
            this.f.a(biI2);
            this.f = null;
        }
        if (this.g != null) {
            this.g.a(biI2);
            this.g = null;
        }
        if (this.i != null) {
            this.i.a(biI2);
            this.i = null;
        }
        if (this.h != null) {
            this.h.a(biI2);
            this.h = null;
        }
        if (this.j != null) {
            this.j.a(biI2);
            this.j = null;
        }
        if (this.k != null) {
            this.k.a(biI2);
            this.k = null;
        }
        if (this.p != null) {
            this.p.a(biI2);
            this.p = null;
        }
        if (this.m != null) {
            this.m.a(biI2);
            this.m = null;
        }
        if (this.n != null) {
            this.n.a(biI2);
            this.n = null;
        }
        if (this.o != null) {
            this.o.a(biI2);
            this.o = null;
        }
        if (this.u != null) {
            this.u.a(biI2);
            this.u = null;
        }
        if (this.l != null) {
            this.l.a(biI2);
            this.l = null;
        }
    }

    public void b(biI biI2) {
        if (this.e != null && !this.e.b()) {
            bjy_0[] bjy_0Array = (bjy_0[])this.e.c();
            bjy_0Array.a(biI2, false);
        }
        if (this.g != null && !this.g.b()) {
            for (bjy_0 bjy_02 : this.g.a()) {
                bjy_02.a(biI2, false);
            }
        }
        if (this.i != null && !this.i.b()) {
            for (bke_0 bke_02 : this.i) {
                bke_02.a(biI2);
            }
        }
        if (this.h != null && !this.h.b()) {
            this.h.a().a((abz_0)biI2, false);
        }
    }

    public void c(biI biI2) {
        if (this.f != null && !this.f.b()) {
            for (bja_0 bja_02 : this.f) {
                bja_02.a(biI2, false);
            }
        }
    }

    private void a(efh_0 efh_02, float f2) {
        if (this.u == null) {
            this.u = new bjx_0();
        }
        this.u.b(this.d, new bjY(efh_02, f2));
    }

    private void b(efh_0 efh_02, float f2) {
        if (this.u == null) {
            return;
        }
        this.u.c(this.d, new bjY(efh_02, f2));
        if (this.u.b()) {
            this.u = null;
        }
    }

    private void a(efh_0 efh_02, short s2) {
        if (this.v == null) {
            this.v = new bjJ();
        }
        this.v.b(this.d, new bjK(efh_02, s2));
    }

    private void b(efh_0 efh_02, short s2) {
        if (this.v == null) {
            return;
        }
        this.v.c(this.d, new bjK(efh_02, s2));
        if (this.v.b()) {
            this.v = null;
        }
    }

    public void g() {
        this.a(this.n);
        this.a(this.o);
        this.a(this.u);
        this.a(this.v);
    }

    public void h() {
        this.a(this.k);
    }

    private <T extends bjg_0> void a(bjf_0<T> bjf_02) {
        if (bjf_02 == null) {
            return;
        }
        int n = bjf_02.d();
        while (n-- > 0) {
            T t = bjf_02.e();
            bjf_02.a(t, t, this.d);
            bjf_02.b(this.d, t);
        }
    }

    public void d(biI biI2) {
        if (biI2 == null) {
            return;
        }
        this.j(biI2);
        this.h(biI2);
        this.i(biI2);
        this.g(biI2);
        this.f(biI2);
        this.e(biI2);
        this.k(biI2);
    }

    private void k(biI biI2) {
        biS biS2 = biI2.cg();
        if (biS2 == null) {
            return;
        }
        if (this.u != null) {
            if (biS2.u == null) {
                biS2.u = new bjx_0();
            }
            this.u.a(biI2, biS2.u);
        }
    }

    public void e(@NotNull biI biI2) {
        biS biS2 = biI2.cg();
        if (biS2 == null) {
            return;
        }
        if (this.i != null) {
            if (biS2.i == null) {
                biS2.i = new bkd_0();
            }
            this.i.a(biI2, biS2.i);
        }
    }

    public void f(biI biI2) {
        biS biS2 = biI2.cg();
        if (biS2 == null) {
            return;
        }
        if (this.f != null) {
            if (biS2.f == null) {
                biS2.f = new bjz_0();
            }
            this.f.a(biI2, biS2.f);
        }
    }

    public void g(biI biI2) {
        biS biS2 = biI2.cg();
        if (biS2 == null) {
            return;
        }
        if (this.o != null) {
            if (biS2.o == null) {
                biS2.o = new bjN();
            }
            this.o.a(biI2, biS2.o);
        }
    }

    public void h(biI biI2) {
        biS biS2 = biI2.cg();
        if (biS2 == null) {
            return;
        }
        if (this.g != null) {
            if (biS2.g == null) {
                biS2.g = new bjw();
            }
            this.g.a(biI2, biS2.g);
        }
    }

    public void i(biI biI2) {
        biS biS2 = biI2.cg();
        if (biS2 == null) {
            return;
        }
        if (this.h != null) {
            if (biS2.h == null) {
                biS2.h = new bjb_0();
            }
            this.h.a(biI2, biS2.h);
        }
    }

    public void j(biI biI2) {
        biS biS2 = biI2.cg();
        if (biS2 == null) {
            return;
        }
        if (this.n != null) {
            if (biS2.n == null) {
                biS2.n = new bjV();
            }
            this.n.a(biI2, biS2.n, new biV(this));
        }
    }

    private void a(efh_0 efh_02, Rj rj) {
        if (this.t == null) {
            this.t = new bje();
        }
        this.t.b(this.d, new bjf(efh_02, rj.e(), rj.f()));
    }

    private void b(efh_0 efh_02, Rj rj) {
        if (this.t == null) {
            return;
        }
        this.t.c(this.d, new bjf(efh_02, rj.e(), rj.f()));
        if (this.t.b()) {
            this.t = null;
        }
    }

    public void i() {
        if (this.t == null) {
            return;
        }
        this.t.a(this.d);
        for (bjf bjf2 : this.t) {
            bjf2.a(this.d);
        }
    }

    public void j() {
        if (this.t == null) {
            return;
        }
        this.t.a(this.d);
    }

    public boolean k() {
        return this.k != null && !this.k.b();
    }

    public boolean l() {
        return this.p != null && !this.p.b();
    }

    public boolean m() {
        return this.r != null && !this.r.b();
    }

    public boolean n() {
        return this.e != null && !this.e.b();
    }

    public boolean o() {
        return this.u != null && !this.u.b();
    }
}

