/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.keplerproject.luajava.LuaState
 */
import org.keplerproject.luajava.LuaState;

final class diC
extends akk_2 {
    diC(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String a() {
        return "setFont";
    }

    @Override
    public akf_1[] e() {
        return new akf_1[]{new akf_1("bubbleId", null, akg_2.d, false)};
    }

    @Override
    public akf_1[] f() {
        return null;
    }

    @Override
    protected void a(int n) {
        ckt_2 ckt_22 = dip.a().e(this.d(0));
        if (ckt_22 != null) {
            ckt_22.setBubbleFontName(this.i(1));
            ckt_22.setBubbleFontSize(this.d(2));
            ckt_22.setBubbleFontStyle(this.d(3));
        }
    }
}

