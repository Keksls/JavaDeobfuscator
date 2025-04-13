/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from aVG
 */
public final class avg_0
extends aXj {
    private final int a;

    public avg_0(int n) {
        this.a = n;
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
        pt.a((short)194);
        pt.a(this.a);
        aaw_22.c(pt);
    }
}

