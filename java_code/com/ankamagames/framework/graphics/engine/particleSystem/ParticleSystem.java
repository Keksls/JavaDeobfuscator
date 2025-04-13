/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
package com.ankamagames.framework.graphics.engine.particleSystem;

import com.ankamagames.framework.graphics.engine.VertexBufferPCT;
import com.ankamagames.framework.graphics.engine.entity.Entity3D;
import com.ankamagames.framework.graphics.engine.geometry.GeometryMesh;
import com.ankamagames.framework.graphics.engine.material.Material;
import com.ankamagames.framework.graphics.engine.opengl.GLGeometryMesh;
import com.ankamagames.framework.graphics.engine.particleSystem.Emitter;
import com.ankamagames.framework.graphics.engine.particleSystem.Particle;
import com.ankamagames.framework.graphics.engine.particleSystem.ParticleSystem$1;
import java.nio.BufferOverflowException;
import java.util.ArrayList;
import org.apache.log4j.Logger;

public class ParticleSystem
extends Entity3D {
    private static final Logger a = Logger.getLogger(ParticleSystem.class);
    public avo_1 Y;
    public static final int b = 16384;
    public static final short[] y = new short[b];
    public static final Material z;
    public long A;
    public int B;
    public boolean C;
    public byte D;
    public axn_2 E = axn_2.b;
    public axn_2 F = axn_2.f;
    protected int G;
    public Particle H;
    protected ArrayList<awn_2> I;
    protected float J;
    protected boolean K;
    protected long L;
    protected float M;
    private float Z;
    private float aa;
    protected float N;
    protected float O;
    protected float P;
    private static int ab;
    private int ac;
    private boolean ad;
    private boolean ae;
    private float af;
    private boolean ag = false;
    public String Q;
    protected final float[] R = new float[]{1.0f, 1.0f, 1.0f, 1.0f};
    private boolean ah = false;
    private boolean ai = false;
    private boolean aj = true;
    private static final float[] ak;
    protected static final float[] S;
    private static final float[] al;
    private static int am;
    private static int an;
    private static int ao;
    protected GeometryMesh T = null;
    protected awr_2 U = awv_2.a();
    private final axa_1 ap = new axa_1();

    public ParticleSystem(boolean bl) {
        this.n_();
        if (bl) {
            this.Y = new avo_1(this);
        } else {
            this.G = 0;
        }
        this.aa = 0.0f;
        this.L = -2521772799257739264L;
    }

    protected boolean d() {
        return this.h(-1);
    }

    protected final boolean h(int n) {
        if (!this.at()) {
            return false;
        }
        return alf_1.b().a(this.B, this.ac, n, -1);
    }

    public void c(boolean bl) {
        this.aj = bl;
    }

    @Override
    public void b(boolean bl) {
        super.b(bl);
        boolean bl2 = this.at();
        if (bl2) {
            if (!this.ah) {
                this.h();
            }
        } else if (this.ah && this.ai) {
            this.j();
        }
    }

    @Override
    public void a(float f2) {
        if (this.H == null) {
            return;
        }
        if (this.Z > 0.0f) {
            if (this.aa >= this.Z) {
                this.X();
                this.W();
            } else {
                this.aa += f2;
            }
        }
        if (this.ag && this.at()) {
            this.h();
            this.ag = false;
        }
        this.H.a(this, f2);
        if (this.J != 0.0f) {
            this.M -= f2;
            if (this.M <= 0.0f && !this.ae) {
                this.Z();
            }
        }
        if (this.Z <= 0.0f && !this.H.b() && !this.ae) {
            this.Z();
        }
        if (!this.ad) {
            return;
        }
        if (this.ae) {
            if (this.H.c()) {
                Emitter[] emitterArray = this.H.N;
                int n = emitterArray.length;
                for (int k = 0; k < n; ++k) {
                    if (!emitterArray[k].a()) continue;
                    return;
                }
            }
            this.z();
        } else {
            this.af -= f2;
            if (this.af <= 0.0f) {
                this.z();
            }
        }
    }

    private void h() {
        if (this.aj && !this.ah) {
            this.ai = this.d();
            this.ah = true;
        }
    }

    private void j() {
        if (this.ah) {
            alf_1.b().a(this.ac, this.ai);
        }
        this.ai = false;
        this.ah = false;
    }

    @Override
    public void a(aui_2 aui_22) {
        if (this.H == null || this.H.N == null) {
            return;
        }
        axr_2.a().a(1.0f);
        super.a(aui_22);
    }

    public void W() {
        if (this.H == null || this.H.N == null) {
            return;
        }
        for (Emitter emitter : this.H.N) {
            emitter.c();
            emitter.a(false);
        }
    }

    public void X() {
        this.aa = 0.0f;
        this.T = null;
        this.ad = false;
        this.ae = false;
        this.ag = true;
        this.aj = true;
        this.ai = false;
        this.ah = false;
        this.U = awv_2.a();
    }

    public void Y() {
        if (this.H == null) {
            return;
        }
        if (this.H.N == null) {
            return;
        }
        Emitter[] emitterArray = this.H.N;
        int n = emitterArray.length;
        for (int k = 0; k < n; ++k) {
            emitterArray[k].a(true);
        }
    }

    public void Z() {
        this.Y();
        this.ad = true;
        this.ae = true;
    }

    public void i(int n) {
        this.Y();
        this.af = (float)n / 1000.0f;
        this.ad = true;
        this.ae = false;
    }

    public void aa() {
        this.ad = true;
        this.ae = false;
    }

    public void z() {
        if (this.H == null) {
            return;
        }
        int n = this.I.size();
        for (int k = 0; k < n; ++k) {
            this.I.get(k).f();
        }
        this.j();
        this.aj = true;
        this.H.a(this);
        this.H.u();
        this.H = null;
        this.u();
    }

    public boolean ab() {
        return this.Y != null;
    }

    public void a(awn_2 awn_22) {
        this.I.add(awn_22);
        if (!this.ab()) {
            this.G += awn_22.a.c();
        }
    }

    public final int ac() {
        return this.ac;
    }

    public int ad() {
        return this.B;
    }

    public int ae() {
        return (int)(this.J * 1000.0f);
    }

    public void j(int n) {
        this.J = (float)n / 1000.0f;
        if (this.J != 0.0f) {
            this.M = this.J;
        }
    }

    public boolean af() {
        return this.K;
    }

    public void d(boolean bl) {
        this.K = bl;
        this.H.M = bl;
    }

    public ArrayList<awn_2> ag() {
        return this.I;
    }

    public final void a(float[] fArray) {
        System.arraycopy(fArray, 0, this.R, 0, fArray.length);
    }

    public final void b(float f2, float f3, float f4, float f5) {
        this.R[0] = f2;
        this.R[1] = f3;
        this.R[2] = f4;
        this.R[3] = f5;
    }

    public void b(float f2) {
        this.Z = f2;
    }

    public void a(float f2, float f3) {
        this.N = f2;
        this.O = f3;
    }

    public void a(float f2, float f3, float f4) {
        this.N = f2;
        this.O = f3;
        this.P = f4;
    }

    public float e() {
        return this.N;
    }

    public float f() {
        return this.O;
    }

    public float g() {
        return this.P;
    }

    public void a(long l) {
        this.L = l;
    }

    public final long k(int n) {
        assert (this.L != -2521772799257739264L);
        return this.L + (long)n;
    }

    public void ah() {
        this.H.a(this, this.I);
    }

    public static int b(awn_2 awn_22) {
        int n = 0;
        n += awn_22.a.c();
        if (awn_22.d == null) {
            return n;
        }
        int n2 = awn_22.d.size();
        for (int k = 0; k < n2; ++k) {
            awn_2 awn_23 = awn_22.d.get(k);
            n += awn_22.a.c() * ParticleSystem.b(awn_23);
        }
        return n;
    }

    public final void a(ays_2 ays_22) {
        assert (!this.ab()) : "Initialize should not be called on editable particle systems";
        this.k();
        if (this.G == 0) {
            return;
        }
        GLGeometryMesh gLGeometryMesh = (GLGeometryMesh)GLGeometryMesh.k.d();
        this.a(gLGeometryMesh);
        gLGeometryMesh.a(this.E, this.F);
        this.a(gLGeometryMesh, ays_22, z);
        gLGeometryMesh.u();
        this.ag = true;
    }

    private void k() {
        this.G = 0;
        int n = this.I.size();
        for (int k = 0; k < n; ++k) {
            awn_2 awn_22 = this.I.get(k);
            this.G += ParticleSystem.b(awn_22);
        }
    }

    private void a(GeometryMesh geometryMesh) {
        geometryMesh.a(ave_1.g, this.G * 4, auf_2.b);
    }

    public void ai() {
        this.k();
        this.a((GeometryMesh)this.b(0));
    }

    protected static boolean ak() {
        return am >= ak.length;
    }

    protected void a(Particle particle, float f2, float f3) {
        float f4 = 2.0f * particle.A * particle.u;
        float f5 = 2.0f * particle.B * particle.v;
        float f6 = Hw.i(particle.t);
        float f7 = Hw.h(particle.t);
        float f8 = -particle.C * particle.u;
        float f9 = (particle.D - particle.B * 2.0f) * particle.v;
        float f10 = f2 + (f6 * f8 - f7 * f9);
        float f11 = f3 + (f7 * f8 + f6 * f9);
        float f12 = f10 - f7 * f5;
        float f13 = f11 + f6 * f5;
        float f14 = f6 * f4;
        float f15 = f7 * f4;
        float f16 = f12 + f14;
        float f17 = f13 + f15;
        float f18 = f10 + f14;
        float f19 = f11 + f15;
        GeometryMesh geometryMesh = this.ab() ? particle.L.g.get(particle.I) : (GeometryMesh)this.b(0);
        if (this.T != null && this.T != geometryMesh) {
            this.al();
        }
        this.T = geometryMesh;
        if (f10 == Float.NaN || f11 == Float.NaN || f12 == Float.NaN || f13 == Float.NaN || f16 == Float.NaN || f17 == Float.NaN || f18 == Float.NaN || f19 == Float.NaN) {
            return;
        }
        this.ap.a(particle.k, particle.l, particle.m);
        float f20 = particle.b + f2;
        float f21 = particle.c + f3;
        float f22 = particle.d;
        this.ap.a(f10, f11, 0.0f, f20, f21, 0.0f);
        ParticleSystem.ak[ParticleSystem.am++] = this.ap.a;
        ParticleSystem.ak[ParticleSystem.am++] = this.ap.b;
        this.ap.a(f12, f13, 0.0f, f20, f21, 0.0f);
        ParticleSystem.ak[ParticleSystem.am++] = this.ap.a;
        ParticleSystem.ak[ParticleSystem.am++] = this.ap.b;
        this.ap.a(f16, f17, 0.0f, f20, f21, 0.0f);
        ParticleSystem.ak[ParticleSystem.am++] = this.ap.a;
        ParticleSystem.ak[ParticleSystem.am++] = this.ap.b;
        this.ap.a(f18, f19, 0.0f, f20, f21, 0.0f);
        ParticleSystem.ak[ParticleSystem.am++] = this.ap.a;
        ParticleSystem.ak[ParticleSystem.am++] = this.ap.b;
        float f23 = particle.w * this.R[0];
        float f24 = particle.x * this.R[1];
        float f25 = particle.y * this.R[2];
        float f26 = particle.z * this.R[3];
        ParticleSystem.S[ParticleSystem.an++] = f23;
        ParticleSystem.S[ParticleSystem.an++] = f24;
        ParticleSystem.S[ParticleSystem.an++] = f25;
        ParticleSystem.S[ParticleSystem.an++] = f26;
        ParticleSystem.S[ParticleSystem.an++] = f23;
        ParticleSystem.S[ParticleSystem.an++] = f24;
        ParticleSystem.S[ParticleSystem.an++] = f25;
        ParticleSystem.S[ParticleSystem.an++] = f26;
        ParticleSystem.S[ParticleSystem.an++] = f23;
        ParticleSystem.S[ParticleSystem.an++] = f24;
        ParticleSystem.S[ParticleSystem.an++] = f25;
        ParticleSystem.S[ParticleSystem.an++] = f26;
        ParticleSystem.S[ParticleSystem.an++] = f23;
        ParticleSystem.S[ParticleSystem.an++] = f24;
        ParticleSystem.S[ParticleSystem.an++] = f25;
        ParticleSystem.S[ParticleSystem.an++] = f26;
        ParticleSystem.al[ParticleSystem.ao++] = particle.F;
        ParticleSystem.al[ParticleSystem.ao++] = particle.G;
        ParticleSystem.al[ParticleSystem.ao++] = particle.F;
        ParticleSystem.al[ParticleSystem.ao++] = particle.E;
        ParticleSystem.al[ParticleSystem.ao++] = particle.H;
        ParticleSystem.al[ParticleSystem.ao++] = particle.E;
        ParticleSystem.al[ParticleSystem.ao++] = particle.H;
        ParticleSystem.al[ParticleSystem.ao++] = particle.G;
        if (f10 < (float)this.l) {
            this.l = (int)f10;
        }
        if (f11 < (float)this.n) {
            this.n = (int)f11;
        }
        if (f16 > (float)this.m) {
            this.m = (int)f16;
        }
        if (f17 > (float)this.o) {
            this.o = (int)f17;
        }
    }

    protected void al() {
        if (this.T == null) {
            return;
        }
        VertexBufferPCT vertexBufferPCT = this.T.c();
        try {
            int n = am / 2;
            vertexBufferPCT.a(ak, am);
            this.U.a(vertexBufferPCT, S, an);
            vertexBufferPCT.e(al, ao);
            vertexBufferPCT.a(vertexBufferPCT.j() + n);
        }
        catch (BufferOverflowException bufferOverflowException) {
            a.error((Object)("systemFile=" + this.ad() + " positionIndex=" + am + "  maxVertex=" + vertexBufferPCT.k() + "  numVertex=" + vertexBufferPCT.j()));
            a.error((Object)"", (Throwable)bufferOverflowException);
            System.exit(0);
        }
        ParticleSystem.am();
    }

    protected static void am() {
        am = 0;
        an = 0;
        ao = 0;
    }

    private static int n() {
        return ab++;
    }

    public boolean an() {
        return !this.ad;
    }

    public Emitter[] ao() {
        if (this.H != null) {
            return this.H.N;
        }
        return null;
    }

    public boolean ap() {
        return this.ae;
    }

    public float as() {
        return this.M;
    }

    public avo_1 au() {
        return this.Y;
    }

    public void a(axn_2 axn_22, axn_2 axn_23) {
        this.E = axn_22;
        this.F = axn_23;
    }

    @Override
    public void m() {
        super.m();
        if (this.H != null) {
            this.H.a();
            this.H.u();
            this.H = null;
        }
        this.I = null;
        this.T = null;
    }

    @Override
    public void n_() {
        super.n_();
        if (this.Y != null) {
            this.Y = new avo_1(this);
        } else {
            this.G = 0;
        }
        this.L = -2521772799257739264L;
        this.H = new ParticleSystem$1(this);
        this.H.r = 0.0f;
        this.H.s = Float.MAX_VALUE;
        this.H.b = 0.0f;
        this.H.c = 0.0f;
        this.H.d = 0.0f;
        this.H.h = 0.0f;
        this.H.i = 0.0f;
        this.H.j = 0.0f;
        this.I = new ArrayList(1);
        this.ac = ParticleSystem.n();
        this.A = 0L;
        this.B = 0;
        this.C = false;
        this.D = 0;
        this.E = axn_2.b;
        this.F = axn_2.f;
        this.X();
    }

    public void a(awr_2 awr_22) {
        this.U = awr_22;
    }

    public static /* synthetic */ void a(ParticleSystem particleSystem) {
        super.c();
    }

    static {
        for (int k = 0; k < y.length; ++k) {
            ParticleSystem.y[k] = (short)k;
        }
        z = (Material)Material.d.c();
        z.a(Material.b);
        ak = new float[2 * b];
        S = new float[4 * b];
        al = new float[2 * b];
        ab = 1;
        am = 0;
        an = 0;
        ao = 0;
    }
}

