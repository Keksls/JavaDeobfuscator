/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.keplerproject.luajava.LuaState
 */
import org.keplerproject.luajava.LuaState;

class bYP
extends akk_2 {
    final /* synthetic */ byn_0 a;

    bYP(byn_0 byn_02, LuaState luaState) {
        this.a = byn_02;
        super(luaState);
    }

    @Override
    public String a() {
        return "getPlayer";
    }

    @Override
    public akf_1[] e() {
        return null;
    }

    @Override
    public final akf_1[] f() {
        return new akf_1[]{new akf_1("playerId", null, akg_2.b, false)};
    }

    @Override
    public void a(int n) {
        bnh_1 bnh_12 = this.a.a.s();
        if (bnh_12 != null) {
            this.b(bnh_12.a_());
        } else {
            this.l();
        }
    }
}

