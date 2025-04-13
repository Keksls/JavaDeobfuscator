/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.keplerproject.luajava.LuaState
 */
import org.keplerproject.luajava.LuaState;

class bWN
extends akk_2 {
    bWN(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String a() {
        return "setPart";
    }

    @Override
    public String b() {
        return "Set anm parts on a mobile";
    }

    @Override
    public akf_1[] e() {
        return bwk_0.k;
    }

    @Override
    public akf_1[] f() {
        return null;
    }

    @Override
    protected void a(int n) {
        long l = this.g(0);
        String string = this.i(1);
        String[] stringArray = new String[n - 2];
        for (int k = 2; k < n; ++k) {
            stringArray[k - 2] = this.i(k);
        }
        afv afv2 = afz_0.d().b(l);
        if (afv2 != null) {
            afv2.a(string, atn_2.a(stringArray));
        } else {
            this.a(bwk_0.l(), "le mobile " + l + " n'existe pas ");
        }
    }
}

