/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 *  org.keplerproject.luajava.LuaState
 */
import org.jetbrains.annotations.Nullable;
import org.keplerproject.luajava.LuaState;

class djh
extends akk_2 {
    djh(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String a() {
        return "addReward";
    }

    @Override
    public String b() {
        return "[DONJON SHUKRUTE] Ajoute une r?compense ? l'interface de r?compenses du donjon";
    }

    @Override
    public akf_1[] e() {
        return dir_0.bb;
    }

    @Override
    @Nullable
    public final akf_1[] f() {
        return null;
    }

    @Override
    public void a(int n) {
        Object object;
        String string = null;
        if (n >= 2) {
            object = this.i(1);
            if (n == 2) {
                string = bae.h().a((String)object, new Object[0]);
            } else {
                String[] stringArray = new String[n - 2];
                for (int k = 2; k < n; ++k) {
                    String string2;
                    stringArray[k - 2] = string2 = this.k(k);
                }
                string = bae.h().a((String)object, stringArray);
            }
        }
        object = new dcs_0(this.d(0), string);
        dcl_0.a().a((dcs_0)object);
    }
}

