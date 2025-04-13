/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.keplerproject.luajava.LuaState
 */
import org.keplerproject.luajava.LuaState;

class bXX
extends akk_2 {
    private final String a;
    private final bwg_0 b;

    bXX(LuaState luaState, String string, bwg_0 bwg_02) {
        super(luaState);
        this.a = string;
        this.b = bwg_02;
    }

    @Override
    public String a() {
        return this.a;
    }

    @Override
    public akf_1[] e() {
        return bxi_0.e;
    }

    @Override
    public akf_1[] f() {
        return null;
    }

    @Override
    protected void a(int n) {
        long l = this.g(0);
        String string = this.i(1);
        akr_2[] akr_2Array = this.a(2, n);
        akx_2 akx_22 = this.m();
        boolean bl = bwh_1.a.a(this.b, new bXY(this, l, akx_22, string, akr_2Array));
        if (!bl) {
            bxi_0.f().warn((Object)("Unable to " + this.a + " for mobile " + l));
        }
    }
}

