/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.map.hash.TByteIntHashMap
 *  org.keplerproject.luajava.LuaState
 */
import gnu.trove.map.hash.TByteIntHashMap;
import org.keplerproject.luajava.LuaState;

class bWX
extends akk_2 {
    bWX(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String a() {
        return "getEquippedWeaponType";
    }

    @Override
    public String b() {
        return "Return type of equipped weapon";
    }

    @Override
    public akf_1[] e() {
        return bwk_0.n;
    }

    @Override
    public akf_1[] f() {
        return bwk_0.o;
    }

    @Override
    protected void a(int n) {
        long l = this.g(0);
        blx_1 blx_12 = bmf_2.a().c(l);
        if (blx_12 == null) {
            this.a(bwk_0.p(), "le characterInfo " + l + " n'existe pas ");
            this.q(0);
            return;
        }
        TByteIntHashMap tByteIntHashMap = blx_12.bc();
        if (tByteIntHashMap == null) {
            this.q(0);
            return;
        }
        int n2 = tByteIntHashMap.get(exh_2.p.A);
        Object r2 = eyo_1.g().d(n2);
        if (r2 == null) {
            this.q(0);
            return;
        }
        int n3 = bwd_0.a(((ezr_0)r2).F());
        if (n3 == 237) {
            this.q(0);
            return;
        }
        this.q(n3);
    }
}

