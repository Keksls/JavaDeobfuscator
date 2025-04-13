/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.keplerproject.luajava.LuaState
 */
import org.keplerproject.luajava.LuaState;

class ajY
extends akk_2 {
    ajY(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String a() {
        return "removeGlobalLight";
    }

    @Override
    public akf_1[] e() {
        return new akf_1[]{new akf_1("lightId", null, akg_2.d, false)};
    }

    @Override
    public akf_1[] f() {
        return null;
    }

    @Override
    protected void a(int n) {
        int n2 = this.d(0);
        aed.a.b(ajV.a(n2));
        ajV.b(n2);
    }
}

