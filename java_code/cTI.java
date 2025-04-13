/*
 * Decompiled with CFR 0.152.
 */
public class cTI
extends cto_0 {
    public cTI b() {
        return new cTI();
    }

    @Override
    public boolean d() {
        bmr_1 bmr_12 = azu_0.j().k();
        return !bmr_12.eZ();
    }

    @Override
    public String q() {
        String string = super.q();
        ani_2 ani_22 = new ani_2().a((CharSequence)string);
        if (azu_0.j().k().eZ()) {
            ani_22.m().i().a(h).a((CharSequence)bae.h().a("error.guild.alreadyInGuild", new Object[0])).j();
        }
        return ani_22.r();
    }

    @Override
    public /* synthetic */ cSS v() {
        return this.b();
    }
}

