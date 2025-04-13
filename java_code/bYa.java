/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.keplerproject.luajava.LuaState
 */
import org.keplerproject.luajava.LuaState;

class bYa
extends akk_2 {
    bYa(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String a() {
        return "addSpellCastCallback";
    }

    @Override
    public akf_1[] e() {
        return bxi_0.f;
    }

    @Override
    public akf_1[] f() {
        return null;
    }

    @Override
    protected void a(int n) {
        long l = this.g(0);
        long l2 = this.g(1);
        String string = this.i(2);
        akr_2[] akr_2Array = this.a(3, n);
        akx_2 akx_22 = this.m();
        boolean bl = bwh_1.a.a(bwg_0.m, new byb_0(this, l, l2, akx_22, string, akr_2Array));
        if (!bl) {
            bxi_0.g().warn((Object)("Unable to addSpellCastCallback for mobile " + l));
        }
    }
}

