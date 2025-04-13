/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from aXS
 */
public final class axs_0
extends aXj {
    public static final int a = 1;
    public static final int b = 2;
    private final long c;
    private final int d;

    public axs_0(int n, long l) {
        this.d = n;
        this.c = l;
    }

    @Override
    public boolean a() {
        return true;
    }

    @Override
    public void b() {
        aaw_2 aaw_22 = azu_0.j().K();
        if (aaw_22 == null) {
            aVo.a().d("Pour acc\u00e9der \u00e0 ces commandes il faut \u00eatre connect\u00e9!");
            return;
        }
        Pt pt = new Pt();
        pt.a((byte)2);
        pt.a(this.d == 1 ? (short)284 : 396);
        pt.a(this.c);
        aaw_22.c(pt);
    }
}

