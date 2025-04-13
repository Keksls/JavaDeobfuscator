/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.keplerproject.luajava.LuaState
 */
import org.keplerproject.luajava.LuaState;

/*
 * Renamed from akU
 */
public final class aku_0
extends akk_2
implements all {
    private static final akf_1[] a = new akf_1[]{new akf_1("x", null, akg_2.d, false), new akf_1("y", null, akg_2.d, false)};
    private static final akf_1[] b = new akf_1[]{new akf_1("mobileId", null, akg_2.b, false)};

    public aku_0(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String a() {
        return "getMobileAtCoordinates";
    }

    @Override
    public String b() {
        return "Return the mobile ID at given coords";
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
        int n2;
        int n3 = this.d(0);
        abu abu2 = this.a_(n3, n2 = this.d(1));
        if (abu2 == null) {
            this.a(this.r_(), "No mobile found at " + n3 + ", " + n2);
            this.b(1L);
            return;
        }
        this.b(abu2.a());
    }
}

