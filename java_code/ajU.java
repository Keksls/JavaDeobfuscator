/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.keplerproject.luajava.LuaState
 */
import org.keplerproject.luajava.LuaState;

class ajU
extends akk_2 {
    ajU(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String a() {
        return "addFlyingImageMob";
    }

    @Override
    public akf_1[] e() {
        return new akf_1[]{new akf_1("mobileId", null, akg_2.d, true), new akf_1("imagePath", null, akg_2.c, true)};
    }

    @Override
    public akf_1[] f() {
        return null;
    }

    @Override
    protected void a(int n) {
        long l = this.g(0);
        String string = this.i(1);
        afv afv2 = afz_0.d().b(l);
        zp_0 zp_02 = new zp_0();
        zo_0 zo_02 = new zo_0(string, -1, -1, (zt_0)zp_02, 3000);
        zo_02.a(afv2);
        zd_0.a().a(zo_02);
    }
}

