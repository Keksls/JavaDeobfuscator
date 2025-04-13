/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 *  org.keplerproject.luajava.LuaState
 */
import org.apache.log4j.Logger;
import org.keplerproject.luajava.LuaState;

/*
 * Renamed from caw
 */
public class caw_1
extends akk_2 {
    private static final Logger a = Logger.getLogger(caw_1.class);

    public caw_1(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String a() {
        return "getDistanceFromLocalPlayer";
    }

    @Override
    public String b() {
        return "Return the distance between local player and given character";
    }

    @Override
    public akf_1[] e() {
        return new akf_1[]{new akf_1("characterId", "characterId", akg_2.b, false)};
    }

    @Override
    public akf_1[] f() {
        return new akf_1[]{new akf_1("distance", null, akg_2.d, false)};
    }

    @Override
    protected void a(int n) {
        long l = this.g(0);
        blx_1 blx_12 = bmf_2.a().c(l);
        if (blx_12 == null) {
            a.error((Object)("On veut recup la distance s?parant le joueur d'un personnage inexistant :" + l));
            this.l();
            return;
        }
        bmr_1 bmr_12 = azu_0.j().k();
        this.q(blx_12.P_().e(bmr_12.P_()));
    }
}

