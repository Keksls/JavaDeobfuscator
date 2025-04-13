/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.keplerproject.luajava.LuaState
 */
import org.keplerproject.luajava.LuaState;

class bWS
extends akk_2 {
    bWS(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String a() {
        return "createActor";
    }

    @Override
    public String b() {
        return "Create a mobile in the world. /!\\ Server doesn't knows this mobile.";
    }

    @Override
    public akf_1[] e() {
        return bwk_0.d;
    }

    @Override
    public final akf_1[] f() {
        return null;
    }

    @Override
    public void a(int n) {
        long l = this.g(0);
        String string = this.i(1);
        int n2 = this.d(2);
        int n3 = this.d(3);
        int n4 = this.d(4);
        byte by = (byte)(n >= 6 ? this.d(5) : 8);
        int n5 = this.m().o();
        bWT bWT2 = new bWT(this, l, n5);
        bWT2.a(ali_1.a);
        byte by2 = 0;
        if (string != null && !string.isEmpty() && string.charAt(string.length() - 1) == '1') {
            by2 = 1;
        }
        bWT2.m(string);
        bWT2.a(aej_2.b);
        bWT2.e("AnimStatique");
        bWT2.b(n2, (float)n3, (float)n4);
        bWT2.g(ahi_0.j.a());
        if (by != 4 && by != 8) {
            this.a(bwk_0.g(), "nombre de direction (" + by + ") inconnu, forc?e ? 8 ");
            bWT2.b((byte)8);
        } else {
            bWT2.b(by);
        }
        if (n >= 7) {
            bnh_1.a((short)this.d(6), bWT2, by2);
        }
        azu_0.a(bWT2);
        bvx_2 bvx_22 = azu_0.j().k().cP();
        cuy_0.a(bvx_22, bWT2);
        afz_0.d().a(bWT2);
        this.m().a(bWT2);
    }
}

