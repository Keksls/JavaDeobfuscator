/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.keplerproject.luajava.LuaState
 */
import org.keplerproject.luajava.LuaState;

class bXb
extends akk_2 {
    bXb(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String a() {
        return "stopMovingActor";
    }

    @Override
    public String b() {
        return "Stop the mobile";
    }

    @Override
    public akf_1[] e() {
        return bwk_0.h;
    }

    @Override
    public akf_1[] f() {
        return null;
    }

    @Override
    protected void a(int n) {
        long l = this.g(0);
        blx_1 blx_12 = bmf_2.a().c(l);
        if (blx_12 == null) {
            this.a(bwk_0.j(), "Mobile introuvable " + l);
            return;
        }
        blx_12.bv().aW();
    }
}

