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
 * Renamed from dkd
 */
class dkd_0
extends akk_2 {
    dkd_0(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String a() {
        return "manageMRU";
    }

    @Override
    public String b() {
        return "Active/D?sactive des actions du MRU en fonction de leur ID";
    }

    @Override
    public akf_1[] e() {
        return dir_0.u;
    }

    @Override
    @Nullable
    public final akf_1[] f() {
        return null;
    }

    @Override
    public void a(int n) {
        cSY[] cSYArray;
        int n2 = this.d(0);
        for (cSY cSY2 : cSYArray = cSY.values()) {
            if (cSY2.b() != n2) continue;
            cSY2.b(this.l(1));
            break;
        }
    }
}

