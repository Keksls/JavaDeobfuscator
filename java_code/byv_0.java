/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.keplerproject.luajava.LuaState
 */
import org.keplerproject.luajava.LuaState;

/*
 * Renamed from bYV
 */
class byv_0
extends akk_2 {
    final /* synthetic */ bYQ a;

    byv_0(bYQ bYQ2, LuaState luaState) {
        this.a = bYQ2;
        super(luaState);
    }

    @Override
    public String a() {
        return "isMonsterOnFight";
    }

    @Override
    public akf_1[] e() {
        return null;
    }

    @Override
    public final akf_1[] f() {
        return bYQ.g;
    }

    @Override
    public void a(int n) {
        bmv_1 bmv_12 = this.a.h.r();
        if (bmv_12 != null) {
            this.a(bmv_12.ak());
        } else {
            this.l();
        }
    }
}

