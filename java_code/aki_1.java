/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 *  org.keplerproject.luajava.LuaState
 */
import org.jetbrains.annotations.Nullable;
import org.keplerproject.luajava.LuaState;

/*
 * Renamed from aKi
 */
class aki_1
extends akk_2 {
    aki_1(LuaState luaState) {
        super(luaState);
    }

    @Override
    public final String a() {
        return "trace";
    }

    @Override
    public String b() {
        return "Log a message. Each param is coma-separated";
    }

    @Override
    public final akf_1[] e() {
        return ajk_2.m;
    }

    @Override
    @Nullable
    public final akf_1[] f() {
        return null;
    }

    @Override
    public final void a(int n) {
        StringBuilder stringBuilder = new StringBuilder("[ligne: " + this.k() + "]");
        for (int k = 0; k < n; ++k) {
            String string = this.k(k);
            stringBuilder.append(", ").append(string != null ? string : null);
        }
        ajk_2.a.info((Object)stringBuilder.toString());
    }
}

