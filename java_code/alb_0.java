/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.keplerproject.luajava.LuaState
 */
import org.keplerproject.luajava.LuaState;

/*
 * Renamed from alb
 */
public final class alb_0
extends akk_2
implements all {
    private static final akf_1[] a = new akf_1[]{new akf_1("mobileId", null, akg_2.b, false)};
    private static final akf_1[] b = new akf_1[]{new akf_1("status", null, akg_2.d, false)};

    public alb_0(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String a() {
        return "getMobileStatus";
    }

    @Override
    public String b() {
        return "Return the status of the mobile (0 = NORMAL, 1 = KO, 2 = DEAD)";
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
        afv afv2 = this.a_(l);
        if (afv2 == null) {
            this.a(this.r_(), "Mobile " + l + " doesn't exist");
            this.l();
            return;
        }
        this.q(afv2.aM());
    }
}

