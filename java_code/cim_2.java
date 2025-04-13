/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.map.hash.TLongObjectHashMap
 *  gnu.trove.procedure.TLongObjectProcedure
 *  gnu.trove.procedure.TObjectProcedure
 *  gnu.trove.set.hash.THashSet
 *  org.apache.log4j.Logger
 */
import gnu.trove.map.hash.TLongObjectHashMap;
import gnu.trove.procedure.TLongObjectProcedure;
import gnu.trove.procedure.TObjectProcedure;
import gnu.trove.set.hash.THashSet;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.apache.log4j.Logger;

/*
 * Renamed from cim
 */
final class cim_2
extends chd_1<ctf_1, bvx_2> {
    private static final Logger b = Logger.getLogger(cim_2.class);

    cim_2() {
    }

    @Override
    public boolean a(ctf_1 ctf_12) {
        byte by = ctf_12.c();
        this.b(ctf_12);
        this.a(by);
        bww_0.a((bvx_2)this.a);
        this.b(ctf_12.i());
        this.a(ctf_12.j());
        this.a(ctf_12.g());
        this.a(ctf_12, by);
        this.b();
        this.e();
        this.f();
        this.d();
        this.c();
        apw_0.a().a(azu_0.j().k().a_());
        return false;
    }

    private void b() {
        for (blx_1 blx_12 : ((bvx_2)this.a).j()) {
            qj_1 qj_12 = blx_12.cr().h();
            if (!(blx_12.fC() instanceof bOI) || qj_12 == null) continue;
            bOI bOI2 = (bOI)blx_12.fC();
            if (qj_12.i.a.g != null) {
                bOI2.a((epq_2)blx_12, qj_12.i.a.g.a.e);
            }
            if (!blx_12.E() || !blx_12.P()) continue;
            blx_12.aQ();
        }
    }

    private void c() {
        if (((bvx_2)this.a).e() == elp_0.c) {
            cdw_0.n().b((bvx_2)this.a);
        }
    }

    private void d() {
        Collection<sr_0> collection = ((bvx_2)this.a).i().f();
        for (sr_0 sr_02 : collection) {
            Su su;
            bgk_2 bgk_22;
            if (!(sr_02 instanceof bgk_2) || (bgk_22 = (bgk_2)sr_02).v() != null || (su = ((bvx_2)this.a).f_(bgk_22.as())) == null) continue;
            bgk_22.d(su);
            bgk_22.ar();
        }
    }

    private void e() {
        long l = ((bvx_2)this.a).r();
        Collection collection = ((bvx_2)this.a).j();
        for (blx_1 blx_12 : collection) {
            eJL eJL2;
            if (blx_12.a_() == l) {
                cZa.a(blx_12);
                continue;
            }
            if (!blx_12.bp()) continue;
            if (blx_12 instanceof bmv_1) {
                blx_1.k(blx_12);
            }
            if ((eJL2 = blx_12.dR()) == null) {
                b.error((Object)String.format("Unable to retrieve %s for fighter (id:%s, breedId:%s, instanceId:%s)", eJL.class, blx_12.a_(), blx_12.gO(), blx_12.T_()));
                continue;
            }
            List<sd_0> list = eJL2.b(efc_0.ei.a());
            for (sd_0 sd_02 : list) {
                if (!(sd_02 instanceof eGf) || !sd_02.ab()) continue;
                eGf eGf2 = (eGf)sd_02;
                eGf2.aD();
            }
        }
    }

    @Override
    private void a(byte[] byArray) {
        enm_0 enm_02 = ((bvx_2)this.a).aA();
        TLongObjectHashMap<enr_0> tLongObjectHashMap = ent_1.a(byArray);
        tLongObjectHashMap.forEachEntry((TLongObjectProcedure)new cin_2(this, enm_02));
    }

    private void b(byte[] byArray) {
        Wk.a(byArray, ((bvx_2)this.a).A().a(((bvx_2)this.a).h()), ((bvx_2)this.a).A().y());
    }

    @Override
    private void a(THashSet<enu_1> tHashSet) {
        tHashSet.forEach((TObjectProcedure)new cio_2(this));
    }

    @Override
    boolean a(enu_1 enu_12) {
        blx_1 blx_12 = (blx_1)((bvx_2)this.a).n(enu_12.a());
        Object object = ((bvx_2)this.a).n(enu_12.b());
        if (object == null) {
            object = ((bvx_2)this.a).i().b(enu_12.b());
        }
        if (blx_12 == null || object == null) {
            b.error((Object)("Impossible de recr\u00e9er le port\u00e9 pour " + blx_12 + " et " + object));
            return true;
        }
        efh_0 efh_02 = bgh_0.a().d(enu_12.c());
        if (efh_02 == null) {
            b.error((Object)("Impossible de recr\u00e9er le port\u00e9 pour " + blx_12 + " et " + object + ", l'effet est inconnu " + enu_12.c()));
            return true;
        }
        sd_0 sd_02 = this.a(blx_12, (Su)object, efh_02);
        bbN bbN2 = this.a(blx_12, efh_02, (ejh_0)sd_02);
        this.a(bbN2);
        return true;
    }

    @Override
    private void a(bbN bbN2) {
        bbN2.v();
        bbN2.l();
    }

    private bbN a(blx_1 blx_12, efh_0 efh_02, ejh_0 ejh_02) {
        bbN bbN2 = new bbN(0, 0, 0, ((bvx_2)this.a).c(), ejh_02, false);
        bbN2.b(blx_12.a_());
        bbN2.b(true);
        bbN2.c(ejh_02.i().a_());
        bbN2.e(efh_02.W());
        return bbN2;
    }

    private sd_0 a(blx_1 blx_12, Su su, efh_0 efh_02) {
        ejh_0 ejh_02 = (ejh_0)efc_0.a().b(efh_02.j());
        sd_0 sd_02 = ejh_02.a(((bvx_2)this.a).h(), bgh_0.a());
        sd_02.a(efh_02);
        sd_02.b(su);
        sd_02.a(blx_12);
        return sd_02;
    }

    private void f() {
        Collection collection = ((bvx_2)this.a).j();
        for (blx_1 blx_12 : collection) {
            cyp_0.a(blx_12, cyp_0.c());
        }
    }

    @Override
    private void a(byte by) {
        ((bvx_2)this.a).a(elp_0.a(by));
    }

    private void b(ctf_1 ctf_12) {
        ((bvx_2)this.a).A().a().a(ctf_12.b());
    }

    private void a(ctf_1 ctf_12, byte by) {
        ArrayList<ahr_1> arrayList = bwp_1.b();
        for (ahr_1 ahr_12 : arrayList) {
            azu_0.j().a(ahr_12);
        }
        if (by == elp_0.c.a()) {
            this.d(ctf_12);
            this.c(ctf_12);
        }
    }

    private void c(ctf_1 ctf_12) {
        long l = wc_0.p().s() - ctf_12.f();
        int n = Hw.d((float)l / 1000.0f);
        int n2 = ctf_12.e() - n;
        ((bvx_2)this.a).f(n2);
    }

    private void d(ctf_1 ctf_12) {
        bxo_2 bxo_22 = ((bvx_2)this.a).A();
        blx_1 blx_12 = bxo_22.H();
        if (blx_12 == null) {
            return;
        }
        bmr_1 bmr_12 = azu_0.j().k();
        boolean bl = bvx_2.a(blx_12, bmr_12);
        if (bl && !azu_0.j().c(cZa.a())) {
            azu_0.j().a(cZa.a());
            ((bvx_2)this.a).g(blx_12.a_());
        }
    }
}

