/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.keplerproject.luajava.LuaState
 */
import org.keplerproject.luajava.LuaState;

public final class alk
extends akk_2
implements all {
    private static final akf_1[] a = new akf_1[]{new akf_1("sourceMobileId", null, akg_2.b, false), new akf_1("toLinkMobileId", null, akg_2.b, false)};

    public alk(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String a() {
        return "linkMobile";
    }

    @Override
    public String b() {
        return "Link the mobile to another. His anchor reference is the source mobile so it reproduces all his movements";
    }

    @Override
    public akf_1[] e() {
        return a;
    }

    @Override
    public akf_1[] f() {
        return null;
    }

    @Override
    protected void a(int n) {
        long l = this.g(0);
        afv afv2 = this.a_(l);
        if (afv2 == null) {
            this.a(this.r_(), "Mobile " + l + " doesn't exist");
            return;
        }
        long l2 = this.g(1);
        afv afv3 = this.a_(l2);
        if (afv3 == null) {
            this.a(this.r_(), "Mobile " + l2 + " doesn't exist");
            return;
        }
        afv2.d(afv3);
    }
}

