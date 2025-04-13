/*
 * Decompiled with CFR 0.152.
 */
import com.ankamagames.baseImpl.graphics.isometric.particles.FreeParticleSystem;

public class ahB {
    private static final float a = 0.01f;
    private static final float b = 2.1f;
    private final int c;
    private final int d;
    private final int e;
    private int f = Integer.MIN_VALUE;
    private int g = Integer.MIN_VALUE;
    private int h = Integer.MIN_VALUE;
    private boolean i = false;
    private Object j;
    private ahh_0 k;
    private int l;
    private int m;
    private int n;
    private String o;
    private final int p;
    private FreeParticleSystem q = null;
    private int r;
    private int s;
    private boolean t = false;
    private final air_0 u;
    private final air_0 v;
    private final air_0 w;
    private final air_0 x;
    private final air_0 y;
    private final ahD z;
    private ahC A;
    private final boolean B;

    public ahB(ahD ahD2, Object object, int n, int n2, int n3, int n4, boolean bl) {
        this.z = ahD2;
        this.j = object;
        this.B = bl;
        this.w = new air_0();
        this.w.b(2.1f);
        this.w.a(0.01f);
        this.x = new air_0();
        this.x.b(2.1f);
        this.x.a(0.01f);
        this.y = new air_0();
        this.y.b(2.1f);
        this.y.a(0.01f);
        this.u = new air_0();
        this.u.b(2.1f);
        this.u.a(0.01f);
        this.v = new air_0();
        this.v.b(2.1f);
        this.v.a(0.01f);
        this.p = n;
        this.c = n2;
        this.d = n3;
        this.e = n4;
    }

    public void a() {
        this.z.a(this);
    }

    public void a(int n, int n2) {
        this.u.c(n);
        this.v.c(n2);
    }

    public void b(int n, int n2) {
        this.u.e(n);
        this.v.e(n2);
    }

    public int b() {
        return this.r;
    }

    public int c() {
        return this.s;
    }

    public int d() {
        return this.p;
    }

    public String e() {
        return this.o;
    }

    public void a(String string) {
        this.o = string;
    }

    public void a(Object object) {
        this.j = object;
    }

    public Object f() {
        return this.j;
    }

    public void a(boolean bl, boolean bl2) {
        if (this.i && !bl2 && this.t == bl) {
            return;
        }
        this.i = true;
        this.t = bl;
        if (this.t) {
            this.u();
        } else {
            this.v();
        }
    }

    public void a(int n, int n2, int n3) {
        this.w.c(n);
        this.x.c(n2);
        this.y.c(n3);
    }

    public void b(int n, int n2, int n3) {
        this.w.e(n);
        this.x.e(n2);
        this.y.e(n3);
    }

    public boolean g() {
        return this.B;
    }

    public int h() {
        return (int)this.w.b();
    }

    public int i() {
        return (int)this.x.b();
    }

    public int j() {
        return (int)this.y.b();
    }

    public int k() {
        return this.c;
    }

    public int l() {
        return this.d;
    }

    public int m() {
        return this.e;
    }

    public int n() {
        return this.f;
    }

    public int o() {
        return this.g;
    }

    public int p() {
        return this.h;
    }

    public boolean q() {
        return this.f != Integer.MIN_VALUE;
    }

    public void c(int n, int n2, int n3) {
        this.f = n;
        this.g = n2;
        this.h = n3;
    }

    public ahh_0 r() {
        return this.k;
    }

    public void a(ahh_0 ahh_02) {
        if (this.k == ahh_02) {
            return;
        }
        this.k = ahh_02;
        if (this.q != null) {
            this.q.a(ahh_02);
        }
    }

    public void a(int n) {
        this.r = (int)this.u.a(n);
        this.s = (int)this.v.a(n);
        this.l = (int)this.w.a(n);
        this.m = (int)this.x.a(n);
        this.n = (int)this.y.a(n);
        if (this.q != null) {
            this.q.b(this.l, this.m, this.n);
        }
    }

    private void u() {
        if (this.q != null) {
            return;
        }
        this.q = aij_0.a().a(this.p, 0);
        if (this.q != null) {
            if (this.k != null) {
                this.q.a(this.k);
            } else {
                this.q.b(this.l, this.m, this.n);
            }
            aik_0.a().b(this.q);
        }
    }

    private void v() {
        if (this.q == null) {
            return;
        }
        aik_0.a().b(this.q.ac());
        this.q = null;
    }

    private void w() {
        if (this.A != null) {
            ahC ahC2 = this.A;
            this.A = null;
            ahC2.a();
        }
    }

    public ahC s() {
        return this.A;
    }

    public void a(ahC ahC2) {
        this.A = ahC2;
    }

    public void t() {
        this.w();
        this.z.b(this);
        this.k = null;
        this.v();
    }
}

