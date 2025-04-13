/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
package com.ankamagames.baseImpl.graphics.isometric.particles;

import com.ankamagames.baseImpl.graphics.isometric.particles.IsoParticleSystem;
import com.ankamagames.framework.graphics.engine.entity.Entity;
import java.util.ArrayList;
import org.jetbrains.annotations.Nullable;

public class FreeParticleSystem
extends IsoParticleSystem
implements YQ,
ahh_0 {
    private ahh_0 Y;
    private int Z = -1;
    private int aa = Integer.MIN_VALUE;
    private int ab = Integer.MIN_VALUE;
    private int ac;
    private ArrayList<YR> ad;

    public FreeParticleSystem(boolean bl) {
        super(bl);
    }

    @Override
    public boolean d() {
        return this.h(this.t());
    }

    @Override
    public float e() {
        if (this.Y != null) {
            return this.Y.J();
        }
        return super.e();
    }

    @Override
    public float f() {
        if (this.Y != null) {
            return this.Y.K();
        }
        return super.f();
    }

    @Override
    public float g() {
        if (this.Y != null) {
            return this.Y.L();
        }
        return super.g();
    }

    public ahh_0 h() {
        return this.Y;
    }

    public void a(@Nullable ahh_0 ahh_02) {
        if (ahh_02 == this.Y) {
            return;
        }
        if (this.Y instanceof ain_0) {
            ((ain_0)((Object)this.Y)).b(this);
        }
        this.Y = ahh_02;
        if (this.Y instanceof ain_0) {
            ((ain_0)((Object)this.Y)).a(this);
        }
    }

    @Override
    public boolean at() {
        boolean bl = super.at();
        if (this.Y != null) {
            return bl && this.Y.at();
        }
        return bl;
    }

    public void a(abu abu2, float f2, int n) {
        this.a(f2 == 0.0f && n == 0 ? abu2 : new ahe_0(abu2, f2, n));
    }

    @Override
    public float L() {
        return this.g();
    }

    @Override
    public float J() {
        return this.e();
    }

    @Override
    public float K() {
        return this.f();
    }

    @Override
    public void b(float f2, float f3) {
        this.a(f2, f3);
    }

    @Override
    public void b(float f2, float f3, float f4) {
        this.a(f2, f3, f4);
    }

    @Override
    public int i() {
        return this.aa;
    }

    @Override
    public int j() {
        return this.ab;
    }

    @Override
    public void d(int n) {
        if (this.aa == n) {
            return;
        }
        this.aa = n;
        this.n();
    }

    @Override
    public void e(int n) {
        if (this.ab == n) {
            return;
        }
        this.ab = n;
        this.n();
    }

    @Override
    public void f(int n) {
        if (this.ac == n) {
            return;
        }
        this.ac = n;
        this.n();
    }

    @Override
    public int k() {
        return this.ac;
    }

    @Override
    public boolean l() {
        return this.aa != Integer.MIN_VALUE && this.ab == Integer.MIN_VALUE;
    }

    @Override
    public void a(YR yR) {
        if (this.ad == null) {
            this.ad = new ArrayList(1);
        }
        this.ad.add(yR);
    }

    @Override
    public void b(YR yR) {
        if (this.ad == null) {
            return;
        }
        this.ad.remove(yR);
        if (this.ad.isEmpty()) {
            this.ad = null;
            this.ab = Integer.MIN_VALUE;
            this.aa = Integer.MIN_VALUE;
        }
    }

    protected void n() {
        if (this.ad != null) {
            int n = this.ad.size();
            for (int k = 0; k < n; ++k) {
                this.ad.get(k).a(this, this.aa, this.ab, this.ac);
            }
        }
    }

    public int t() {
        ahh_0 ahh_02 = this.Y;
        if (ahh_02 instanceof ahe_0) {
            ahh_02 = ((ahe_0)ahh_02).a();
        }
        if (ahh_02 instanceof aty_1) {
            return ((aty_1)((Object)ahh_02)).az();
        }
        return this.Z;
    }

    public void a(int n) {
        this.Z = n;
    }

    @Override
    public float aj() {
        return this.i;
    }

    @Override
    public boolean v() {
        return this.Y != null || super.v();
    }

    @Override
    public int w() {
        if (this.Y instanceof abu) {
            return ((abu)this.Y).y() + (this.C ? -1 : 1);
        }
        return super.w();
    }

    @Override
    public boolean a(ahg_0 ahg_02) {
        if (this.Y != null) {
            abu abu2;
            Entity entity;
            ahh_0 ahh_02 = this.Y;
            if (ahh_02 instanceof ahe_0) {
                ahh_02 = ((ahe_0)ahh_02).a();
            }
            if (ahh_02 instanceof abu && (entity = (abu2 = (abu)ahh_02).t()) != null) {
                this.e = entity.e + (long)(this.C ? -1 : 1);
                if (this.e < 0L) {
                    this.e = 0L;
                }
                this.a(abu2.aq(), abu2.ar());
                return true;
            }
        }
        return super.a(ahg_02);
    }

    @Override
    public void n_() {
        super.n_();
        this.Z = -1;
        this.aa = Integer.MIN_VALUE;
        this.ab = Integer.MIN_VALUE;
        this.ac = 0;
        this.ad = null;
    }

    @Override
    public void m() {
        super.m();
        this.a((ahh_0)null);
    }

    public String toString() {
        return "FreeParticleSystem{m_target=" + this.Y + ", m_fightId=" + this.Z + ", m_screenX=" + this.aa + ", m_screenY=" + this.ab + ", m_screenHeight=" + this.ac + ", m_watchers=" + this.ad + "}";
    }
}

