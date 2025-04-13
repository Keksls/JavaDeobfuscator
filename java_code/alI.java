/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.keplerproject.luajava.LuaState
 */
import org.keplerproject.luajava.LuaState;

public final class alI
extends akk_2
implements all {
    private static final akf_1[] a = new akf_1[]{new akf_1("mobileId", null, akg_2.b, false), new akf_1("worldX", null, akg_2.d, false), new akf_1("worldY", null, akg_2.d, false), new akf_1("isHeightDirections", "True for 8 directions, else 4", akg_2.f, true)};
    private static final akf_1[] b = new akf_1[]{new akf_1("newDirectionIndex", null, akg_2.d, false)};

    public alI(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String a() {
        return "setMobileLookAt";
    }

    @Override
    public String b() {
        return "Set the direction of the mobile to look towards the specified coordinates";
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
        abu abu2 = this.a(l);
        if (!(abu2 instanceof aby_0)) {
            this.a(this.r_(), "Mobile " + l + " doesn't exist or is not an AnimatedElementWithDirection");
            this.l();
            return;
        }
        aby_0 aby_02 = (aby_0)abu2;
        int n2 = this.d(1);
        int n3 = this.d(2);
        boolean bl = n >= 4 ? this.l(3) : this.a(aby_02);
        int n4 = n2 - aby_02.G();
        int n5 = n3 - aby_02.H();
        aej_2 aej_22 = aby_02.aC();
        if (bl && (n4 != 0 || n5 != 0)) {
            aej_22 = afs_2.a(n4, n5);
        } else if (!bl) {
            aej_22 = new afs_2(n4, n5, 0).h();
        }
        if (aej_22 != aej_2.k) {
            aby_02.a(aej_22);
        }
        this.q(aej_22.l);
    }
}

