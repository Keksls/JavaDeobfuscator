/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from aVK
 */
public class avk_0
extends aXj {
    private final long a;
    private long b = Long.MIN_VALUE;
    private final String c;

    public avk_0(long l, long l2, String string) {
        this.a = l;
        this.b = l2;
        this.c = string;
    }

    @Override
    public boolean a() {
        return this.a > 0L && this.c != null && this.b > Long.MIN_VALUE;
    }

    @Override
    public void b() {
        Pt pt = new Pt();
        pt.a((byte)1);
        pt.a((short)444);
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

