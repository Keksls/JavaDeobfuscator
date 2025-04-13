/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bGC
 */
public final class bgc_0
extends bgw_0<bcr_1> {
    public bgc_0(bcr_1 bcr_12) {
        super(bcr_12);
    }

    @Override
    protected void a(oq_0 oq_02) {
        if (oq_02.a() == 2) {
            xg_2 xg_22 = (xg_2)oq_02;
            int n = ((bcr_1)this.a).aq();
            ((bcr_1)this.a).a(xg_22.a.a);
            ((bcr_1)this.a).a(n, ((bcr_1)this.a).aq(), xg_22.a.b);
        }
    }

    @Override
    public boolean n() {
        return ((bcr_1)this.a).aq() == -1;
    }

    @Override
    public ffs at_() {
        return ffs.a;
    }
}

