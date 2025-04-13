/*
 * Decompiled with CFR 0.152.
 */
package com.ankamagames.wakfu.client.alea.graphics.particle;

import com.ankamagames.baseImpl.graphics.isometric.particles.FreeParticleSystem;

public class WakfuFreeParticleSystem
extends FreeParticleSystem {
    public WakfuFreeParticleSystem(boolean bl) {
        super(bl);
    }

    @Override
    public boolean at() {
        bvx_2 bvx_22;
        try {
            bmr_1 bmr_12 = azu_0.j().k();
            if (bmr_12 == null) {
                return true;
            }
            bvx_22 = bmr_12.cP();
        }
        catch (Exception exception) {
            return super.at();
        }
        int n = this.t();
        if (bvx_22 != null && bvx_22.c() != n && bvx_22.g().c(this.G(), this.H())) {
            return false;
        }
        if (n != -1) {
            ahh_0 ahh_02 = this.h();
            blx_1 blx_12 = null;
            if (ahh_02 instanceof blx_1) {
                blx_12 = (blx_1)((Object)ahh_02);
            } else if (ahh_02 instanceof biI) {
                blx_12 = ((biI)ahh_02).bI();
            }
            if (blx_12 != null) {
                boolean bl = blx_12.t();
                if (bl) {
                    return false;
                }
                if (blx_12.a(eoz_1.f)) {
                    return false;
                }
            }
            return aPc.f().a(n);
        }
        return super.at();
    }
}

