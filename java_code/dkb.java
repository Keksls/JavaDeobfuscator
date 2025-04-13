/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 *  org.keplerproject.luajava.LuaException
 *  org.keplerproject.luajava.LuaState
 */
import org.jetbrains.annotations.Nullable;
import org.keplerproject.luajava.LuaException;
import org.keplerproject.luajava.LuaState;

class dkb
extends akk_2 {
    dkb(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String a() {
        return "loadTutorialDialog";
    }

    @Override
    public String b() {
        return "Ouvre l'interface de tutorial";
    }

    @Override
    public akf_1[] e() {
        return dir_0.bc;
    }

    @Override
    @Nullable
    public final akf_1[] f() {
        return null;
    }

    @Override
    public void a(int n) {
        Object object;
        String string;
        int n2;
        String string2;
        if (n < 3) {
            dir_0.a.warn((Object)"On utilise LoadTutorialDialog avec trop peu d'arguments !");
            return;
        }
        int n3 = 0;
        String string3 = "null".equalsIgnoreCase(string2 = this.i(n3++)) ? null : string2;
        String string4 = bae.h().a(this.i(n3++), new Object[0]);
        String string5 = this.i(n3++);
        if (n == n3) {
            n2 = 0;
        } else {
            try {
                n2 = this.d(n3);
                ++n3;
            }
            catch (LuaException luaException) {
                n2 = 0;
            }
        }
        if (n - n3 == 0) {
            string = bae.h().a(string5, new Object[0]);
        } else {
            object = new String[n - n3];
            for (int k = n3; k < n; ++k) {
                String string6;
                object[k - n3] = string6 = this.k(k);
            }
            string = bae.h().a(string5, object);
        }
        object = new dhf_0(string4, string, string3, n2);
        add_2.b().a((adt_1)object);
    }
}

