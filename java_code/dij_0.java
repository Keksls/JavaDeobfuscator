/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.keplerproject.luajava.LuaState
 */
import org.keplerproject.luajava.LuaState;

/*
 * Renamed from dij
 */
class dij_0
extends akk_2 {
    dij_0(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String a() {
        return "addMessage";
    }

    @Override
    public akf_1[] e() {
        return new akf_1[]{new akf_1("message", null, akg_2.c, false), new akf_1("params", null, akg_2.h, true)};
    }

    @Override
    public final akf_1[] f() {
        return null;
    }

    @Override
    public void a(int n) {
        String string;
        if (n == 1) {
            string = bae.h().a(this.i(0), new Object[0]);
        } else {
            Object[] objectArray = new String[n - 1];
            for (int k = 1; k < n; ++k) {
                String string2 = this.k(k);
                objectArray[k - 1] = string2;
            }
            string = bae.h().a(this.i(0), objectArray);
        }
        int n2 = 1000 + 50 * string.length();
        dlx.a().a(new dlw(dly.e, string, n2));
    }
}

