/*
 * Decompiled with CFR 0.152.
 */
package com.ankamagames.framework.graphics.engine.particleSystem;

import com.ankamagames.framework.graphics.engine.particleSystem.Particle;

public final class Particle$ObjectFactory
extends abi_1<Particle> {
    public Particle$ObjectFactory() {
        super(Particle.class);
    }

    public Particle a() {
        return new Particle();
    }

    @Override
    public /* synthetic */ abh_1 b() {
        return this.a();
    }
}

