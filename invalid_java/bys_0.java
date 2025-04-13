/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.keplerproject.luajava.LuaState
 */
import org.keplerproject.luajava.LuaState;

/*
 * Renamed from bYS
 */
class bys_0
extends akk_2 {
    final /* synthetic */ bYQ a;

    bys_0(bYQ bYQ2, LuaState luaState) {
        this.a = bYQ2;
        super(luaState);
    }

    @Override
    public String a() {
        return "getMonsterBreedInfo";
    }

    @Override
    public akf_1[] e() {
        return null;
    }

    @Override
    public final akf_1[] f() {
        return bYQ.d;
    }

    @Override
    public void a(int n) {
        bmv_1 bmv_12 = this.a.h.r();
        if (bmv_12 != null) {
            this.q(bmv_12.gO());
            this.q(bmv_12.cO());
        } else {
            this.l();
            this.l();
        }
    }
}

