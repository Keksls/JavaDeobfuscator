/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.keplerproject.luajava.LuaState
 */
import org.keplerproject.luajava.LuaState;

public final class alw
extends akk_2
implements all {
    private static final akf_1[] a = new akf_1[]{new akf_1("mobileId", null, akg_2.b, false), new akf_1("visibility", null, akg_2.f, false)};

    public alw(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String a() {
        return "setDirectionParticleSystemVisibility";
    }

    @Override
    public String b() {
        return "Hide or Show the DirectionParticleSystem on the mobile";
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
        boolean bl = this.l(1);
        if (bl) {
            afv2.aP();
        } else {
            afv2.aO();
        }
    }
}

