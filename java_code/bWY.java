/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.map.hash.TByteIntHashMap
 *  org.keplerproject.luajava.LuaState
 */
import gnu.trove.map.hash.TByteIntHashMap;
import org.keplerproject.luajava.LuaState;

class bWY
extends akk_2 {
    bWY(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String a() {
        return "getHandsOccupedByWeapon";
    }

    @Override
    public String b() {
        return "Return number of hands used by a weapon";
    }

    @Override
    public akf_1[] e() {
        return bwk_0.p;
    }

    @Override
    public akf_1[] f() {
        return bwk_0.q;
    }

    @Override
    protected void a(int n) {
        long l = this.g(0);
        blx_1 blx_12 = bmf_2.a().c(l);
        if (blx_12 == null) {
            this.a(bwk_0.q(), "le characterInfo " + l + " n'existe pas ");
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
        int n3 = bwd_0.a(((ezr_0)r2).F());
        if (n3 == 237) {
            this.q(0);
            return;
        }
        this.q(((ezr_0)r2).B() ? 2 : 1);
    }
}

