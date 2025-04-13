/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 *  org.keplerproject.luajava.LuaState
 */
import com.ankamagames.baseImpl.graphics.isometric.particles.FreeParticleSystem;
import org.apache.log4j.Logger;
import org.keplerproject.luajava.LuaState;

public abstract class alZ
extends akk_2 {
    private static final Logger a = Logger.getLogger(alZ.class);

    protected alZ(LuaState luaState) {
        super(luaState);
    }

    @Override
    public akf_1[] f() {
        return new akf_1[]{new akf_1("systemId", null, akg_2.d, false)};
    }

    protected abstract abu a(long var1);

    protected abstract void a(FreeParticleSystem var1, abu var2, int var3);

    protected final void a(FreeParticleSystem freeParticleSystem) {
        int n = this.m().o();
        if (n != -1) {
            freeParticleSystem.a(n);
        }
    }

    @Override
    protected void a(int n) {
        long l = this.g(1);
        abu abu2 = this.a(l);
        if (abu2 != null && !aij_0.a().c(abu2.az())) {
            this.q(0);
            return;
        }
        int n2 = this.d(0);
        FreeParticleSystem freeParticleSystem = n >= 3 ? aij_0.a().a(n2, this.d(2)) : aij_0.a().a(n2);
        if (abu2 != null) {
            this.a(freeParticleSystem, abu2, n);
            aik_0.a().b(freeParticleSystem);
            this.q(freeParticleSystem.ac());
        } else {
            this.a(a, "pas d'?l?ment interactif trouv? " + l);
            this.l();
        }
    }
}

