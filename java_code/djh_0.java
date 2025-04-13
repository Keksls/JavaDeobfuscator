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
 * Renamed from djH
 */
class djh_0
extends akk_2 {
    djh_0(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String a() {
        return "displayWideScreenBand";
    }

    @Override
    public String b() {
        return "Affiche/Masque les bandes noires pour faire un aspect cin?ma";
    }

    @Override
    public akf_1[] e() {
        return dir_0.af;
    }

    @Override
    @Nullable
    public akf_1[] f() {
        return null;
    }

    @Override
    protected void a(int n) {
        aNF aNF2 = (aNF)ans_0.D().c();
        aNF2.h(this.l(0));
        if (n > 1) {
            aNF2.c((float)this.d(1));
            if (n > 2) {
                aNF2.e(1000.0f / (float)this.d(2));
            }
        }
    }
}

