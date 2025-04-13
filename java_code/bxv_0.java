/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.keplerproject.luajava.LuaState
 */
import org.keplerproject.luajava.LuaState;

/*
 * Renamed from bXV
 */
class bxv_0
extends akk_2 {
    private final String a;
    private final bwg_0 b;

    bxv_0(LuaState luaState, String string, bwg_0 bwg_02) {
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
        return bxi_0.d;
    }

    @Override
    public akf_1[] f() {
        return null;
    }

    @Override
    protected void a(int n) {
        String string = this.i(0);
        akr_2[] akr_2Array = this.a(1, n);
        akx_2 akx_22 = this.m();
        boolean bl = bwh_1.a.a(this.b, new bxw_0(this, akx_22, string, akr_2Array));
        if (!bl) {
            bxi_0.e().warn((Object)("Unable to " + this.a));
        }
    }
}

