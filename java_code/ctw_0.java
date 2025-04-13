/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cTW
 */
public final class ctw_0
extends cSU {
    @Override
    public cSY n() {
        return cSY.Y;
    }

    @Override
    protected void a() {
        bcr_1 bcr_12 = (bcr_1)this.l;
        cYr.a().a(bcr_12);
    }

    @Override
    public boolean c() {
        if (!(this.l instanceof bcr_1)) {
            return false;
        }
        bFZ bFZ2 = (bFZ)this.l;
        bmr_1 bmr_12 = azu_0.j().k();
        long l = bFZ2.aH_().m();
        if (l == bmr_12.a_()) {
            return true;
        }
        return cSW.a(l);
    }

    @Override
    public String r() {
        return "manageEquipableDummy";
    }

    @Override
    public cSS v() {
        return new ctw_0();
    }

    @Override
    protected int t() {
        return cUL.r.aH;
    }
}

