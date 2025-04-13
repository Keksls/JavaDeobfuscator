/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 *  org.keplerproject.luajava.LuaState
 */
import org.apache.log4j.Logger;
import org.keplerproject.luajava.LuaState;

final class bZE
extends bZs {
    private static final Logger b = Logger.getLogger(bZE.class);
    private static final akf_1[] c = new akf_1[]{new akf_1("effectId", null, akg_2.d, false)};
    private static final akf_1[] d = new akf_1[]{new akf_1("hasEffect", null, akg_2.f, false)};
    private static final String g = "hasEffect";
    private static final String h = "Permet de savoir si le lanceur de l'action poss?de un effet d'id donn?";

    bZE(LuaState luaState, bal_0 bal_02) {
        super(luaState, bal_02);
    }

    @Override
    public String a() {
        return g;
    }

    @Override
    public akf_1[] e() {
        return c;
    }

    @Override
    public akf_1[] f() {
        return d;
    }

    @Override
    protected void a(int n) {
        blx_1 blx_12 = bmf_2.a().c(this.a.f());
        if (blx_12 == null) {
            this.a(b, "CharacterInfo introuvable : " + this.a.f());
            this.l();
            return;
        }
        int n2 = this.d(0);
        if (n == 1) {
            this.a(blx_12.s(n2));
        } else {
            this.a(b, "Nombre de parametres invalides : " + n);
            this.l();
        }
    }

    @Override
    public String b() {
        return h;
    }
}

