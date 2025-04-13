/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.keplerproject.luajava.LuaState
 */
import org.keplerproject.luajava.LuaState;

/*
 * Renamed from akY
 */
public final class aky_0
extends akk_2
implements all {
    private static final akf_1[] a = new akf_1[]{new akf_1("mobileId", null, akg_2.b, false)};
    private static final akf_1[] b = new akf_1[]{new akf_1("jumpCapacity", null, akg_2.d, false)};

    public aky_0(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String a() {
        return "getMobileJumpCapacity";
    }

    @Override
    public String b() {
        return "Return the jump capacity of the mobile";
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
        afv afv2 = afz_0.d().b(l);
        if (!(afv2 instanceof afe_0)) {
            this.a(this.r_(), "Mobile " + l + " doesn't exist or is not a PathMobile");
            this.l();
            return;
        }
        this.q(((afe_0)afv2).aU());
    }
}

