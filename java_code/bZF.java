/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 *  org.keplerproject.luajava.LuaState
 */
import org.apache.log4j.Logger;
import org.keplerproject.luajava.LuaState;

final class bZF
extends bZs {
    private static final Logger b = Logger.getLogger(bZF.class);
    private static final String c = "hasState";
    private static final String d = "Permet de savoir si le lanceur de l'action poss?de un ?tat optionnellement d'un certain niveau";
    private static final akf_1[] g = new akf_1[]{new akf_1("stateId", null, akg_2.d, false), new akf_1("stateLevel", null, akg_2.d, true)};
    private static final akf_1[] h = new akf_1[]{new akf_1("hasState", null, akg_2.f, false)};

    bZF(LuaState luaState, bal_0 bal_02) {
        super(luaState, bal_02);
    }

    @Override
    public String a() {
        return c;
    }

    @Override
    public akf_1[] e() {
        return g;
    }

    @Override
    public akf_1[] f() {
        return h;
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
            this.a(blx_12.d_(n2));
        } else if (n == 2) {
            int n3 = this.d(1);
            this.a(blx_12.a_(n2, n3));
        } else {
            this.a(b, "Nombre de parametres invalides : " + n);
            this.l();
        }
    }

    @Override
    public String b() {
        return d;
    }
}

