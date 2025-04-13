/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from aYS
 */
public class ays_0
extends aXj {
    private final byte a;
    private final long b;

    public ays_0(byte by) {
        this(by, -1L);
    }

    public ays_0(byte by, long l) {
        this.a = by;
        this.b = l;
    }

    @Override
    public boolean a() {
        return this.a == 2 || (this.a == 0 || this.a == 1) && this.b > 0L;
    }

    @Override
    public void b() {
        aaw_2 aaw_22 = azu_0.j().K();
        if (aaw_22 == null) {
            aVo.a().d("You must be connected to use this command");
            return;
        }
        Pt pt = new Pt();
        pt.a(this.b);
        pt.b(this.a);
        pt.a((short)251);
        pt.a((byte)2);
        aaw_22.c(pt);
    }
}

