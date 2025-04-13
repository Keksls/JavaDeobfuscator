/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.Collection;

/*
 * Renamed from eGP
 */
public final class egp_0
extends ejh_0 {
    private static final aqr_2 v = new eFw(new eFv("Params", new eFu[0]));

    @Override
    public aqr_2 c_() {
        return v;
    }

    public egp_0() {
        this.M();
    }

    public egp_0 aD() {
        egp_0 egp_02 = new egp_0();
        return egp_02;
    }

    @Override
    public void j(sd_0 sd_02) {
    }

    @Override
    protected void b(sd_0 sd_02, boolean bl) {
        this.ba();
        if (this.g == null) {
            return;
        }
        Collection<sr_0> collection = this.h.g().f();
        epq_2 epq_22 = null;
        if (this.e instanceof epq_2) {
            epq_22 = ((epq_2)this.e).cl();
        }
        if (epq_22 == null) {
            return;
        }
        ArrayList<ekk_0> arrayList = new ArrayList<ekk_0>();
        for (sr_0 sr_02 : collection) {
            if (!sr_02.c(this.g) || sr_02.w() != ele_0.l.a()) continue;
            arrayList.add((ekk_0)sr_02);
        }
        for (ekk_0 ekk_02 : arrayList) {
            ekk_02.a(epq_22);
            ekk_02.a(this, (apq_2)epq_22);
        }
    }

    @Override
    public boolean Q() {
        return true;
    }

    @Override
    public boolean R() {
        return false;
    }

    @Override
    public boolean S() {
        return true;
    }

    @Override
    public void z() {
        super.z();
    }

    @Override
    public /* synthetic */ sd_0 x() {
        return this.aD();
    }
}

