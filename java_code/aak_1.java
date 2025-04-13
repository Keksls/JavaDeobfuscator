/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from aAK
 */
public class aak_1
extends aad_1 {
    private final int k;
    private final int l;

    public aak_1(float f2, boolean bl, int n, int n2) {
        super(f2, bl);
        this.k = n;
        this.l = n2;
    }

    @Override
    public void e() {
        int n;
        int n2;
        super.e();
        block0: do {
            if ((n = this.i.size() * this.l) < this.k) {
                n = this.k;
            }
            for (n2 = 0; n2 < n; ++n2) {
                afq_2 afq_22 = this.b();
                this.a(afq_22, 2.0f * this.g);
                if (this.c.size() == 0 && this.e(afq_22)) continue block0;
            }
        } while (n2 != n);
    }
}

