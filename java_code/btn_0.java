/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.iterator.TShortObjectIterator
 *  gnu.trove.map.hash.TShortObjectHashMap
 *  gnu.trove.set.hash.TIntHashSet
 *  org.apache.log4j.Logger
 */
import gnu.trove.iterator.TShortObjectIterator;
import gnu.trove.map.hash.TShortObjectHashMap;
import gnu.trove.set.hash.TIntHashSet;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import org.apache.log4j.Logger;

/*
 * Renamed from btn
 */
public class btn_0
implements ajh_1,
ans_1 {
    public static final String a = "tutorials";
    public static final String b = "oneActivated";
    private static final Logger d = Logger.getLogger(btn_0.class);
    private static final btn_0 e = new btn_0();
    private static final String f = "tutorials";
    private static final String g = "tutorial";
    private static final String h = "part";
    private static final String i = "name";
    private static final String j = "activated";
    private static final String k = "eventId";
    private static final String l = "id";
    private final String[] m = new String[]{"tutorials", "oneActivated"};
    private final TShortObjectHashMap<bto_0> n = new TShortObjectHashMap();
    private final TIntHashSet o = new TIntHashSet();
    private boolean p = true;
    private static final boolean q = false;
    private int r;
    private String s;

    public static btn_0 a() {
        return e;
    }

    public static int a(short s2, short s3) {
        StringBuilder stringBuilder = new StringBuilder("2");
        String string = String.valueOf(s2);
        String string2 = String.valueOf(s3);
        StringBuilder stringBuilder2 = new StringBuilder("000");
        stringBuilder2.replace(stringBuilder2.length() - string.length(), stringBuilder2.length(), string);
        stringBuilder.append((CharSequence)stringBuilder2);
        StringBuilder stringBuilder3 = new StringBuilder("0000");
        stringBuilder3.replace(stringBuilder3.length() - string2.length(), stringBuilder3.length(), string2);
        stringBuilder.append((CharSequence)stringBuilder3);
        return Integer.valueOf(stringBuilder.toString());
    }

    @Override
    public Object b(String string) {
        if (string.equals("tutorials")) {
            return this.n.values();
        }
        if (string.equals(b)) {
            return !this.f();
        }
        return null;
    }

    public void a(short s2) {
        bto_0 bto_02;
        bto_02.a(!(bto_02 = (bto_0)this.n.get(s2)).c());
        try {
            this.a(this.e());
        }
        catch (Exception exception) {
            d.error((Object)"Exception during activateDesactivateTutorial", (Throwable)exception);
        }
        fis_1.a().a((ajf_1)this, this.d());
    }

    public void a(String string) {
        atg_2 atg_22 = atg_2.a();
        ath_2 ath_22 = atg_22.b();
        ath_22.a(new ati_2("tutorials", null));
        TShortObjectIterator tShortObjectIterator = this.n.iterator();
        while (tShortObjectIterator.hasNext()) {
            tShortObjectIterator.advance();
            bto_0 bto_02 = (bto_0)tShortObjectIterator.value();
            ati_2 ati_22 = new ati_2(g, null);
            ath_22.a().a(ati_22);
            ati_22.c(new atj_2(i, bto_02.b()));
            ati_22.c(new atj_2(l, String.valueOf(bto_02.a())));
            TShortObjectIterator<bts_0> tShortObjectIterator2 = bto_02.e();
            while (tShortObjectIterator2.hasNext()) {
                tShortObjectIterator2.advance();
                bts_0 bts_02 = (bts_0)tShortObjectIterator2.value();
                ati_2 ati_23 = new ati_2(h, null);
                ati_22.a(ati_23);
                ati_23.c(new atj_2(l, String.valueOf(bts_02.a())));
                ati_23.c(new atj_2(i, bts_02.b()));
                ati_23.c(new atj_2(j, String.valueOf(bts_02.c())));
                ati_23.c(new atj_2(k, String.valueOf(bts_02.d())));
            }
        }
        atg_22.g(string);
        atg_22.a(ath_22);
    }

    @Override
    public String[] d() {
        return this.m;
    }

    public void b(short s2, short s3) {
        bts_0 bts_02;
        bto_0 bto_02 = (bto_0)this.n.get(s2);
        bts_02.a(!(bts_02 = bto_02.a(s3)).c());
        if (this.c(bto_02.a(), bts_02.a())) {
            btn_0.a().d(bto_02.a(), bts_02.a());
        }
        try {
            this.a(this.e());
        }
        catch (Exception exception) {
            d.error((Object)"Exception during activateDesactivateTutorialPart", (Throwable)exception);
        }
        fis_1.a().a((ajf_1)this, this.d());
    }

    public void b() {
        boolean bl = this.f();
        TShortObjectIterator tShortObjectIterator = this.n.iterator();
        while (tShortObjectIterator.hasNext()) {
            tShortObjectIterator.advance();
            bto_0 bto_02 = (bto_0)tShortObjectIterator.value();
            bto_02.a(bl);
            this.a(this.e());
        }
        fis_1.a().a((ajf_1)this, this.d());
    }

    private String e() {
        return new URL(azs_0.z("tutorialFile")).getFile();
    }

    private boolean f() {
        TShortObjectIterator tShortObjectIterator = this.n.iterator();
        while (tShortObjectIterator.hasNext()) {
            tShortObjectIterator.advance();
            if (((bto_0)tShortObjectIterator.value()).c()) continue;
            return true;
        }
        return false;
    }

    public void a(String string, btn_0 btn_02) {
        atg_2 atg_22 = atg_2.a();
        ath_2 ath_22 = (ath_2)atg_22.n();
        atg_22.a(string);
        atg_22.a(ath_22, new aqy_2[0]);
        atg_22.l();
        boolean bl = false;
        TShortObjectIterator tShortObjectIterator = btn_02.n.iterator();
        while (tShortObjectIterator.hasNext()) {
            Object object;
            tShortObjectIterator.advance();
            bto_0 bto_02 = (bto_0)tShortObjectIterator.value();
            ArrayList<aqx_2> arrayList = ath_22.d(g);
            aqx_2 object2 = null;
            boolean bl2 = false;
            for (aqx_2 aqx_22 : arrayList) {
                if (aqx_22.f(i) == null) {
                    d.error((Object)"Nom de tutorial invalide dans le chargement des tutoriaux");
                }
                object = aqx_22.f(i).c();
                if (!bto_02.b().equals(object)) continue;
                object2 = aqx_22;
                bl2 = true;
                break;
            }
            if (object2 == null) {
                bl = true;
                object2 = new ati_2(g, null);
                object2.c(new atj_2(i, bto_02.b()));
                object2.c(new atj_2(l, String.valueOf(bto_02.a())));
                arrayList.add(object2);
                ath_22.a().a(object2);
            }
            Iterator<aqx_2> iterator = bto_02.e();
            while (iterator.hasNext()) {
                iterator.advance();
                bts_0 bts_02 = (bts_0)iterator.value();
                if (bl2) {
                    object = object2.d(h);
                    boolean bl3 = false;
                    Iterator iterator2 = ((ArrayList)object).iterator();
                    while (iterator2.hasNext()) {
                        aqx_2 aqx_23 = (aqx_2)iterator2.next();
                        if (bts_02.a() != aqx_23.f(l).g()) continue;
                        bl3 = true;
                        break;
                    }
                    if (bl3) continue;
                    bl = true;
                    this.a(bts_02, object2);
                    continue;
                }
                this.a(bts_02, object2);
            }
        }
        if (bl) {
            atg_22.g(string);
            atg_22.a(ath_22);
        }
    }

    private void a(bts_0 bts_02, aqx_2 aqx_22) {
        ati_2 ati_22 = new ati_2(h, null);
        ati_22.c(new atj_2(l, String.valueOf(bts_02.a())));
        aqx_22.a(ati_22);
        if (bts_02.b() != null && bts_02.b().length() > 0) {
            ati_22.c(new atj_2(i, bts_02.b()));
            aqx_22.a(ati_22);
        }
        ati_22.c(new atj_2(j, "true"));
        aqx_22.a(ati_22);
        ati_22.c(new atj_2(k, String.valueOf(bts_02.d())));
        aqx_22.a(ati_22);
    }

    public void a(btr_0 btr_02, String string) {
        if (this.p) {
            // empty if block
        }
    }

    public void c() {
    }

    public void c(String string) {
        atg_2 atg_22 = atg_2.a();
        ath_2 ath_22 = atg_22.b();
        atg_22.a(string);
        atg_22.a(ath_22, new aqy_2[0]);
        atg_22.l();
        ArrayList<aqx_2> arrayList = ath_22.d(g);
        if (arrayList == null) {
            return;
        }
        for (aqx_2 aqx_22 : arrayList) {
            if (aqx_22.f(i) == null) {
                d.error((Object)"Nom de tutorial invalide dans le chargement des tutoriaux");
                continue;
            }
            String string2 = aqx_22.f(i).c();
            int n = aqx_22.f(l).g();
            ArrayList<aqx_2> arrayList2 = aqx_22.e(h);
            TShortObjectHashMap tShortObjectHashMap = new TShortObjectHashMap();
            for (int k = 0; k < arrayList2.size(); ++k) {
                aqx_2 aqx_23 = arrayList2.get(k);
                aqx_2 aqx_24 = aqx_23.f(i);
                aqx_2 aqx_25 = aqx_23.f(j);
                aqx_2 aqx_26 = aqx_23.f(k);
                aqx_2 aqx_27 = aqx_23.f(l);
                if (aqx_24 == null || aqx_25 == null || aqx_26 == null || aqx_27 == null) {
                    d.error((Object)("Step incorrecte dans le XML de tutorial " + string2));
                    continue;
                }
                tShortObjectHashMap.put((short)aqx_27.g(), (Object)new bts_0((short)aqx_27.g(), aqx_24.c(), aqx_25.d(), aqx_26.e()));
            }
            bto_0 bto_02 = (bto_0)this.n.get((short)n);
            if (bto_02 != null) continue;
            bto_02 = new bto_0((short)n, string2, (TShortObjectHashMap<bts_0>)tShortObjectHashMap);
            this.n.put((short)n, (Object)bto_02);
        }
    }

    public boolean c(short s2, short s3) {
        return this.o.contains(Hw.c(s2, s3));
    }

    public void d(short s2, short s3) {
        this.r = -1;
        if (!this.o.remove(Hw.c(s2, s3))) {
            d.error((Object)"[TUTORIAL] On essaye de supprimer un TutorialAction des launchedTutorial alors que celui-ci n'y est pas.");
        }
    }

    public void a(boolean bl) {
        this.p = bl;
    }

    @Override
    public void dialogUnloaded(String string) {
        if (string != null && string.equals(this.s)) {
            this.c();
        }
    }

    public String toString() {
        return "EmbeddedTutorialManager{m_tutorialsCount=" + this.n.size() + ", m_enabled=" + this.p + ", m_launchedActionId=" + this.r + ", m_linkedDialogId='" + this.s + "', m_launchedTutorialsCount=" + this.o.size() + "}";
    }
}

