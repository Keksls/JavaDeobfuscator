/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 *  org.keplerproject.luajava.LuaException
 *  org.keplerproject.luajava.LuaState
 */
import org.jetbrains.annotations.Nullable;
import org.keplerproject.luajava.LuaException;
import org.keplerproject.luajava.LuaState;

/*
 * Renamed from dhS
 */
class dhs_0
extends akk_2 {
    dhs_0(LuaState luaState) {
        super(luaState);
    }

    @Override
    @Nullable
    public akf_1[] e() {
        return new akf_1[]{new akf_1("display", "Display or hide the focus", akg_2.f, false)};
    }

    @Override
    @Nullable
    public akf_1[] f() {
        return null;
    }

    @Override
    protected void a(int n) {
        if (n != 1 && n != 3) {
            throw new LuaException("Invalid parameter count");
        }
        boolean bl = this.l(0);
        if (bl) {
            if (!azu_0.j().c(cZb.a)) {
                azu_0.j().a(cZb.a);
            }
        } else {
            azu_0.j().b(cZb.a);
        }
    }

    @Override
    public String a() {
        return "display";
    }
}

