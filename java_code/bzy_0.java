/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.Nullable
 *  org.keplerproject.luajava.LuaState
 */
import org.apache.log4j.Logger;
import org.jetbrains.annotations.Nullable;
import org.keplerproject.luajava.LuaState;

/*
 * Renamed from bZY
 */
final class bzy_0
extends cap_2 {
    private static final Logger a = Logger.getLogger(bzy_0.class);
    private static final String c = "getBreedId";
    private static final String d = "Retourne l'id de la breed du personnage pass\u00e9 en param\u00e8tre";
    private static final akf_1[] g = new akf_1[]{new akf_1("characterId", null, akg_2.b, false)};
    private static final akf_1[] h = new akf_1[]{new akf_1("breedId", null, akg_2.d, false)};

    bzy_0(LuaState luaState, bbo_0 bbo_02) {
        super(luaState, bbo_02);
    }

    @Override
    @Nullable
    public akf_1[] e() {
        return g;
    }

    @Override
    @Nullable
    public akf_1[] f() {
        return h;
    }

    @Override
    protected void a(int n) {
        long l = this.g(0);
        blx_1 blx_12 = bmf_2.a().c(l);
        if (blx_12 == null) {
            this.a(a, "CharacterInfo introuvable : " + l);
            this.l();
            return;
        }
        this.q(blx_12.gO());
    }

    @Override
    public String b() {
        return d;
    }

    @Override
    public String a() {
        return c;
    }
}

