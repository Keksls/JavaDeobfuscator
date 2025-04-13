/*
 * Decompiled with CFR 0.152.
 */
public class aWK
extends aXj {
    private final long a;
    private final String b;

    public aWK(long l) {
        this.a = l;
        this.b = null;
    }

    public aWK(String string) {
        this.b = string;
        this.a = 0L;
    }

    @Override
    public boolean a() {
        return this.a > 0L || this.b != null;
    }

    @Override
    public void b() {
        aaw_2 aaw_22 = azu_0.j().K();
        Pt pt = new Pt();
        if (this.b == null && this.a > 0L) {
            pt.a((byte)3);
            pt.a((short)342);
            pt.a(this.a);
        } else if (this.b != null) {
            pt.a((byte)2);
            pt.a((short)23);
            pt.b((short)342);
            pt.a(this.b);
        }
        aaw_22.c(pt);
    }
}

