/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 *  org.lwjgl.BufferUtils
 *  org.lwjgl.openal.AL10
 *  org.lwjgl.openal.AL11
 */
import java.nio.ByteBuffer;
import java.nio.IntBuffer;
import org.apache.log4j.Logger;
import org.lwjgl.BufferUtils;
import org.lwjgl.openal.AL10;
import org.lwjgl.openal.AL11;

/*
 * Renamed from aMj
 */
public class amj_1
implements abo_1,
ald_1,
amk_1 {
    public static final int a = 0;
    public static final int b = 1;
    public static final int c = 2;
    public static final int d = 3;
    protected static final Logger e = Logger.getLogger(amj_1.class);
    protected static final boolean f = false;
    protected static final int g = 65536;
    protected static final int h = 2;
    private long B;
    protected int i = 2;
    protected final IntBuffer j = BufferUtils.createIntBuffer((int)2);
    protected final IntBuffer k = BufferUtils.createIntBuffer((int)1);
    private final ByteBuffer C = BufferUtils.createByteBuffer((int)65536);
    private int D;
    private int E;
    private int F;
    private boolean G = true;
    private int H;
    private final float[] I = new float[3];
    private float J = 1.0f;
    private float K = 1.0f;
    private float L = Float.MAX_VALUE;
    private boolean M = false;
    private int N = -1;
    private int O = 0;
    private int P = 0;
    protected volatile amv_1 l;
    private volatile boolean Q = false;
    private ams_1 R;
    private all_1 S;
    protected volatile float m;
    protected volatile float n;
    protected volatile float o;
    protected volatile float p;
    protected volatile float q;
    protected volatile float r;
    protected volatile boolean s = false;
    protected volatile boolean t = false;
    protected volatile boolean u = false;
    protected volatile boolean v = false;
    protected volatile boolean w = false;
    protected volatile boolean x = false;
    protected volatile boolean y = false;
    protected volatile long z = 0L;
    protected volatile long A = 0L;
    private volatile int T;
    private volatile boolean U = true;
    private volatile boolean V = false;
    private volatile boolean W = false;
    private volatile boolean X = false;

    @Override
    public long b() {
        return this.B;
    }

    public void a(long l) {
        this.B = l;
    }

    public byte c() {
        if (this.S != null) {
            return this.S.d();
        }
        return 0;
    }

    public void a(ams_1 ams_12) {
        this.R = ams_12;
    }

    public all_1 d() {
        return this.S;
    }

    public amv_1 e() {
        return this.l;
    }

    public boolean f() {
        return this.Q;
    }

    public void a(boolean bl) {
        this.Q = bl;
    }

    public boolean g() {
        return this.y;
    }

    public void b(boolean bl) {
        this.y = bl;
    }

    @Override
    public void onCheckOut() {
        this.x = false;
        this.s = false;
        this.t = false;
        this.u = false;
        this.v = false;
        this.r = 0.0f;
        this.y = false;
        this.m = 0.0f;
        this.n = 1.0f;
        this.o = 1.0f;
        this.q = 1.0f;
        this.p = this.n;
        this.z = 0L;
        this.A = 0L;
        this.T = 1;
        this.U = true;
        this.V = false;
        this.I[2] = 0.0f;
        this.I[1] = 0.0f;
        this.I[0] = 0.0f;
        this.J = 1.0f;
        this.K = 1.0f;
        this.L = Float.MAX_VALUE;
        this.W = false;
        this.O = 0;
        this.P = 0;
        this.M = false;
        this.N = 0;
    }

    @Override
    public void onCheckIn() {
        this.O();
        if (this.R != null) {
            this.R.b(this.N, this.B);
        }
        this.i = 2;
    }

    public synchronized boolean a(int n) {
        boolean bl = true;
        try {
            this.C.clear();
            int n2 = this.l.a(this.C, 0);
            boolean bl2 = n2 <= 0;
            n2 = Math.abs(n2);
            if (bl2) {
                if (this.y || --this.T > 0) {
                    this.l.e();
                    n2 += Math.abs(this.l.a(this.C, n2));
                } else {
                    bl = false;
                }
            }
            this.C.position(0).limit(n2);
            AL10.alBufferData((int)n, (int)this.D, (ByteBuffer)this.C, (int)this.H);
            AL10.alSourceQueueBuffers((int)this.k.get(0), (int)n);
        }
        catch (Exception exception) {
            e.error((Object)"Exeption lev\u00e9e", (Throwable)exception);
            return false;
        }
        return bl;
    }

    public synchronized boolean h() {
        if (!this.M()) {
            return false;
        }
        this.W = false;
        if (this.O != 0) {
            this.b(this.O);
        }
        if (this.P != 0) {
            this.c(this.P);
        }
        this.d(this.x);
        this.f(this.m);
        this.e(this.n);
        this.g(this.o);
        this.c(this.p);
        this.k(this.J);
        this.i(this.K);
        this.j(this.L);
        if (this.l != null) {
            this.l.a();
        }
        return true;
    }

    private synchronized boolean M() {
        block8: {
            while (true) {
                if (this.S.a(this.E)) {
                    this.F = this.E;
                    this.G = true;
                    break block8;
                }
                if (this.R.d(this.E)) {
                    this.F = this.E;
                    this.G = false;
                    break block8;
                }
                amj_1 amj_12 = aml_1.a().c();
                if (amj_12 == null) {
                    e.debug((Object)"Il n'y a aucune source \u00e0 lib\u00e9rer, mais on n'arrive pas \u00e0 r\u00e9server de voix");
                    this.F = 0;
                    return false;
                }
                if (amj_12.c() <= this.S.d()) break;
                amj_12.u();
            }
            e.debug((Object)"Impossible d'assigner suffisament de voix \u00e0 cette Source.");
            this.F = 0;
            return false;
        }
        try {
            this.j.clear();
            AL10.alGenBuffers((IntBuffer)this.j);
            amj_1 amj_13 = this;
            amj_13.R.f();
        }
        catch (Exception exception) {
            e.warn((Object)"Impossible de cr\u00e9er un buffer suppl\u00e9mentaire.", (Throwable)exception);
            return false;
        }
        try {
            this.k.clear();
            AL10.alGenSources((IntBuffer)this.k);
            amj_1 amj_14 = this;
            amj_14.R.f();
        }
        catch (Exception exception) {
            e.warn((Object)"Impossible de cr\u00e9er une source audio suppl\u00e9mentaire.");
            return false;
        }
        AL10.alSourcei((int)this.k.get(0), (int)4103, (int)0);
        AL10.alSourcei((int)this.k.get(0), (int)514, (int)1);
        return true;
    }

    public synchronized boolean a(ams_1 ams_12, all_1 all_12, amv_1 amv_12) {
        this.R = ams_12;
        this.S = all_12;
        this.l = amv_12;
        if (this.l.c() == 1) {
            this.E = 1;
            this.D = 4353;
        } else {
            this.E = 2;
            this.D = 4355;
        }
        this.H = this.l.d();
        if (!this.M()) {
            return false;
        }
        this.e(1.0f);
        this.f(0.0f);
        this.h(1.0f);
        this.c(this.z());
        return true;
    }

    public synchronized void b(int n) {
        this.O = n;
        if (this.k.get(0) != 0) {
            AL11.alSource3i((int)this.k.get(0), (int)131078, (int)n, (int)0, (int)0);
        }
    }

    public synchronized void c(int n) {
        this.P = n;
        if (this.k.get(0) != 0) {
            AL10.alSourcei((int)this.k.get(0), (int)131077, (int)(this.M ? this.P : 0));
        }
    }

    public synchronized void c(boolean bl) {
        if (this.M == bl) {
            return;
        }
        this.M = bl;
        if (this.M) {
            this.R.a(this.N, this.B);
        } else {
            this.R.b(this.N, this.B);
        }
        this.c(this.P);
    }

    public int i() {
        return this.N;
    }

    public void d(int n) {
        if (this.N == n) {
            return;
        }
        this.R.b(this.N, this.B);
        this.N = n;
        this.R.a(this.N, this.B);
    }

    public synchronized void j() {
        this.N();
        if (this.l != null) {
            this.l.f();
        }
        this.W = true;
    }

    private synchronized void N() {
        if (this.k.get(0) != 0) {
            AL10.alSourceStop((int)this.k.get(0));
            this.P();
        }
        if (this.k.get(0) != 0) {
            this.k.position(0);
            AL10.alDeleteSources((IntBuffer)this.k);
            this.k.put(0, 0);
            this.k.clear();
        }
        for (int k = 0; k < 2; ++k) {
            int n = this.j.get(k);
            if (n != 0) {
                this.j.position(0);
                AL10.alDeleteBuffers((int)n);
                this.j.put(k, 0);
            }
            this.j.clear();
        }
        if (this.F != 0) {
            if (this.G) {
                this.S.b(this.F);
            } else {
                this.R.e(this.F);
            }
            this.F = 0;
        }
        this.v = false;
        this.w = false;
        this.X = false;
    }

    private synchronized void O() {
        if (this.S == null) {
            return;
        }
        this.N();
        if (this.l != null) {
            this.l.f();
            this.l.o();
            this.l = null;
        }
        this.F = 0;
        this.x = false;
        this.r = 0.0f;
        this.p = this.n;
        this.o = 1.0f;
        this.S = null;
    }

    private synchronized void P() {
        if (this.S == null || this.W) {
            return;
        }
        int n = AL10.alGetSourcei((int)this.k.get(0), (int)4117);
        for (int k = 0; k < n; ++k) {
            AL10.alSourceUnqueueBuffers((int)this.k.get(0));
        }
    }

    public synchronized void k() {
        this.v = false;
    }

    public synchronized int b(long l) {
        if (this.S == null) {
            return 1;
        }
        if (this.z > 0L && l > this.z) {
            this.s();
            return 1;
        }
        if (this.v) {
            return 1;
        }
        if (this.V) {
            return 2;
        }
        boolean bl = false;
        if (!this.w) {
            for (int k = 0; k < this.i; ++k) {
                this.a(this.j.get(k));
            }
            this.X = true;
            bl = true;
            this.w = true;
        } else {
            int n = AL10.alGetSourcei((int)this.k.get(0), (int)4118);
            if (n > 0) {
                if (n > 4) {
                    e.error((Object)("Processed buffers > 4 : " + n));
                    try {
                        amj_1 amj_12 = this;
                        amj_12.R.f();
                    }
                    catch (Exception exception) {
                        e.error((Object)"Exception ", (Throwable)exception);
                    }
                } else {
                    for (int k = 0; k < n; ++k) {
                        int n2 = AL10.alSourceUnqueueBuffers((int)this.k.get(0));
                        if (!this.U) continue;
                        this.U = this.a(n2);
                        this.X = true;
                    }
                    bl = true;
                }
            } else {
                this.X = false;
            }
        }
        if (bl && !this.p()) {
            AL10.alSourcePlay((int)this.k.get(0));
        }
        if (this.A > 0L && l > this.A) {
            this.r = this.p / (float)(this.z - this.A);
        }
        if (this.r != 0.0f) {
            this.c(this.p + this.r);
        }
        if (this.r < 0.0f && this.p == this.m) {
            this.r = 0.0f;
        } else if (this.r > 0.0f && this.p == this.n) {
            this.r = 0.0f;
        }
        if ((this.s || this.t || this.u) && this.p == this.m) {
            this.r = 0.0f;
            if (this.s) {
                this.s();
                return 1;
            }
            if (this.t) {
                this.q();
                return 2;
            }
            this.j();
            return 3;
        }
        return this.U || this.p() ? 0 : 1;
    }

    private int Q() {
        if (this.S != null && !this.W) {
            int n = AL10.alGetSourcei((int)this.k.get(0), (int)4112);
            return n;
        }
        return -1;
    }

    public synchronized boolean l() {
        return this.w;
    }

    public synchronized boolean m() {
        return this.U;
    }

    public synchronized boolean n() {
        return this.W;
    }

    public synchronized boolean o() {
        return this.S == null;
    }

    public synchronized boolean p() {
        return this.Q() == 4114;
    }

    public synchronized void q() {
        if (this.V) {
            return;
        }
        int n = this.Q();
        if (!(n != 4114 && n != 4113 && n != 4115 || this.S == null || this.W)) {
            AL10.alSourceStop((int)this.k.get(0));
        }
        this.V = true;
    }

    public synchronized void r() {
        this.V = false;
    }

    public synchronized void s() {
        int n = this.Q();
        if (n == 4114 || n == 4113 || n == 4115) {
            if (!this.W) {
                AL10.alSourceStop((int)this.k.get(0));
            }
            this.P();
        }
        this.w = false;
        this.U = true;
        if (this.l != null) {
            this.l.e();
        }
    }

    public synchronized void t() {
        if (this.l != null) {
            this.l.f();
        }
    }

    public synchronized void u() {
        this.O();
    }

    public void a(float f2) {
        float f3 = this.a();
        this.c(f3 *= f2);
    }

    public void b(float f2) {
        float f3 = this.a();
        this.d(f3 *= f2);
    }

    public void v() {
        this.c(this.a());
    }

    public void w() {
        this.d(this.a());
    }

    public synchronized void d(boolean bl) {
        if (!this.W) {
            AL10.alSourcef((int)this.k.get(0), (int)4106, (float)(bl ? 0.0f : this.p * this.q));
        }
        this.x = bl;
    }

    public synchronized void c(float f2) {
        this.p = Math.min(this.n, Math.max(this.m, f2));
        if (!this.W) {
            if (this.x) {
                AL10.alSourcef((int)this.k.get(0), (int)4106, (float)0.0f);
            } else {
                AL10.alSourcef((int)this.k.get(0), (int)4106, (float)(this.p * this.q));
            }
        }
    }

    public synchronized void d(float f2) {
        f2 = Math.min(this.n, Math.max(this.m, f2));
        if (!this.W) {
            if (this.x) {
                AL10.alSourcef((int)this.k.get(0), (int)4106, (float)0.0f);
            } else {
                AL10.alSourcef((int)this.k.get(0), (int)4106, (float)(f2 * this.q));
            }
        }
    }

    public int x() {
        if (this.l != null) {
            return this.l.g();
        }
        return 0;
    }

    @Override
    public float a() {
        return this.p;
    }

    public void e(float f2) {
        this.n = Math.min(1.0f, Math.max(0.0f, f2));
        if (this.n < this.m) {
            float f3 = this.n;
            this.n = this.m;
            this.m = f3;
        }
        this.c(this.p);
    }

    public void f(float f2) {
        this.m = Math.min(1.0f, Math.max(0.0f, f2));
        if (this.n < this.m) {
            float f3 = this.n;
            this.n = this.m;
            this.m = f3;
        }
    }

    public float y() {
        return this.m;
    }

    public float z() {
        return this.n;
    }

    public synchronized void g(float f2) {
        if (!this.W) {
            AL10.alSourcef((int)this.k.get(0), (int)4099, (float)f2);
            this.o = f2;
        }
    }

    public float A() {
        return this.o;
    }

    public float B() {
        return this.q;
    }

    public void h(float f2) {
        this.q = f2;
        this.c(this.a());
    }

    public synchronized void i(float f2) {
        this.K = f2;
        if (!this.W) {
            AL10.alSourcef((int)this.k.get(0), (int)4128, (float)f2);
        }
    }

    public synchronized void j(float f2) {
        this.L = f2;
        if (!this.W) {
            AL10.alSourcef((int)this.k.get(0), (int)4131, (float)f2);
        }
    }

    public synchronized void k(float f2) {
        this.J = f2;
        if (!this.W) {
            AL10.alSourcef((int)this.k.get(0), (int)4129, (float)f2);
        }
    }

    public synchronized void a(afr_2 afr_22) {
        this.I[0] = afr_22.a();
        this.I[1] = afr_22.b();
        this.I[2] = afr_22.c();
        if (!this.W) {
            AL10.alSource3f((int)this.k.get(0), (int)4100, (float)this.I[0], (float)this.I[1], (float)this.I[2]);
        }
    }

    public synchronized void a(float f2, float f3, float f4) {
        this.I[0] = f2;
        this.I[1] = f3;
        this.I[2] = f4;
        if (!this.W) {
            AL10.alSource3f((int)this.k.get(0), (int)4100, (float)this.I[0], (float)this.I[1], (float)this.I[2]);
            try {
                amj_1 amj_12 = this;
                amj_12.R.f();
            }
            catch (Exception exception) {
                e.error((Object)"Exception during setPosition", (Throwable)exception);
            }
        }
    }

    public long C() {
        if (this.l != null) {
            return this.l.h();
        }
        return -1L;
    }

    public synchronized int c(long l) {
        if (this.l != null) {
            return this.l.b(l);
        }
        return -1;
    }

    public synchronized long e(boolean bl) {
        if (this.l == null || this.S == null || this.W) {
            return -1L;
        }
        long l = this.l.i();
        if (bl) {
            int n = AL10.alGetSourcei((int)this.k.get(0), (int)4117);
            return this.l.i() - (long)(65536 / this.l.k() * n);
        }
        return l;
    }

    public long D() {
        return this.e(true);
    }

    public synchronized int d(long l) {
        if (this.l != null) {
            return this.l.a(l);
        }
        return -1;
    }

    public float E() {
        if (this.l == null) {
            return 0.0f;
        }
        return this.l.j();
    }

    public synchronized int l(float f2) {
        if (this.l != null) {
            return this.l.a(f2);
        }
        return -1;
    }

    public boolean F() {
        return this.X;
    }

    public void m(float f2) {
        this.s = true;
        this.p(f2);
    }

    public void n(float f2) {
        this.t = true;
        this.p(f2);
    }

    public void o(float f2) {
        this.r = f2;
    }

    @Override
    public void a(float f2, float f3) {
        float f4 = f2 - this.a();
        if (f4 > 0.0f && this.z() > f2 || f4 < 0.0f && this.z() < f2) {
            this.e(f2);
        }
        if (f3 > 0.0f) {
            this.r = f4 * 10.0f / f3;
        } else {
            this.c(f2);
        }
    }

    public void p(float f2) {
        this.r = -f2;
    }

    public void e(long l) {
        this.z = l;
    }

    public void f(long l) {
        this.A = l;
    }

    public void e(int n) {
        this.T = n;
    }

    public void f(boolean bl) {
        this.s = bl;
    }

    public void g(boolean bl) {
        this.t = bl;
    }

    public void h(boolean bl) {
        this.u = bl;
    }

    public boolean G() {
        return this.s;
    }

    public boolean H() {
        return this.t;
    }

    public boolean I() {
        return this.u;
    }

    public String J() {
        if (this.l == null) {
            return null;
        }
        return "URL : " + this.l.b();
    }

    public String K() {
        if (this.l == null) {
            return null;
        }
        return this.l.p();
    }

    public long L() {
        if (this.l == null) {
            return -1L;
        }
        return Co.f(this.l.p());
    }

    public String toString() {
        return "URL : " + this.l.b() + "\n\tSample Rate : " + this.l.d() + "Hz\n\tChannels : " + this.l.c();
    }
}

