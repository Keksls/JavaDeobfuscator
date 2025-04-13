/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from aVJ
 */
public class avj_0
extends aXj {
    private final long a;
    private final boolean b;
    private final int c;

    public avj_0(long l, boolean bl, int n) {
        this.a = l;
        this.b = bl;
        this.c = n;
    }

    @Override
    public boolean a() {
        return this.a > 0L && (!this.b || this.c > 0);
    }

    @Override
    public void b() {
        Pt pt = new Pt();
        pt.a((byte)1);
        pt.a((short)256);
        pt.a(this.a);
        pt.a(this.b);
        pt.a(this.c);
        aaw_2 aaw_22 = azu_0.j().K();
        if (aaw_22 != null) {
            aaw_22.c(pt);
        } else {
            aVo.a().d("Pour acc\u00e9der \u00e0 ces commandes il faut \u00eatre connect\u00e9 !");
        }
    }
}

