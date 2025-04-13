/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.keplerproject.luajava.LuaState
 */
import org.keplerproject.luajava.LuaState;

/*
 * Renamed from cau
 */
public final class cau_1
extends akk_2 {
    public cau_1(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String a() {
        return "getCharacterName";
    }

    @Override
    public akf_1[] e() {
        return new akf_1[]{new akf_1("characterId", null, akg_2.b, false)};
    }

    @Override
    public final akf_1[] f() {
        return new akf_1[]{new akf_1("characterName", null, akg_2.c, false)};
    }

    @Override
    protected void a(int n) {
        blx_1 blx_12 = bmf_2.a().c(this.g(0));
        this.a(blx_12 != null ? blx_12.dp() : "");
    }
}

