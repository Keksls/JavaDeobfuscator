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
 * Renamed from djF
 */
class djf_0
extends akk_2 {
    djf_0(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String a() {
        return "displaySplashText";
    }

    @Override
    public String b() {
        return "[DONJON SHUKRUTE] Affiche un message splash (trace de pneu + particule..)";
    }

    @Override
    public akf_1[] e() {
        return dir_0.aR;
    }

    @Override
    @Nullable
    public akf_1[] f() {
        return null;
    }

    @Override
    protected void a(int n) {
        String string;
        String string2 = this.i(0);
        if (n == 1) {
            string = bae.h().a(string2, new Object[0]);
        } else {
            Object[] objectArray = new Object[n - 1];
            for (int k = 1; k < n; ++k) {
                String string3 = this.i(k);
                objectArray[k - 1] = string3;
            }
            string = bae.h().a(string2, objectArray);
        }
        cYe.a().a(string);
    }
}

