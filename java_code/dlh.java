/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 *  org.keplerproject.luajava.LuaState
 */
import org.jetbrains.annotations.Nullable;
import org.keplerproject.luajava.LuaState;

class dlh
extends akk_2 {
    dlh(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String a() {
        return "writeInChatPipe";
    }

    @Override
    public String b() {
        return "write a message in the specified channel";
    }

    @Override
    public akf_1[] e() {
        return dir_0.aC;
    }

    @Override
    @Nullable
    public akf_1[] f() {
        return null;
    }

    @Override
    protected void a(int n) {
        String string;
        if (n < 2) {
            dir_0.a.warn((Object)"On utilise writeInChatPipe sans assez d'arguments !");
            return;
        }
        aup_0 aup_02 = aup_0.a(this.d(0));
        if (n == 2) {
            string = bae.h().a(this.i(1), new Object[0]);
        } else {
            String[] stringArray = new String[n - 2];
            for (int k = 2; k < n; ++k) {
                String string2;
                stringArray[k - 2] = string2 = this.k(k);
            }
            string = bae.h().a(this.i(1), stringArray);
        }
        aul_0.a().a(string, aup_02);
    }
}

