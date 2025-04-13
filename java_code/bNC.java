/*
 * Decompiled with CFR 0.152.
 */
public class bNC
implements adv_1 {
    private int a;

    @Override
    public boolean a(adt_1 adt_12) {
        bmr_1 bmr_12;
        abz_0 abz_02;
        if (adt_12.a() == Integer.MIN_VALUE && (abz_02 = (bmr_12 = azu_0.j().k()).bB()) != null) {
            cln_0 cln_02 = new cln_0(this.a, abz_02.G(), abz_02.H(), 0L);
            azu_0.j().K().c(cln_02);
        }
        return false;
    }

    @Override
    public long a_() {
        return 1L;
    }

    @Override
    public void a(long l) {
    }

    public void a(int n) {
        this.a = n;
    }
}

