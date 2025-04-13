/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.keplerproject.luajava.LuaState
 */
import org.keplerproject.luajava.LuaState;

/*
 * Renamed from caz
 */
public final class caz_1
extends akk_2 {
    public caz_1(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String a() {
        return "getPlayerBreed";
    }

    @Override
    public String b() {
        return "Return the Breed ID and Name of the current local player character";
    }

    @Override
    public akf_1[] e() {
        return null;
    }

    @Override
    public akf_1[] f() {
        return new akf_1[]{new akf_1("localPlayerBreedId", null, akg_2.d, false), new akf_1("localPlayerBreedName", null, akg_2.c, false)};
    }

    @Override
    protected void a(int n) {
        bks_1 bks_12 = azu_0.j().k().bb();
        short s2 = bks_12.a();
        String string = bks_12.b();
        this.q(s2);
        this.a(string);
    }
}

