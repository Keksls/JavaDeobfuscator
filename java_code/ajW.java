/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.keplerproject.luajava.LuaState
 */
import org.keplerproject.luajava.LuaState;

class ajW
extends akk_2 {
    ajW(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String a() {
        return "addGlobalLight";
    }

    @Override
    public akf_1[] e() {
        return new akf_1[]{new akf_1("red", null, akg_2.e, false), new akf_1("green", null, akg_2.e, false), new akf_1("blue", null, akg_2.e, false)};
    }

    @Override
    public akf_1[] f() {
        return new akf_1[]{new akf_1("lightId", null, akg_2.d, false)};
    }

    @Override
    protected void a(int n) {
        acO acO2 = new acO();
        acO2.a(this.f(0), this.f(1), this.f(2));
        aed.a.a(acO2);
        int n2 = ++ajV.f;
        ajV.a(n2, acO2);
        this.q(n2);
    }
}

