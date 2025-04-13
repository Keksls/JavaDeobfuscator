/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.keplerproject.luajava.LuaObject
 *  org.keplerproject.luajava.LuaState
 */
import com.ankamagames.baseImpl.graphics.isometric.particles.FreeParticleSystem;
import org.keplerproject.luajava.LuaObject;
import org.keplerproject.luajava.LuaState;

/*
 * Renamed from ame
 */
public class ame_0
extends akk_2 {
    private static final String a = "addTweenParticleSystem";
    private static final akf_1[] b = new akf_1[]{new akf_1("particleFileId", "Id du systeme", akg_2.d, false), new akf_1("startX", "Position de depart x", akg_2.d, false), new akf_1("startY", "Position de depart y", akg_2.d, false), new akf_1("startZ", "Position de depart z", akg_2.d, false), new akf_1("destX", "Position de destination x", akg_2.d, false), new akf_1("destY", "Position de destination y", akg_2.d, false), new akf_1("destZ", "Position de destination z", akg_2.d, false), new akf_1("angle", "Angle de la courbure que le syst?me suivra pour aller d'un point ? l'autre", akg_2.d, false), new akf_1("type", "Inutilis? (laisser ? 1)", akg_2.d, false), new akf_1("timeCoef", "Valeur permettant d'accelerer ou de ralentir le d?placement", akg_2.e, true), new akf_1("level", "Niveau du systeme", akg_2.d, true)};
    private static final akf_1[] c = new akf_1[]{new akf_1("systemId", "Id unique du systeme", akg_2.d, false), new akf_1("movementDuration", "Temps en ms que mettra le d?placement", akg_2.d, false)};

    public ame_0(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String a() {
        return a;
    }

    @Override
    public String b() {
        return "Ajoute un syst?me de particules en le faisant se d?placer entre deux points du monde. Attention, plus l'angle est faible plus le chemin est court, et donc plus le syst?me aura tendance ? aller vite.";
    }

    @Override
    public akf_1[] e() {
        return b;
    }

    @Override
    public final akf_1[] f() {
        return c;
    }

    @Override
    public void a(int n) {
        LuaObject luaObject = this.m().k().getLuaObject("fightId");
        int n2 = -1;
        if (luaObject.isNumber()) {
            n2 = (int)luaObject.getNumber();
            if (!aij_0.a().c(n2)) {
                this.q(0);
                this.q(0);
                return;
            }
        }
        int n3 = this.d(0);
        int n4 = this.d(1);
        int n5 = this.d(2);
        int n6 = this.d(3);
        int n7 = this.d(4);
        int n8 = this.d(5);
        int n9 = this.d(6);
        int n10 = this.d(7);
        this.d(8);
        float f2 = n >= 9 ? this.f(9) : -1.0f;
        FreeParticleSystem freeParticleSystem = n >= 10 ? aij_0.a().a(n3, this.d(10)) : aij_0.a().a(n3);
        freeParticleSystem.a(n4, (float)n5, (float)n6);
        aiu_0 aiu_02 = f2 < 0.0f ? new aiu_0(freeParticleSystem, n7, n8, n9, n10) : new aiu_0(freeParticleSystem, n7, n8, n9, n10, f2);
        int n11 = (int)aiu_02.f();
        freeParticleSystem.a(n2);
        aik_0.a().b(freeParticleSystem);
        aix_0.a().a(aiu_02);
        this.q(freeParticleSystem.ac());
        this.q(n11);
    }
}

