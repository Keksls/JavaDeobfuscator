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
 * Renamed from djg
 */
class djg_0
extends akk_2 {
    djg_0(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String a() {
        return "addMRU";
    }

    @Override
    public akf_1[] e() {
        return dir_0.v;
    }

    @Override
    public String b() {
        return "Ajoute un MRU d'action d\u00e9finie \u00e0 un personnage";
    }

    @Override
    @Nullable
    public final akf_1[] f() {
        return null;
    }

    @Override
    public void a(int n) {
        cSY[] cSYArray;
        long l = this.g(0);
        int n2 = this.d(1);
        blx_1 blx_12 = bmf_2.a().c(l);
        cSS[] cSSArray = blx_12.aI();
        cSY[] cSYArray2 = new cSY[cSSArray.length];
        for (int k = 0; k < cSSArray.length; ++k) {
            cSYArray2[k] = cSSArray[k].n();
        }
        cSY cSY2 = null;
        for (cSY cSY3 : cSYArray = cSY.values()) {
            if (cSY3.b() != n2) continue;
            cSY2 = cSY3;
            break;
        }
        boolean bl = false;
        if (n < 3 || this.l(2)) {
            for (cSY cSY4 : cSYArray2) {
                if (cSY2 == null || cSY4.b() != cSY2.c().n().b()) continue;
                bl = true;
                break;
            }
        }
        if (!bl) {
            blx_12.a(cSY2);
        }
    }
}

