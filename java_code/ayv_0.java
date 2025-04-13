/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from aYV
 */
public class ayv_0
extends aXj {
    public static final byte a = 1;
    public static final byte b = 2;
    public static final byte c = 3;
    private final byte d;
    private final int e;

    public ayv_0(byte by) {
        this.d = by;
        this.e = -1;
    }

    public ayv_0(byte by, int n) {
        this.d = by;
        this.e = n;
    }

    @Override
    public boolean a() {
        return true;
    }

    @Override
    public void b() {
        Pt pt = new Pt();
        pt.a((byte)3);
        pt.a((short)107);
        pt.b(this.d);
        pt.a(this.e);
        aaw_2 aaw_22 = azu_0.j().K();
        if (aaw_22 != null) {
            aaw_22.c(pt);
        } else {
            aVo.a().d("Pour acc\u00e9der \u00e0 ces commandes il faut \u00eatre connect\u00e9 !");
        }
    }
}

