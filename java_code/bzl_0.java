/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.keplerproject.luajava.LuaState
 */
import org.keplerproject.luajava.LuaState;

/*
 * Renamed from bZl
 */
class bzl_0
extends akk_2 {
    bzl_0(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String a() {
        return "setResourceAlpha";
    }

    @Override
    public akf_1[] e() {
        return new akf_1[]{new akf_1("Resource X", null, akg_2.e, false), new akf_1("Resource Y", null, akg_2.e, false), new akf_1("Alpha", null, akg_2.e, false)};
    }

    @Override
    public final akf_1[] f() {
        return null;
    }

    @Override
    public void a(int n) {
        int n2 = this.d(0);
        int n3 = this.d(1);
        float f2 = (float)this.e(2);
        bNK bNK2 = bNT.f().c(n2, n3);
        if (bNK2 == null) {
            this.a(bZd.f(), "Aucune ressource trouv?e en [" + n2 + ";" + n3 + "]");
            return;
        }
        bNK2.d(f2);
    }
}

