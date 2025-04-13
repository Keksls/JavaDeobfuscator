/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.keplerproject.luajava.LuaState
 */
import org.keplerproject.luajava.LuaState;

class ajP
extends akk_2 {
    ajP(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String a() {
        return "createRainEffect";
    }

    @Override
    public String b() {
        return "Active un effet de pluie";
    }

    @Override
    public akf_1[] e() {
        return new akf_1[]{new akf_1("numParticles", "Nombre de gouttes ? l'?cran", akg_2.e, true), new akf_1("numParticlesPerSpawn", "Nombre de gouttes ? g?n?rer", akg_2.e, true), new akf_1("spawnFrequency", "On r?gen?re numParticlesPerSpawn toutes les spawnFrequency millisecondes", akg_2.e, true), new akf_1("particleLifeTime", "Dur\u00e9e de vie d'une goutte", akg_2.e, true), new akf_1("particleHeight", "Taille d'une goutte", akg_2.e, true), new akf_1("particleVelocity", "Vitesse de chute des gouttes", akg_2.e, true), new akf_1("particleAlpha", "Transparence des gouttes", akg_2.e, true), new akf_1("particleAngle", "Angle (en radian) selon lequel tombe les gouttes", akg_2.e, true), new akf_1("particleAngleRandom", "Al\u00e9atoire sur l'angle (en radian ? ajouter ? particleAngle)", akg_2.e, true)};
    }

    @Override
    public akf_1[] f() {
        return new akf_1[]{new akf_1("effectId", "Id de l'effet", akg_2.d, false)};
    }

    @Override
    protected void a(int n) {
        int n2 = 512;
        float f2 = 128.0f;
        float f3 = 100.0f;
        float f4 = 300.0f;
        float f5 = 4.0f;
        float f6 = -60.0f;
        float f7 = 0.25f;
        float f8 = -1.2566371f;
        float f9 = 0.15707964f;
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
        if (n >= 6) {
            f6 = (float)this.e(5);
        }
        if (n == 7) {
            f7 = (float)this.e(6);
        }
        if (n == 8) {
            f8 = (float)this.e(7);
        }
        if (n == 9) {
            f9 = (float)this.e(8);
        }
        adD adD2 = new adD();
        adD2.c(n2);
        adD2.a(f8, f9);
        adD2.a(1.0f, 1.0f, 1.0f, f7, 0.0f);
        adD2.a(f2, f3, f4, f5, f6, 0.0f);
        adD2.a(ajJ.f());
        adD2.a(new aeh_2(-18.0f, 18.0f, -18.0f, 18.0f, -18.0f, 18.0f));
        aui_1.a().a(adD2);
        this.q(adD2.f());
    }
}

