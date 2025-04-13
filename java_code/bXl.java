/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.keplerproject.luajava.LuaState
 */
import org.keplerproject.luajava.LuaState;

class bXl
extends akk_2 {
    bXl(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String a() {
        return "Shift";
    }

    @Override
    public akf_1[] e() {
        return new akf_1[]{new akf_1("number", akg_2.b, false), new akf_1("direction (>>, <<, >>>)", akg_2.c, false), new akf_1("shift", akg_2.d, false)};
    }

    @Override
    public final akf_1[] f() {
        return new akf_1[]{new akf_1("number", akg_2.b, false)};
    }

    @Override
    public void a(int n) {
        if (n != 3) {
            bXi.d().error((Object)"Invalid param number");
        } else {
            long l = this.g(0);
            String string = this.i(1);
            int n2 = this.d(2);
            if (string.equals("<<")) {
                l <<= n2;
            } else if (string.equals(">>")) {
                l >>= n2;
            } else if (string.equals(">>>")) {
                l >>>= n2;
            }
            this.b(l);
        }
    }
}

