/*
 * Decompiled with CFR 0.152.
 */
import java.util.Collection;
import java.util.HashSet;

public final class eHH
extends ejh_0 {
    private static final aqr_2 v = new eFw(new eFv("Id de la Zone a retirer", new eFu("Id", eFx.b)));

    @Override
    public aqr_2 c_() {
        return v;
    }

    public eHH() {
        this.M();
    }

    public eHH aD() {
        return new eHH();
    }

    @Override
    public void j(sd_0 sd_02) {
        if (this.c == null) {
            return;
        }
        if (((efh_0)this.c).F() < 1) {
            return;
        }
        this.m = ((efh_0)this.c).a(0, this.aZ(), eFb.a);
    }

    @Override
    protected void b(sd_0 sd_02, boolean bl) {
        if (!this.D()) {
            return;
        }
        if (this.h == null) {
            return;
        }
        ss_0 ss_02 = this.h.g();
        Collection<sr_0> collection = ss_02.f();
        HashSet<sr_0> hashSet = new HashSet<sr_0>();
        for (sr_0 sr_02 : collection) {
            if (sr_02.A() != (long)this.m) continue;
            hashSet.add(sr_02);
        }
        for (sr_0 sr_02 : hashSet) {
            ss_02.a(sr_02, this.e);
        }
    }

    @Override
    public boolean Q() {
        return false;
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

