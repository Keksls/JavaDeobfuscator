/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cTJ
 */
public class ctj_0
extends cto_0 {
    public ctj_0 b() {
        return new ctj_0();
    }

    @Override
    public boolean d() {
        bmr_1 bmr_12 = azu_0.j().k();
        if (!bmr_12.eZ()) {
            return false;
        }
        if (ctj_0.e()) {
            return false;
        }
        return super.d();
    }

    private static boolean e() {
        bmr_1 bmr_12 = azu_0.j().k();
        if (!bmr_12.eZ()) {
            return true;
        }
        return bmr_12.be() && !bmr_12.bf();
    }

    @Override
    public String q() {
        String string = super.q();
        ani_2 ani_22 = new ani_2().a((CharSequence)string);
        if (!azu_0.j().k().eZ()) {
            ani_22.m().i().a(h).a((CharSequence)bae.h().a("group.error.not_in_guild", new Object[0])).j();
        }
        return ani_22.r();
    }

    @Override
    public /* synthetic */ cSS v() {
        return this.b();
    }
}

