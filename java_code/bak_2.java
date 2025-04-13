/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;

/*
 * Renamed from bAk
 */
public class bak_2
extends bac_2 {
    private List<enj_1> m = null;
    private final aff_1 n = new aff_1();

    public void a(bvx_2 bvx_22, byte by, List<enj_1> list) {
        this.a(bvx_22, by);
        this.m = list;
        this.b(99.0f);
        this.a(99.0f);
    }

    @Override
    public void h() {
        this.m = null;
    }

    @Override
    protected boolean a(int n, int n2, short s2, int n3, int n4, short s3) {
        this.n.c(n, n2, s2);
        return !enj_1.a(this.n, this.m) || super.a(n, n2, s2, n3, n4, s3);
    }
}

