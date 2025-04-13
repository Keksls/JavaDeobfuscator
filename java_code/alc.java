/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.keplerproject.luajava.LuaState
 */
import org.keplerproject.luajava.LuaState;

public final class alc
extends akk_2
implements all {
    private static final akf_1[] a = new akf_1[]{new akf_1("mobileId", null, akg_2.b, false), new akf_1("animationName", null, akg_2.c, false)};
    private static final akf_1[] b = new akf_1[]{new akf_1("hasAnimation", null, akg_2.f, false)};

    public alc(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String a() {
        return "hasAnimation";
    }

    @Override
    public String b() {
        return "Return true if the mobile has the specified animation";
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
        String string = this.i(1);
        boolean bl = afv2.an().c(afv2.l(string));
        this.a(bl);
    }
}

