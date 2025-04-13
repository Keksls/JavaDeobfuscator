/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.keplerproject.luajava.LuaState
 */
import org.keplerproject.luajava.LuaState;

/*
 * Renamed from bXa
 */
class bxa_0
extends akk_2 {
    bxa_0(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String a() {
        return "setActorHeight";
    }

    @Override
    public akf_1[] e() {
        return bwk_0.e;
    }

    @Override
    public final akf_1[] f() {
        return null;
    }

    @Override
    public void a(int n) {
        long l = this.g(0);
        short s2 = (short)this.d(1);
        afv afv2 = afz_0.d().b(l);
        if (afv2 == null) {
            bwk_0.h().warn((Object)("impossible de trouver le mobile " + l));
        } else {
            afv2.a(s2);
        }
    }
}

