/*
 * Decompiled with CFR 0.152.
 */
package com.ankamagames.xulor2.graphics;

import com.ankamagames.framework.graphics.engine.entity.EntityGroup;
import com.ankamagames.framework.graphics.engine.geometry.GeometryMesh;
import com.ankamagames.framework.graphics.engine.particleSystem.Emitter;
import com.ankamagames.framework.graphics.engine.particleSystem.Particle;
import com.ankamagames.framework.graphics.engine.particleSystem.ParticleSystem;

public final class XulorParticleSystem
extends ParticleSystem {
    public XulorParticleSystem() {
        super(false);
    }

    public void b(EntityGroup entityGroup) {
        double d2 = this.e();
        double d3 = this.f();
        float f2 = 0.0f;
        float f3 = 0.0f;
        if (this.K) {
            f2 = (float)((double)f2 + d2);
            f3 = (float)((double)f3 + d3);
        }
        if (this.V() == 0) {
            return;
        }
        entityGroup.a(this);
        for (int k = 0; k < this.V(); ++k) {
            GeometryMesh geometryMesh = (GeometryMesh)this.b(k);
            geometryMesh.c().a();
        }
        this.a(this.H, f2, f3, 0);
        this.al();
        this.T = null;
    }

    private void a(Particle particle, float f2, float f3, int n) {
        if (XulorParticleSystem.ak()) {
            return;
        }
        if (particle != this.H && particle.z > 0.004f) {
            this.a(particle, particle.b + f2, particle.c + f3);
        }
        if (particle.N == null) {
            return;
        }
        for (Emitter emitter : particle.N) {
            Particle particle2;
            int n2;
            avm_1 avm_12 = emitter.h;
            if (avm_12 == null) continue;
            int n3 = avm_12.a();
            if (emitter.j.a.u()) {
                for (n2 = 0; n2 < n3; ++n2) {
                    particle2 = avm_12.b(n2);
                    this.a(particle2, particle.b + f2, particle.c + f3, n + 1);
                }
                continue;
            }
            for (n2 = 0; n2 < n3; ++n2) {
                particle2 = avm_12.b(n2);
                this.a(particle2, f2, f3, n + 1);
            }
        }
    }

    @Override
    public void a(awr_2 awr_22) {
        this.U = awv_2.a();
    }
}

