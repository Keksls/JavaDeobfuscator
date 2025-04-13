/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.keplerproject.luajava.LuaState
 */
import org.keplerproject.luajava.LuaState;

class bYG
extends akk_2 {
    final /* synthetic */ bye_0 a;

    bYG(bye_0 bye_02, LuaState luaState) {
        this.a = bye_02;
        super(luaState);
    }

    @Override
    public String a() {
        return "getMobile";
    }

    @Override
    public akf_1[] e() {
        return null;
    }

    @Override
    public final akf_1[] f() {
        return new akf_1[]{new akf_1("mobileId", null, akg_2.b, false)};
    }

    @Override
    public void a(int n) {
        this.b(this.a.d.r().bv().a());
    }
}

