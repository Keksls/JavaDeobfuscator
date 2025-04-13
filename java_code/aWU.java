/*
 * Decompiled with CFR 0.152.
 */
public class aWU
extends aXj {
    private final long a;
    private final boolean b;

    public aWU() {
        bmr_1 bmr_12 = azu_0.j().k();
        this.a = bmr_12 != null ? bmr_12.T_() : -1L;
        this.b = false;
    }

    public aWU(long l, boolean bl) {
        this.a = l;
        this.b = bl;
    }

    @Override
    public boolean a() {
        return this.a >= 0L;
    }

    @Override
    public void b() {
        Pt pt = new Pt();
        pt.a((byte)3);
        pt.a((short)31);
        pt.a(this.a);
        pt.a(this.b);
        aaw_2 aaw_22 = azu_0.j().K();
        if (aaw_22 != null) {
            aaw_22.c(pt);
        } else {
            aVo.a().d("Pour acc\u00e9der \u00e0 ces commandes il faut \u00eatre connect\u00e9 !");
        }
    }
}

