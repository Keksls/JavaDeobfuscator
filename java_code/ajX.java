/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.keplerproject.luajava.LuaState
 */
import org.keplerproject.luajava.LuaState;

class ajX
extends akk_2 {
    ajX(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String a() {
        return "addPointLight";
    }

    @Override
    public String b() {
        return "Add a point of light";
    }

    @Override
    public akf_1[] e() {
        return new akf_1[]{new akf_1("posX", "Position x", akg_2.e, false), new akf_1("posY", "Position y", akg_2.e, false), new akf_1("posZ", "Position z", akg_2.e, false), new akf_1("red", "R of RGB value", akg_2.e, false), new akf_1("green", "G of RGB value", akg_2.e, false), new akf_1("blue", "B of RGB value", akg_2.e, false), new akf_1("radius", "Light radius (including automatic light attenuation)", akg_2.e, true)};
    }

    @Override
    public akf_1[] f() {
        return new akf_1[]{new akf_1("lightId", null, akg_2.d, false)};
    }

    @Override
    protected void a(int n) {
        adS adS2 = (adS)avo_2.a.a();
        adS2.a(new ahf_0(this.f(0), this.f(1), this.f(2)));
        adS2.c(this.f(3), this.f(4), this.f(5));
        if (n == 7) {
            adS2.a(this.f(6));
        }
        aed.a.a(adS2);
        int n2 = ++ajV.f;
        ajV.a(n2, adS2);
        this.q(n2);
    }
}

