/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.keplerproject.luajava.LuaState
 */
import org.keplerproject.luajava.LuaState;

public final class akQ
extends akk_2
implements all {
    private static final akf_1[] a = new akf_1[]{new akf_1("startX", null, akg_2.e, false), new akf_1("startY", null, akg_2.e, false), new akf_1("destX", null, akg_2.e, false), new akf_1("destY", null, akg_2.e, false)};
    private static final akf_1[] b = new akf_1[]{new akf_1("direction8", null, akg_2.d, false)};

    public akQ(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String a() {
        return "getDirection8To";
    }

    @Override
    public String b() {
        return "Return the direction 8 between start and end coordinates. Return 0 on error";
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
    protected void a(int n) {
        int n2 = this.d(0);
        int n3 = this.d(1);
        int n4 = this.d(2);
        int n5 = this.d(3);
        int n6 = n4 - n2;
        int n7 = n5 - n3;
        aej_2 aej_22 = aej_2.a(Hw.a(n6, -1, 1), Hw.a(n7, -1, 1));
        if (aej_22 == null) {
            this.a(this.r_(), "Can't find direction for coords : " + n2 + ", " + n3 + " to " + n4 + ", " + n5);
            this.q(0);
        } else {
            this.q(aej_22.l);
        }
    }
}

