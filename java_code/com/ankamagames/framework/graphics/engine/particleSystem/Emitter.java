/*
 * Decompiled with CFR 0.152.
 */
package com.ankamagames.framework.graphics.engine.particleSystem;

import com.ankamagames.framework.graphics.engine.geometry.GeometryMesh;
import com.ankamagames.framework.graphics.engine.particleSystem.Emitter$ObjectFactory;
import com.ankamagames.framework.graphics.engine.particleSystem.Particle;
import com.ankamagames.framework.graphics.engine.particleSystem.ParticleSystem;
import java.util.ArrayList;

public class Emitter
extends abh_1 {
    public static final Emitter$ObjectFactory a = new Emitter$ObjectFactory();
    public float b;
    public float c;
    public float d;
    public boolean e;
    public boolean f;
    public ArrayList<GeometryMesh> g;
    public avm_1 h;
    public Particle i;
    public awn_2 j;
    public awo_2 k;
    public Particle l;
    private avl_1 m;
    private float n = 0.0f;

    Emitter() {
        this.e();
    }

    public void a(awn_2 awn_22) {
        this.j = awn_22;
        this.a(awn_22.e);
    }

    public void a(ParticleSystem particleSystem, float f2) {
        Object object;
        Object object2;
        int n;
        int n2;
        this.b += f2;
        if (this.h != null) {
            n2 = this.h.a();
            for (n = 0; n < n2; ++n) {
                object2 = this.h.b(n);
                if (((Particle)object2).b()) continue;
                ((Particle)object2).a(particleSystem);
                ((abp_1)object2).u();
                this.h.a(n);
            }
            this.h.b();
        }
        if (this.b()) {
            this.b(particleSystem, f2);
        }
        if (this.k != null) {
            if (this.k.c()) {
                n = this.k.d();
                for (n2 = 0; n2 < n; ++n2) {
                    object2 = this.k.b(n2);
                    ((avh_1)object2).a(f2, this.i, this.l, particleSystem);
                }
            }
            if (this.k.a()) {
                n = this.k.b();
                for (n2 = 0; n2 < n; ++n2) {
                    object2 = this.k.a(n2);
                    ((avh_1)object2).a(0.03f, this.i, this.l, particleSystem);
                }
            }
            this.m.a(f2, this, particleSystem);
        }
        if (this.h == null) {
            return;
        }
        n = this.h.a();
        if (this.j.a()) {
            if (n != 0) {
                this.c += f2;
            }
            n2 = this.j.b();
            while (this.c >= 0.03f) {
                for (int k = 0; k < n; ++k) {
                    object = this.h.b(k);
                    float f3 = ((Particle)object).r;
                    ((Particle)object).r = ((Particle)object).q;
                    if (((Particle)object).q <= ((Particle)object).s) {
                        for (int i2 = 0; i2 < n2; ++i2) {
                            avh_1 avh_12 = this.j.a(i2);
                            avh_12.a(0.03f, this.i, (Particle)object, particleSystem);
                        }
                    }
                    ((Particle)object).q += 0.03f;
                    ((Particle)object).r = f3;
                }
                this.c -= 0.03f;
            }
        }
        if (this.j.c()) {
            int n3;
            n2 = this.j.d();
            for (n3 = 0; n3 < n2; ++n3) {
                object = this.j.b(n3);
                for (int k = n - 1; k >= 0 && !((avh_1)object).a(f2, this.i, this.h.b(k), particleSystem); --k) {
                }
            }
            for (n3 = 0; n3 < n; ++n3) {
                this.h.b(n3).a(particleSystem, f2);
            }
        } else {
            for (n2 = 0; n2 < n; ++n2) {
                this.h.b(n2).a(particleSystem, f2);
            }
        }
    }

    public boolean a() {
        if (this.g()) {
            return true;
        }
        if (this.b()) {
            return true;
        }
        if (this.h == null) {
            return false;
        }
        int n = this.h.a();
        for (int k = 0; k < n; ++k) {
            Particle particle = this.h.b(k);
            if (particle.r < particle.s) {
                return true;
            }
            if (!particle.c()) continue;
            Emitter[] emitterArray = particle.N;
            int n2 = emitterArray.length;
            for (int i2 = 0; i2 < n2; ++i2) {
                if (!emitterArray[i2].a()) continue;
                return true;
            }
        }
        return false;
    }

    private boolean g() {
        return this.b < this.j.a.a();
    }

    public boolean b() {
        if (this.i != null && this.i.r <= 0.0f) {
            return false;
        }
        if (this.f) {
            return false;
        }
        if (!this.e) {
            return false;
        }
        if (this.b < this.j.a.a()) {
            return false;
        }
        return this.j.a.b() == 0.0f || !(this.b > this.j.a.b());
    }

    public void b(ParticleSystem particleSystem, float f2) {
        if (this.j.a.e() == 0.0f) {
            return;
        }
        this.d += f2;
        float f3 = this.j.a.e() + this.n;
        if (this.h == null) {
            this.h = new avm_1(this.j.a.c());
        } else {
            if (this.d < f3) {
                return;
            }
            if (this.h.d()) {
                return;
            }
            this.d -= f3;
        }
        this.n = this.j.a.f() * Hw.d();
        for (int k = 0; k < this.j.a.d(); ++k) {
            Particle particle;
            avn_1 avn_12;
            int n = this.j.g();
            if (n < 0 || (avn_12 = this.j.c.get(n)) == null || (particle = avn_12.a(particleSystem)) == null) continue;
            this.h.a(particle);
            particle.I = n;
            particle.L = this;
            this.j.a(particleSystem, this.i, particle);
            avn_12.a(particle);
            if (particle.c()) {
                for (Emitter emitter : particle.N) {
                    if (!emitter.b()) continue;
                    emitter.b(particleSystem, f2);
                }
            }
            if (this.h.d()) break;
        }
    }

    public void a(boolean bl) {
        this.f = bl;
        if (this.h == null) {
            return;
        }
        int n = this.h.a();
        for (int k = 0; k < n; ++k) {
            Particle particle = this.h.b(k);
            if (!particle.c()) continue;
            for (Emitter emitter : particle.N) {
                emitter.a(bl);
            }
        }
    }

    public void c() {
        if (this.h != null) {
            int n = this.h.a();
            for (int k = 0; k < n; ++k) {
                Particle particle = this.h.b(k);
                if (particle.c()) {
                    Emitter[] emitterArray = particle.N;
                    int n2 = emitterArray.length;
                    for (int i2 = 0; i2 < n2; ++i2) {
                        emitterArray[i2].c();
                    }
                }
                particle.u();
            }
            this.h.c();
        }
        if (this.l != null) {
            this.l.b = 0.0f;
            this.l.c = 0.0f;
            this.l.d = 0.0f;
            this.l.h = 0.0f;
            this.l.i = 0.0f;
            this.l.j = 0.0f;
            this.l.r = 0.0f;
            this.l.s = 0.0f;
        }
        this.b = 0.0f;
        this.e = true;
        this.f = false;
        this.d = 0.0f;
    }

    public void e() {
        if (this.h != null) {
            int n = this.h.a();
            for (int k = 0; k < n; ++k) {
                Particle particle = this.h.b(k);
                if (particle.c()) {
                    Emitter[] emitterArray = particle.N;
                    int n2 = emitterArray.length;
                    for (int i2 = 0; i2 < n2; ++i2) {
                        emitterArray[i2].e();
                    }
                }
                particle.u();
            }
            this.h.c();
            this.h = null;
        }
        if (this.g != null) {
            this.g.clear();
            this.g = null;
        }
        this.a((awo_2)null);
        this.b = 0.0f;
        this.c = 0.0f;
        this.e = true;
        this.f = false;
        this.d = 0.0f;
        this.n = 0.0f;
        this.i = null;
        this.j = null;
    }

    public void f() {
        if (this.k == null || this.m == null) {
            return;
        }
        this.m.b();
        this.m = null;
    }

    public void a(awo_2 awo_22) {
        if (awo_22 == this.k) {
            return;
        }
        if (this.m != null) {
            this.m.b();
            this.m = null;
            this.l.a();
            this.l.u();
            this.l = null;
        }
        this.k = awo_22;
        if (this.k != null) {
            this.m = new avl_1(this.k);
            this.m.a();
            this.l = this.k.f();
            this.j.a(this.i, this.l);
            this.l.s -= 0.1f;
            this.l.K = this.i;
        }
    }

    @Override
    public void n_() {
    }

    @Override
    public void m() {
        this.e();
    }
}

