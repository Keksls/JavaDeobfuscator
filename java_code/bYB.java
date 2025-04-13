/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.keplerproject.luajava.LuaState
 */
import org.keplerproject.luajava.LuaState;

class bYB
extends akk_2 {
    bYB(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String a() {
        return "setBlockingMovements";
    }

    @Override
    public akf_1[] e() {
        return new akf_1[]{new akf_1("elementId", null, akg_2.b, false), new akf_1("blocking", null, akg_2.f, false)};
    }

    @Override
    public akf_1[] f() {
        return null;
    }

    @Override
    protected void a(int n) {
        long l = this.g(0);
        boolean bl = this.l(1);
        pj_0 pj_02 = ccm_1.g().a(l);
        if (pj_02 == null) {
            byh_0.a.error((Object)("L'?l?ment interactif " + l + "n'existe pas"));
            return;
        }
        pj_02.g(bl);
        pj_02.T();
        pj_02.aI_();
    }
}

