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

public class alY
extends akk_2 {
    private static final String a = "addParticleSystem";
    private static final akf_1[] b = new akf_1[]{new akf_1("particleFileId", "Id du systeme", akg_2.d, false), new akf_1("x", "Position x", akg_2.d, false), new akf_1("y", "Position y", akg_2.d, false), new akf_1("z", "Position z", akg_2.d, false), new akf_1("level", "Niveau du systeme", akg_2.d, true), new akf_1("fightId", null, akg_2.d, true)};
    private static final akf_1[] c = new akf_1[]{new akf_1("systemId", "Id unique de l'APS", akg_2.d, false)};

    public alY(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String a() {
        return a;
    }

    @Override
    public String b() {
        return "Ajoute un syst?me de particules ? un endroit bien pr?cis du monde.";
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
        int n2;
        LuaObject luaObject = this.m().k().getLuaObject("fightId");
        int n3 = -1;
        if (luaObject.isNumber()) {
            n3 = (int)luaObject.getNumber();
            if (!aij_0.a().c(n3)) {
                this.q(0);
                return;
            }
        }
        if ((n2 = this.d(0)) == 0) {
            this.q(-1);
            return;
        }
        if (n >= 6) {
            n3 = this.d(5);
        }
        int n4 = this.d(1);
        int n5 = this.d(2);
        int n6 = this.d(3);
        FreeParticleSystem freeParticleSystem = n >= 5 ? aij_0.a().a(n2, this.d(4)) : aij_0.a().a(n2);
        freeParticleSystem.a(n4, (float)n5, (float)n6);
        freeParticleSystem.a(n3);
        aik_0.a().b(freeParticleSystem);
        this.q(freeParticleSystem.ac());
    }
}

