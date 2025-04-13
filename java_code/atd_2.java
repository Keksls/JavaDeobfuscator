/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.set.hash.TIntHashSet
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.NotNull
 */
import com.ankamagames.framework.graphics.engine.Anm2.Anm;
import com.ankamagames.framework.graphics.engine.VertexBufferPCT;
import com.ankamagames.framework.graphics.engine.entity.Entity3D;
import com.ankamagames.framework.graphics.engine.material.Material;
import com.ankamagames.framework.graphics.engine.opengl.GLGeometryMesh;
import com.ankamagames.framework.kernel.core.maths.Matrix44;
import gnu.trove.set.hash.TIntHashSet;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import org.apache.log4j.Logger;
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from atD
 */
public final class atd_2 {
    private static final Logger h = Logger.getLogger(atd_2.class);
    private static final Logger i = Logger.getLogger((String)"animation");
    private static final axn_2 j = axn_2.b;
    private static final Material k;
    private static final float[] l;
    private static final float[] m;
    private static final float[] n;
    private static int o;
    private static int p;
    private static int q;
    private static int r;
    private static long s;
    private static ays_2 t;
    private static final auf_2 u;
    private static final Fx[] v;
    private static final int w = 1003439990;
    private static final int x = 1272524161;
    static final int a = 2048;
    private static final Set<String> y;
    String b;
    private final Anm z;
    private final String A;
    private final String B;
    @NotNull
    private atu_1 C = atu_1.a;
    private atu_1 D = null;
    @NotNull
    private atp_2 E = atp_2.a;
    private float[][] F;
    private String G;
    private gc_0 H;
    private Anm I;
    private int J = -1;
    private boolean K;
    private Material L;
    private axn_2 M;
    private axn_2 N;
    private final afk_2 O = new afk_2();
    private byte P = (byte)-1;
    private final afk_2 Q = new afk_2();
    float c;
    float d;
    float e;
    float f;
    private final Matrix44 R;
    private final Matrix44 S;
    private int T;
    private int U;
    private boolean V = false;
    private boolean W = false;
    private final Fx X = new Fx();
    private byte Y;
    private byte Z;
    private GLGeometryMesh aa;

    public atd_2(Anm anm, String string, String string2) {
        assert (anm != null);
        this.z = anm;
        this.z.k_();
        this.b(anm.q().e());
        this.A = string;
        this.B = string2;
        this.I = null;
        this.H = null;
        this.C = atu_1.a;
        this.E = atp_2.a;
        this.M = j;
        this.N = axn_2.f;
        this.L = null;
        this.b(1.0f);
        this.O.a(Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE);
        this.Q.a(0, 0, 0, 0);
        this.R = (Matrix44)Matrix44.a.d();
        this.R.b();
        this.S = (Matrix44)Matrix44.a.d();
        this.S.b();
        this.K = false;
        this.V = false;
    }

    public atd_2(atd_2 atd_22) {
        this(atd_22.z, atd_22.A, atd_22.B);
        assert (this.A.equals(atd_22.A));
        assert (this.B.equals(atd_22.B));
        if (atd_22.G != null) {
            this.a(atd_22.G);
        }
        this.C = atd_22.C.h();
        this.E = atd_22.E.d();
        this.a(atd_22);
        this.M = atd_22.M;
        this.N = atd_22.N;
        this.L = atd_22.L;
        if (this.L != null) {
            this.L.k_();
        }
        this.O.a(atd_22.O.a(), atd_22.O.b(), atd_22.O.c(), atd_22.O.d());
        this.R.a(atd_22.R);
        this.S.a(atd_22.S);
        this.V = atd_22.V;
        this.T = atd_22.T;
        this.b(atd_22.p());
    }

    public Anm a() {
        return this.z;
    }

    public axn_2 b() {
        return this.M;
    }

    public axn_2 c() {
        return this.N;
    }

    public static ays_2 d() {
        return t;
    }

    public void e() {
        this.z.u();
        this.C.f();
        this.C = atu_1.a;
        this.E.b();
        if (this.D != null) {
            this.D.f();
            this.D = null;
        }
        this.G = null;
        if (this.I != null && this.I != this.z) {
            this.I.u();
            this.I = null;
            this.J = -1;
        }
        this.H = null;
        this.M = j;
        this.N = axn_2.f;
        if (this.L != null) {
            this.L.u();
            this.L = null;
        }
        this.F = null;
        this.K = false;
        this.T = 0;
        this.V = false;
        this.R.u();
        this.S.u();
        this.b(1.0f);
        if (this.aa != null) {
            this.aa.u();
            this.aa = null;
        }
    }

    public String f() {
        return this.B;
    }

    public void a(@NotNull Anm anm, int[] nArray) {
        this.a(anm, null, nArray);
    }

    public void a(@NotNull Anm anm, TIntHashSet tIntHashSet, int[] nArray) {
        if (this.C == atu_1.a) {
            this.C = new atu_1();
        }
        this.C.a(anm, atd_2.a(nArray), tIntHashSet);
        if (anm.c().f().a() > 1) {
            this.J = -1;
        }
        this.g();
    }

    public void b(@NotNull Anm anm, int ... nArray) {
        if (this.C == atu_1.a) {
            return;
        }
        TIntHashSet tIntHashSet = atd_2.a(nArray);
        this.V |= this.C.b(anm, tIntHashSet);
        this.g();
    }

    private static TIntHashSet a(int[] nArray) {
        if (nArray == null || nArray.length == 0) {
            return null;
        }
        return new TIntHashSet(nArray);
    }

    public void g() {
        this.E.c();
        FS[] fSArray = this.z.q().d();
        if (fSArray == null) {
            return;
        }
        ArrayList<FR> arrayList = this.C.e();
        int n = arrayList.size();
        if (n == 0) {
            return;
        }
        int n2 = fSArray.length;
        for (int k = 0; k < n; ++k) {
            FR fR = arrayList.get(k);
            for (int i2 = 0; i2 < n2; ++i2) {
                FS fS = fSArray[i2];
                if (fR.b != fS.a) continue;
                if (this.E == atp_2.a) {
                    this.E = new atp_2();
                }
                this.E.a(fS.b);
            }
        }
    }

    public void a(int n) {
        if (this.E == atp_2.a) {
            this.E = new atp_2();
        }
        this.E.b(n);
    }

    public void b(int n) {
        assert (this.E != atp_2.a);
        this.E.c(n);
    }

    public void c(int n) {
        if (this.E == atp_2.a) {
            this.E = new atp_2();
        }
        this.E.f(n);
    }

    public void d(int n) {
        assert (this.E != atp_2.a);
        this.E.g(n);
    }

    public boolean h() {
        boolean bl = false;
        if (this.b != null) {
            this.a(this.b);
            if (this.b == null) {
                bl = true;
                this.V = true;
            }
        }
        return bl;
    }

    public void a(String string) {
        this.a(string, false);
    }

    public void a(String string, boolean bl) {
        fp_0 fp_02 = this.z.q();
        String string2 = this.d(string);
        if (string2 != string) {
            this.K = true;
            this.X.a(-1.0f, 0.0f, 0.0f, 1.0f);
        } else {
            this.K = false;
            this.X.a();
        }
        this.G = string2;
        this.H = null;
        this.b = null;
        this.W = true;
        this.V = true;
        fo_0 fo_02 = this.a(fp_02, string2, true);
        if (fo_02 == null) {
            String string3 = String.format("[Animation] Not found (%s) %s", this.B + this.A, string2);
            i.error((Object)string3);
            h.warn((Object)string3, (Throwable)new att_1(string3, this.A, string));
            return;
        }
        assert (fo_02.b().equals(string2));
        if (fo_02.a() == -1) {
            assert (this.z.f());
            this.a(this.z, this.z.c().f().a(fo_02.c()), bl);
        } else {
            String string4 = fp_02.a(fo_02.a());
            atf_2.a().a(string4, fo_02, this, bl);
        }
        this.P = (byte)-1;
    }

    public fo_0 a(fp_0 fp_02, String string2, boolean bl) {
        if (this.c(string2)) {
            return fp_02.b(string2);
        }
        if (bl) {
            char c2 = string2.charAt(0);
            return y.stream().filter(string -> this.c(c2 + string)).findFirst().map(string -> fp_02.b(c2 + string)).orElse(null);
        }
        return null;
    }

    public gc_0 i() {
        return this.H;
    }

    public boolean j() {
        return this.b != null;
    }

    public boolean k() {
        return this.W;
    }

    public void a(ArrayList<String> arrayList) {
        fo_0[] fo_0Array = this.z.q().b();
        for (int k = 0; k < fo_0Array.length; ++k) {
            arrayList.add(fo_0Array[k].b());
        }
    }

    public void a(axn_2 axn_22, axn_2 axn_23) {
        this.M = axn_22;
        this.N = axn_23;
    }

    public boolean l() {
        boolean bl = this.C.g();
        if (this.D != null) {
            bl |= this.D.g();
        }
        if (bl) {
            this.g();
        }
        return bl;
    }

    public boolean m() {
        return this.C.d();
    }

    public void a(int n, Entity3D entity3D, int n2) {
        int n3;
        entity3D.c();
        if (this.aa != null && this.J == -1) {
            this.aa.u();
            this.aa = null;
        }
        if (this.H == null) {
            h.error((Object)"On ne peut pas mettre a jour une animation nulle");
            return;
        }
        this.b(this.z.q().e());
        this.T = n3 = this.h(n);
        this.V = true;
        this.W = false;
        this.Y = 0;
        this.Z = 0;
        o = 0;
        s = 0L;
        p = 0;
        q = 0;
        r = 0;
        t = null;
        this.c = Float.MAX_VALUE;
        this.d = -3.4028235E38f;
        this.e = Float.MAX_VALUE;
        this.f = -3.4028235E38f;
        this.X.a((byte)0);
        this.a(n3, this.H, entity3D, this.X, this.I, 0);
        if (o != 0) {
            this.b(entity3D);
        }
        this.O.a((int)this.c, (int)this.d, (int)this.e, (int)this.f);
    }

    public void a(float f2) {
        afk_2 afk_22 = this.O;
        if (this.P == 0) {
            return;
        }
        if (afk_22.b == Integer.MAX_VALUE || afk_22.d == Integer.MAX_VALUE || afk_22.c == Integer.MIN_VALUE || afk_22.e == Integer.MIN_VALUE) {
            this.Q.a(afk_22.b, afk_22.c, afk_22.d, afk_22.e);
            this.P = (byte)-1;
            return;
        }
        if (this.P == -1) {
            this.Q.a(afk_22.b, afk_22.c, afk_22.d, afk_22.e);
            this.P = 0;
            return;
        }
        float f3 = f2 / 300.0f;
        this.P = 0;
        int n = this.a(this.Q.b, afk_22.b, f3);
        int n2 = this.a(this.Q.c, afk_22.c, f3);
        int n3 = this.a(this.Q.d, afk_22.d, f3);
        int n4 = this.a(this.Q.e, afk_22.e, f3);
        this.Q.a(n, n2, n3, n4);
    }

    private int a(int n, int n2, float f2) {
        float f3 = n2 - n;
        if (Math.abs(f3) <= 1.0f) {
            return n;
        }
        this.P = 1;
        return Hw.d((float)n + f3 * f2);
    }

    public static Material n() {
        return k;
    }

    public void a(Material material) {
        if (material != null) {
            material.k_();
        }
        if (this.L != null) {
            this.L.u();
        }
        this.L = material;
    }

    public afk_2 o() {
        return this.O;
    }

    public int e(int n) {
        gc_0 gc_02 = this.H.r() ? this.I.c().f().a(this.H.s()) : this.H;
        if (gc_02 == null) {
            return 0;
        }
        int n2 = this.h(n);
        return atd_2.a(n2, gc_02);
    }

    private static int a(int n, gc_0 gc_02) {
        int n2 = gc_02.i();
        if (n >= n2) {
            if (gc_02.h(128)) {
                return n % n2;
            }
            return n2 - 1;
        }
        return n;
    }

    public float p() {
        return this.z.q().e();
    }

    public void b(float f2) {
        if (this.K) {
            this.X.a(-f2, 0.0f, 0.0f, f2);
        } else {
            this.X.a(f2, 0.0f, 0.0f, f2);
        }
    }

    public boolean q() {
        return this.I != null && this.I.g();
    }

    public int r() {
        gc_0 gc_02;
        assert (this.H != null);
        if (this.H.r()) {
            gc_02 = this.I.c().f().a(this.H.s());
            if (gc_02 == null) {
                return 1;
            }
        } else {
            gc_02 = this.H;
        }
        return gc_02.i();
    }

    public float[] f(int n) {
        if (this.F == null) {
            return null;
        }
        return this.F[n];
    }

    public void a(atm_1 atm_12, float[] fArray) {
        this.a(atm_12.b(), fArray);
    }

    public void a(int n, float[] fArray) {
        if (this.F == null) {
            this.F = new float[atm_1.values().length][];
        }
        this.F[n] = fArray;
    }

    public void a(atd_2 atd_22) {
        float[][] fArray = atd_22.F;
        if (fArray == null) {
            this.F = null;
        } else {
            this.F = new float[fArray.length][];
            for (int k = 0; k < fArray.length; ++k) {
                this.F[k] = (float[])(fArray[k] == null ? null : (float[])fArray[k].clone());
            }
        }
    }

    public void g(int n) {
        if (this.F == null) {
            return;
        }
        this.F[n] = null;
    }

    public void s() {
        this.F = null;
    }

    public void a(ArrayList<Fz> arrayList, int n, int n2) {
        int n3;
        assert (this.H != null);
        if (n == n2 && n != 0) {
            return;
        }
        int n4 = this.r();
        int n5 = n == 0 ? -1 : this.e(n2);
        int n6 = n3 = n == 0 ? 0 : this.e(n);
        if (n5 + 1 > n3) {
            int n7;
            for (n7 = n5 + 1; n7 <= n4 - 1; ++n7) {
                this.H.a(n7, arrayList);
            }
            for (n7 = 0; n7 <= n3; ++n7) {
                this.H.a(n7, arrayList);
            }
        } else {
            for (int k = n5 + 1; k <= n3; ++k) {
                this.H.a(k, arrayList);
            }
        }
    }

    private int h(int n) {
        return (int)((float)this.U + (float)(this.I.b().b() * n) / 1000.0f);
    }

    public Matrix44 t() {
        return this.R;
    }

    public Matrix44 u() {
        return this.S;
    }

    public boolean v() {
        return this.z.f();
    }

    public int b(String string) {
        Anm anm;
        gc_0 gc_02;
        if (!this.z.f()) {
            h.warn((Object)("Impossible de r\u00e9cup\u00e9rer la duree de l'animation " + string + " dans " + this.B + this.A + " : la definition n'est pas chargee"));
            return 0;
        }
        fp_0 fp_02 = this.z.q();
        fo_0 fo_02 = fp_02.b(string = this.d(string));
        if (fo_02 == null) {
            String string2 = String.format("[Animation] Not found (%s) %s", this.B + this.A, string);
            i.error((Object)string2);
            h.warn((Object)string2, (Throwable)new att_1(string2, this.A, string));
            return 0;
        }
        assert (fo_02.b().equals(string));
        if (fo_02.a() == -1) {
            gc_02 = this.z.c().f().a(fo_02.c());
            anm = this.I;
        } else {
            String string3 = this.B + fp_02.a(fo_02.a());
            try {
                anm = atf_2.a().b(string3, true);
                gc_02 = anm != null ? anm.c().f().a(fo_02.c()) : null;
            }
            catch (IOException iOException) {
                h.error((Object)"", (Throwable)iOException);
                return 0;
            }
        }
        return atd_2.a(gc_02, anm);
    }

    private String d(String object) {
        if (this.z.q().k()) {
            char c2 = ((String)object).charAt(0);
            switch (c2) {
                case '4': {
                    object = "0" + ((String)object).substring(1);
                    break;
                }
                case '3': {
                    object = "1" + ((String)object).substring(1);
                    break;
                }
                case '7': {
                    object = "5" + ((String)object).substring(1);
                }
            }
        }
        return object;
    }

    private static int a(gc_0 gc_02, Anm anm) {
        if (gc_02 == null || anm == null) {
            return 0;
        }
        if (gc_02.r() && (gc_02 = anm.c().f().a(gc_02.s())) == null) {
            return 0;
        }
        if (gc_02.h(128)) {
            return Integer.MAX_VALUE;
        }
        int n = gc_02.i();
        return (int)(1000.0f * (float)n / (float)anm.b().b());
    }

    public boolean w() {
        return this.V;
    }

    public void x() {
        this.V = false;
    }

    public void y() {
        this.V = true;
    }

    void a(Anm anm, gc_0 gc_02) {
        if (anm != null && anm != this.z) {
            anm.k_();
        }
        if (this.I != null && this.I != this.z) {
            this.I.u();
        }
        this.I = anm;
        this.J = anm != null ? anm.c().f().a() : 0;
        this.H = gc_02;
        this.P = 1;
        this.U = 0;
    }

    void a(Anm anm, gc_0 gc_02, boolean bl) {
        this.a(anm, gc_02);
        if (bl && gc_02.h(128)) {
            this.T = this.U = Hw.a(gc_02.i());
        }
    }

    private void a(int n, gc_0 gc_02, Entity3D entity3D, Fx fx, Anm anm, int n2) {
        int n3 = atd_2.a(n, gc_02);
        this.E.a();
        int n4 = gc_02.g(n3);
        boolean bl = !anm.c().g().b();
        boolean bl2 = anm.g();
        for (int k = 0; k < n4; ++k) {
            Object object;
            gc_02.t();
            Fx fx2 = v[n2];
            fx2.a(fx.p());
            short s2 = gc_02.a(fx, fx2);
            if (fx2.o() == 0.0f && bl2) continue;
            if (bl && (object = anm.c().g().a(s2)) != null) {
                this.a(n, entity3D, anm, n2, fx2, (fm_0)object);
                continue;
            }
            object = anm.c().f().a(s2);
            if (this.a((gc_0)object)) {
                this.a(this.C, (gc_0)object, n, entity3D, fx2, anm, n2);
                continue;
            }
            FU fU = anm.c().d().a(s2);
            if (fU == null || fx2.o() <= 0.004f && bl2) continue;
            float f2 = fU.i() * fx2.d() + fU.j() * fx2.f() + fx2.h();
            float f3 = fU.i() * -fx2.e() + fU.j() * -fx2.g() - fx2.i();
            float f4 = fx2.f() * (float)fU.h();
            float f5 = -fx2.g() * (float)fU.h();
            float f6 = fx2.d() * (float)fU.g();
            float f7 = -fx2.e() * (float)fU.g();
            long l = anm.r();
            if (s != l) {
                if (o != 0) {
                    this.b(entity3D);
                }
                s = l;
                t = ayu_2.a().a(l);
            }
            float f8 = f4 + f2;
            float f9 = f5 + f3;
            float f10 = f6 + f4 + f2;
            float f11 = f7 + f5 + f3;
            float f12 = f6 + f2;
            float f13 = f7 + f3;
            atd_2.l[atd_2.p++] = f2;
            atd_2.l[atd_2.p++] = f3;
            atd_2.l[atd_2.p++] = f8;
            atd_2.l[atd_2.p++] = f9;
            atd_2.l[atd_2.p++] = f10;
            atd_2.l[atd_2.p++] = f11;
            atd_2.l[atd_2.p++] = f12;
            atd_2.l[atd_2.p++] = f13;
            if (f2 > this.d) {
                this.d = f2;
            } else if (f2 < this.c) {
                this.c = f2;
            }
            if (f8 > this.d) {
                this.d = f8;
            } else if (f8 < this.c) {
                this.c = f8;
            }
            if (f10 > this.d) {
                this.d = f10;
            } else if (f10 < this.c) {
                this.c = f10;
            }
            if (f12 > this.d) {
                this.d = f12;
            } else if (f12 < this.c) {
                this.c = f12;
            }
            if (f3 > this.f) {
                this.f = f3;
            } else if (f3 < this.e) {
                this.e = f3;
            }
            if (f9 > this.f) {
                this.f = f9;
            } else if (f9 < this.e) {
                this.e = f9;
            }
            if (f11 > this.f) {
                this.f = f11;
            } else if (f11 < this.e) {
                this.e = f11;
            }
            if (f13 > this.f) {
                this.f = f13;
            } else if (f13 < this.e) {
                this.e = f13;
            }
            float f14 = fx2.l();
            float f15 = fx2.m();
            float f16 = fx2.n();
            float f17 = fx2.o();
            atd_2.m[atd_2.q++] = f14 *= 0.5f;
            atd_2.m[atd_2.q++] = f15 *= 0.5f;
            atd_2.m[atd_2.q++] = f16 *= 0.5f;
            atd_2.m[atd_2.q++] = f17;
            atd_2.m[atd_2.q++] = f14;
            atd_2.m[atd_2.q++] = f15;
            atd_2.m[atd_2.q++] = f16;
            atd_2.m[atd_2.q++] = f17;
            atd_2.m[atd_2.q++] = f14;
            atd_2.m[atd_2.q++] = f15;
            atd_2.m[atd_2.q++] = f16;
            atd_2.m[atd_2.q++] = f17;
            atd_2.m[atd_2.q++] = f14;
            atd_2.m[atd_2.q++] = f15;
            atd_2.m[atd_2.q++] = f16;
            atd_2.m[atd_2.q++] = f17;
            atd_2.n[atd_2.r++] = fU.d();
            atd_2.n[atd_2.r++] = fU.e();
            atd_2.n[atd_2.r++] = fU.d();
            atd_2.n[atd_2.r++] = fU.c();
            atd_2.n[atd_2.r++] = fU.f();
            atd_2.n[atd_2.r++] = fU.c();
            atd_2.n[atd_2.r++] = fU.f();
            atd_2.n[atd_2.r++] = fU.e();
            ++o;
        }
    }

    private void a(int n, Entity3D entity3D, Anm anm, int n2, Fx fx, fm_0 fm_02) {
        Object object;
        if (this.D != null && (object = this.D.a(fm_02.c())) != null) {
            if (this.a(((ato_2)object).c)) {
                this.a(this.D, ((ato_2)object).c, n, entity3D, fx, anm, n2);
            }
            return;
        }
        object = this.z.c().f().a(fm_02.c());
        if (this.a((gc_0)object)) {
            this.a(this.C, (gc_0)object, n, entity3D, fx, this.z, n2);
        }
    }

    private boolean a(gc_0 gc_02) {
        return gc_02 != null && !this.E.h(gc_02.d());
    }

    private void a(Entity3D entity3D) {
        int n = o * 4;
        VertexBufferPCT vertexBufferPCT = VertexBufferPCT.d.b(n);
        this.a(vertexBufferPCT, n);
        GLGeometryMesh gLGeometryMesh = (GLGeometryMesh)GLGeometryMesh.k.d();
        gLGeometryMesh.a(this.M, this.N);
        gLGeometryMesh.a(ave_1.g, vertexBufferPCT, u, Arrays.copyOf(m, n * 4));
        entity3D.a(gLGeometryMesh, t, this.L);
        gLGeometryMesh.u();
        o = 0;
        p = 0;
        q = 0;
        r = 0;
        vertexBufferPCT.u();
    }

    private void a(VertexBufferPCT vertexBufferPCT, int n) {
        vertexBufferPCT.b(l, p);
        vertexBufferPCT.d(m, q);
        vertexBufferPCT.f(atd_2.n, r);
        vertexBufferPCT.a(n);
    }

    private void b(Entity3D entity3D) {
        this.Z = (byte)(this.Z + 1);
        this.Y = (byte)(this.Y + o);
        if (this.J == -1 || entity3D.V() != 0) {
            this.a(entity3D);
            return;
        }
        int n = o * 4;
        if (this.aa != null && this.aa.c().k() < n) {
            this.aa.u();
            this.aa = null;
        }
        if (this.aa == null) {
            VertexBufferPCT vertexBufferPCT = VertexBufferPCT.d.b(Math.max(this.J * 4, n));
            this.aa = (GLGeometryMesh)GLGeometryMesh.k.d();
            this.aa.a(ave_1.g, vertexBufferPCT, u, m);
            vertexBufferPCT.u();
        }
        this.aa.a(m, n);
        this.aa.a(this.M, this.N);
        this.a(this.aa.c(), n);
        entity3D.a(this.aa, t, this.L);
        o = 0;
        p = 0;
        q = 0;
        r = 0;
    }

    private void a(atu_1 atu_12, gc_0 gc_02, int n, Entity3D entity3D, Fx fx, Anm anm, int n2) {
        int n3 = gc_02.e() & 0x3F;
        if (atu_12.b() && !this.a(atu_12, gc_02, n, entity3D, fx, n2, n3)) {
            return;
        }
        if (this.F != null && n3 != atm_1.a.b()) {
            this.a(fx, n3);
        }
        if (gc_02.b() != null) {
            switch (gc_02.d()) {
                case 1272524161: {
                    this.a(fx, this.R.c());
                    break;
                }
                case 1003439990: {
                    this.a(fx, this.S.c());
                }
            }
        }
        this.a(n, gc_02, entity3D, fx, anm, n2 + 1);
    }

    private boolean a(atu_1 atu_12, gc_0 gc_02, int n, Entity3D entity3D, Fx fx, int n2, int n3) {
        ato_2 ato_22 = atu_12.a(gc_02.c());
        if (ato_22 == null) {
            return true;
        }
        if (gc_02.b() != null && n3 != atm_1.a.b() && n3 != atm_1.j.b() && n3 != atm_1.g.b() && n3 != atm_1.h.b() && this.F != null) {
            this.a(fx, n3);
        }
        gc_0 gc_03 = ato_22.c;
        assert (gc_03 != null);
        this.a(n, gc_03, entity3D, fx, ato_22.b, n2 + 1);
        return false;
    }

    private void a(Fx fx, int n) {
        if (n != fx.p()) {
            float[] fArray = this.F[fx.p()];
            if (fArray != null) {
                fx.g(fx.l() / fArray[0]);
                fx.h(fx.m() / fArray[1]);
                fx.i(fx.n() / fArray[2]);
                fx.j(fx.o() / fArray[3]);
            }
            if ((fArray = this.F[n]) != null) {
                fx.g(fx.l() * fArray[0]);
                fx.h(fx.m() * fArray[1]);
                fx.i(fx.n() * fArray[2]);
                fx.j(fx.o() * fArray[3]);
                fx.a((byte)n);
            }
        }
    }

    private void a(Fx fx, float[] fArray) {
        fArray[0] = this.K ? -fx.d() : fx.d();
        fArray[1] = fx.e();
        fArray[4] = fx.f();
        fArray[5] = fx.g();
        fArray[12] = fx.h();
        fArray[13] = -fx.i();
    }

    public boolean c(String string) {
        string = this.d(string);
        return this.z.q().b(string) != null;
    }

    public float z() {
        if (this.z.q().i()) {
            return this.z.q().f();
        }
        return 1.0f;
    }

    public afk_2 A() {
        return this.Q;
    }

    public float B() {
        return this.c;
    }

    public float C() {
        return this.e;
    }

    public String D() {
        return this.B + this.A + ".anm";
    }

    public boolean E() {
        return this.C.c();
    }

    public atu_1 F() {
        return this.C.h();
    }

    public atu_1 G() {
        return this.D == null ? null : this.D.h();
    }

    public void a(atu_1 atu_12, atu_1 atu_13) {
        assert (this.C != null);
        this.C.f();
        this.C = atu_12.h();
        this.D = atu_13 == null ? null : atu_13.h();
        this.g();
    }

    public atp_2 H() {
        return this.E.d();
    }

    public void a(atp_2 atp_22) {
        this.E.b();
        this.E = atp_22.d();
    }

    public void I() {
        this.C.f();
        this.g();
    }

    public String toString() {
        return "AnmInstance - " + this.A + " [" + this.G + "]";
    }

    public byte J() {
        return this.Y;
    }

    public byte K() {
        return this.Z;
    }

    public void a(Anm anm) {
        if (this.D == null) {
            this.D = new atu_1();
        }
        this.D.a(anm, null);
    }

    public void b(Anm anm) {
        if (this.D != null) {
            this.D.b(anm, null);
        }
    }

    static {
        u = auf_2.b;
        y = Stream.of("_Cadre", "_AnimStatiqueCadre", "_AnimStatique").collect(Collectors.toCollection(HashSet::new));
        k = Material.b;
        l = new float[4096];
        m = new float[8192];
        n = new float[4096];
        int n = 32;
        v = new Fx[32];
        for (int k = 0; k < v.length; ++k) {
            atd_2.v[k] = new Fx();
        }
    }
}

