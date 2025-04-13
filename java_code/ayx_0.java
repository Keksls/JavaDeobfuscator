/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from aYx
 */
public class ayx_0
extends aXj {
    private final int a;
    private final short b;

    public ayx_0(int n, short s2) {
        this.a = n;
        this.b = s2;
    }

    @Override
    public boolean a() {
        return true;
    }

    @Override
    public void b() {
        Pt pt = new Pt();
        pt.a((byte)3);
        pt.a((short)190);
        pt.a(this.a);
        pt.b(this.b);
        aaw_2 aaw_22 = azu_0.j().K();
        if (aaw_22 != null) {
            aaw_22.c(pt);
        } else {
            aVo.a().d("Pour acc\u00e9der \u00e0 ces commandes il faut \u00eatre connect\u00e9 !");
        }
    }
}

