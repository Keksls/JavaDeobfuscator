/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.keplerproject.luajava.LuaState
 */
import org.keplerproject.luajava.LuaState;

/*
 * Renamed from caN
 */
public final class can_1
extends akk_2 {
    public can_1(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String a() {
        return "isInFight";
    }

    @Override
    public String b() {
        return "Check if the local player is in fight";
    }

    @Override
    public akf_1[] e() {
        return new akf_1[]{new akf_1("currentFight", "True if player must be in the fight (false if must be in fight or spectator)", akg_2.f, true)};
    }

    @Override
    public final akf_1[] f() {
        return new akf_1[]{new akf_1("inFight", null, akg_2.f, false)};
    }

    @Override
    protected void a(int n) {
        bvx_2 bvx_22 = azu_0.j().k().cP();
        if (bvx_22 == null) {
            this.a(false);
            return;
        }
        if (n == 1 && this.l(0)) {
            this.a(this.m().o() == bvx_22.c());
            return;
        }
        this.a(true);
    }
}

