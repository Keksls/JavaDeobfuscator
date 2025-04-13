/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.keplerproject.luajava.LuaState
 */
import org.keplerproject.luajava.LuaState;

class bYO
extends akk_2 {
    final /* synthetic */ byn_0 a;

    bYO(byn_0 byn_02, LuaState luaState) {
        this.a = byn_02;
        super(luaState);
    }

    @Override
    public String a() {
        return "getMonster";
    }

    @Override
    public akf_1[] e() {
        return null;
    }

    @Override
    public final akf_1[] f() {
        return new akf_1[]{new akf_1("monsterId", null, akg_2.b, false)};
    }

    @Override
    public void a(int n) {
        bmv_1 bmv_12 = this.a.a.r();
        if (bmv_12 != null) {
            this.b(bmv_12.a_());
        } else {
            this.l();
        }
    }
}

