/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.keplerproject.luajava.LuaState
 */
import org.keplerproject.luajava.LuaState;

class bWO
extends akk_2 {
    bWO(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String a() {
        return "changeActorDefaultDeltaZ";
    }

    @Override
    public String b() {
        return "Change the layer of the mobile. Default layer is 7.";
    }

    @Override
    public akf_1[] e() {
        return bwk_0.g;
    }

    @Override
    public akf_1[] f() {
        return null;
    }

    @Override
    protected void a(int n) {
        long l = this.g(0);
        int n2 = this.d(1);
        blx_1 blx_12 = bmf_2.a().c(l);
        if (blx_12 == null) {
            this.a(bwk_0.i(), "Mobile introuvable " + l);
            return;
        }
        blx_12.bv().g(n2);
    }
}

