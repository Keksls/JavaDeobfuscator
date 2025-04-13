/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.keplerproject.luajava.LuaState
 */
import org.keplerproject.luajava.LuaState;

class bWP
extends akk_2 {
    bWP(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String a() {
        return "changeSkin";
    }

    @Override
    public String b() {
        return "Change mobile's skin";
    }

    @Override
    public akf_1[] e() {
        return bwk_0.l;
    }

    @Override
    public akf_1[] f() {
        return null;
    }

    @Override
    protected void a(int n) {
        long l = this.g(0);
        String string = this.i(1);
        afv afv2 = afz_0.d().b(l);
        if (afv2 instanceof biE) {
            biE biE2 = (biE)afv2;
            biE2.m(string);
            if (n > 2) {
                akx_2 akx_22 = this.m();
                String string2 = this.i(2);
                akr_2[] akr_2Array = this.a(3, n);
                int n2 = akx_22.a(string2, akr_2Array);
                afv2.a(new bWQ(this, akx_22, n2));
            }
        } else {
            this.a(bwk_0.m(), "le mobile " + l + " n'existe pas ");
        }
    }
}

