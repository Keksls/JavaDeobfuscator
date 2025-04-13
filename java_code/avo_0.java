/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from aVO
 */
public class avo_0
extends aXj {
    public static final byte a = 1;
    private final byte b;
    private final long c;

    public avo_0(byte by, long l) {
        this.b = by;
        this.c = l;
    }

    @Override
    public boolean a() {
        return true;
    }

    @Override
    public void b() {
        aaw_2 aaw_22 = azu_0.j().K();
        Pt pt = new Pt();
        pt.a((byte)1);
        pt.a((short)5);
        pt.b(this.b);
        pt.a(this.c);
        aaw_22.c(pt);
    }
}

