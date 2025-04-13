/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.keplerproject.luajava.LuaState
 */
import org.keplerproject.luajava.LuaState;

class bWW
extends akk_2 {
    public bWW(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String a() {
        return "getActivePetMobile";
    }

    @Override
    public String b() {
        return "Return the ID of the active pet mobile of supplied character. Return -1 on error";
    }

    @Override
    public akf_1[] e() {
        return bwk_0.t;
    }

    @Override
    public akf_1[] f() {
        return bwk_0.u;
    }

    @Override
    protected void a(int n) {
        long l = this.g(0);
        blx_1 blx_12 = bmf_2.a().c(l);
        if (!(blx_12 instanceof bnh_1)) {
            this.b(-1L);
            return;
        }
        bnh_1 bnh_12 = (bnh_1)blx_12;
        bMk bMk2 = bnh_12.er();
        if (bMk2 == null || !bMk2.aQ_() || bMk2.g() == null || !bMk2.f().p()) {
            this.b(-1L);
            return;
        }
        this.b(bMk2.g().a());
    }
}

