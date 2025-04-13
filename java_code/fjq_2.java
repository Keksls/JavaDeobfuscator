/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from fJq
 */
public class fjq_2
extends fjh_2 {
    private final int a;
    private final int o;
    private final int p;
    private final int q;

    public fjq_2(int n, int n2, int n3, int n4, fvE fvE2, int n5, int n6, fjw_2 fjw_22) {
        super(null, null, fvE2, n5, n6, fjw_22);
        this.a = n;
        this.o = n2;
        this.p = n3;
        this.q = n4;
    }

    @Override
    public boolean a(int n) {
        if (!super.a(n)) {
            return false;
        }
        if (this.c != null) {
            int n2 = (int)this.c.a(this.a, this.p, this.d, this.e);
            int n3 = (int)this.c.a(this.o, this.q, this.d, this.e);
            this.c().setPosition(n2, n3, true);
        }
        return true;
    }

    @Override
    public void a() {
        this.c().setPosition(this.p, this.q, true);
        super.a();
    }

    public String toString() {
        return "[PositionTween] (" + this.a + ", " + this.o + ") -> (" + this.p + ", " + this.q + ")";
    }
}

