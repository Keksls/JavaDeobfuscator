/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cKM
 */
class ckm_2
extends fjh_2 {
    private ftj_0 o;
    private int p;
    private int q;
    private int r;
    private int s;
    private int t;
    private int u;
    private int v;
    private int w;
    private int x;
    private int y;
    private ftj_0 z;
    private int A;
    private int B;
    private int C;
    private int D;
    private int E;
    private int F;
    private int G;
    private int H;
    private int I;
    private int J;
    private int K;
    private boolean L = true;
    final /* synthetic */ ckf_2 a;

    ckm_2(ckf_2 ckf_22, fjw_2 fjw_22) {
        this.a = ckf_22;
        this.c(0);
        this.b(250);
        this.d(1);
        this.a(fjw_22);
    }

    public void a(ftj_0 ftj_02, int n, int n2, int n3, int n4, int n5, int n6, int n7, int n8, int n9, int n10) {
        this.o = ftj_02;
        this.p = n;
        this.r = n3;
        this.t = n5;
        this.v = n7;
        this.q = n2;
        this.s = n4;
        this.u = n6;
        this.w = n8;
        this.x = n9;
        this.y = n10;
        int n11 = this.a.l.get(this.o);
        this.a.l.put(this.o, n11 + 1);
    }

    public void b(ftj_0 ftj_02, int n, int n2, int n3, int n4, int n5, int n6, int n7, int n8, int n9, int n10) {
        this.z = ftj_02;
        this.A = n;
        this.C = n3;
        this.E = n5;
        this.G = n7;
        this.B = n2;
        this.D = n4;
        this.F = n6;
        this.H = n8;
        this.I = n9;
        this.J = n10;
        int n11 = this.a.l.get(this.z);
        this.a.l.put(this.z, n11 + 1);
    }

    public boolean b() {
        return this.o != null;
    }

    @Override
    public boolean a(int n) {
        if (!super.a(n)) {
            return false;
        }
        if (this.c != null) {
            int n2;
            int n3 = this.a.getAppearance().getContentWidth();
            if (this.L) {
                this.K = this.a.m.getX() - n3;
                this.L = false;
            }
            if (this.d < this.e / 2) {
                n2 = (int)this.c.a(this.p, this.r, this.d, this.e / 2);
                int n4 = (int)this.c.a(this.q, this.s, this.d, this.e / 2);
                this.o.setPosition(n2 + n3, n4);
                if (this.z != null) {
                    int n5 = (int)this.c.a(this.A, this.C, this.d, this.e / 2);
                    int n6 = (int)this.c.a(this.B, this.D, this.d, this.e / 2);
                    this.z.setPosition(n5 + n3, n6);
                }
            } else {
                n2 = (int)this.c.a(this.t, this.v, this.d - this.e / 2, this.e / 2);
                int n7 = (int)this.c.a(this.u, this.w, this.d - this.e / 2, this.e / 2);
                this.o.setPosition(n2 + n3, n7);
                if (this.z != null) {
                    int n8 = (int)this.c.a(this.E, this.G, this.d - this.e / 2, this.e / 2);
                    int n9 = (int)this.c.a(this.F, this.H, this.d - this.e / 2, this.e / 2);
                    this.z.setPosition(n8 + n3, n9);
                }
            }
            n2 = (int)this.c.a(this.K, this.K + 72, this.d, this.e);
            this.a.m.setX(n2 + n3);
        }
        return true;
    }

    @Override
    public void a() {
        int n = this.a.getAppearance().getContentWidth();
        this.o.setPosition(this.v + n, this.w);
        this.o.setSize(this.x, this.y);
        this.a.m.setX(this.K + n);
        int n2 = this.a.l.get(this.o);
        if (n2 == 1) {
            this.a.l.remove(this.o);
            this.o.destroySelfFromParent();
        } else {
            this.a.l.put(this.o, n2 - 1);
        }
        if (this.z != null) {
            this.z.setPosition(this.G + n, this.H);
            this.z.setSize(this.I, this.J);
            n2 = this.a.l.get(this.z);
            if (n2 == 1) {
                this.a.l.remove(this.z);
                this.z.destroySelfFromParent();
            } else {
                this.a.l.put(this.z, n2 - 1);
            }
        }
        super.a();
    }
}

