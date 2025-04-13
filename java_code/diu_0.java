/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.keplerproject.luajava.LuaState
 */
import org.keplerproject.luajava.LuaState;

/*
 * Renamed from diU
 */
class diu_0
extends akk_2 {
    diu_0(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String a() {
        return "addCompass";
    }

    @Override
    public String b() {
        return "Cr?e une boussole";
    }

    @Override
    public akf_1[] e() {
        return dir_0.aW;
    }

    @Override
    public final akf_1[] f() {
        return dir_0.aX;
    }

    @Override
    protected void a(int n) {
        String string = bae.h().a(this.i(0), new Object[0]);
        int n2 = this.d(1);
        int n3 = this.d(2);
        short s2 = n >= 4 ? (short)this.d(3) : (short)0;
        if ((s2 = yz_0.d(n2, n3, s2)) == Short.MIN_VALUE) {
            s2 = 0;
        }
        int n4 = 2;
        if (n >= 5) {
            n4 = this.d(4);
        }
        long l = abd_1.c();
        ble_1.E().a(n4, (float)n2, (float)n3, (float)s2, azu_0.j().k().T_(), null, string, true);
        this.b(l);
    }
}

