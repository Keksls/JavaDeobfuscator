/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.keplerproject.luajava.LuaState
 */
import org.keplerproject.luajava.LuaState;

/*
 * Renamed from caF
 */
public final class caf_1
extends akk_2 {
    public caf_1(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String a() {
        return "getPlayerPetId";
    }

    @Override
    public akf_1[] e() {
        return null;
    }

    @Override
    public final akf_1[] f() {
        return new akf_1[]{new akf_1("localPlayerPetId", "Local player pet mobile ID", akg_2.b, false)};
    }

    @Override
    protected void a(int n) {
        bMk bMk2 = azu_0.j().k().er();
        if (bMk2 != null) {
            this.b(bMk2.g().a());
        } else {
            this.b(0L);
        }
    }
}

