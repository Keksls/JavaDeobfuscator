/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.keplerproject.luajava.LuaState
 */
import org.keplerproject.luajava.LuaState;

/*
 * Renamed from alj
 */
public final class alj_0
extends akk_2
implements all {
    private static final akf_1[] a = new akf_1[]{new akf_1("mobileId", null, akg_2.b, false)};
    private static final akf_1[] b = new akf_1[]{new akf_1("isMoving", null, akg_2.f, false)};

    public alj_0(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String a() {
        return "isMoving";
    }

    @Override
    public String b() {
        return "Return true if the mobile is moving";
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
        long l = this.g(0);
        abu abu2 = this.a(l);
        if (!(abu2 instanceof afe_0)) {
            this.a(this.r_(), "Mobile " + l + " doesn't exist or is not a PathMobile");
            this.a(false);
            return;
        }
        afe_0 afe_02 = (afe_0)abu2;
        this.a(afe_02.ba());
    }
}

