/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cjf
 */
class cjf_2
implements adx_1<caj_0> {
    cjf_2() {
    }

    @Override
    public boolean a(caj_0 caj_02) {
        int n = caj_02.b();
        String string = bae.h().a(138, (long)n, new Object[0]);
        String string2 = bae.h().a("notification.guildBonusLearnedText", string);
        dbo_0.a.a(string2, 4);
        aUh.b("guild.chatBonusActivated", string);
        return false;
    }

    @Override
    public int a() {
        return 14821;
    }
}

