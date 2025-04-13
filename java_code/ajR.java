/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.keplerproject.luajava.LuaState
 */
import org.keplerproject.luajava.LuaState;

class ajR
extends akk_2 {
    ajR(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String a() {
        return "stopEffect";
    }

    @Override
    public String b() {
        return "Arr\u00eate execution d'un effet";
    }

    @Override
    public akf_1[] e() {
        return new akf_1[]{new akf_1("effectId", "L'id de l'effet", akg_2.e, false)};
    }

    @Override
    public akf_1[] f() {
        return null;
    }

    @Override
    protected void a(int n) {
        int n2 = this.d(0);
        if (n2 == aup_1.z || n2 == aup_1.A) {
            return;
        }
        auh_1 auh_12 = aui_1.a().b(n2);
        if (auh_12 != null) {
            auh_12.a(false);
            aui_1.a().b(auh_12);
            auh_12.a();
        }
    }
}

