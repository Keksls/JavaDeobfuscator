/*
 * Decompiled with CFR 0.152.
 */
public class bbs
extends alb_2 {
    private final bmv_1 m;
    private final bnh_1 n;

    public bbs(int n, int n2, int n3, int n4, bmv_1 bmv_12, bnh_1 bnh_12) {
        super(n, n2, n3);
        this.m = bmv_12;
        this.n = bnh_12;
        this.a(new byn_0(this));
        this.e(n4);
    }

    public bmv_1 r() {
        return this.m;
    }

    public bnh_1 s() {
        return this.n;
    }

    @Override
    public long o() {
        long l = super.o();
        if (l != -1L || this.g) {
            this.j();
            this.g = false;
        }
        return -1L;
    }
}

