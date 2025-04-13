/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.iterator.TIntObjectIterator
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.Nullable
 */
import gnu.trove.iterator.TIntObjectIterator;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import org.apache.log4j.Logger;
import org.jetbrains.annotations.Nullable;

public final class aUf {
    private static final Logger b = Logger.getLogger(aUf.class);
    private static final String c = "chat";
    private static final String d = "selectedChat";
    private static final String e = "window";
    private static final String f = "command";
    private static final String g = "view";
    private static final String h = "selectedView";
    private static final String i = "name";
    private static final String j = "isDefault";
    private static final String k = "id";
    private static final String l = "isInLine";
    private static final String m = "lastDefinedHeight";
    private static final String n = "channelName";
    private static final String o = "opennedPipes";
    private static final String p = "value";
    private static final String q = "isPrivate";
    private static final String r = "isNameDirty";
    private static final String s = "cmdPattern";
    public static final String a = "chat.xml";
    private static final Pattern t = Pattern.compile(".*\\Q(?:\\E(/[^|^)]+)[|)].*");
    private static final ArrayList<aUm> u = new ArrayList();
    private static final HashMap<String, auv_0> v = new HashMap();
    private static final Set<eog_0> w = new HashSet<eog_0>();
    private static aUe x = null;
    private static aUe y = null;
    private static boolean z;

    private aUf() {
    }

    public static boolean a() {
        return z;
    }

    public static URL b() {
        return anr_0.class.getResource("/com/ankamagames/wakfu/client/chat/console/ChatCommandDescriptorSet.xml");
    }

    public static void a(aUm aUm2) {
        if (u.contains(aUm2)) {
            return;
        }
        u.add(aUm2);
    }

    public static void a(boolean bl) {
        z = bl;
        if (!z || u.isEmpty()) {
            return;
        }
        for (aUm aUm2 : u) {
            aul_0.a().a(aUm2);
        }
        u.clear();
    }

    public static void a(String string, boolean bl) {
        atg_2 atg_22 = atg_2.a();
        ath_2 ath_22 = atg_22.b();
        atg_22.a(string);
        atg_22.a(ath_22, new aqy_2[0]);
        atg_22.l();
        w.clear();
        if (bl) {
            aUf.b(ath_22);
        } else {
            aUf.a(ath_22);
        }
    }

    private static void a(aqv_2 aqv_22) {
        ArrayList<aqx_2> arrayList = aqv_22.d(e);
        boolean bl = true;
        aUxx aUxx2 = aUxx.a();
        for (aqx_2 aqx_22 : arrayList) {
            if (aqx_22.f(k) == null) {
                b.error((Object)"Id null sur au chargement d'une fen\u00eatre de chat");
                continue;
            }
            int n = aqx_22.f(k).g();
            int n2 = aqx_22.f(h).g();
            aUv aUv2 = aUxx2.b(n);
            if (aUv2 == null) {
                aUv2 = aUxx2.a(n);
            }
            aUv2.b(n2);
            ArrayList<aqx_2> arrayList2 = aqx_22.d(g);
            if (arrayList2 == null) continue;
            for (aqx_2 aqx_23 : arrayList2) {
                if (aqx_23.f(k) == null) continue;
                int n3 = aqx_23.f(k).g();
                String string = aqx_23.f(i).c();
                String string2 = aqx_23.f(o).c();
                String string3 = aqx_23.f(n).c();
                aUe aUe2 = aUe.a(string3);
                if (aUe2 == null) {
                    b.error((Object)("Commande inconnue enregistr\u00e9e sur la vue " + string));
                    continue;
                }
                aUr aUr2 = new aUr(n3, string, aUe2, aup_0.v, true);
                aUr2.a(aUf.b(string2));
                aUv2.b(aUr2);
            }
            if (bl) {
                aUxx2.a(aUv2);
            }
            bl = false;
        }
        ((bvx_0)ans_0.D().h()).j();
        aUf.i();
    }

    public static auv_0 a(String string) {
        if (string == null) {
            return null;
        }
        if (x != null && string.equals(x.b())) {
            return v.get(aUe.k.b());
        }
        if (y != null && string.equals(y.b())) {
            return v.get(aUe.p.b());
        }
        return v.get(string);
    }

    public static void c() {
        atg_2 atg_22 = atg_2.a();
        ath_2 ath_22 = atg_22.b();
        atg_22.a(aUf.b().toString());
        atg_22.a(ath_22, new aqy_2[0]);
        atg_22.l();
        ArrayList<aqx_2> arrayList = ath_22.d(f);
        for (aqx_2 aqx_22 : arrayList) {
            aqx_2 aqx_23;
            aqx_2 aqx_24 = aqx_22.f(n);
            if (aqx_24 == null || (aqx_23 = aqx_22.f(s)) == null) continue;
            String string = aqx_24.c();
            String string2 = aqx_23.c();
            Matcher matcher = t.matcher(string2);
            if (!matcher.find()) continue;
            String string3 = matcher.group(1);
            aUe aUe2 = aUe.a(string);
            if (aUe2 == null) continue;
            v.put(string, new auv_0(aUe2, string3));
        }
    }

    public static void a(Ow ow) {
        x = aUe.a(ow);
    }

    public static void b(Ow ow) {
        y = aUe.b(ow);
    }

    private static void b(aqv_2 aqv_22) {
        int n;
        ArrayList<aqx_2> arrayList = aqv_22.d(e);
        boolean bl = false;
        for (aqx_2 aqx_22 : arrayList) {
            ArrayList<aqx_2> arrayList2;
            aqx_2 aqx_23;
            aqx_2 aqx_24;
            if (aqx_22.f(k) == null) {
                b.error((Object)"Id null sur au chargement d'une fen\u00eatre de chat");
                continue;
            }
            n = aqx_22.f(k).g();
            int n2 = aqx_22.f(h).g();
            aUv aUv2 = aUxx.a().b(n);
            if (aUv2 == null) {
                aUv2 = aUxx.a().a(n);
            }
            if ((aqx_24 = aqx_22.f(l)) != null) {
                aUv2.b(aqx_24.d());
            }
            if ((aqx_23 = aqx_22.f(m)) != null) {
                aUv2.a((Integer)aqx_23.g());
            }
            if ((arrayList2 = aqx_22.d(g)) == null) continue;
            for (aqx_2 aqx_25 : arrayList2) {
                Object object;
                Object object2;
                Object object3;
                Object object4;
                if (aqx_25.f(k) == null) continue;
                int n3 = aqx_25.f(k).g();
                boolean bl2 = aqx_25.f(j).d();
                boolean bl3 = aqx_25.f(r).d();
                boolean bl4 = aqx_25.f(q) != null && aqx_25.f(q).d();
                bl |= bl2;
                String string = aqx_25.f(i).c();
                if (!bl3 && !bl2 && !bl4 && ((Matcher)(object4 = ((Pattern)(object3 = Pattern.compile("[0-9]+"))).matcher(string))).find()) {
                    object2 = ((Matcher)object4).group();
                    object = Integer.valueOf((String)object2);
                    string = bae.h().a("chat.pipeName.personnal", object);
                }
                object3 = aqx_25.f(o).c();
                object4 = aqx_25.f(n).c();
                object2 = aUe.a((String)object4);
                if (object2 == null) {
                    b.error((Object)("Commande inconnue enregistr\u00e9e sur la vue " + string));
                    continue;
                }
                object = aUf.b((String)object3);
                aUr aUr2 = aUv2.a(n3);
                if (aUr2 == null) {
                    if (bl4) {
                        bdk_1.a(n3, aUv2, (aUe)object2, string);
                        continue;
                    }
                    aUr2 = new aUr(n3, string, (aUe)object2, aup_0.v, bl2);
                    aUr2.a((List<aup_0>)object);
                    aUr2.b(bl3);
                } else {
                    aUr2.c(string);
                    aUr2.b(bl3);
                    aUr2.a((aUW)object2);
                    aUr2.a((List<aup_0>)object);
                    aUr2.c(bl2);
                }
                aUv2.b(aUr2);
            }
            aUr aUr3 = aUv2.b(n2);
            if (aUr3 != null) continue;
            throw new IllegalStateException("Impossible de retrouver la vue de la fen\u00eatre de chat d'id=" + aUv2.a() + " id de la vue enregistr\u00e9e=" + n2 + " reset config...");
        }
        if (!bl) {
            throw new IllegalStateException("Acucune vue par d\u00e9faut dans la configuration du chat ! On reset la config en attendant de savoir ce qui s'est pass\u00e9");
        }
        ArrayList<aqx_2> arrayList3 = aqv_22.d(d);
        if (arrayList3 != null) {
            aqx_2 aqx_22;
            if (arrayList3.size() > 1) {
                b.warn((Object)"La sauvegarde poss\u00e8de plusieurs r\u00e9f\u00e9rences \u00e0 un chat par d\u00e9faut, \u00e9trange...");
            }
            aqx_22 = (aqx_2)arrayList3.get(0);
            n = aqx_22.f(p).g();
            aUxx.a().c(n);
        }
        ((bvx_0)ans_0.D().h()).j();
        aUf.i();
    }

    private static List<aup_0> b(String string) {
        ArrayList<aup_0> arrayList = new ArrayList<aup_0>();
        for (String string2 : string.split(",")) {
            try {
                arrayList.add(aup_0.a(Integer.parseInt(string2)));
            }
            catch (NumberFormatException numberFormatException) {
                b.error((Object)"ClassCastException during getFilters", (Throwable)numberFormatException);
            }
        }
        return arrayList;
    }

    private static void i() {
        if (aUf.b(aup_0.h)) {
            aUf.a(eog_0.c);
        }
        aUf.d();
    }

    public static void d() {
        for (Ow ow : Ow.p) {
            eog_0 eog_02 = eog_0.a(ow.c());
            aup_0 aup_02 = aup_0.a(ow);
            if (aUf.a(aup_02, ow)) {
                aUf.a(eog_02);
            } else {
                aUf.b(eog_02);
            }
            eog_0 eog_03 = eog_0.b(ow.c());
            aup_0 aup_03 = aup_0.b(ow);
            if (aUf.a(aup_03, ow)) {
                aUf.a(eog_03);
                continue;
            }
            aUf.b(eog_03);
        }
    }

    public static boolean a(aup_0 aup_02) {
        for (aUr aUr2 : aUxx.a().n()) {
            if (!aUr2.a(aup_02)) continue;
            return false;
        }
        return true;
    }

    public static boolean b(aup_0 aup_02) {
        for (aUr aUr2 : aUxx.a().n()) {
            if (!aUr2.a(aup_02)) continue;
            return true;
        }
        return false;
    }

    public static boolean a(aup_0 aup_02, @Nullable Ow ow) {
        if (ow == null) {
            return aUf.b(aup_02);
        }
        if (!((bvx_0)ans_0.D().h()).b(ow)) {
            return false;
        }
        return aUf.b(aup_02);
    }

    public static void a(eog_0 eog_02) {
        if (w.contains((Object)eog_02)) {
            return;
        }
        PL pL = new PL();
        pL.a(eog_02.a());
        azu_0.j().K().c(pL);
        w.add(eog_02);
    }

    public static void b(eog_0 eog_02) {
        if (!w.contains((Object)eog_02)) {
            return;
        }
        PL pL = new PL();
        pL.a(eog_02.a());
        pL.c();
        azu_0.j().K().c(pL);
        w.remove((Object)eog_02);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static void e() {
        Object object;
        b.info((Object)"save chat config");
        atg_2 atg_22 = atg_2.a();
        ath_2 ath_22 = atg_22.b();
        String string = aUf.g();
        atg_22.g(string);
        ath_22.a(new ati_2(c, null));
        atg_22.a(ath_22, "");
        atg_22.l();
        atg_22.a(string);
        atg_22.a(ath_22, new aqy_2[0]);
        atg_22.l();
        aUxx aUxx2 = aUxx.a();
        Object object2 = aUxx2.h();
        while (object2.hasNext()) {
            object2.advance();
            object = (aUv)object2.value();
            int n = ((aUv)object).a();
            if (aUxx2.e(n)) continue;
            ati_2 ati_22 = new ati_2(e, null);
            ati_22.c(new atj_2(k, String.valueOf(n)));
            ati_22.c(new atj_2(h, String.valueOf(((aUv)object).i())));
            ati_22.c(new atj_2(l, String.valueOf(((aUv)object).k())));
            Integer n2 = ((aUv)object).l();
            if (n2 != null) {
                ati_22.c(new atj_2(m, String.valueOf(n2)));
            }
            int n3 = 0;
            TIntObjectIterator<aUr> tIntObjectIterator = ((aUv)object).c();
            while (tIntObjectIterator.hasNext()) {
                tIntObjectIterator.advance();
                aUr aUr2 = (aUr)tIntObjectIterator.value();
                try {
                    aUf.a(aUr2, ati_22);
                }
                catch (RuntimeException runtimeException) {
                    b.error((Object)"Impossible de sauvegarder une vue", (Throwable)runtimeException);
                }
                finally {
                    ++n3;
                }
            }
            if (n3 == 0) continue;
            ath_22.a().a(ati_22);
        }
        object2 = aUxx.a().f();
        if (object2 != null) {
            object = new ati_2(d, null);
            ((ati_2)object).c(new atj_2(p, String.valueOf(((aUv)object2).a())));
            ath_22.a().a((aqx_2)object);
        } else {
            b.error((Object)"Impossible de r\u00e9cup\u00e9rer le chat par d\u00e9faut, il y a un probl\u00e8me.");
        }
        atg_22.g(string);
        atg_22.a(ath_22);
        atg_22.l();
    }

    private static void a(aUr aUr2, ati_2 ati_22) {
        ati_2 ati_23 = new ati_2(g, null);
        ati_23.c(new atj_2(k, String.valueOf(aUr2.f())));
        ati_23.c(new atj_2(i, aUr2.o()));
        ati_23.c(new atj_2(j, String.valueOf(aUr2.p())));
        ati_23.c(new atj_2(r, String.valueOf(aUr2.q())));
        ati_23.c(new atj_2(n, aUr2.e().a().b()));
        ati_23.c(new atj_2(q, String.valueOf(aUr2.l())));
        String string = aUr2.m().stream().map(aup_02 -> String.valueOf(aup_02.a())).collect(Collectors.joining(","));
        ati_23.c(new atj_2(o, string));
        ati_22.a(ati_23);
    }

    public static String f() {
        return "file:" + azr_0.a().l() + "/chat.xml";
    }

    public static String g() {
        return gg_0.d(aUf.f()).getFile();
    }

    static void h() {
        gi_0.e(aUf.g());
    }

    public static String a(aUe aUe2) {
        return aUf.a(aUe2.b()).b();
    }
}

