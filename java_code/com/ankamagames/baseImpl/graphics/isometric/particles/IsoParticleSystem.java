/*
 * Decompiled with CFR 0.152.
 */
package com.ankamagames.baseImpl.graphics.isometric.particles;

import com.ankamagames.framework.graphics.engine.geometry.GeometryMesh;
import com.ankamagames.framework.graphics.engine.particleSystem.Emitter;
import com.ankamagames.framework.graphics.engine.particleSystem.Particle;
import com.ankamagames.framework.graphics.engine.particleSystem.ParticleSystem;

public abstract class IsoParticleSystem
extends ParticleSystem
implements alo_1,
aek_0,
aiG {
    public static final afk_2 a = new afk_2(-512, 512, -512, 512);
    private short Y;
    private int Z;
    private byte aa;
    private final afk_2 ab = new afk_2(a);
    private boolean ac = true;

    protected IsoParticleSystem(boolean bl) {
        super(bl);
        aiI.a(this);
    }

    public void b(ahg_0 ahg_02) {
        float f2;
        float f3;
        float f4;
        int n = this.V();
        if (n == 0) {
            return;
        }
        this.a(ahg_02.s().a(this));
        if (this.R[3] < 0.004f) {
            return;
        }
        ahg_02.a(this, this.i > 0.0f);
        for (int k = 0; k < n; ++k) {
            GeometryMesh geometryMesh = (GeometryMesh)this.b(k);
            geometryMesh.c().a();
        }
        float f5 = this.e();
        float f6 = this.f();
        float f7 = this.g();
        this.f = f5;
        this.g = f6;
        this.h = f7;
        this.j = 0.0f;
        this.l = Integer.MAX_VALUE;
        this.n = Integer.MAX_VALUE;
        this.m = Integer.MIN_VALUE;
        this.o = Integer.MIN_VALUE;
        if (this.K) {
            f4 = f5;
            f3 = f6;
            f2 = f7;
        } else {
            f2 = 0.0f;
            f3 = 0.0f;
            f4 = 0.0f;
        }
        this.a(this.H, f4, f3, f2, ahg_02, 0);
        this.al();
        this.T = null;
    }

    public final int x() {
        return this.a(this.H);
    }

    private int a(Particle particle) {
        Emitter[] emitterArray;
        int n = 0;
        if (particle == null) {
            return n;
        }
        if (particle != this.H && particle.z > 0.004f) {
            ++n;
        }
        if ((emitterArray = particle.N) == null) {
            return n;
        }
        int n2 = emitterArray.length;
        for (int k = 0; k < n2; ++k) {
            avm_1 avm_12 = emitterArray[k].h;
            if (avm_12 == null) continue;
            int n3 = avm_12.a();
            for (int i2 = 0; i2 < n3; ++i2) {
                Particle particle2 = avm_12.b(i2);
                n += this.a(particle2);
            }
        }
        return n;
    }

    private void a(Particle particle, float f2, float f3, float f4, ahg_0 ahg_02, int n) {
        Emitter[] emitterArray;
        if (particle == null) {
            return;
        }
        if (IsoParticleSystem.ak()) {
            return;
        }
        if (particle != this.H && particle.z > 0.004f) {
            float f5 = particle.b + f2;
            float f6 = particle.c + f3;
            float f7 = particle.d + f4;
            float f8 = ahg_02.c(f5, f6);
            float f9 = ahg_02.a(f5, f6, f7);
            this.a(particle, f8, f9);
        }
        if ((emitterArray = particle.N) == null) {
            return;
        }
        for (Emitter emitter : emitterArray) {
            float f10;
            float f11;
            float f12;
            avm_1 avm_12 = emitter.h;
            if (avm_12 == null) continue;
            if (!emitter.j.a.u()) {
                f12 = f2;
                f11 = f3;
                f10 = f4;
            } else {
                f12 = f2 + particle.b;
                f11 = f3 + particle.c;
                f10 = f4 + particle.d;
            }
            int n2 = avm_12.a();
            for (int k = 0; k < n2; ++k) {
                Particle particle2 = avm_12.b(k);
                this.a(particle2, f12, f11, f10, ahg_02, n + 1);
            }
        }
    }

    @Override
    public final int aq() {
        return this.Z;
    }

    @Override
    public final short ar() {
        return this.Y;
    }

    @Override
    public final void a(int n, short s2) {
        this.Z = n;
        this.Y = s2;
    }

    public final byte y() {
        return this.aa;
    }

    public final void a(byte by) {
        this.aa = by;
    }

    @Override
    public void z() {
        super.z();
        aic_0.a.b(this);
    }

    @Override
    public float o() {
        return this.e() - this.f();
    }

    @Override
    public float p() {
        return -(this.e() + this.f());
    }

    @Override
    public float q() {
        return this.g() / 4.8f;
    }

    @Override
    public boolean r() {
        return false;
    }

    @Override
    public int s() {
        return this.aq();
    }

    @Override
    public void n_() {
        super.n_();
        aiI.a(this);
        this.R();
        this.ac = true;
    }

    public boolean v() {
        return aiI.b(this);
    }

    public int w() {
        return this.C ? ahi_0.g.a() : ahi_0.m.a();
    }

    public boolean a(ahg_0 ahg_02) {
        return ahg_02.a(this, this, this.G(), this.H(), this.I(), this.w(), true);
    }

    @Override
    public int G() {
        return Hw.b(this.e());
    }

    @Override
    public int H() {
        return Hw.b(this.f());
    }

    @Override
    public short I() {
        return (short)Hw.c(this.g());
    }

    @Override
    public void b(float[] fArray) {
        this.U.a(fArray);
    }

    public afk_2 A() {
        return this.ab;
    }

    public boolean B() {
        return this.ac;
    }

    public void a(boolean bl) {
        this.ac = bl;
    }
}

