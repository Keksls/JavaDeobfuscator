/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from aXz
 */
public final class axz_0
extends aXj {
    private final long a;
    private final int b;
    private final int c;
    private final boolean d;

    public axz_0(long l, int n, int n2) {
        this(l, n, n2, true);
    }

    public axz_0(long l, int n, int n2, boolean bl) {
        this.a = l;
        this.b = n;
        this.c = n2;
        this.d = bl;
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
        try {
            Pt pt = new Pt();
            pt.a((byte)3);
            pt.a((short)4);
            pt.a(this.a);
            pt.a(this.b);
            pt.a(this.c);
            pt.a(this.d);
            aaw_22.c(pt);
        }
        catch (Exception exception) {
            aVo.a().d("Error trying to play aps : " + exception);
        }
    }
}

