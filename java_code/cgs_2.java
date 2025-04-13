/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.util.HashMap;
import java.util.Map;
import org.apache.log4j.Logger;

/*
 * Renamed from cgs
 */
public class cgs_2
implements ahr_1 {
    protected static final Logger a = Logger.getLogger(cgs_2.class);
    private static final cgs_2 b = new cgs_2();
    private static final int c = 1000000;
    private final Map<Byte, Long> d = new HashMap<Byte, Long>();
    private final Map<Byte, Double> e = new HashMap<Byte, Double>();
    private final Map<Byte, Double> f = new HashMap<Byte, Double>();
    private final Map<Byte, Integer> g = new HashMap<Byte, Integer>();

    public static cgs_2 a() {
        return b;
    }

    private cgs_2() {
    }

    public long a(byte by) {
        return this.d.containsKey(by) ? this.d.get(by) : 0L;
    }

    public int b(byte by) {
        return this.g.containsKey(by) ? this.g.get(by) : 0;
    }

    public double c(byte by) {
        return this.e.containsKey(by) ? this.e.get(by) : 0.0;
    }

    public double d(byte by) {
        return this.f.containsKey(by) ? this.f.get(by) : 0.0;
    }

    @Override
    public boolean a(adt_1 adt_12) {
        switch (adt_12.a()) {
            case 333: {
                PC pC = (PC)adt_12;
                switch (pC.b()) {
                    case 1: {
                        int n = pC.f();
                        int n2 = n / 60;
                        int n3 = n % 60;
                        String string = bae.h().a("systemNotification.shutdown.time", n2, n3);
                        aul_0.a().b(string);
                        dlx.a().a(new dlw(dly.a, string, 5000));
                        break;
                    }
                    case 2: {
                        String string = bae.h().a("systemNotification.shutdown.canceled", new Object[0]);
                        aul_0.a().b(string);
                        dlx.a().a(new dlw(dly.a, string, 5000));
                        break;
                    }
                    case 3: {
                        String string = pC.h();
                        aul_0.a().a(string, aup_0.k);
                        dlx.a().a(new dlw(dly.b, string, this.a(string)));
                        break;
                    }
                    case 9: {
                        Object object;
                        HashMap<Byte, String> hashMap = new HashMap<Byte, String>();
                        for (int k = 0; k < Ow.q.size(); ++k) {
                            object = pC.d();
                            String string = pC.h();
                            hashMap.put((Byte)object, string);
                        }
                        Ow ow = bae.h().f();
                        object = (String)hashMap.get(ow.c());
                        if (object == null || ((String)object).isEmpty() || ((String)object).isBlank()) {
                            object = (String)hashMap.get(Ow.b.c());
                        }
                        if (object == null) {
                            a.error((Object)"Received a localized system message, but there is no translation available");
                            break;
                        }
                        aul_0.a().a((String)object, aup_0.k);
                        dlx.a().a(new dlw(dly.b, (String)object, this.a((String)object)));
                        break;
                    }
                    case 11: {
                        String string = pC.h();
                        String string2 = pC.h();
                        aUm aUm2 = new aUm(string, string2);
                        aUm2.a(aup_0.b);
                        aul_0.a().a(aUm2);
                        break;
                    }
                    case 4: {
                        String string = pC.h();
                        aul_0.a().c(string);
                        break;
                    }
                    case 5: {
                        String string = bae.h().a("systemNotification.moderatedZone.start", new Object[0]);
                        aul_0.a().c(string);
                        break;
                    }
                    case 6: {
                        String string = bae.h().a("systemNotification.moderatedZone.stop", new Object[0]);
                        aul_0.a().c(string);
                        break;
                    }
                    case 7: {
                        String string = bae.h().a("systemNotification.moderatedZone.enter", new Object[0]);
                        aul_0.a().c(string);
                        break;
                    }
                    case 8: {
                        String string = bae.h().a("systemNotification.moderatedZone.leave", new Object[0]);
                        aul_0.a().c(string);
                        break;
                    }
                    case 100: {
                        String string = bae.h().a("error.chat.channelNotFound", new Object[0]);
                        aul_0.a().b(string);
                        break;
                    }
                    case 101: {
                        String string = pC.h();
                        String string3 = bae.h().a("error.chat.userNotFound", string);
                        aul_0.a().b(string3);
                        break;
                    }
                    case 102: {
                        String string = pC.h();
                        String string4 = bae.h().a("error.chat.userDoNotDisturb", string);
                        aul_0.a().b(string4);
                        break;
                    }
                    case 103: {
                        String string = pC.h();
                        String string5 = bae.h().a("error.chat.userIgnoreYou", string);
                        aul_0.a().b(string5);
                        break;
                    }
                    case 104: {
                        String string = bae.h().a("error.chat.targetIsYourself", new Object[0]);
                        aul_0.a().b(string);
                        break;
                    }
                    case 105: {
                        String string = bae.h().a("systemNotification.cannotChatWhenMuted", new Object[0]);
                        aul_0.a().b(string);
                        break;
                    }
                    case 106: {
                        String string = bae.h().a("systemNotification.cannotChatOnGlobalChannels", eAL.b());
                        aul_0.a().b(string);
                        break;
                    }
                    case 107: {
                        long l = pC.g();
                        String string = bae.h().a("error.chat.channelDelayError", l / 1000L);
                        aul_0.a().b(string);
                        break;
                    }
                    case 108: {
                        String string = bae.h().a("error.chat.whileJoiningChannel", new Object[0]);
                        aul_0.a().b(string);
                        break;
                    }
                    case 109: {
                        String string = bae.h().a("error.chat.whileLeavingChannel", new Object[0]);
                        aul_0.a().b(string);
                        break;
                    }
                    case 140: {
                        aUh.a("error.chat.generalError", new Object[0]);
                        break;
                    }
                    case 141: {
                        aUh.a("error.chat.regularItemNotFound", new Object[0]);
                        break;
                    }
                    case 142: {
                        aUh.a("error.chat.bagNotFound", new Object[0]);
                        break;
                    }
                    case 143: {
                        aUh.a("error.chat.questItemNotFound", new Object[0]);
                        break;
                    }
                    case 144: {
                        aUh.a("error.chat.cosmeticItemNotFound", new Object[0]);
                        break;
                    }
                    case 112: {
                        String string = bae.h().a("error.chat.restrictedChannel", new Object[0]);
                        aul_0.a().b(string);
                        break;
                    }
                    case 200: {
                        String string = bae.h().a("error.chat.maxFriendCountReached", 100);
                        aul_0.a().b(string);
                        break;
                    }
                    case 201: {
                        String string = bae.h().a("error.chat.maxIgnoredCountReached", 100);
                        aul_0.a().b(string);
                        break;
                    }
                    case 113: {
                        Ow ow = Ow.a(pC.d());
                        cgs_2.a(ow);
                        break;
                    }
                    case 111: {
                        Ow ow = Ow.a(pC.d());
                        cgs_2.b(ow);
                        break;
                    }
                    case 115: {
                        aUh.a("error.chat.playerNotInBattleground", new Object[0]);
                        break;
                    }
                    case 199: {
                        String string = bae.h().a("error.chat.operationNotPermited", new Object[0]);
                        aul_0.a().b(string);
                        break;
                    }
                    case 114: {
                        String string = bae.h().a("systemNotification.moderatedZone.cannotChat", new Object[0]);
                        aul_0.a().b(string);
                        break;
                    }
                    case 116: {
                        aUh.a("error.chat.moderatorMessageRemoved", new Object[0]);
                        break;
                    }
                    case 117: {
                        aUh.a("error.chat.pmBetweenTwoAfkPlayers", new Object[0]);
                        break;
                    }
                    case 300: {
                        aUh.a("error.mount", new Object[0]);
                        break;
                    }
                    case 301: {
                        aUh.a("error.mount.dead", new Object[0]);
                        break;
                    }
                    case 500: {
                        aUh.b("notification.guild.invitationRefused", pC.h());
                        break;
                    }
                    default: {
                        a.error((Object)("Notification syst\u00e8me inconnue : type=" + pC.b()));
                    }
                }
                return false;
            }
            case 349: {
                Py py = (Py)adt_12;
                double d2 = (double)(py.g() - py.d()) / 1000000.0;
                double d3 = (double)(py.f() - py.e()) / 1000000.0;
                if (py.c() == 0 && py.b() == 3) {
                    aUh.b("chat.ping", Math.round(d2));
                } else if (py.c() > 0) {
                    aVo.a().b("Server " + Xf.a(py.b()) + ": RTT = " + Math.round(d2) + " ms ; PT = " + Math.round(d3) + " ms");
                }
                a.info((Object)("Pong! serverGroup=" + py.b() + " rtt=" + d2 + " processing=" + d3 + " key=" + py.c()));
                this.d.put(py.b(), System.currentTimeMillis());
                this.g.put(py.b(), py.c());
                this.e.put(py.b(), d2);
                this.f.put(py.b(), d3);
                return false;
            }
        }
        return true;
    }

    public static void a(Ow ow) {
        String string = bae.h().a("error.chat.languageNotActivatedByServer", new Object[0]) + " " + bae.h().d(ow);
        aul_0.a().b(string);
    }

    public static void b(Ow ow) {
        String string = bae.h().a("error.chat.languageNotActivatedByPlayer", new Object[0]) + " " + bae.h().d(ow);
        aul_0.a().b(string);
    }

    @Override
    public long a_() {
        return 0L;
    }

    @Override
    public void a(long l) {
    }

    private int a(String string) {
        return 500 + string.length() * 100;
    }
}

