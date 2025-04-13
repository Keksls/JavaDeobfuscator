/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import com.ankamagames.baseImpl.graphics.isometric.particles.FreeParticleSystem;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.apache.log4j.Logger;

public class dcw
extends cVc {
    private static final Logger j = Logger.getLogger(dcw.class);
    private static final dcw k = new dcw();
    protected final ArrayList<FreeParticleSystem> i = new ArrayList();

    public static dcw n() {
        return k;
    }

    @Override
    protected void a(aff_1 aff_12) {
        this.e.a(aff_12.d(), aff_12.e(), aff_12.f());
    }

    @Override
    protected void e() {
        if (!this.i.isEmpty()) {
            return;
        }
        for (int n : this.u()) {
            FreeParticleSystem freeParticleSystem = aij_0.a().a(n);
            if (freeParticleSystem == null) continue;
            this.i.add(freeParticleSystem);
            freeParticleSystem.a(this.c);
            aik_0.a().b(freeParticleSystem);
        }
    }

    @Override
    public void h() {
        bjc_2 bjc_22 = (bjc_2)this.b.T().p();
        int n = bjc_22.i();
        bNI bNI2 = (bNI)bNJ.a().a(n);
        bua_0.a.a(new but_1(n, bNI2.j()));
        bgg.a.b().b(bjc_22.g());
        aff_1 aff_12 = this.h.d();
        if (this.b(1)) {
            this.a(this.d, true);
        }
        if (this.b(aff_12)) {
            this.d(aff_12);
            this.c(aff_12);
        }
    }

    @Override
    protected void a(int n, int n2) {
        ((bjc_2)this.b.T().p()).a(this.b, n, n2);
    }

    private boolean o() {
        bmr_1 bmr_12 = azu_0.j().k();
        return emj_0.b.a(new emh_0[]{bmr_12});
    }

    @Override
    protected String l() {
        if (this.f()) {
            return "";
        }
        if (this.d == null) {
            return "";
        }
        if (!this.o()) {
            ani_2 ani_22 = new ani_2();
            ani_22.i().a(azf_2.h.w());
            ani_22.a((CharSequence)bae.h().a("error.playerNotSubscribed", new Object[0]));
            ani_22.j();
            return ani_22.r();
        }
        int n = this.e(this.d);
        String string = this.p();
        return n == -1 ? "X" : n + " %" + (string == null ? "" : string);
    }

    private String p() {
        List<fde> list;
        fbl_0 fbl_02 = cSR.j();
        if (fbl_02 == null) {
            return null;
        }
        ani_2 ani_22 = new ani_2();
        boolean bl = this.q();
        if (bl) {
            ani_22.i().a(azf_2.h.w());
            ani_22.a((CharSequence)"\n").a((CharSequence)bae.h().a("desc.mru.illegalAction", new Object[0]));
            ani_22.j();
        }
        List<fde> list2 = this.r();
        if (fbl_02 == fbl_0.b && !list2.isEmpty()) {
            ani_22.m().i().a(azf_2.j.w());
            ani_22.a().a((CharSequence)bae.h().a("nation.law.mru.good", new Object[0])).b();
            ani_22.j();
            cSR.a(ani_22, list2, azf_2.j.w(), bl);
        }
        if (!(list = this.s()).isEmpty()) {
            ani_22.m().i().a(azf_2.h.w());
            ani_22.a().a((CharSequence)bae.h().a("nation.law.mru.bad", new Object[0])).b();
            ani_22.j();
            cSR.a(ani_22, list, azf_2.h.w(), bl);
        }
        return ani_22.q() > 0 ? ani_22.r() : null;
    }

    private boolean q() {
        if (cSR.j() != fbl_0.a) {
            return false;
        }
        List<fde> list = this.s();
        return !list.isEmpty();
    }

    private List<fde> r() {
        return fde.b(this.t());
    }

    private List<fde> s() {
        return fde.c(this.t());
    }

    private List<fde> t() {
        bjc_2 bjc_22 = (bjc_2)this.b.T().p();
        int n = bjc_22.i();
        bNI bNI2 = (bNI)bNJ.a().a(n);
        if (bNI2 == null) {
            return Collections.emptyList();
        }
        bMn bMn2 = bwy_2.h().j();
        if (bMn2 == null) {
            return Collections.emptyList();
        }
        faX faX2 = bMn2.D();
        if (faX2 == faX.i) {
            return Collections.emptyList();
        }
        bmr_1 bmr_12 = azu_0.j().k();
        ArrayList<bRz> arrayList = new ArrayList<bRz>();
        if (bNI2 instanceof bNF) {
            for (int n2 : ((bNF)bNI2).b()) {
                arrayList.add(bRC.c().a(n2));
            }
        } else {
            arrayList.add(bRD.c().a(bNI2.j()));
        }
        Object object = new ArrayList();
        for (bRz bRz2 : arrayList) {
            if (bRz2 == null || !bRz2.c() || bRz2.e()) continue;
            fec_0 fec_02 = new fec_0(bmr_12);
            int n3 = bRz2.f();
            if (n3 == 0) continue;
            fed_0 fed_02 = n3 < 0 ? fed_0.b : fed_0.a;
            fec_02.a(fed_02);
            ((ArrayList)object).addAll(fec_02.b());
        }
        return object;
    }

    private List<Integer> u() {
        if (this.q()) {
            return Collections.singletonList(800127);
        }
        List<fde> list = this.t();
        if (!list.isEmpty()) {
            int n = list.get(0).b() > 0 ? 800191 : 800192;
            return Collections.singletonList(n);
        }
        return Collections.emptyList();
    }

    @Override
    protected int e(aff_1 aff_12) {
        epj_1 epj_12;
        if (this.b == null) {
            return -1;
        }
        bNK bNK2 = bNT.f().c(aff_12.d(), aff_12.e());
        if (bNK2 != null) {
            return -1;
        }
        aoc_0 aoc_02 = (aoc_0)aew_0.a().a(aff_12.d(), aff_12.e());
        if (aoc_02 == null) {
            return -1;
        }
        short s2 = aoc_02.d(aff_12.d(), aff_12.e(), aff_12.f());
        if (s2 == 0) {
            return -1;
        }
        if (yz_0.g(aff_12.d(), aff_12.e(), aff_12.f())) {
            return -1;
        }
        bmr_1 bmr_12 = azu_0.j().k();
        if (!this.o()) {
            return -1;
        }
        bsx_2 bsx_22 = bmr_12.di();
        if (bsx_22 != null && !bsx_22.a(bmr_12, aff_12.d(), aff_12.e())) {
            return -1;
        }
        bjc_2 bjc_22 = (bjc_2)this.b.T().p();
        int n = bjc_22.i();
        bNI bNI2 = (bNI)bNJ.a().a(n);
        if (bNI2 == null) {
            return -1;
        }
        if (bNI2 instanceof bNF) {
            if (yz_0.f(aff_12.d(), aff_12.e(), aff_12.f())) {
                return -1;
            }
            if (!this.a((bNF)bNI2)) {
                return -1;
            }
        }
        if ((epj_12 = epi_1.a().a(s2)) == null) {
            return -1;
        }
        brf_0 brf_02 = brh_0.a().g().a();
        double d2 = fhq_0.b(bmr_12, bNI2, epj_12, brf_02 == null ? Yf.a : brf_02.k(), bjc_22.g());
        return (int)(d2 <= 0.0 ? -1L : Math.round(d2 * 100.0));
    }

    private boolean a(bNF bNF2) {
        if (cci_2.a.g()) {
            return true;
        }
        for (int n : bNF2.b()) {
            if (bRC.c().a(n) != null) continue;
            return false;
        }
        return true;
    }

    @Override
    protected void m() {
        for (FreeParticleSystem freeParticleSystem : this.i) {
            freeParticleSystem.aa();
        }
        this.i.clear();
    }
}

