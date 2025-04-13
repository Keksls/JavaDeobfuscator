/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;

/*
 * Renamed from eHd
 */
public final class ehd_0
extends ejh_0 {
    private static final aqr_2 v = new eFw(new eFv("Default", new eFu[0]), new eFv("Annulation de l'effet \u00e0 rediriger", new eFu("Annulation de l'effet d\u00e9clencheur (1=oui, 0=non)", eFx.b)), new eFv("Modificateur de la valeur recalcul\u00e9e en %", new eFu("Annulation de l'effet d\u00e9clencheur (1=oui, 0=non)", eFx.b), new eFu("Modificateur de la valeur recalcul\u00e9e en %", eFx.b)), new eFv("Ex\u00e9cute sur les cibles", new eFu("Annulation de l'effet d\u00e9clencheur (1=oui, 0=non)", eFx.b), new eFu("Modificateur de la valeur recalcul\u00e9e en %", eFx.b), new eFu("Ex\u00e9cute sur les cibles dans l'aoe (pas sur les cellules) (1=oui, 0=non (d\u00e9faut))", eFx.b)));
    private boolean w;
    private boolean x;

    @Override
    public aqr_2 c_() {
        return v;
    }

    public ehd_0() {
        this.M();
    }

    public ehd_0 aD() {
        ehd_0 ehd_02 = new ehd_0();
        ehd_02.w = this.w;
        return ehd_02;
    }

    @Override
    public void j(sd_0 sd_02) {
        this.w = false;
        this.m = 100;
        if (this.c == null) {
            return;
        }
        if (((efh_0)this.c).F() >= 1) {
            boolean bl = this.w = ((efh_0)this.c).a(0, this.aZ(), eFb.a) == 1;
        }
        if (((efh_0)this.c).F() >= 2) {
            this.m = ((efh_0)this.c).a(1, this.aZ(), eFb.a);
        }
        if (((efh_0)this.c).F() >= 3) {
            this.x = ((efh_0)this.c).a(2, this.aZ(), eFb.a) == 1;
        }
    }

    @Override
    protected void b(sd_0 sd_02, boolean bl) {
        this.ba();
        sd_0 sd_03 = this.m(sd_02);
        if (sd_03 == null) {
            a.error((Object)("On ne peut pas executer un " + this.getClass().getSimpleName() + " sans effet declencheur, id = " + this.o()));
            return;
        }
        this.a((ejh_0)sd_03);
        if (this.w) {
            efn_0 efn_02 = (efn_0)sd_03.l();
            if (efn_02 == null) {
                efn_02 = efn_0.a(false, false, null);
                sd_03.a(efn_02);
            }
            efn_02.i();
        }
    }

    @Override
    private void a(ejh_0 ejh_02) {
        if (this.c == null || ((efh_0)this.c).u() == null) {
            return;
        }
        Object FX = ejh_02.f();
        if (FX == null) {
            return;
        }
        aqd_1 aqd_12 = ((efh_0)this.c).u();
        Iterable<Su> iterable = apr_2.a().a(this.f, this.h.c(), aqd_12, this.g.d(), this.g.e(), this.g.f());
        if (this.x) {
            for (Su su : iterable) {
                FX.a((Sm)this.k(), this.h(), this.m(), efc_0.a(), su.G(), su.H(), su.I(), su, this.a(ejh_02, false), false);
            }
        } else {
            ArrayList<aff_1> arrayList = new ArrayList<aff_1>();
            for (Su object : iterable) {
                aff_1 aff_12 = object.P_();
                if (arrayList.contains(aff_12)) continue;
                arrayList.add(aff_12);
            }
            for (aff_1 aff_13 : arrayList) {
                FX.a((Sm)this.k(), this.h(), this.m(), efc_0.a(), aff_13.d(), aff_13.e(), aff_13.f(), null, this.a(ejh_02, false), false);
            }
        }
    }

    private efn_0 a(ejh_0 ejh_02, boolean bl) {
        efn_0 efn_02 = efn_0.a(bl, false, ejh_02);
        efn_02.a(ejh_02.aZ());
        efn_02.a(this.m, efo_0.c);
        efn_02.a(false);
        return efn_02;
    }

    @Override
    public boolean Q() {
        return false;
    }

    @Override
    public boolean R() {
        return true;
    }

    @Override
    public boolean S() {
        return false;
    }

    @Override
    public void z() {
        super.z();
        this.w = false;
        this.x = false;
    }

    @Override
    public /* synthetic */ sd_0 x() {
        return this.aD();
    }
}

