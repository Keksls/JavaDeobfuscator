/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.iterator.TIntObjectIterator
 *  org.apache.log4j.Logger
 */
import com.ankamagames.wakfu.client.chat.console.command.UnknownCommand;
import gnu.trove.iterator.TIntObjectIterator;
import org.apache.log4j.Logger;

/*
 * Renamed from bdK
 */
public class bdk_1
implements agw_0 {
    private static final bdk_1 a = new bdk_1();
    private static final Logger b = Logger.getLogger(bdk_1.class);

    public static bdk_1 a() {
        return a;
    }

    @Override
    public String m_() {
        return bae.h().a("contentLoader.chat", new Object[0]);
    }

    public void a(YK yK) {
        aUf.c();
        aul_0 aul_02 = aul_0.a();
        aul_02.b(aup_0.b);
        aul_02.c(aup_0.c);
        aul_02.a(aup_0.d);
        aul_02.a(aup_0.e);
        aul_02.b(aup_0.f);
        aul_02.b(aup_0.g);
        aul_02.b(aup_0.h);
        aul_02.b(aup_0.i);
        aul_02.b(aup_0.l);
        aul_02.c(aup_0.m);
        aul_02.b(aup_0.n);
        aul_02.b(aup_0.o);
        aul_02.b(aup_0.p);
        aul_02.b(aup_0.q);
        aul_02.b(aup_0.r);
        aul_02.b(aup_0.s);
        aul_02.b(aup_0.t);
        aul_02.b(aup_0.u);
        aul_02.b(aup_0.j);
        aul_02.a(aup_0.k);
        aul_02.a(new UnknownCommand(), aUf.b(), new aun_0());
        yK.b(this);
    }

    public static void b() {
        String string = aUf.f();
        String string2 = azs_0.z("defaultChatFile");
        b.info((Object)"Loading chat file.");
        try {
            aUxx.a().p();
            if (gi_0.d(aUf.g())) {
                aUf.a(string, true);
            } else {
                aUf.a(string2, false);
            }
        }
        catch (Exception exception) {
            b.error((Object)"Exception \u00e0 la lecture des param\u00e8tres de chat : ", (Throwable)exception);
            aUxx.a().q();
            aUf.a(string2, false);
        }
        TIntObjectIterator<aUv> tIntObjectIterator = aUxx.a().h();
        while (tIntObjectIterator.hasNext()) {
            tIntObjectIterator.advance();
            aUv aUv2 = (aUv)tIntObjectIterator.value();
            if (aUv2 == null) continue;
            bdk_1.a(aUv2);
        }
        fis_1.a().a("chatManager", aUxx.a());
        aUf.a(true);
    }

    public static void a(aUr aUr2) {
        bdk_1.b(aUr2);
        bdk_1.a((auc_0)aUr2, aup_0.b);
        bdk_1.a((auc_0)aUr2, aup_0.c);
        bdk_1.a((auc_0)aUr2, aup_0.m);
        bdk_1.a((auc_0)aUr2, aup_0.f);
        bdk_1.a((auc_0)aUr2, aup_0.g);
        bdk_1.a((auc_0)aUr2, aup_0.h);
        bdk_1.a((auc_0)aUr2, aup_0.l);
        bdk_1.a((auc_0)aUr2, aup_0.n);
        bdk_1.a((auc_0)aUr2, aup_0.o);
        bdk_1.a((auc_0)aUr2, aup_0.p);
        bdk_1.a((auc_0)aUr2, aup_0.q);
        bdk_1.a((auc_0)aUr2, aup_0.r);
        bdk_1.a((auc_0)aUr2, aup_0.s);
        bdk_1.a((auc_0)aUr2, aup_0.t);
        bdk_1.a((auc_0)aUr2, aup_0.u);
        if (emp_0.b(azu_0.j().n().v(), emq_0.bh)) {
            bdk_1.a((auc_0)aUr2, aup_0.j);
        }
        aUr2.a(aUr2.r(), false);
    }

    private static void a(auc_0 auc_02, aup_0 aup_02) {
        auv_0 auv_02 = aUf.a(aup_02.i().b());
        if (auv_02 != null) {
            auc_02.a(aul_0.a().d(aup_02), aud_0.b, auv_02);
        }
    }

    public static void b(aUr aUr2) {
        aul_0 aul_02 = aul_0.a();
        for (aup_0 aup_02 : aUr2.m()) {
            aUn aUn2 = aul_02.d(aup_02);
            if (aUn2 == null) {
                b.error((Object)("Trying to register an unknown channel: " + aup_02));
                continue;
            }
            for (aUn aUn3 : aUn2.l().values()) {
                aUr2.a(aUn3, aud_0.a, null);
            }
            aUr2.a(aUn2, aud_0.a, null);
        }
    }

    public static void a(aUv aUv2) {
        aUv2.o();
        TIntObjectIterator<aUr> tIntObjectIterator = aUv2.c();
        while (tIntObjectIterator.hasNext()) {
            tIntObjectIterator.advance();
            aUr aUr2 = (aUr)tIntObjectIterator.value();
            if (aUr2.l()) {
                if (aUr2.r() == aUe.g) {
                    bdk_1.d(aUr2);
                    continue;
                }
                if (aUr2.r() != aUe.b) continue;
                bdk_1.c(aUr2);
                continue;
            }
            bdk_1.a(aUr2);
        }
    }

    public static aUv a(aUv aUv2, aUe aUe2, String string) {
        return bdk_1.a(-1, aUv2, aUe2, string);
    }

    public static aUv a(int n, aUv aUv2, aUe aUe2, String string) {
        aUv aUv3 = aUv2 == null ? aUxx.a().e() : aUv2;
        aUr aUr2 = aUv3.a(n, string, aUe2);
        if (aUe2 == aUe.b) {
            bdk_1.c(aUr2);
        } else if (aUe2 == aUe.g) {
            bdk_1.d(aUr2);
        }
        aUv3.a((auc_0)aUr2);
        return aUv3;
    }

    private static void c(aUr aUr2) {
        bdk_1.a(aUr2, aup_0.c);
    }

    private static void d(aUr aUr2) {
        bdk_1.a(aUr2, aup_0.m);
    }

    private static void a(aUr aUr2, aup_0 aup_02) {
        String string;
        aVd aVd2;
        aUn aUn2 = aul_0.a().d(aup_02);
        if (aUn2 == null) {
            aUn2 = aul_0.a().c(aup_02);
        }
        if ((aVd2 = (aVd)aUn2.b(string = aUr2.o())) == null) {
            aVd2 = new aVd(aup_02, string);
        }
        auv_0 auv_02 = aUf.a(aup_02.i().b());
        aUr2.a(aUn2, aud_0.a, auv_02);
        aUr2.a(aVd2, aud_0.a, auv_02);
        aUr2.a(aUn2, aud_0.b, auv_02);
        aUr2.a(aVd2, aud_0.b, auv_02);
        aUr2.a(aul_0.a().d(aup_0.d), aud_0.a, null);
        aUn2.a(string, aVd2);
        aUr2.a(auv_02.a(), false);
    }

    public void c() {
        aul_0 aul_02 = aul_0.a();
        TIntObjectIterator<aUv> tIntObjectIterator = aUxx.a().h();
        while (tIntObjectIterator.hasNext()) {
            tIntObjectIterator.advance();
            aUv aUv2 = (aUv)tIntObjectIterator.value();
            if (aUv2 == null) continue;
            TIntObjectIterator<aUr> tIntObjectIterator2 = aUv2.c();
            while (tIntObjectIterator2.hasNext()) {
                tIntObjectIterator2.advance();
                aUr aUr2 = (aUr)tIntObjectIterator2.value();
                if (aUr2.l()) continue;
                fcu_0 fcu_02 = azu_0.j().k().fE().w();
                if (fcu_02 != null) {
                    if (!aUr2.b(aup_0.i)) {
                        aUr2.a(aul_02.d(aup_0.i), aud_0.b, aUf.a(aUe.h.b()));
                        aUr2.a(aul_02.d(aup_0.i), aud_0.b, aUf.a(aUe.i.b()));
                        aUr2.a(aUr2.r(), false);
                    }
                } else {
                    aUr2.c(aup_0.i);
                    if (aUr2.r().d()) {
                        aUr2.a(aUe.a, true);
                    }
                }
                fis_1.a().a((ajf_1)aUr2, "channelsList");
            }
        }
    }
}

