/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cjh
 */
class cjh_2
implements adx_1<cal_0> {
    cjh_2() {
    }

    @Override
    public boolean a(cal_0 cal_02) {
        erb_1 erb_12 = cal_02.b();
        if (erb_12 == null) {
            cjp_2.a.error((Object)"Message d'erreur de guilde inconnu !!!");
            return false;
        }
        String string = null;
        switch (erb_12) {
            case c: {
                string = bae.h().a("error.guild.creation", new Object[0]);
                break;
            }
            case d: {
                string = bae.h().a("error.guild.alreadyInGuild", new Object[0]);
                azu_0.j().b(cZl.a());
                break;
            }
            case g: {
                string = bae.h().a("group.error.unknown_user", new Object[0]);
                break;
            }
            case f: {
                string = bae.h().a("error.guild.creation.existingBlazon", new Object[0]);
                break;
            }
            case i: {
                string = bae.h().a("group.error.invitationPending", new Object[0]);
                break;
            }
            case h: {
                string = bae.h().a("guild.error.user.already.in.guild", new Object[0]);
                break;
            }
            case e: {
                string = bae.h().a("error.guild.creation.existingName", new Object[0]);
                break;
            }
            case b: {
                string = bae.h().a("error.guild.creation.invalidName", new Object[0]);
                break;
            }
            case l: {
                string = bae.h().a("guild.error.user.is.soul.avatar", new Object[0]);
                break;
            }
            case m: {
                string = bae.h().a("guild.error.user.is.hero", new Object[0]);
            }
        }
        if (string == null) {
            cjp_2.a.error((Object)("Message d'erreur de guilde non trait\u00e9 : " + erb_12.name()));
            return false;
        }
        aul_0.a().b(string);
        if (cal_02.c()) {
            fpm_0.b().a(string, cfn_0.a(1), 2L, 102, 3);
        }
        return false;
    }

    @Override
    public int a() {
        return 15286;
    }
}

