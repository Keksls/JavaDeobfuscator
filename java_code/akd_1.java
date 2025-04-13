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
 * Renamed from aKd
 */
class akd_1
extends akk_2 {
    akd_1(LuaState luaState) {
        super(luaState);
    }

    @Override
    public final String a() {
        return "require";
    }

    @Override
    public String b() {
        return "Import the content of a script in another during script build (useless if used dynamically)";
    }

    @Override
    public akf_1[] e() {
        return ajk_2.h;
    }

    @Override
    @Nullable
    public akf_1[] f() {
        return null;
    }

    @Override
    protected void a(int n) {
    }
}

