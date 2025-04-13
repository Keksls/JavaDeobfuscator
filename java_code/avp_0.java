/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from aVP
 */
public class avp_0
extends aXj {
    private final Short a;
    private final byte b;
    private final int c;

    public avp_0() {
        this((short)-1);
    }

    public avp_0(Short s2) {
        this.a = s2;
        this.b = (byte)-1;
        this.c = -1;
    }

    public avp_0(Short s2, byte by) {
        this.b = by;
        this.a = s2;
        this.c = -1;
    }

    public avp_0(Short s2, int n) {
        this.a = s2;
        this.c = n;
        this.b = (byte)-1;
    }

    @Override
    public boolean a() {
        return true;
    }

    @Override
    public void b() {
        aaw_2 aaw_22 = azu_0.j().K();
        if (aaw_22 == null) {
            aVo.a().d("Pour acc\u00e9der \u00e0 ces commandes il faut \u00eatre connect\u00e9 !");
            return;
        }
        Pt pt = new Pt();
        pt.a((byte)3);
        pt.a((short)162);
        pt.b(this.a);
        pt.b(this.b);
        pt.a(this.c);
        aaw_22.c(pt);
        bmr_1 bmr_12 = azu_0.j().k();
        fis_1.a().a((ajf_1)bmr_12, bmr_12.d());
    }
}

