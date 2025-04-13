/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.keplerproject.luajava.LuaState
 */
import org.keplerproject.luajava.LuaState;

public final class akS
extends akk_2
implements all {
    private static final akf_1[] a = new akf_1[]{new akf_1("startMobileId", null, akg_2.b, false), new akf_1("destMobileId", null, akg_2.b, false)};
    private static final akf_1[] b = new akf_1[]{new akf_1("distance", null, akg_2.d, false)};

    public akS(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String a() {
        return "getDistanceBetweenMobile";
    }

    @Override
    public String b() {
        return "Return the number of cell(s) between 2 mobiles";
    }

    @Override
    public akf_1[] e() {
        return a;
    }

    @Override
    public akf_1[] f() {
        return b;
    }

    @Override
    public void a(int n) {
        long l = this.g(0);
        long l2 = this.g(1);
        abu abu2 = this.a(l);
        abu abu3 = this.a(l2);
        if (abu2 == null || abu3 == null) {
            this.a(this.r_(), "Mobile " + l + " or " + l2 + " doesn't exist");
            this.l();
            return;
        }
        this.q(aob_2.c((aoc_2)abu2, abu3));
    }
}

