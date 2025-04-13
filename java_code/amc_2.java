/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.concurrent.atomic.AtomicInteger;
import org.apache.log4j.Logger;

/*
 * Renamed from aMC
 */
public class amc_2
implements amv_1 {
    protected static final Logger a = Logger.getLogger(amc_2.class);
    private static final int c = 8500;
    private static final int d = 0;
    private static final int e = 1;
    private static final int f = -1;
    private static final int g = -2;
    private static final int h = -128;
    private static final int i = -129;
    private static final int j = -130;
    private int k;
    private boolean l = true;
    private final AtomicInteger m = new AtomicInteger(0);
    private int n = 8500;
    private boolean o = false;
    private static final boolean p = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
    private fkw_2 q;
    private fkv_2 r;
    private fku_2 s;
    private fkt_2 t;
    private fle_1 u;
    private fkx_2 v;
    private int w = 0;
    private long x;
    private long[] y;
    private long[] z;
    private int[] A;
    private long[] B;
    private fls_1[] C;
    private flb_1[] D;
    private long E;
    private boolean F = false;
    private int G;
    private int H;
    private amx_1 I;
    private float J;
    private static final int K = 8192;
    private final byte[] L = new byte[8192];
    private final float[][][] M = new float[1][][];
    private final int[] N = new int[2];

    @Override
    public String b() {
        return this.I.g();
    }

    @Override
    public String p() {
        return this.I.h();
    }

    private boolean u() {
        fls_1 fls_12 = new fls_1();
        flb_1 flb_12 = new flb_1();
        this.n = Math.min(8500, (int)amc_2.b(this.I));
        fku_2 fku_22 = new fku_2();
        int[] nArray = new int[1];
        int n = this.a(fls_12, flb_12, nArray, null);
        int n2 = nArray[0];
        int n3 = (int)this.x;
        this.r.c();
        if (n < 0) {
            return false;
        }
        amc_2.a(this.I, 0L, 1);
        this.x = amc_2.c(this.I);
        long l = this.a(fku_22);
        if (fku_22.g() != n2 ? this.a(0L, 0L, l + 1L, n2, 0) < 0 : this.a(0L, l, l + 1L, n2, 0) < 0) {
            return false;
        }
        this.a(fls_12, flb_12, n3);
        this.b(this.z[0]);
        return true;
    }

    private boolean v() {
        this.w = 1;
        this.C = new fls_1[]{new fls_1()};
        this.D = new flb_1[]{new flb_1()};
        int[] nArray = new int[1];
        if (this.a(this.C[0], this.D[0], nArray, null) == -1) {
            return false;
        }
        this.G = nArray[0];
        this.x();
        return true;
    }

    private int w() {
        int n;
        int n2 = this.q.a(this.n);
        if (n2 == -1) {
            a.debug((Object)("Stream corrompu : " + this.b()));
            return -128;
        }
        byte[] byArray = this.q.a;
        try {
            n = this.I.a(byArray, n2, this.n);
        }
        catch (Exception exception) {
            return -128;
        }
        this.q.b(n);
        if (n == -1) {
            n = 0;
        }
        return n;
    }

    private void x() {
        this.u.a(this.C[0]);
        this.v.a(this.u);
        this.F = true;
    }

    private void y() {
        this.r.c();
        this.u.a();
        this.v.a();
        this.F = false;
    }

    private int a(fku_2 fku_22, long l) {
        int n;
        int n2;
        block6: {
            if (l > 0L) {
                l += this.x;
            }
            while (true) {
                if (l > 0L && this.x >= l) {
                    return -1;
                }
                n2 = this.q.a(fku_22);
                if (n2 < 0) {
                    this.x -= (long)n2;
                    continue;
                }
                if (n2 != 0) break block6;
                if (l == 0L) {
                    return -1;
                }
                n = this.w();
                if (n == 0) {
                    return -2;
                }
                if (n < 0) break;
            }
            return -128;
        }
        n = (int)this.x;
        this.x += (long)n2;
        return n;
    }

    private int a(fku_2 fku_22) {
        int n;
        long l = this.x;
        int n2 = -1;
        while (n2 == -1) {
            if ((l -= (long)this.n) < 0L) {
                l = 0L;
            }
            this.c(l);
            while (this.x < l + (long)this.n) {
                n = this.a(fku_22, l + (long)this.n - this.x);
                if (n == -128) {
                    return -128;
                }
                if (n < 0) {
                    if (n2 != -1) continue;
                    return -1;
                }
                n2 = n;
            }
        }
        this.c((long)n2);
        n = this.a(fku_22, (long)this.n);
        if (n < 0) {
            return -129;
        }
        return n2;
    }

    private void c(long l) {
        amc_2.a(this.I, l, 0);
        this.x = l;
        this.q.c();
    }

    private int a(long l, long l2, long l3, int n, int n2) {
        int n3;
        long l4 = l3;
        long l5 = l3;
        fku_2 fku_22 = new fku_2();
        while (l2 < l4) {
            long l6 = l4 - l2 < (long)this.n ? l2 : (l2 + l4) / 2L;
            this.c(l6);
            n3 = this.a(fku_22, -1L);
            if (n3 == -128) {
                return -128;
            }
            if (n3 < 0 || fku_22.g() != n) {
                l4 = l6;
                if (n3 < 0) continue;
                l5 = n3;
                continue;
            }
            l2 = n3 + fku_22.c + fku_22.f;
        }
        this.c(l5);
        n3 = this.a(fku_22, -1L);
        if (n3 == -128) {
            return -128;
        }
        if (l2 >= l3 || n3 == -1) {
            this.w = n2 + 1;
            this.y = new long[n2 + 2];
            this.y[n2 + 1] = l2;
        } else {
            n3 = this.a(l5, this.x, l3, fku_22.g(), n2 + 1);
            if (n3 == -128) {
                return -128;
            }
        }
        this.y[n2] = l;
        return 0;
    }

    public int a(fls_1 fls_12, flb_1 flb_12, int[] nArray, fku_2 fku_22) {
        if (fku_22 == null) {
            fku_22 = new fku_2();
            int n = this.a(fku_22, (long)this.n);
            if (n == -128) {
                return -128;
            }
            if (n < 0) {
                return -130;
            }
        }
        if (nArray != null) {
            nArray[0] = fku_22.g();
        }
        this.r.a(fku_22.g());
        fls_12.a();
        flb_12.a();
        fkt_2 fkt_22 = new fkt_2();
        int n = 0;
        while (n < 3) {
            int n2;
            this.r.a(fku_22);
            while (n < 3 && (n2 = this.r.b(fkt_22)) != 0) {
                if (n2 == -1) {
                    fls_12.b();
                    this.r.c();
                    return -1;
                }
                if (fls_12.a(flb_12, fkt_22) != 0) {
                    fls_12.b();
                    this.r.c();
                    return -1;
                }
                ++n;
            }
            if (n >= 3 || this.a(fku_22, 1L) >= 0) continue;
            fls_12.b();
            this.r.c();
            return -1;
        }
        return 0;
    }

    public fls_1[] q() {
        return this.C;
    }

    private void a(fls_1 fls_12, flb_1 flb_12, int n) {
        fku_2 fku_22 = new fku_2();
        this.C = new fls_1[this.w];
        this.D = new flb_1[this.w];
        this.z = new long[this.w];
        this.B = new long[this.w];
        this.A = new int[this.w];
        block0: for (int k = 0; k < this.w; ++k) {
            if (fls_12 != null && flb_12 != null && k == 0) {
                this.C[k] = fls_12;
                this.D[k] = flb_12;
                this.z[k] = n;
            } else {
                this.c(this.y[k]);
                this.C[k] = new fls_1();
                this.D[k] = new flb_1();
                if (this.a(this.C[k], this.D[k], null, null) == -1) {
                    this.z[k] = -1L;
                } else {
                    this.z[k] = this.x;
                    this.r.c();
                }
            }
            long l = this.y[k + 1];
            this.c(l);
            do {
                int n2;
                if ((n2 = this.a(fku_22)) != -1) continue;
                this.C[k].b();
                continue block0;
            } while (fku_22.f() == -1L);
            this.A[k] = fku_22.g();
            this.B[k] = fku_22.f();
        }
    }

    @Override
    public boolean a() {
        return this.a(this.I);
    }

    @Override
    public boolean a(amx_1 amx_12) {
        boolean bl;
        this.I = amx_12;
        try {
            this.I.a();
        }
        catch (IOException iOException) {
            a.info((Object)("Probl\u00e8me \u00e0 l'ouverture du stream " + amx_12.g()));
            try {
                this.I.c();
            }
            catch (IOException iOException2) {
                a.info((Object)("Probl\u00e8me au nettoyage du stream " + amx_12.g()));
            }
            return false;
        }
        this.x = 0L;
        boolean bl2 = bl = this.s != null;
        if (bl) {
            assert (this.t != null && this.q != null && this.r != null && this.u != null && this.v != null);
            this.s.a();
            this.t.b();
            this.q.b();
            this.r.b();
            this.u = new fle_1();
            this.v.a(this.u);
        } else {
            assert (this.t == null && this.q == null && this.r == null && this.u == null && this.v == null);
            this.s = new fku_2();
            this.t = new fkt_2();
            this.q = new fkw_2();
            this.r = new fkv_2();
            this.u = new fle_1();
            this.v = new fkx_2(this.u);
        }
        if (amx_12.d()) {
            return this.u();
        }
        return this.v();
    }

    private int b(boolean bl) {
        while (true) {
            int n;
            if (this.F && (n = this.r.b(this.t)) > 0) {
                long l = this.t.f;
                if (this.v.a(this.t) == 0) {
                    this.u.a(this.v);
                    if (l != -1L) {
                        int n2 = this.I.d() ? this.H : 0;
                        int n3 = this.u.a(null, null);
                        l = Math.max(0L, l - (long)n3);
                        for (int k = 0; k < n2; ++k) {
                            l += this.B[k];
                        }
                        this.E = l;
                    }
                    return 1;
                }
            }
            if (!bl) {
                return 0;
            }
            if (this.a(this.s, -1L) < 0) {
                return 0;
            }
            if (this.F && this.G != this.s.g()) {
                this.y();
            }
            if (!this.F) {
                if (this.I.d()) {
                    this.G = this.s.g();
                    for (n = 0; n < this.w && this.A[n] != this.G; ++n) {
                    }
                    if (n == this.w) {
                        return -1;
                    }
                    this.H = n;
                    this.r.a(this.G);
                    this.r.f();
                } else {
                    int[] nArray = new int[1];
                    int n4 = this.a(this.C[0], this.D[0], nArray, this.s);
                    this.G = nArray[0];
                    if (n4 != 0) {
                        return n4;
                    }
                    ++this.H;
                }
                this.x();
            }
            this.r.a(this.s);
        }
    }

    public long b(int n) {
        if (!this.I.d() || n >= this.w) {
            return -1L;
        }
        if (n < 0) {
            long l = 0L;
            for (int k = 0; k < this.w; ++k) {
                l += this.b(k);
            }
            return l;
        }
        return this.y[n + 1] - this.y[n];
    }

    public long c(int n) {
        if (!this.I.d() || n >= this.w) {
            return -1L;
        }
        if (n < 0) {
            long l = 0L;
            for (int k = 0; k < this.w; ++k) {
                l += this.c(k);
            }
            return l;
        }
        return this.B[n];
    }

    public long r() {
        if (!this.I.d()) {
            return -1L;
        }
        long l = 0L;
        for (int k = 0; k < this.w; ++k) {
            l += this.B[k] * (long)this.C[k].b * 2L;
        }
        return l;
    }

    public float d(int n) {
        if (!this.I.d() || n >= this.w) {
            return -1.0f;
        }
        if (n < 0) {
            if (this.J == 0.0f) {
                for (int k = 0; k < this.w; ++k) {
                    this.J += this.d(k);
                }
            }
            return this.J;
        }
        return (float)this.B[n] / (float)this.C[n].c;
    }

    @Override
    public int b(long l) {
        if (!this.I.d()) {
            return -1;
        }
        this.E = -1L;
        this.y();
        if (l < 0L || l > this.y[this.w]) {
            return -1;
        }
        this.c(l);
        switch (this.b(true)) {
            case 0: {
                this.E = this.c(-1);
                return 0;
            }
            case -1: {
                this.E = -1L;
                this.y();
                return -1;
            }
        }
        while (true) {
            switch (this.b(false)) {
                case 0: {
                    return 0;
                }
                case -1: {
                    this.E = -1L;
                    this.y();
                    return -1;
                }
            }
        }
    }

    @Override
    public int a(long l) {
        int n;
        if (!this.I.d()) {
            return -1;
        }
        long l2 = this.c(-1);
        if (l < 0L || l > l2) {
            this.E = -1L;
            this.y();
            return -1;
        }
        for (n = this.w - 1; n >= 0 && l < (l2 -= this.B[n]); --n) {
        }
        long l3 = l - l2;
        long l4 = this.y[n + 1];
        long l5 = this.y[n];
        int n2 = (int)l5;
        fku_2 fku_22 = new fku_2();
        while (l5 < l4) {
            long l6 = l4 - l5 < (long)this.n ? l5 : (l4 + l5) / 2L;
            this.c(l6);
            int n3 = this.a(fku_22, l4 - l6);
            if (n3 == -1) {
                l4 = l6;
                continue;
            }
            long l7 = fku_22.f();
            if (l7 < l3) {
                n2 = n3;
                l5 = this.x;
                continue;
            }
            l4 = l6;
        }
        if (this.b((long)n2) != 0) {
            this.E = -1L;
            this.y();
            return -1;
        }
        if (this.E >= l) {
            this.E = -1L;
            this.y();
            return -1;
        }
        if (l > this.c(-1)) {
            this.E = -1L;
            this.y();
            return -1;
        }
        while (this.E < l) {
            int n4 = (int)(l - this.E);
            int[] nArray = new int[this.C[this.H].b];
            int n5 = this.u.a(this.M, nArray);
            if (n5 > n4) {
                n5 = n4;
            }
            this.u.a(n5);
            this.E += (long)n5;
            if (n5 >= n4 || this.b(true) != 0) continue;
            this.E = this.c(-1);
        }
        return 0;
    }

    @Override
    public int a(float f2) {
        int n;
        if (!this.I.d()) {
            return -1;
        }
        long l = this.c(-1);
        float f3 = this.d(-1);
        if (f2 < 0.0f || f2 > f3) {
            this.E = -1L;
            this.y();
            return -1;
        }
        for (n = this.w - 1; n >= 0; --n) {
            l -= this.B[n];
            if (f2 >= (f3 -= this.d(n))) break;
        }
        long l2 = (long)((float)l + (f2 - f3) * (float)this.C[n].c);
        return this.a(l2);
    }

    @Override
    public long h() {
        return this.x;
    }

    @Override
    public long i() {
        return this.E;
    }

    @Override
    public float j() {
        if (this.w < 1) {
            return 0.0f;
        }
        float f2 = 0.0f;
        long l = 0L;
        int n = -1;
        if (this.I.d()) {
            l = this.c(-1);
            f2 = this.d(-1);
            for (n = this.w - 1; n >= 0; --n) {
                f2 -= this.d(n);
                if (this.E >= (l -= this.B[n])) break;
            }
        }
        return f2 + (float)(this.E - l) / (float)this.C[n].c;
    }

    @Override
    public int a(ByteBuffer byteBuffer, int n) {
        this.l = false;
        byteBuffer.position(n);
        while (byteBuffer.remaining() > 0) {
            boolean bl = true;
            if (this.F) {
                fls_1 fls_12 = this.C[this.H];
                int n2 = this.u.a(this.M, this.N);
                float[][] fArray = this.M[0];
                if (n2 > 0) {
                    int n3;
                    int n4 = fls_12.b;
                    int n5 = n4 * 2;
                    int n6 = Math.min(n2, byteBuffer.remaining() / n5);
                    bl = (n6 = Math.min(n6, 8192 / n5)) == n2;
                    for (n3 = 0; n3 < n4; ++n3) {
                        int n7 = n3 * 2;
                        int n8 = this.N[n3];
                        for (int k = 0; k < n6; ++k) {
                            int n9 = (int)(fArray[n3][n8 + k] * 32767.0f);
                            if (n9 > Short.MAX_VALUE) {
                                n9 = Short.MAX_VALUE;
                            }
                            if (n9 < Short.MIN_VALUE) {
                                n9 = Short.MIN_VALUE;
                            }
                            if (n9 < 0) {
                                n9 |= 0x8000;
                            }
                            if (p) {
                                this.L[n7] = (byte)(n9 >>> 8 & 0xFF);
                                this.L[n7 + 1] = (byte)(n9 & 0xFF);
                            } else {
                                this.L[n7] = (byte)(n9 & 0xFF);
                                this.L[n7 + 1] = (byte)(n9 >>> 8 & 0xFF);
                            }
                            n7 += 2 * n4;
                        }
                    }
                    n3 = n6 * n5;
                    byteBuffer.put(this.L, 0, n3);
                    this.u.a(n6);
                    this.E += (long)n6;
                }
            }
            if (!bl) continue;
            switch (this.b(true)) {
                case 0: {
                    return -(byteBuffer.position() - n);
                }
                case -1: {
                    return -(byteBuffer.position() - n);
                }
            }
        }
        return byteBuffer.position() - n;
    }

    @Override
    public int k() {
        return this.C[this.H].b * 2;
    }

    @Override
    public int c() {
        return this.C[0].b;
    }

    @Override
    public int d() {
        return this.C[0].c;
    }

    @Override
    public void a(boolean bl) {
        this.o = bl;
    }

    @Override
    public int g() {
        return (int)(this.d(-1) * 1000.0f);
    }

    public void s() {
        if (this.I.d()) {
            this.b(this.z[0]);
        } else {
            this.e();
        }
    }

    @Override
    public void f() {
        if (this.I != null) {
            try {
                this.I.c();
            }
            catch (IOException iOException) {
                a.error((Object)("Impossible de fermer le flux pour le stream " + this.I.g()));
            }
        }
    }

    @Override
    public void e() {
        if (!this.l) {
            if (this.I.d()) {
                this.b(this.z[0]);
            } else {
                this.r.c();
                this.v.a();
                this.u.a();
                if (this.C != null) {
                    for (fls_1 fls_12 : this.C) {
                        fls_12.b();
                    }
                }
                this.q.a();
                try {
                    if (this.I != null) {
                        this.I.b();
                    }
                }
                catch (Exception exception) {
                    a.error((Object)"Exception during reset", (Throwable)exception);
                }
                this.w = 0;
                this.x = 0L;
                this.y = null;
                this.z = null;
                this.A = null;
                this.B = null;
                this.C = null;
                this.D = null;
                this.E = 0L;
                this.F = false;
                this.G = 0;
                this.H = 0;
                this.a(this.I);
            }
            this.l = true;
        }
    }

    @Override
    public int l() {
        return this.k;
    }

    @Override
    public void a(int n) {
        this.k = n;
    }

    @Override
    public int m() {
        return this.m.get();
    }

    @Override
    public void n() {
        this.m.incrementAndGet();
    }

    @Override
    public void o() {
        this.m.decrementAndGet();
    }

    public String toString() {
        return this.getClass().getSimpleName() + " : url=" + this.I.g();
    }

    private static long b(amx_1 amx_12) {
        if (!amx_12.d()) {
            return -1L;
        }
        try {
            return amx_12.e();
        }
        catch (IOException iOException) {
            a.debug((Object)"Probl\u00e8me lors du length() sur le stream !", (Throwable)iOException);
            return -1L;
        }
    }

    private static int a(amx_1 amx_12, long l, int n) {
        if (!amx_12.d()) {
            return -1;
        }
        try {
            if (n == 0) {
                amx_12.a(l);
            } else if (n == 1) {
                amx_12.a(amx_12.e() - l);
            }
            return 0;
        }
        catch (IOException iOException) {
            a.debug((Object)"Probl\u00e8me lors du seek sur le stream !", (Throwable)iOException);
            return -1;
        }
    }

    private static long c(amx_1 amx_12) {
        if (!amx_12.d()) {
            return 0L;
        }
        try {
            return amx_12.f();
        }
        catch (IOException iOException) {
            a.debug((Object)"Probl\u00e8me lors du tell sur le stream !", (Throwable)iOException);
            return 0L;
        }
    }

    public flb_1 t() {
        if (this.D == null || this.D.length == 0) {
            return null;
        }
        return this.D[0];
    }
}

