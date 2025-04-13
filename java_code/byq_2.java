/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from byq
 */
class byq_2
implements erk_1 {
    final /* synthetic */ byp_2 a;

    byq_2(byp_2 byp_22) {
        this.a = byp_22;
    }

    @Override
    public void a(String string) {
        fis_1.a().a((ajf_1)this.a, "name");
    }

    @Override
    public void a() {
        fis_1.a().a((ajf_1)this.a, "blazon");
    }

    @Override
    public void b() {
        fis_1.a().a((ajf_1)this.a, "guildDescription");
    }

    @Override
    public void c() {
        this.a.k();
        fis_1.a().a((ajf_1)this.a, "guildMessage");
    }

    @Override
    public void a(short s2) {
        this.d();
        byk_2.a.a(new byr_2(this));
        fis_1.a().a((ajf_1)this.a, "canLevelUp", "nextLevelCost", "nextLevelDuration", "guildLevelText");
    }

    @Override
    public void a(int n) {
        fis_1.a().a((ajf_1)this.a, "currentGuildPoints");
    }

    @Override
    public void b(int n) {
        fis_1.a().a((ajf_1)this.a, "totalGuildPoints");
    }

    @Override
    public void a(ern_1 ern_12) {
        this.a.c(true);
    }

    @Override
    public void b(ern_1 ern_12) {
        this.a.c(true);
    }

    @Override
    public void c(ern_1 ern_12) {
        this.a.c(true);
    }

    @Override
    public void a(erl_1 erl_12) {
        String string = erl_12.a() == azu_0.j().k().a_() ? bae.h().a("notification.guildJoinText", new Object[0]) : bae.h().a("notification.guildRecrueText", erl_12.f());
        dbo_0.a.a(string, 4);
        this.a.d(true);
    }

    @Override
    public void b(erl_1 erl_12) {
        if (erl_12.a() != azu_0.j().k().a_()) {
            String string = bae.h().a("notification.guildQuitText", erl_12.f());
            dbo_0.a.a(string, 4);
        }
        this.a.d(true);
    }

    @Override
    public void a(erh_1 erh_12) {
        this.d(erh_12);
        this.a.a(erh_12);
    }

    @Override
    public void b(erh_1 erh_12) {
        this.d(erh_12);
        this.e(erh_12);
    }

    @Override
    public void d(ern_1 ern_12) {
        this.a.c(true);
    }

    @Override
    public void c(erl_1 erl_12) {
        this.a.a(erl_12);
        this.a.c(true);
    }

    @Override
    public void c(erh_1 erh_12) {
        this.d(erh_12);
        this.a.a(erh_12);
        eqp_2 eqp_22 = eqp_2.a(erh_12.a());
        if (eqt_2.a(eqp_22)) {
            return;
        }
        String string = bae.h().a(138, (long)erh_12.a(), new Object[0]);
        String string2 = bae.h().a("notification.guildBonusActivatedText", string);
        dbo_0.a.a(string2, 4);
        aUh.b("guild.chatBonusActivated", string);
    }

    @Override
    public void c(int n) {
        fis_1.a().a((ajf_1)this.a, "currentWeekGuildPoints");
    }

    @Override
    public void d(int n) {
        fis_1.a().a((ajf_1)this.a, "currentWeekGuildPoints");
    }

    @Override
    public void d_(int n) {
        fis_1.a().a((ajf_1)this.a, "guildMembersThreshold");
    }

    private void d(erh_1 erh_12) {
        bxy_1 bxy_12 = byk_2.a.a(erh_12.a());
        bxy_12.f();
        fis_1.a().a((ajf_1)this.a, "canLevelUp", "availableBonuses", "loadingBonuses", "permanentBonuses", "temporaryBonuses", "simultaneousBonusesText");
    }

    private void e(erh_1 erh_12) {
        eqd_0 eqd_02 = eqs_2.a.a(erh_12.a());
        if (!bxv_1.b(eqd_02)) {
            return;
        }
        bxy_1 bxy_12 = byk_2.a.a(erh_12.a());
        bxy_12.i();
        this.a(eqd_02);
    }

    private void a(eqd_0 eqd_02) {
        String string = bae.h().a(138, (long)eqd_02.a(), new Object[0]);
        String string2 = bae.h().a("notification.guildBonusEndText", string);
        dbo_0.a.a(string2, 4);
        aUh.b("guild.chatBonusEnd", string);
    }

    private void d() {
        fis_1.a().a((ajf_1)this.a, "level", "nextLevel", "nextLevelCost", "canLevelUp");
        String string = bae.h().a("notification.guildLevelText", this.a.n());
        dbo_0.a.a(string, 4);
        aUh.b("guild.chatLevelGain", this.a.n());
    }
}

