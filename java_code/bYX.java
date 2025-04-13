/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.keplerproject.luajava.LuaState
 */
import org.keplerproject.luajava.LuaState;

class bYX
extends akk_2 {
    final /* synthetic */ byw_0 a;

    bYX(byw_0 byw_02, LuaState luaState) {
        this.a = byw_02;
        super(luaState);
    }

    @Override
    public String a() {
        return "evolveMonsterToBreed";
    }

    @Override
    public akf_1[] e() {
        return new akf_1[]{new akf_1("breedId", null, akg_2.d, false)};
    }

    @Override
    public final akf_1[] f() {
        return null;
    }

    @Override
    public void a(int n) {
        short s2 = (short)this.d(0);
        bmv_1 bmv_12 = (bmv_1)this.a.a.u();
        if (bmv_12 != null) {
            bmv_12.a(s2, this.a.a.t());
        }
    }
}

