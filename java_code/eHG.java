/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class eHG
extends eHV {
    private static final aqr_2 C = new eFw(new eFv("groupe d'effets standard", new eFu("nb d'effets \u00e0 executer", eFx.b)), new eFv("groupe d'effets cibl\u00e9", new eFu("nb d'effets \u00e0 executer", eFx.b), new eFu("0 = cellule, 1 = cibles (default)", eFx.c)), new eFv("Gestion de la tansmission de la cible originale", new eFu("nb d'effets \u00e0 executer", eFx.b), new eFu("0 = cellule, 1 = cibles (default)", eFx.c), new eFu("Transmission de la cible originale aux effets du groupe : oui = 1 (d\u00e9faut), non = 0 ", eFx.c)));
    protected int v = -1;

    public eHG aD() {
        eHG eHG2 = new eHG();
        this.a(eHG2);
        return eHG2;
    }

    @Override
    protected void a(eHG eHG2) {
        eHG2.v = this.v;
        eHG2.A = this.A;
        eHG2.B = null;
    }

    @Override
    protected void b(sd_0 sd_02, boolean bl) {
        this.ba();
        if (!this.D()) {
            return;
        }
        if (this.B == null) {
            a.error((Object)("Groupe d'effets inexistant " + this.o()));
            return;
        }
        List<efh_0> list = this.aM();
        efn_0 efn_02 = efn_0.a(true, false, (ejh_0)sd_02);
        if (this.a(eff_0.o) && efn_02.g() == -1) {
            efn_02.a(this.aZ());
        }
        for (efh_0 efh_02 : list) {
            if (this.R()) {
                efh_02.a((Sm)this.k(), this.h(), this.m(), efc_0.a(), this.f.G(), this.f.H(), this.f.I(), this.A ? this.f : null, efn_02, false);
                continue;
            }
            if (this.c == null || ((efh_0)this.c).u() == null) {
                return;
            }
            this.a(efn_02, efh_02);
        }
    }

    private void a(efn_0 efn_02, efh_0 efh_02) {
        tg_0 tg_02 = this.h.e();
        if (tg_02 == null) {
            a.warn((Object)("pas de fightmap sur le context " + this.h));
            return;
        }
        aff_1 aff_12 = new aff_1(this.j());
        aqd_1 aqd_12 = ((efh_0)this.c).u();
        Iterable<int[]> iterable = aqd_12.a(this.g.d(), this.g.e(), this.g.f(), this.e.G(), this.e.H(), this.e.I(), this.e.F());
        for (int[] nArray : iterable) {
            short s2;
            aff_12.b(nArray[0]);
            aff_12.c(nArray[1]);
            if (!tg_02.c(aff_12.d(), aff_12.e()) || (s2 = tg_02.i(aff_12.d(), aff_12.e())) == Short.MIN_VALUE) continue;
            aff_12.a(s2);
            if (!tg_02.o(aff_12.d(), aff_12.e())) continue;
            efh_02.a((Sm)this.k(), this.h(), this.m(), efc_0.a(), aff_12.d(), aff_12.e(), aff_12.f(), null, efn_02, false);
        }
    }

    private boolean a(efh_0 efh_02) {
        if (efh_02.O() > this.aZ()) {
            return false;
        }
        if (efh_02.P() < this.aZ()) {
            return false;
        }
        apc_2 apc_22 = efh_02.Q();
        return apc_22 == null || apc_22.b(this.e, this.R() ? this.f : this.g, null, this.h);
    }

    private List<efh_0> aM() {
        Object object22;
        ArrayList<Object> arrayList = new ArrayList<Object>();
        for (Object object22 : this.B) {
            if (!this.a((efh_0)object22)) continue;
            arrayList.add(object22);
        }
        object22 = new ArrayList();
        Iterator<efh_0> iterator = arrayList.iterator();
        int n = 0;
        while (iterator.hasNext()) {
            efh_0 efh_02 = iterator.next();
            n = (int)((float)n + efh_02.b(this.aZ()));
        }
        block2: for (int k = 0; k < this.v; ++k) {
            int n2 = 0;
            int n3 = Hw.a(n);
            for (efh_0 efh_03 : arrayList) {
                if (object22.contains(efh_03) || (n2 = (int)((float)n2 + efh_03.b(this.aZ()))) < n3) continue;
                object22.add(efh_03);
                n = (int)((float)n - efh_03.b(this.aZ()));
                continue block2;
            }
        }
        return object22;
    }

    @Override
    public void j(sd_0 sd_02) {
        short s2 = this.aZ();
        fil_0 fil_02 = fim_0.a().a(((efh_0)this.c).i());
        if (fil_02 != null) {
            this.B = fil_02.b(s2);
        }
        this.v = ((efh_0)this.c).a(0, s2, eFb.a);
        if (((efh_0)this.c).F() >= 3) {
            this.A = ((efh_0)this.c).a(2, s2, eFb.a) == 1;
        }
    }

    @Override
    public aqr_2 c_() {
        return C;
    }

    @Override
    public boolean R() {
        if (this.c != null && ((efh_0)this.c).F() >= 2) {
            return ((efh_0)this.c).a(1) == 1.0f;
        }
        return true;
    }

    @Override
    public boolean S() {
        if (this.c != null && ((efh_0)this.c).F() >= 2) {
            return ((efh_0)this.c).a(1) == 0.0f;
        }
        return false;
    }

    @Override
    public void z() {
        this.B = null;
        this.v = -1;
        this.A = false;
        super.z();
    }

    @Override
    public /* synthetic */ eHV aE() {
        return this.aD();
    }

    @Override
    public /* synthetic */ sd_0 x() {
        return this.aD();
    }
}

