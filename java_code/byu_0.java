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
 * Renamed from bYu
 */
public class byu_0
extends akk_2 {
    byu_0(LuaState luaState) {
        super(luaState);
    }

    @Override
    @Nullable
    public akf_1[] e() {
        return new akf_1[]{new akf_1("elementId", null, akg_2.b, false)};
    }

    @Override
    @Nullable
    public akf_1[] f() {
        return new akf_1[]{new akf_1("isInteractiveElement", null, akg_2.f, false)};
    }

    @Override
    protected void a(int n) {
        long l = this.g(0);
        ahv ahv2 = ahs.d().b(l);
        this.a(ahv2 != null);
    }

    @Override
    public String a() {
        return "isInteractiveElement";
    }
}

