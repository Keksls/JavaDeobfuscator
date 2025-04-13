/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.keplerproject.luajava.LuaState
 */
import org.keplerproject.luajava.LuaState;

class bWR
extends akk_2 {
    bWR(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String a() {
        return "copyActorFrom";
    }

    @Override
    public String b() {
        return "Copy a mobile from another (both mobiles must exist)";
    }

    @Override
    public akf_1[] e() {
        return bwk_0.r;
    }

    @Override
    public akf_1[] f() {
        return null;
    }

    @Override
    protected void a(int n) {
        long l = this.g(0);
        long l2 = this.g(1);
        afv afv2 = afz_0.d().b(l);
        afv afv3 = afz_0.d().b(l2);
        if (afv2 == null) {
            this.a(bwk_0.r(), "le mobile " + l + " n'existe pas ");
            return;
        }
        if (afv3 == null) {
            this.a(bwk_0.s(), "le mobile " + l2 + " n'existe pas ");
            return;
        }
        afv3.a((abu)afv2);
    }
}

