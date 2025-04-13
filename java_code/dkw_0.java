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
 * Renamed from dkw
 */
class dkw_0
extends akk_2 {
    dkw_0(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String a() {
        return "removeMRU";
    }

    @Override
    public String b() {
        return "Enl\u00e8ve un MRU d'action sp\u00e9cifi\u00e9e au personnage sp\u00e9cifi\u00e9";
    }

    @Override
    public akf_1[] e() {
        return dir_0.w;
    }

    @Override
    @Nullable
    public final akf_1[] f() {
        return null;
    }

    @Override
    public void a(int n) {
        long l = this.g(0);
        int n2 = this.d(1);
        blx_1 blx_12 = bmf_2.a().c(l);
        if (blx_12 != null) {
            blx_12.b(n2);
        }
    }
}

