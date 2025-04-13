/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.jogamp.opengl.util.texture.TextureCoords
 */
package com.ankamagames.framework.graphics.engine.particleSystem;

import com.ankamagames.framework.graphics.engine.geometry.GeometryMesh;
import com.ankamagames.framework.graphics.engine.particleSystem.Emitter;
import com.ankamagames.framework.graphics.engine.particleSystem.Particle$ObjectFactory;
import com.ankamagames.framework.graphics.engine.particleSystem.ParticleSystem;
import com.jogamp.opengl.util.texture.TextureCoords;
import java.util.ArrayList;

public class Particle
extends abh_1 {
    public static final Particle$ObjectFactory a = new Particle$ObjectFactory();
    public float b;
    public float c;
    public float d;
    public float e;
    public float f;
    public float g;
    public float h;
    public float i;
    public float j;
    public float k;
    public float l;
    public float m;
    public float n;
    public float o;
    public float p;
    public float q;
    public float r;
    public float s;
    public float t;
    public float u;
    public float v;
    public float w;
    public float x;
    public float y;
    public float z;
    public float A;
    public float B;
    public float C;
    public float D;
    public float E;
    public float F;
    public float G;
    public float H;
    public int I;
    public avn_1 J;
    public Particle K;
    public Emitter L;
    public boolean M;
    public Emitter[] N;

    Particle() {
        this.h();
    }

    public void a() {
        if (this.N != null) {
            for (Emitter emitter : this.N) {
                emitter.e();
                emitter.u();
            }
            this.N = null;
        }
        this.J = null;
    }

    public void a(ParticleSystem particleSystem, ArrayList<awn_2> arrayList) {
        int n = arrayList.size();
        if (this.N == null) {
            this.N = new Emitter[n];
        }
        if (particleSystem.ab()) {
            avo_1 avo_12 = particleSystem.au();
            for (int k = 0; k < n; ++k) {
                awn_2 awn_22 = arrayList.get(k);
                Emitter emitter = (Emitter)Emitter.a.d();
                emitter.a(awn_22);
                emitter.i = this;
                this.N[k] = emitter;
                avo_12.a(emitter);
            }
        } else {
            for (int k = 0; k < n; ++k) {
                awn_2 awn_23 = arrayList.get(k);
                Emitter emitter = (Emitter)Emitter.a.d();
                emitter.a(awn_23);
                emitter.i = this;
                this.N[k] = emitter;
            }
        }
    }

    public void a(ParticleSystem particleSystem, float f2) {
        Object object;
        this.r += f2;
        this.b += this.h * f2;
        this.c += this.i * f2;
        this.d += this.j * f2;
        if (this.J != null && this.J.b()) {
            object = (awx_1)this.J;
            TextureCoords textureCoords = ((awx_1)object).a((int)(1000.0f * f2));
            this.E = textureCoords.top();
            this.F = textureCoords.left();
            this.G = textureCoords.bottom();
            this.H = textureCoords.right();
        }
        if (this.N == null) {
            return;
        }
        object = this.N;
        int n = ((Emitter[])object).length;
        for (int k = 0; k < n; ++k) {
            ((Emitter)object[k]).a(particleSystem, f2);
        }
    }

    public boolean b() {
        if (this.r <= this.s && this.s != Float.MAX_VALUE) {
            return true;
        }
        if (this.N != null && this.K == null) {
            Emitter[] emitterArray = this.N;
            int n = emitterArray.length;
            for (int k = 0; k < n; ++k) {
                if (!emitterArray[k].a()) continue;
                return true;
            }
        }
        return false;
    }

    public void a(ParticleSystem particleSystem) {
        if (this.N == null) {
            return;
        }
        for (Emitter emitter : this.N) {
            avm_1 avm_12;
            int n;
            emitter.f();
            if (emitter.g != null) {
                int n2 = emitter.g.size();
                for (n = 0; n < n2; ++n) {
                    GeometryMesh geometryMesh = emitter.g.get(n);
                    particleSystem.b(geometryMesh);
                }
                emitter.g.clear();
            }
            if ((avm_12 = emitter.h) != null) {
                int n3 = avm_12.a();
                for (n = 0; n < n3; ++n) {
                    avm_12.b(n).a(particleSystem);
                }
            }
            emitter.u();
        }
        this.N = null;
    }

    public final boolean c() {
        return this.N != null;
    }

    public float e() {
        if (this.M || this.K == null || this.K.M) {
            return this.b;
        }
        return this.K.M ? this.K.e() : 0.0f;
    }

    public float f() {
        if (this.M || this.K == null || this.K.M) {
            return this.c;
        }
        return this.K.M ? this.K.f() : 0.0f;
    }

    public float g() {
        if (this.M || this.K == null || this.K.M) {
            return this.d;
        }
        return this.K.M ? this.K.g() : 0.0f;
    }

    @Override
    public void n_() {
        this.h();
    }

    @Override
    public void m() {
        this.a();
        this.K = null;
        this.L = null;
    }

    private void h() {
        this.e = Float.NaN;
        this.f = Float.NaN;
        this.g = Float.NaN;
        this.q = 0.0f;
    }
}

