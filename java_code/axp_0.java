/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from aXp
 */
public class axp_0
extends aXj {
    public static final int a = 0;
    public static final int b = 1;
    public static final int c = 2;
    private final int d;
    private final long e;
    private final int f;
    private final flt_0 g;

    public axp_0(int n) {
        this(n, -1L, -1, "");
    }

    public axp_0(int n, long l, int n2, String string) {
        this.d = n;
        this.e = l;
        this.f = n2;
        this.g = "HIDDEN".equals(string) ? flt_0.b : flt_0.a;
    }

    @Override
    public boolean a() {
        switch (this.d) {
            case 0: {
                return this.e > 0L && this.f > 0;
            }
            case 1: {
                return this.e > 0L && this.f == -1;
            }
            case 2: {
                return this.e == -1L && this.f == -1;
            }
        }
        return false;
    }

    @Override
    public void b() {
        aaw_2 aaw_22 = azu_0.j().K();
        if (aaw_22 == null) {
            aVo.a().d("Pour acc\u00e9der \u00e0 ces commandes il faut \u00eatre connect\u00e9 !");
            return;
        }
        Pt pt = new Pt();
        pt.a((byte)2);
        pt.a((short)150);
        pt.a(this.e);
        pt.a(this.f);
        pt.a(this.g.a());
        aaw_22.c(pt);
    }
}

