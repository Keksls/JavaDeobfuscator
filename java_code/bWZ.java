/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.keplerproject.luajava.LuaState
 */
import org.keplerproject.luajava.LuaState;

class bWZ
extends akk_2 {
    bWZ(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String a() {
        return "getSex";
    }

    @Override
    public String b() {
        return "Return mobile gender";
    }

    @Override
    public akf_1[] e() {
        return bwk_0.i;
    }

    @Override
    public akf_1[] f() {
        return bwk_0.j;
    }

    @Override
    protected void a(int n) {
        long l = this.g(0);
        blx_1 blx_12 = bmf_2.a().c(l);
        if (blx_12 == null) {
            this.a(bwk_0.k(), "Mobile introuvable " + l);
            this.l();
            return;
        }
        this.q(blx_12.gX());
    }
}

