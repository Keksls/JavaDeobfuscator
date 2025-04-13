/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.keplerproject.luajava.LuaState
 */
import org.keplerproject.luajava.LuaState;

public final class alJ
extends akk_2
implements all {
    private static final akf_1[] a = new akf_1[]{new akf_1("mobileId", null, akg_2.b, false), new akf_1("walkStyle", "Movement style used for WALK (see MovementStyle.java)", akg_2.c, false), new akf_1("runStyle", "Movement style used for RUN (see MovementStyle.java)", akg_2.c, true), new akf_1("isUniqueUsage", "True to remove the style after a single movement (Default = True)", akg_2.f, true)};

    public alJ(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String a() {
        return "setMobileMovementStyle";
    }

    @Override
    public String b() {
        return "Set the movement style of the mobile (see MovementStyleManager.java)";
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
    public void a(int n) {
        long l = this.g(0);
        abu abu2 = this.a(l);
        if (!(abu2 instanceof afe_0)) {
            this.a(this.r_(), "Mobile " + l + " doesn't exist or is not a PathMobile");
            return;
        }
        String string = this.i(1);
        String string2 = n > 2 ? this.i(2) : string;
        boolean bl = n <= 3 || this.l(3);
        ((afe_0)abu2).a(bl, afm_0.valueOf(string), afm_0.valueOf(string2));
    }
}

