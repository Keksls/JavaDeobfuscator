/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.map.hash.TShortObjectHashMap
 *  org.jetbrains.annotations.NotNull
 */
import gnu.trove.map.hash.TShortObjectHashMap;
import java.util.HashMap;
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from enS
 */
public enum ens_2 {
    a(1, "monitoredproperties.enable", "true", false, ent_2.a),
    b(2, "calendar.delta", "0", true, ent_2.b),
    c(3, "calendar.timezone", "UTC", true, ent_2.c),
    d(4, "censor.enable", "false", ent_2.a),
    e(5, "serverLanguage", "", true, ent_2.d),
    f(6, "ssl.enable", "true", false, ent_2.a),
    g(8, "authorizedCharacterClass", "", true, ent_2.e),
    h(9, "worldInstances.forbidden", "", true, ent_2.e),
    i(11, "shopInGameInteractions.enable", "false", true, ent_2.a),
    j(12, "contactModerator.enable", "false", true, ent_2.a),
    k(13, "display.subscription.end.popup.enable", "true", true, ent_2.a),
    l(14, "partner", "", false, ent_2.c),
    m(15, "shop.enable", "true", true, ent_2.a),
    n(16, "account.free.character.slots", "5", true, ent_2.b),
    o(17, "shop.used", "shopi", true, ent_2.c),
    p(18, "shop.stone.level.min", "0", true, ent_2.b),
    q(19, "metrics.reporter.enable", "false", false, ent_2.a),
    r(20, "beta.check.enabled", "false", false, ent_2.a),
    s(21, "client.path.scheduling.enabled", "false", true, ent_2.a),
    t(22, "heroes.allow.tutorial", "false", true, ent_2.a),
    u(30, "player.level.default", "6", false, ent_2.b),
    v(31, "player.level.cap", "245", true, ent_2.b),
    w(32, "player.default.startPoint", "-8|-1|18|895", true, ent_2.e),
    x(33, "player.incarnam.startPoint", "0|0|0|1361", true, ent_2.e),
    y(50, "client.npc.forced.skin", "0", true, ent_2.b),
    z(51, "client.pc.forced.skin", "0", true, ent_2.b),
    A(101, "platform.name", "", false, ent_2.c),
    B(201, "game.id", "3", false, ent_2.b),
    C(202, "expomode.enable", "false", true, ent_2.a),
    D(203, "adminrights.forceAll", "false", ent_2.a),
    E(204, "serverlock.enable", "false", ent_2.a),
    F(206, "subscription.required", "", ent_2.e),
    G(207, "subscription.force", "0", ent_2.b),
    H(208, "community.check.enabled", "false", ent_2.a),
    I(209, "community.required", "", true, ent_2.e),
    J(210, "community.forbidden", "", true, ent_2.e),
    K(211, "antiAddiction.enable", "false", true, ent_2.a),
    L(212, "antiAddiction.force.accounts", "", ent_2.e),
    M(215, "subscription.forced.duration.in.second", "-1", ent_2.b),
    N(218, "subscription.check.game.id", "0", ent_2.b),
    O(219, "queue.activated", "true", ent_2.a),
    P(220, "queue.player.limit", "0", ent_2.b),
    Q(221, "partners.authorized", "default|steam", ent_2.d),
    R(230, "server.restrictions.ip.count", "0", true, ent_2.b),
    S(231, "server.restrictions.ip.admin.bypass", "true", true, ent_2.a),
    T(232, "server.restrictions.account.secure", "false", true, ent_2.a),
    U(233, "server.restrictions.account.2fa", "false", true, ent_2.a),
    V(234, "server.restrictions.account.mail", "false", true, ent_2.a),
    W(235, "server.restrictions.account.gsm", "false", true, ent_2.a),
    X(236, "server.restrictions.account.identity", "false", true, ent_2.a),
    Y(237, "server.restrictions.ip.tolerance", "0", true, ent_2.b),
    Z(238, "server.restrictions.mac.count", "0", false, ent_2.b),
    aa(239, "server.restrictions.mac.admin.bypass", "true", false, ent_2.a),
    ab(250, "server.restrictions.earlyAccess", "false", false, ent_2.a),
    ac(251, "server.ips.bypassing.limit", "", false, ent_2.d),
    ad(301, "instances.staticDistribution", "true", false, ent_2.a),
    ae(302, "moderation.teleport.fromHavenBagAllowed", "true", false, ent_2.a),
    af(303, "moderation.teleport.fromFightAllowed", "true", false, ent_2.a),
    ag(304, "server.data.safety.status", "false", false, ent_2.a),
    ah(401, "preboostCharacter.enable", "false", ent_2.a),
    ai(402, "achievements.forbidden", "", ent_2.e),
    aj(403, "interactiveElements.forbidden", "", ent_2.e),
    ak(405, "dungeonDailyLockBypass", "", true, ent_2.e),
    al(406, "companions.enabled", "true", true, ent_2.a),
    am(407, "beta.mode", "false", true, ent_2.a),
    an(408, "subscription.defaultValue", "0", false, ent_2.b),
    ao(409, "subscription.dateTimezone", "Europe/Paris", false, ent_2.c),
    ap(411, "freeCompanion.enable", "true", false, ent_2.a),
    aq(412, "rerollXpBonus.enable", "true", true, ent_2.a),
    ar(413, "shop.key", "WAKFU_INGAME", true, ent_2.c),
    as(414, "instancesNeedingAccessRights", "", true, ent_2.e),
    at(415, "instancesNeedingInteractionRights", "", true, ent_2.e),
    au(416, "collectFightEnabled", "true", false, ent_2.a),
    av(417, "shop.gifts.minimumPurchaseDate", "", false, ent_2.c),
    aw(418, "timerForFirstCollect", "true", true, ent_2.a),
    ax(419, "forceBindOnPickup.enable", "false", true, ent_2.a),
    ay(420, "server.id", "0", true, ent_2.b),
    az(422, "shop.gifts.disabled.items", "", false, ent_2.e),
    aA(423, "shop.gifts.excluded.distribution.tags", "", false, ent_2.d),
    aB(424, "itemTracker.logLevel", "10000", false, ent_2.b),
    aC(426, "steam.enabled", "false", false, ent_2.a),
    aD(431, "heroes.enabled", "true", true, ent_2.a),
    aE(432, "server.restrictions.craft.kamaCraftingAllowed", "false", true, ent_2.a),
    aF(433, "transfer.duration.alert.millis", "5000", false, ent_2.b),
    aG(434, "feature.spectatormode.allowed", "true", true, ent_2.a),
    aH(435, "disabled.items.list", "", true, ent_2.e),
    aI(436, "disabled.spells.list", "", true, ent_2.e),
    aJ(437, "disabled.summon.list", "", true, ent_2.e),
    aK(440, "feature.pactpvp.allowed", "true", true, ent_2.a),
    aL(441, "feature.oldEnchant.enabled", "false", true, ent_2.a),
    aM(442, "feature.item.set.merge.enabled", "false", true, ent_2.a),
    aN(443, "feature.item.merge.enabled", "true", true, ent_2.a),
    aO(450, "fight.duration.placement", "60000", true, ent_2.b),
    aP(451, "fight.duration.turn", "30000", true, ent_2.b),
    aQ(452, "fight.duration.turn.incrementForFirst", "30000", true, ent_2.b),
    aR(453, "fight.duration.turn.reduced", "20000", true, ent_2.b),
    aS(454, "fight.duration.turn.max", "120000", true, ent_2.b),
    aT(455, "fight.duration.turn.boss", "60000", true, ent_2.b),
    aU(456, "fight.duration.turn.bonus.ap", "500", true, ent_2.b),
    aV(457, "fight.duration.turn.bonus.mp", "500", true, ent_2.b),
    aW(458, "fight.duration.turn.bonus.wp", "0", true, ent_2.b),
    aX(459, "fight.duration.turn.bonus.max", "30000", true, ent_2.b),
    aY(500, "version.check", "true", false, ent_2.a),
    aZ(600, "proxy.list", "proxies.json", false, ent_2.c),
    ba(601, "admin.list", "admins.json", false, ent_2.c),
    bb(602, "heroes.forceAddToParty", "false", true, ent_2.a),
    bc(603, "companies.enabled", "true", true, ent_2.a),
    bd(604, "newCraft.enabled", "false", false, ent_2.a),
    be(605, "haapi.user", "wakfu", false, ent_2.c),
    bf(606, "haapi.pass", "pass", false, ent_2.c),
    bg(607, "haapi.ankama.url", "https://haapi.ankama.tst/json/Ankama/v5", false, ent_2.c),
    bh(608, "haapi.timeout", "5000", false, ent_2.b),
    bi(609, "new.chat.enabled", "false", false, ent_2.a),
    bj(610, "default.bonus.sheet", "0", true, ent_2.b),
    bk(611, "trunk", "false", true, ent_2.a),
    bl(613, "ogrest.total.score", "25000000", true, ent_2.b),
    bm(620, "automaticDnd", "true", true, ent_2.a),
    bn(621, "party.max.own.companions", "2", true, ent_2.b),
    bo(622, "party.max.own.heroes", "2", true, ent_2.b),
    bp(623, "party.max.own.heroes.companions", "2", true, ent_2.b),
    bq(624, "demo", "false", ent_2.a),
    br(625, "battleground.start.hour", "14", ent_2.b),
    bs(626, "battleground.end.hour", "23", ent_2.b),
    bt(627, "battleground.interval.minute", "60", ent_2.b),
    bu(628, "battleground.active", "true", false, ent_2.a),
    bv(629, "party.max.members", "6", true, ent_2.b),
    bw(630, "item.service.url", "http://localhost:8080", false, ent_2.c),
    bx(631, "shop.payment.mode", "OK", true, ent_2.c),
    by(632, "battleground.days.of.the.week", "1|2|3|4|5|6|7", ent_2.e),
    bz(701, "guild.level.min.required.for.auction", "10", true, ent_2.b),
    bA(702, "havenworld.max.instances", "150", false, ent_2.b),
    bB(703, "havenworld.game.server.id", "1", false, ent_2.b),
    bC(704, "havenworld.ttl", "10", false, ent_2.b),
    bD(705, "feature.guild.chest.kamas.withdrawal.enabled", "true", true, ent_2.a),
    bE(706, "feature.guild.chest.kamas.deposit.enabled", "true", true, ent_2.a),
    bF(1000, "unknown.value.1", "5000", false, ent_2.b),
    bG(2001, "forced.spawned.point", "", false, ent_2.e),
    bH(2003, "name.check.disabled", "false", false, ent_2.a),
    bI(2004, "character.deletion.disabled", "false", false, ent_2.a),
    bJ(2005, "character.creation.disabled", "false", false, ent_2.a),
    bK(2006, "character.rename.disabled", "false", true, ent_2.a),
    bL(2007, "character.change.disabled", "false", true, ent_2.a),
    bM(2010, "load.achievements", "true", false, ent_2.a),
    bN(2020, "character.resend.initial.delay", "200", false, ent_2.b),
    bO(2021, "character.resend.timeout.delay", "60000", false, ent_2.b),
    bP(2022, "character.forced.release.retry.delay", "5000", false, ent_2.b),
    bQ(2023, "character.forced.release.timeout.delay", "3600000", false, ent_2.b),
    bR(2024, "action.flood.check.enabled", "true", true, ent_2.a),
    bS(2025, "character.rename.free.date", "0", true, ent_2.b),
    bT(2026, "spell.cast.logging.threshold.ms", "500", false, ent_2.b),
    bU(2050, "global.chat.enabled", "true", true, ent_2.a),
    bV(2052, "global.chat.trade.delay", "60000", false, ent_2.b),
    bW(2053, "global.chat.community.delay", "60000", false, ent_2.b),
    bX(2054, "global.chat.recruitment.delay", "60000", false, ent_2.b),
    bY(2055, "global.chat.restriction.enabled", "true", true, ent_2.a),
    bZ(2056, "global.chat.restriction.level", "50", true, ent_2.b),
    ca(2057, "chat.send.items.data", "true", false, ent_2.a),
    cb(2058, "chat.flood.check.enabled", "true", true, ent_2.a),
    cc(2059, "chat.sms.check.enabled", "true", true, ent_2.a),
    cd(2200, "base.xp.ratio", "0.7692", true, ent_2.g),
    ce(2201, "booster.xp.bonus", "50", true, ent_2.b),
    cf(2202, "base.craft.xp.ratio", "0.6667", true, ent_2.g),
    cg(2203, "booster.craft.xp.bonus", "50", true, ent_2.b),
    ch(2204, "base.kamas.ratio", "1.0", true, ent_2.g),
    ci(2205, "booster.kamas.bonus", "30", true, ent_2.b),
    cj(2206, "base.drop.ratio", "1.0", true, ent_2.g),
    ck(2207, "booster.drop.bonus", "25", true, ent_2.b),
    cl(2300, "bodyguard.api.key", "", false, ent_2.c),
    cm(2301, "bodyguard.nala.character.base.path", "https://nala2.ankama.com/fr/wakfu/characters?id=", false, ent_2.c),
    cn(2302, "bodyguard.nala.account.base.path", "https://nala2.ankama.com/fr/account?id=", false, ent_2.c),
    co(2303, "bodyguard.excluded.channels", "guild|party", false, ent_2.d),
    cp(2304, "bodyguard.enabled", "true", false, ent_2.a),
    cq(2305, "bodyguard.do.not.remove", "false", false, ent_2.a),
    cr(2306, "bodyguard.excluded.classifications", "", false, ent_2.d),
    cs(2321, "bodyguard.vicinity.channel.id", "", false, ent_2.c),
    ct(2322, "bodyguard.battleground.channel.id", "", false, ent_2.c),
    cu(2323, "bodyguard.guild.channel.id", "", false, ent_2.c),
    cv(2324, "bodyguard.party.channel.id", "", false, ent_2.c),
    cw(2325, "bodyguard.politic.channel.id", "", false, ent_2.c),
    cx(2326, "bodyguard.private.channel.id", "", false, ent_2.c),
    cy(2327, "bodyguard.trade.channel.id", "", false, ent_2.c),
    cz(2328, "bodyguard.community.channel.id", "", false, ent_2.c),
    cA(2329, "bodyguard.recruitment.channel.id", "", false, ent_2.c),
    cB(2490, "market.service.enabled", "true", false, ent_2.a),
    cC(2491, "market.service.url", "http://localhost:8081", false, ent_2.c),
    cD(2492, "market.debug", "true", false, ent_2.a),
    cE(2493, "market.offers.enabled", "true", false, ent_2.a),
    cF(2500, "cosmetics.type.hidden", "", true, ent_2.e),
    cG(2510, "non.permanent.build.limit", "24", true, ent_2.b);

    private static final TShortObjectHashMap<ens_2> cI;
    private static final HashMap<String, ens_2> cJ;
    static final int cH;
    private final short cK;
    private final String cL;
    private final boolean cM;
    private final Object cN;
    private final ent_2 cO;

    private ens_2(@NotNull int n2, String string2, String string3, ent_2 ent_22) {
        this.cK = Hw.c((long)n2);
        this.cL = string2;
        this.cN = enn_2.a(ent_22, string3);
        this.cM = false;
        this.cO = ent_22;
    }

    private ens_2(@NotNull int n2, String string2, String string3, boolean bl, ent_2 ent_22) {
        this.cK = Hw.c((long)n2);
        this.cL = string2;
        this.cM = bl;
        this.cN = enn_2.a(ent_22, string3);
        this.cO = ent_22;
    }

    public static ens_2 a(String string) {
        return cJ.get(string);
    }

    public static ens_2 a(short s2) {
        return (ens_2)((Object)cI.get(s2));
    }

    public short a() {
        return this.cK;
    }

    public String b() {
        return this.cL;
    }

    public boolean c() {
        return this.cM;
    }

    @NotNull
    public Object d() {
        return this.cN;
    }

    public ent_2 e() {
        return this.cO;
    }

    static {
        cI = new TShortObjectHashMap();
        cJ = new HashMap();
        int n = 0;
        for (ens_2 ens_22 : ens_2.values()) {
            cI.put(ens_22.cK, (Object)ens_22);
            cJ.put(ens_22.cL, ens_22);
            if (!ens_22.cM) continue;
            ++n;
        }
        cH = n;
    }
}

