/*
 * Decompiled with CFR 0.152.
 */
public class cTG
extends cTF {
    public cTG e() {
        return new cTG();
    }

    @Override
    public boolean d() {
        return cSW.a();
    }

    @Override
    public boolean c() {
        if (!super.c()) {
            return false;
        }
        return azu_0.j().k().eZ();
    }

    @Override
    public String q() {
        String string = super.q();
        ani_2 ani_22 = new ani_2().a((CharSequence)string);
        if (!cSW.a()) {
            ani_22.m().i().a(h).a((CharSequence)bae.h().a("guild.error.not.leader", new Object[0])).j();
        }
        return ani_22.r();
    }

    @Override
    public /* synthetic */ cTF a() {
        return this.e();
    }

    @Override
    public /* synthetic */ cSS v() {
        return this.e();
    }
}

