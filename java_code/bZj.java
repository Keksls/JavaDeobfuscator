/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.keplerproject.luajava.LuaState
 */
import org.keplerproject.luajava.LuaState;

class bZj
extends akk_2 {
    bZj(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String a() {
        return "getResourceAtCoordinates";
    }

    @Override
    public akf_1[] e() {
        return new akf_1[]{new akf_1("x", null, akg_2.d, false), new akf_1("y", null, akg_2.d, false)};
    }

    @Override
    public final akf_1[] f() {
        return new akf_1[]{new akf_1("resourceId", null, akg_2.b, false)};
    }

    @Override
    public void a(int n) {
        int n2 = this.d(0);
        int n3 = this.d(1);
        bNK bNK2 = bNT.f().c(n2, n3);
        if (bNK2 == null) {
            this.b(1L);
            return;
        }
        this.b(bNK2.a());
    }
}

