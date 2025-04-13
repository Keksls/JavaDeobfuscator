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
 * Renamed from dkB
 */
class dkb_0
extends akk_2 {
    dkb_0(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String a() {
        return "removeShortcutWithPosition";
    }

    @Override
    public String b() {
        return "Remove the specified shortcut from his position";
    }

    @Override
    public akf_1[] e() {
        return dir_0.aj;
    }

    @Override
    @Nullable
    public akf_1[] f() {
        return null;
    }

    @Override
    protected void a(int n) {
        bmr_1 bmr_12 = azu_0.j().k();
        short s2 = (short)this.d(0);
        int n2 = this.d(1);
        bmr_12.cg().a(n2, s2, true);
    }
}

