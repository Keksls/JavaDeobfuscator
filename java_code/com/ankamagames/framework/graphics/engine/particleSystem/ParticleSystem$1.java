/*
 * Decompiled with CFR 0.152.
 */
package com.ankamagames.framework.graphics.engine.particleSystem;

import com.ankamagames.framework.graphics.engine.particleSystem.Particle;
import com.ankamagames.framework.graphics.engine.particleSystem.ParticleSystem;

class ParticleSystem$1
extends Particle {
    final /* synthetic */ ParticleSystem O;

    ParticleSystem$1(ParticleSystem particleSystem) {
        this.O = particleSystem;
    }

    @Override
    public float e() {
        return this.M ? 0.0f : this.O.e();
    }

    @Override
    public float f() {
        return this.M ? 0.0f : this.O.f();
    }

    @Override
    public float g() {
        return this.M ? 0.0f : this.O.g();
    }
}

