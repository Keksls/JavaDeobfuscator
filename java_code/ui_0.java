/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.commons.pool.ObjectPool
 *  org.apache.log4j.Level
 *  org.apache.log4j.Logger
 */
import org.apache.commons.pool.ObjectPool;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;

/*
 * Renamed from UI
 */
public class ui_0
implements abq_1 {
    private static final Logger b = Logger.getLogger(ui_0.class);
    private static final Logger c = Logger.getLogger((String)"debug");
    private static final boolean d = false;
    private yy_0 e;
    private int f;
    private int g;
    private short h;
    private int i;
    private int j;
    private short k;
    private int l;
    private int m;
    private short n;
    private short o;
    private final boolean p = false;
    private final yt_0[] q = new yt_0[32];
    private static final ObjectPool r;
    private uk_0 s = null;

    ui_0() {
        for (int k = 0; k < this.q.length; ++k) {
            this.q[k] = new yt_0();
        }
    }

    public static ui_0 a() {
        try {
            return (ui_0)r.borrowObject();
        }
        catch (Exception exception) {
            b.error((Object)"Exception during LineOfSightChecker checkout", (Throwable)exception);
            return null;
        }
    }

    @Override
    public final void release() {
        try {
            r.returnObject((Object)this);
        }
        catch (Exception exception) {
            b.error((Object)"Exception during LineOfSightChecker release", (Throwable)exception);
        }
    }

    @Override
    public final void onCheckOut() {
    }

    @Override
    public final void onCheckIn() {
        this.e = null;
    }

    public final void a(yy_0 yy_02) {
        this.e = yy_02;
    }

    public final void a(int n, int n2, short s2) {
        this.f = n;
        this.g = n2;
        this.h = s2;
    }

    public final void a(aff_1 aff_12) {
        this.f = aff_12.d();
        this.g = aff_12.e();
        this.h = aff_12.f();
    }

    public final void b(int n, int n2, short s2) {
        this.i = n;
        this.j = n2;
        this.k = s2;
    }

    public final void b(aff_1 aff_12) {
        this.i = aff_12.d();
        this.j = aff_12.e();
        this.k = aff_12.f();
    }

    private boolean c() {
        boolean bl;
        yv_0 yv_02 = this.e.n(this.l, this.m);
        if (yv_02 == null) {
            return false;
        }
        boolean bl2 = bl = this.l == this.i && this.m == this.j || this.l == this.f && this.m == this.g;
        if (!bl && this.d()) {
            return false;
        }
        int n = yv_02.a(this.l, this.m, this.q, 0);
        if (n <= 0) {
            return false;
        }
        for (int k = 0; k < n; ++k) {
            yt_0 yt_02 = this.q[k];
            if (yt_02.c <= this.n) continue;
            if (yt_02.c - yt_02.d >= this.o) {
                return k > 0;
            }
            if (this.o <= yt_02.c - yt_02.d || this.n >= yt_02.c || yt_02.e) continue;
            return false;
        }
        return true;
    }

    private boolean d() {
        return this.e.b(this.l, this.m, this.n) || this.e.b(this.l, this.m, this.o);
    }

    private boolean c(int n, int n2, short s2) {
        if (this.l == Integer.MAX_VALUE) {
            this.l = n;
            this.m = n2;
            this.n = s2;
            this.o = s2;
            return true;
        }
        if (n == this.l && n2 == this.m) {
            if (s2 < this.n) {
                this.n = s2;
            }
            if (s2 > this.o) {
                this.o = s2;
            }
            return true;
        }
        if (!this.c()) {
            return false;
        }
        this.l = n;
        this.m = n2;
        this.n = s2;
        this.o = s2;
        return true;
    }

    public final boolean b() {
        int n;
        int n2;
        int n3;
        int n4;
        int n5;
        int n6;
        assert (this.e != null) : "No TopologyMapInstanceSet defined for this LOS Check";
        this.l = Integer.MAX_VALUE;
        this.m = Integer.MAX_VALUE;
        this.n = (short)Short.MAX_VALUE;
        this.o = (short)Short.MIN_VALUE;
        int n7 = this.f;
        int n8 = this.g;
        short s2 = this.h;
        int n9 = this.i - this.f;
        int n10 = this.j - this.g;
        int n11 = this.k - this.h;
        if (n9 < 0) {
            n6 = -1;
            n5 = -n9;
        } else {
            n6 = 1;
            n5 = n9;
        }
        if (n10 < 0) {
            n4 = -1;
            n3 = -n10;
        } else {
            n4 = 1;
            n3 = n10;
        }
        if (n11 < 0) {
            n2 = -1;
            n = -n11;
        } else {
            n2 = 1;
            n = n11;
        }
        int n12 = n5 << 2;
        int n13 = n3 << 2;
        int n14 = n << 2;
        if (n5 >= n3 && n5 >= n) {
            int n15 = (n13 >>> 1) - 2 * n5;
            int n16 = (n14 >>> 1) - 2 * n5;
            for (int k = 0; k < n5; ++k) {
                n7 += n6;
                if (n15 < 0) {
                    if (n16 < 0) {
                        if (!this.c(n7, n8, s2)) {
                            return false;
                        }
                    } else if (n16 == 0) {
                        n16 -= n12;
                        if (!this.c(n7, n8, s2 = (short)(s2 + n2))) {
                            return false;
                        }
                    } else {
                        n16 -= n12;
                        if (!this.c(n7 - n6, n8, s2 = (short)(s2 + n2))) {
                            return false;
                        }
                        if (!this.c(n7, n8, s2)) {
                            return false;
                        }
                    }
                } else if (n15 == 0) {
                    n15 -= n12;
                    n8 += n4;
                    if (n16 < 0) {
                        if (!this.c(n7, n8, s2)) {
                            return false;
                        }
                    } else if (n16 == 0) {
                        n16 -= n12;
                        if (!this.c(n7, n8, s2 = (short)(s2 + n2))) {
                            return false;
                        }
                    } else {
                        n16 -= n12;
                        if (!this.c(n7 - n6, n8 - n4, s2 = (short)(s2 + n2))) {
                            return false;
                        }
                        if (!this.c(n7, n8, s2)) {
                            return false;
                        }
                    }
                } else {
                    n15 -= n12;
                    n8 += n4;
                    if (n16 < 0) {
                        if (!this.c(n7 - n6, n8, s2)) {
                            return false;
                        }
                        if (!this.c(n7, n8, s2)) {
                            return false;
                        }
                    } else if (n16 == 0) {
                        if (!this.c(n7 - n6, n8, s2)) {
                            return false;
                        }
                        n16 -= n12;
                        if (!this.c(n7, n8, s2 = (short)(s2 + n2))) {
                            return false;
                        }
                    } else {
                        int n17;
                        s2 = (short)(s2 + n2);
                        int n18 = n15 + n15 - n13;
                        if (n18 > (n17 = (n16 -= n12) + n16 - n14) ? !this.c(n7 - n6, n8, (short)(s2 - n2)) : n17 > n18 && !this.c(n7 - n6, n8 - n4, s2)) {
                            return false;
                        }
                        if (!this.c(n7 - n6, n8, s2)) {
                            return false;
                        }
                        if (!this.c(n7, n8, s2)) {
                            return false;
                        }
                    }
                }
                n15 += n13;
                n16 += n14;
            }
        } else if (n3 >= n5 && n3 >= n) {
            int n19 = (n12 >>> 1) - 2 * n3;
            int n20 = (n14 >>> 1) - 2 * n3;
            for (int k = 0; k < n3; ++k) {
                n8 += n4;
                if (n19 < 0) {
                    if (n20 < 0) {
                        if (!this.c(n7, n8, s2)) {
                            return false;
                        }
                    } else if (n20 == 0) {
                        n20 -= n13;
                        if (!this.c(n7, n8, s2 = (short)(s2 + n2))) {
                            return false;
                        }
                    } else {
                        n20 -= n13;
                        if (!this.c(n7, n8 - n4, s2 = (short)(s2 + n2))) {
                            return false;
                        }
                        if (!this.c(n7, n8, s2)) {
                            return false;
                        }
                    }
                } else if (n19 == 0) {
                    n19 -= n13;
                    n7 += n6;
                    if (n20 < 0) {
                        if (!this.c(n7, n8, s2)) {
                            return false;
                        }
                    } else if (n20 == 0) {
                        n20 -= n13;
                        if (!this.c(n7, n8, s2 = (short)(s2 + n2))) {
                            return false;
                        }
                    } else {
                        n20 -= n13;
                        if (!this.c(n7 - n6, n8 - n4, s2 = (short)(s2 + n2))) {
                            return false;
                        }
                        if (!this.c(n7, n8, s2)) {
                            return false;
                        }
                    }
                } else {
                    n19 -= n13;
                    n7 += n6;
                    if (n20 < 0) {
                        if (!this.c(n7, n8 - n4, s2)) {
                            return false;
                        }
                        if (!this.c(n7, n8, s2)) {
                            return false;
                        }
                    } else if (n20 == 0) {
                        if (!this.c(n7, n8 - n4, s2)) {
                            return false;
                        }
                        n20 -= n13;
                        if (!this.c(n7, n8, s2 = (short)(s2 + n2))) {
                            return false;
                        }
                    } else {
                        int n21;
                        s2 = (short)(s2 + n2);
                        int n22 = n19 + n19 - n12;
                        if (n22 > (n21 = (n20 -= n13) + n20 - n14) ? !this.c(n7, n8 - n4, (short)(s2 - n2)) : n21 > n22 && !this.c(n7 - n6, n8 - n4, s2)) {
                            return false;
                        }
                        if (!this.c(n7, n8 - n4, s2)) {
                            return false;
                        }
                        if (!this.c(n7, n8, s2)) {
                            return false;
                        }
                    }
                }
                n19 += n12;
                n20 += n14;
            }
        } else {
            int n23 = (n12 >>> 1) - 2 * n;
            int n24 = (n13 >>> 1) - 2 * n;
            for (int k = 0; k < n; ++k) {
                s2 = (short)(s2 + n2);
                if (n23 < 0) {
                    if (n24 < 0) {
                        if (!this.c(n7, n8, s2)) {
                            return false;
                        }
                    } else if (n24 == 0) {
                        n24 -= n14;
                        if (!this.c(n7, n8 += n4, s2)) {
                            return false;
                        }
                    } else {
                        n24 -= n14;
                        if (!this.c(n7, n8 += n4, (short)(s2 - n2))) {
                            return false;
                        }
                        if (!this.c(n7, n8, s2)) {
                            return false;
                        }
                    }
                } else if (n23 == 0) {
                    n23 -= n14;
                    n7 += n6;
                    if (n24 < 0) {
                        if (!this.c(n7, n8, s2)) {
                            return false;
                        }
                    } else if (n24 == 0) {
                        n24 -= n14;
                        if (!this.c(n7, n8 += n4, s2)) {
                            return false;
                        }
                    } else {
                        n24 -= n14;
                        if (!this.c(n7 - n6, n8 += n4, (short)(s2 - n2))) {
                            return false;
                        }
                        if (!this.c(n7, n8, s2)) {
                            return false;
                        }
                    }
                } else {
                    n23 -= n14;
                    n7 += n6;
                    if (n24 < 0) {
                        if (!this.c(n7, n8, (short)(s2 - n2))) {
                            return false;
                        }
                        if (!this.c(n7, n8, s2)) {
                            return false;
                        }
                    } else if (n24 == 0) {
                        if (!this.c(n7, n8, (short)(s2 - n2))) {
                            return false;
                        }
                        n24 -= n14;
                        if (!this.c(n7, n8 += n4, s2)) {
                            return false;
                        }
                    } else {
                        int n25;
                        n8 += n4;
                        int n26 = n23 + n23 - n12;
                        if (n26 > (n25 = (n24 -= n14) + n24 - n13) ? !this.c(n7, n8 - n4, (short)(s2 - n2)) : n25 > n26 && !this.c(n7 - n6, n8, (short)(s2 - n2))) {
                            return false;
                        }
                        if (!this.c(n7, n8, (short)(s2 - n2))) {
                            return false;
                        }
                        if (!this.c(n7, n8, s2)) {
                            return false;
                        }
                    }
                }
                n23 += n12;
                n24 += n13;
            }
        }
        return this.c();
    }

    public void a(uk_0 uk_02) {
        this.s = uk_02;
    }

    static {
        c.setLevel(Level.ALL);
        r = new abm_1(new uj_0());
    }
}

