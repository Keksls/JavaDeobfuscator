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
 * Renamed from cbb
 */
final class cbb_2
extends akk_2 {
    private static final String a = "videoAvailable";
    private static final akf_1[] b = new akf_1[0];
    private static final akf_1[] c = new akf_1[]{new akf_1("available", "true if videos can be launched on this device", akg_2.f, false)};

    cbb_2(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String a() {
        return a;
    }

    @Override
    @Nullable
    public akf_1[] e() {
        return b;
    }

    @Override
    @Nullable
    public akf_1[] f() {
        return c;
    }

    @Override
    protected void a(int n) {
        this.a(!aVk.b);
    }
}

