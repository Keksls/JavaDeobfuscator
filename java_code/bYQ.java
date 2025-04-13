/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.keplerproject.luajava.LuaState
 */
import org.keplerproject.luajava.LuaState;

public class bYQ
extends akr_1 {
    static final akf_1[] a = new akf_1[]{new akf_1("monsterId", null, akg_2.b, false)};
    static final akf_1[] d = new akf_1[]{new akf_1("breedId", null, akg_2.d, false), new akf_1("familyId", null, akg_2.d, false)};
    static final akf_1[] e = new akf_1[]{new akf_1("monsterId", null, akg_2.b, false)};
    static final akf_1[] f = new akf_1[]{new akf_1("posX", null, akg_2.d, false), new akf_1("posY", null, akg_2.d, false)};
    static final akf_1[] g = new akf_1[]{new akf_1("isOnFight", null, akg_2.f, false)};
    final bbu h;

    @Override
    public final String a() {
        return "Behaviour";
    }

    @Override
    public String b() {
        return "Retrieves informations about the caster and his target in monster behaviour scripts";
    }

    public bYQ(bbu bbu2) {
        this.h = bbu2;
    }

    @Override
    public akk_2[] a(LuaState luaState) {
        return new akk_2[]{new bYR(this, luaState), new bys_0(this, luaState), new bYU(this, luaState), new bYT(this, luaState), new byv_0(this, luaState)};
    }

    @Override
    public akk_2[] b(LuaState luaState) {
        return null;
    }
}

