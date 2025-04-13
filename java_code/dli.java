/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 *  org.keplerproject.luajava.LuaState
 */
import org.jetbrains.annotations.Nullable;
import org.keplerproject.luajava.LuaState;

class dli
extends akk_2 {
    dli(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String a() {
        return "writeEmoteChat";
    }

    @Override
    public String b() {
        return "[DEPRECATED] Affiche un message chat localis? dans le chat d'emote";
    }

    @Override
    public akf_1[] e() {
        return dir_0.aB;
    }

    @Override
    @Nullable
    public akf_1[] f() {
        return null;
    }

    @Override
    protected void a(int n) {
        String string;
        if (n < 1) {
            dir_0.a.warn((Object)"On utilise writeEmoteChat sans argument !");
            return;
        }
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
        aul_0.a().a(string, aup_0.b);
    }
}

