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
 * Renamed from djB
 */
class djb_0
extends akk_2 {
    djb_0(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String a() {
        return "displayFresco";
    }

    @Override
    public akf_1[] e() {
        return dir_0.m;
    }

    @Override
    public String b() {
        return "Affiche une fr?sque background manipulable horizontalement ? la souris";
    }

    @Override
    @Nullable
    public final akf_1[] f() {
        return null;
    }

    @Override
    public void a(int n) {
        int n2 = this.d(0);
        czd_0.a().a(n2);
        azu_0.j().a(czd_0.a());
    }
}

