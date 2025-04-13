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
 * Renamed from dkg
 */
class dkg_0
extends akk_2 {
    dkg_0(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String a() {
        return "openInfoDialog";
    }

    @Override
    public akf_1[] e() {
        return dir_0.ba;
    }

    @Override
    @Nullable
    public final akf_1[] f() {
        return null;
    }

    @Override
    public String b() {
        return "Ouvre un popup semblable ? celui des donjons shukrutes, mais sans ic?ne challenge et avec un titre param?tr?";
    }

    @Override
    public void a(int n) {
        Object object;
        String string = null;
        String string2 = bae.h().a(this.i(0), new Object[0]);
        if (n >= 1) {
            object = this.i(1);
            if (n == 1) {
                string = bae.h().a((String)object, new Object[0]);
            } else {
                String[] stringArray = new String[n - 1];
                for (int k = 1; k < n; ++k) {
                    String string3;
                    stringArray[k - 1] = string3 = this.k(k);
                }
                string = bae.h().a((String)object, stringArray);
            }
        }
        object = new cZT(string2, string);
        czn_0.a().a((cZT)object);
    }
}

