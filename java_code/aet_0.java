/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.NotNull
 */
import org.apache.log4j.Logger;
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from aeT
 */
public class aet_0
extends aen_0 {
    private static final Logger l = Logger.getLogger(aet_0.class);
    private static final int m = 255;
    private static final int n = 255;
    private static final int o = 4;
    private static final byte p = 3;
    public static final int d = 255;
    public static final int e = (int)Math.ceil(81.0);
    public static final int f = 0;
    public static final int g = -1;
    private afc[] q = null;
    private aeu_0[] r = null;
    private static final aeu_0[] s = new aeu_0[0];
    private afo[] t = null;
    private afs[] u = null;
    int[] h;
    byte[] i;
    boolean j;

    public aet_0() {
    }

    public aet_0(short s2, short s3) {
        super(s2, s3);
    }

    public byte d() {
        return 0;
    }

    public afo[] e() {
        return this.t;
    }

    public afs[] f() {
        return this.u;
    }

    public int[] g() {
        return this.h;
    }

    public int b(int n, int n2) {
        if (this.h == null) {
            return -1;
        }
        if (this.i == null) {
            return this.h[0];
        }
        n2 -= this.b * 18;
        assert ((n -= this.a * 18) >= 0 && n < 18);
        assert (n2 >= 0 && n2 < 18);
        int n3 = n + n2 * 18;
        int n4 = this.i[n3 / 4] >>> n3 % 4 * 2;
        return this.h[n4 & 3];
    }

    public afc[] h() {
        return this.q;
    }

    public aeu_0[] i() {
        return this.r;
    }

    public void a(afs[] afsArray) {
        this.u = afsArray;
    }

    public void a(afo[] afoArray) {
        this.t = afoArray;
    }

    public void a(int[] nArray) {
        this.h = nArray;
        assert (this.h.length <= 4) : "Trop d'ambiance diff\u00e9rentes";
        if (this.h.length >= 1) {
            this.i = new byte[e];
        }
    }

    public void a(int n, int n2, int n3) {
        assert (n >= 0 && n < 18);
        assert (n2 >= 0 && n2 < 18);
        assert (this.i != null) : "Il faut d'abord appeler setAmbiancesId";
        assert (n3 < this.h.length);
        int n4 = n + n2 * 18;
        int n5 = n4 / 4;
        this.i[n5] = (byte)(this.i[n5] | n3 << n4 % 4 * 2);
    }

    public void a(afc[] afcArray) {
        this.q = afcArray;
    }

    public void a(aeu_0[] aeu_0Array) {
        this.r = aeu_0Array;
    }

    @Override
    public void c() {
        this.t = null;
        this.u = null;
        this.i = null;
        this.h = null;
    }

    @Override
    public void a(@NotNull arf_1 arf_12) {
        super.a(arf_12);
        this.d(arf_12);
        this.e(arf_12);
        this.f(arf_12);
        this.b(arf_12);
        this.c(arf_12);
    }

    @Override
    public void a(@NotNull gk_0 gk_02) {
        super.a(gk_02);
        this.b(gk_02);
        this.c(gk_02);
        this.d(gk_02);
        this.e(gk_02);
        this.f(gk_02);
    }

    private void d(arf_1 arf_12) {
        int n = arf_12.a() & 0xFF;
        if (n == 0) {
            return;
        }
        this.t = new afo[n];
        for (int k = 0; k < n; ++k) {
            afo afo2 = new afo();
            afo2.a(arf_12);
            this.t[k] = afo2;
        }
    }

    private void b(gk_0 gk_02) {
        if (this.t == null) {
            gk_02.a((byte)0);
            return;
        }
        int n = this.t.length;
        if (n >= 255) {
            throw new RuntimeException("trop de particules sur la map (" + this.a + " " + this.b + ")");
        }
        gk_02.a((byte)(n & 0xFF));
        for (int k = 0; k < n; ++k) {
            this.t[k].a(gk_02);
        }
    }

    private void e(arf_1 arf_12) {
        int n = arf_12.a() & 0xFF;
        if (n == 0) {
            return;
        }
        this.u = new afs[n];
        for (int k = 0; k < n; ++k) {
            afs afs2 = new afs();
            afs2.a(arf_12);
            this.u[k] = afs2;
        }
    }

    private void c(gk_0 gk_02) {
        if (this.u == null) {
            gk_02.a((byte)0);
            return;
        }
        int n = this.u.length;
        if (n >= 255) {
            throw new RuntimeException("trop de sons sur la map (" + this.a + " " + this.b + ")");
        }
        gk_02.a((byte)(n & 0xFF));
        for (int k = 0; k < n; ++k) {
            this.u[k].a(gk_02);
        }
    }

    private void f(arf_1 arf_12) {
        int n = arf_12.a() & 0xFF;
        if (n == 0) {
            this.i = null;
            this.h = null;
            return;
        }
        this.h = arf_12.c(n);
        int n2 = arf_12.a() & 0xFF;
        if (n2 == 0) {
            assert (this.h.length == 1);
            this.i = null;
            return;
        }
        assert (n2 == e);
        this.i = arf_12.a(n2);
    }

    private void d(gk_0 gk_02) {
        if (this.h == null) {
            assert (this.i == null);
            gk_02.a((byte)0);
            return;
        }
        int n = this.h.length;
        assert (this.h.length < 4);
        gk_02.a((byte)(n & 0xFF));
        for (int k = 0; k < n; ++k) {
            gk_02.a(this.h[k]);
        }
        if (this.i == null) {
            assert (this.h.length == 1);
            gk_02.a((byte)0);
            return;
        }
        assert (this.i.length == e);
        gk_02.a((byte)(this.i.length & 0xFF));
        gk_02.a(this.i);
    }

    protected void b(arf_1 arf_12) {
        int n = arf_12.a() & 0xFF;
        if (n == 0) {
            return;
        }
        this.q = new afc[n];
        for (int k = 0; k < n; ++k) {
            afc afc2 = new afc();
            afc2.a(arf_12);
            this.q[k] = afc2;
        }
    }

    private void e(gk_0 gk_02) {
        if (this.q == null) {
            gk_02.a((byte)0);
            return;
        }
        int n = this.q.length;
        if (n >= 255) {
            throw new RuntimeException("trop de interactivs sur la map (" + this.a + " " + this.b + ")");
        }
        gk_02.a((byte)(n & 0xFF));
        for (int k = 0; k < n; ++k) {
            this.q[k].a(gk_02);
        }
    }

    protected void c(arf_1 arf_12) {
        int n = arf_12.a() & 0xFF;
        if (n == 0) {
            this.r = s;
            return;
        }
        this.r = new aeu_0[n];
        for (int k = 0; k < n; ++k) {
            aeu_0 aeu_02 = new aeu_0();
            aeu_02.a(arf_12);
            this.r[k] = aeu_02;
        }
    }

    private void f(gk_0 gk_02) {
        if (this.r == null) {
            gk_02.a((byte)0);
            return;
        }
        int n = this.r.length;
        if (n >= 255) {
            throw new RuntimeException("trop de dynamic sur la map (" + this.a + " " + this.b + ")");
        }
        gk_02.a((byte)(n & 0xFF));
        for (int k = 0; k < n; ++k) {
            this.r[k].a(gk_02);
        }
    }
}

