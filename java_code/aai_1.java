/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from aAI
 */
public class aai_1
extends aad_1 {
    private final int k;

    public aai_1(float f2, boolean bl, int n) {
        super(f2, bl);
        this.k = n;
    }

    @Override
    public void e() {
        super.e();
        int n = (int)(0.7 / (double)(this.g * this.g));
        for (int k = 0; k < n; ++k) {
            afq_2 afq_22 = new afq_2(0.0f, 0.0f);
            float f2 = 0.0f;
            int n2 = 1 + this.i.size() * this.k;
            for (int i2 = 0; i2 < n2; ++i2) {
                afq_2 afq_23 = this.b();
                float f3 = this.b(afq_23, 4.0f * this.g);
                if (i2 != 0 && !(f3 > f2)) continue;
                f2 = f3;
                afq_22 = afq_23;
            }
            this.e(afq_22);
        }
    }
}

