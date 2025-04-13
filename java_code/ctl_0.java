/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cTL
 */
public class ctl_0
extends cSS {
    @Override
    public cSS v() {
        return new ctl_0();
    }

    @Override
    public boolean c() {
        if (!(this.l instanceof bnh_1)) {
            return false;
        }
        bnh_1 bnh_12 = (bnh_1)this.l;
        boolean bl = cci_2.a.g();
        if (!bl) {
            return false;
        }
        long l = cci_2.a.d().a();
        long l2 = bnh_12.fc();
        long l3 = azu_0.j().k().fc();
        return l == l3 && l != l2;
    }

    @Override
    public void o() {
        bnh_1 bnh_12 = (bnh_1)this.l;
        cnb_0 cnb_02 = new cnb_0();
        cnb_02.a(bnh_12.a_());
        azu_0.j().K().c(cnb_02);
    }

    @Override
    public cSY n() {
        return cSY.ah;
    }

    @Override
    public String r() {
        return "kick";
    }

    @Override
    protected int t() {
        return cUL.o.aH;
    }
}

