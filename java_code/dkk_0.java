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
 * Renamed from dkk
 */
class dkk_0
extends akk_2 {
    dkk_0(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String a() {
        return "pushHavenBagJukebox";
    }

    @Override
    public String b() {
        return "Display or hide jukebox for Haven Bag";
    }

    @Override
    public akf_1[] e() {
        return dir_0.aG;
    }

    @Override
    @Nullable
    public akf_1[] f() {
        return null;
    }

    @Override
    protected void a(int n) {
        dal.a().c();
    }
}

