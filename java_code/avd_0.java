/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from aVD
 */
public class avd_0
extends aXj {
    private final long a;

    public avd_0(long l) {
        this.a = l;
    }

    @Override
    public boolean a() {
        return this.a > 0L;
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
        pt.a((short)2);
        pt.a(this.a);
        aaw_22.c(pt);
    }
}

