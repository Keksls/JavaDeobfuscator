/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.keplerproject.luajava.LuaState
 */
import org.keplerproject.luajava.LuaState;

class bXZ
extends akk_2 {
    bXZ(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String a() {
        return "removeCallback";
    }

    @Override
    public akf_1[] e() {
        return bxi_0.g;
    }

    @Override
    public akf_1[] f() {
        return null;
    }

    @Override
    protected void a(int n) {
        long l = this.g(0);
        String string = this.i(1);
        bwg_0 bwg_02 = bwg_0.valueOf(string);
        boolean bl = bwh_1.a.a(bwg_02, l);
        if (!bl) {
            bxi_0.h().warn((Object)("Unable to remove callback " + string + "for mobile " + l));
        }
    }
}

