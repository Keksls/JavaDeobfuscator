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
 * Renamed from djk
 */
class djk_0
extends akk_2 {
    djk_0(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String a() {
        return "addUnremovableDialog";
    }

    @Override
    public String b() {
        return "Add a dialog to unremovableDialogs";
    }

    @Override
    public akf_1[] e() {
        return dir_0.L;
    }

    @Override
    @Nullable
    public final akf_1[] f() {
        return null;
    }

    @Override
    protected void a(int n) {
        String string = this.i(0);
        fpm_0.b().m(string);
    }
}

