/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 *  org.keplerproject.luajava.LuaState
 */
import org.apache.log4j.Logger;
import org.keplerproject.luajava.LuaState;

final class bZv
extends bZs {
    private static final Logger b = Logger.getLogger(bZv.class);
    private static final String c = "getCasterBreed";
    private static final String d = "Permet de r?cup?rer l'id de la breed du lanceur";
    private static final akf_1[] g = new akf_1[]{new akf_1("breedId", null, akg_2.d, false)};

    bZv(LuaState luaState, bal_0 bal_02) {
        super(luaState, bal_02);
    }

    @Override
    public String a() {
        return c;
    }

    @Override
    public akf_1[] e() {
        return null;
    }

    @Override
    public akf_1[] f() {
        return g;
    }

    @Override
    protected void a(int n) {
        blx_1 blx_12 = bmf_2.a().c(this.a.f());
        if (blx_12 == null) {
            this.a(b, "CharacterInfo introuvable : " + this.a.f());
            this.l();
            return;
        }
        this.q(blx_12.gO());
    }

    @Override
    public String b() {
        return d;
    }
}

