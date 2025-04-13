/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.keplerproject.luajava.LuaState
 */
import org.keplerproject.luajava.LuaState;

/*
 * Renamed from aKh
 */
class akh_2
extends akk_2 {
    akh_2(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String a() {
        return "toString";
    }

    @Override
    public akf_1[] e() {
        return ajk_2.J;
    }

    @Override
    public akf_1[] f() {
        return ajk_2.K;
    }

    @Override
    protected void a(int n) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int k = 0; k < n; ++k) {
            String string = this.k(k);
            stringBuilder.append(string != null ? string : null);
        }
        this.a(stringBuilder.toString());
    }
}

