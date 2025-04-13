/*
 * Decompiled with CFR 0.152.
 */
import com.ankamagames.baseImpl.graphics.alea.display.DisplayedScreenElement;
import java.util.ArrayList;
import java.util.List;

/*
 * Renamed from cTO
 */
public class cto_0
extends cSR
implements afy_0 {
    private static afy_0 a;
    private int m;
    private String n;
    private bFZ o;
    private azj_2 p = azf_2.e;
    private String q = null;

    @Override
    public cSY n() {
        return cSY.v;
    }

    protected Tv a() {
        return this.o.v();
    }

    public void a(azj_2 azj_22) {
        this.p = azj_22;
    }

    @Override
    public void o() {
        bFZ bFZ2;
        if (!this.c()) {
            return;
        }
        bmr_1 bmr_12 = azu_0.j().k();
        if (!cto_0.a(bmr_12)) {
            return;
        }
        biI biI2 = bmr_12.bv();
        if (a != null) {
            biI2.c(a);
        }
        a = this;
        biI2.b(a);
        this.o = bFZ2 = (bFZ)this.l;
        ArrayList<aff_1> arrayList = new ArrayList<aff_1>(bFZ2.aK_());
        for (int k = arrayList.size() - 1; k >= 0; --k) {
            aff_1 aff_12 = (aff_1)arrayList.get(k);
            DisplayedScreenElement displayedScreenElement = acs_0.b().d(aff_12.d(), aff_12.e(), aff_12.f(), acV.c);
            if (displayedScreenElement != null) continue;
            b.error((Object)("walkableElement null sur l'approchPoint=" + aff_12));
        }
        if (!bmr_12.a(false, true, (List<aff_1>)arrayList)) {
            bmr_12.bv().c(a);
            if (!bmr_12.a(false, true)) {
                return;
            }
            this.a(this.a());
        }
    }

    @Override
    public boolean d() {
        return super.d() && ((bFZ)this.l).aF_();
    }

    @Override
    public boolean c() {
        bmr_1 bmr_12 = azu_0.j().k();
        return !bmr_12.ak() && !bvz_2.a.a();
    }

    @Override
    public String q() {
        return this.f();
    }

    String f() {
        ani_2 ani_22 = new ani_2().a().a(this.p.w());
        ani_22.a((CharSequence)bae.h().a(this.r(), new Object[0]));
        ani_22.b();
        if (!this.d()) {
            if (this.q != null && this.q.length() > 0) {
                ani_22.m().a(h).a((CharSequence)this.q);
            }
            if (!((bFZ)this.l).aF_()) {
                ani_22.m().a(h).a((CharSequence)bae.h().a("error.playerNotSubscribed", new Object[0]));
            }
        }
        return ani_22.r();
    }

    @Override
    public String r() {
        return this.n != null ? this.n : "ielt.use";
    }

    @Override
    public cSS v() {
        return new cto_0();
    }

    public void c(String string) {
        this.q = string;
    }

    @Override
    protected int t() {
        return this.m;
    }

    public void a(int n) {
        this.m = n;
    }

    public void d(String string) {
        this.n = string;
    }

    @Override
    public void pathEnded(afe_0 afe_02, int n, int n2, short s2) {
        afe_02.c(a);
        if (this.o.c(afe_02.ap())) {
            bmr_1 bmr_12 = azu_0.j().k();
            if (!bmr_12.a(false, true)) {
                return;
            }
            this.a(this.a());
        }
    }

    @Override
    public List<fde> k() {
        return null;
    }

    @Override
    public List<fde> l() {
        if (cto_0.j() != fbl_0.b) {
            return null;
        }
        bmr_1 bmr_12 = azu_0.j().k();
        feE feE2 = new feE(bmr_12);
        feE2.b(Integer.MAX_VALUE);
        feE2.a(((TH)this.l).a_());
        return feE2.b();
    }
}

