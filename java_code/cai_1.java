/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.keplerproject.luajava.LuaState
 */
import org.keplerproject.luajava.LuaState;

/*
 * Renamed from caI
 */
public final class cai_1
extends akk_2 {
    public cai_1(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String a() {
        return "getZ";
    }

    @Override
    public String b() {
        return "Return list of walkable Z for a provided position (desc order)";
    }

    @Override
    public akf_1[] e() {
        return new akf_1[]{new akf_1("worldX", "Position x", akg_2.d, false), new akf_1("worldY", "Position y", akg_2.d, false), new akf_1("worldZ", "Position z", akg_2.d, true)};
    }

    @Override
    public final akf_1[] f() {
        return new akf_1[]{new akf_1("worldZ", "List of walkable Z", akg_2.h, true)};
    }

    @Override
    public void a(int n) {
        int n2 = this.d(0);
        int n3 = this.d(1);
        if (n == 3) {
            int n4 = this.d(2);
            if (n4 == Short.MIN_VALUE) {
                this.q(n4);
            } else {
                this.q(yz_0.b(n2, n3, (short)n4));
            }
            return;
        }
        short[] sArray = yz_0.c(n2, n3);
        for (int k = 0; k < sArray.length; ++k) {
            this.q(sArray[k]);
        }
    }
}

