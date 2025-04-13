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
 * Renamed from dkj
 */
class dkj_0
extends akk_2 {
    dkj_0(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String a() {
        return "openRewardsDialog";
    }

    @Override
    public String b() {
        return "[DONJON SHUKRUTE] Affiche l'interface de r?compenses avec un texte donn?";
    }

    @Override
    public akf_1[] e() {
        return dir_0.aZ;
    }

    @Override
    @Nullable
    public final akf_1[] f() {
        return null;
    }

    @Override
    public void a(int n) {
        String[] stringArray;
        String string = null;
        String string2 = this.i(0);
        if (n >= 1) {
            if (n == 1) {
                string = bae.h().a(string2, new Object[0]);
            } else {
                stringArray = new String[n - 1];
                for (int k = 1; k < n; ++k) {
                    String string3;
                    stringArray[k - 1] = string3 = this.k(k);
                }
                string = bae.h().a(string2, stringArray);
            }
        }
        stringArray = new dcR(string);
        dcl_0.a().a((dcR)stringArray);
    }
}

