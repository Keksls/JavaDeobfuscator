/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.keplerproject.luajava.LuaState
 */
import org.keplerproject.luajava.LuaState;

class ajQ
extends akk_2 {
    ajQ(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String a() {
        return "createSnowEffect";
    }

    @Override
    public String b() {
        return "Active un effet de neige";
    }

    @Override
    public akf_1[] e() {
        return new akf_1[]{new akf_1("numParticles", "Nombre de flocons ? l'?cran", akg_2.e, true), new akf_1("numParticlesPerSpawn", "Nombre de flocons a r?g?n?rer", akg_2.e, true), new akf_1("spawnFrequency", "On r?gen?re numParticlesPerSpawn toutes les spawnFrequency millisecondes", akg_2.e, true), new akf_1("particleLifeTime", "Dur\u00e9e de vie d'un flocon", akg_2.e, true), new akf_1("particleSize", "Taille d'un flocon", akg_2.e, true), new akf_1("particleVelocity", "Vitesse d'un flocon", akg_2.e, true), new akf_1("windSpeed", "Vitesse du vent", akg_2.e, true)};
    }

    @Override
    public akf_1[] f() {
        return new akf_1[]{new akf_1("effectId", "Id de l'effet", akg_2.d, false)};
    }

    @Override
    protected void a(int n) {
        int n2 = 512;
        float f2 = 10.0f;
        float f3 = 300.0f;
        float f4 = 20000.0f;
        float f5 = 3.0f;
        if (n >= 1) {
            n2 = this.d(0);
        }
        if (n >= 2) {
            f2 = (float)this.e(1);
        }
        if (n >= 3) {
            f3 = (float)this.e(2);
        }
        if (n >= 4) {
            f4 = (float)this.e(3);
        }
        if (n >= 5) {
            f5 = (float)this.e(4);
        }
        adh_0 adh_02 = new adh_0();
        adh_02.c(n2);
        adh_02.a(f2, f3, f4, f5);
        adh_02.a(ajJ.f());
        adh_02.a(new aeh_2(-18.0f, 18.0f, -18.0f, 18.0f, -18.0f, 18.0f));
        aui_1.a().a(adh_02);
        this.q(adh_02.f());
    }
}

