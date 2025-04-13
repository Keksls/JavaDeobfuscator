/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.keplerproject.luajava.LuaState
 */
import org.keplerproject.luajava.LuaState;

class bXf
extends akk_2 {
    bXf(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String a() {
        return "setWeather";
    }

    @Override
    public akf_1[] e() {
        return new akf_1[]{new akf_1("temperature", null, akg_2.e, false), new akf_1("rainIntensity", null, akg_2.e, false), new akf_1("wind", null, akg_2.e, false)};
    }

    @Override
    public final akf_1[] f() {
        return null;
    }

    @Override
    protected void a(int n) {
        float f2 = (float)this.e(0);
        Yf yf = Yf.a(this.d(1));
        float f3 = (float)this.e(2);
        brf_0 brf_02 = new brf_0();
        brf_02.a(f2, f2, f2, 0.0f, new float[]{f2}, yf, f3, 0.0f);
        brh_0.a().a(brf_02);
        cbt_1.a.a(brf_02.h(), 100);
        cbt_1.a.b(brf_02.g());
    }
}

