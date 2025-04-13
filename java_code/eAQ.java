/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.commons.lang3.StringUtils
 */
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import org.apache.commons.lang3.StringUtils;

public final class eAQ {
    public static final eAQ a = new eAQ();
    private boolean b = true;
    private boolean c = true;
    private final Map<Long, LinkedList<eAS>> d = new HashMap<Long, LinkedList<eAS>>();
    private final Map<Long, LinkedList<eAR>> e = new HashMap<Long, LinkedList<eAR>>();

    public static eAQ a() {
        return a;
    }

    private eAQ() {
        enp_2.a.a((ens_2 ens_22, Object object) -> {
            if (ens_22 == ens_2.cb) {
                this.b = enp_2.a.d(ens_2.cb);
            } else if (ens_22 == ens_2.bR) {
                this.c = enp_2.a.d(ens_2.bR);
            }
        });
    }

    public void b() {
        this.b = enp_2.a.d(ens_2.cb);
        this.c = enp_2.a.d(ens_2.bR);
    }

    public boolean a(eAT eAT2, String string) {
        if (!this.b) {
            return false;
        }
        if (string == null) {
            return false;
        }
        if (eAT2.b()) {
            return false;
        }
        long l = eAT2.a();
        eAS eAS2 = new eAS(eAQ.a(string), System.currentTimeMillis());
        if (!this.d.containsKey(l)) {
            this.d.put(l, new LinkedList());
        }
        this.a(l, eAS2.b());
        boolean bl = this.a(l, eAS2);
        this.b(l, eAS2);
        return bl;
    }

    private void a(long l, long l2) {
        LinkedList<eAS> linkedList = new LinkedList<eAS>();
        for (eAS eAS2 : this.d.get(l)) {
            if (eAS2.b() + 120000L < l2) continue;
            linkedList.add(eAS2);
        }
        this.d.put(l, linkedList);
    }

    private boolean a(long l, eAS eAS2) {
        LinkedList<eAS> linkedList = this.d.get(l);
        int n = 0;
        int n2 = 0;
        for (eAS eAS3 : linkedList) {
            if (eAS3.b() + 5000L > eAS2.b()) {
                ++n;
            }
            if (!(eAQ.a(eAS2.a(), eAS3.a()) >= 0.75f)) continue;
            ++n2;
        }
        return n >= 5 || n2 >= 3;
    }

    private void b(long l, eAS eAS2) {
        LinkedList<eAS> linkedList = this.d.get(l);
        linkedList.add(eAS2);
        if (linkedList.size() >= 10) {
            linkedList.removeFirst();
        }
    }

    public boolean a(eAT eAT2) {
        return this.a(eAT2, null, eAO.e);
    }

    public boolean a(eAT eAT2, String string, eAO eAO2) {
        if (!this.c) {
            return false;
        }
        if (eAT2.b()) {
            return false;
        }
        long l = eAT2.a();
        if (!this.e.containsKey(l)) {
            this.e.put(l, new LinkedList());
        }
        eAR eAR2 = new eAR(string, eAO2, System.currentTimeMillis());
        this.b(l, eAR2.a());
        boolean bl = this.a(l, eAR2);
        this.b(l, eAR2);
        return bl;
    }

    private void b(long l, long l2) {
        LinkedList<eAR> linkedList = new LinkedList<eAR>();
        for (eAR eAR2 : this.e.get(l)) {
            if (eAR2.a() + 120000L < l2) continue;
            linkedList.add(eAR2);
        }
        this.e.put(l, linkedList);
    }

    private boolean a(long l, eAR eAR2) {
        LinkedList<eAR> linkedList = this.e.get(l);
        int n = 0;
        int n2 = 0;
        for (eAR eAR3 : linkedList) {
            if (eAR3.a() + 5000L > eAR2.a()) {
                ++n;
            }
            if (!eAR2.a(eAR3)) continue;
            ++n2;
        }
        return n >= 5 || n2 >= 3;
    }

    private void b(long l, eAR eAR2) {
        LinkedList<eAR> linkedList = this.e.get(l);
        linkedList.add(eAR2);
        if (linkedList.size() >= 10) {
            linkedList.removeFirst();
        }
    }

    private static String a(String string) {
        String string2 = string.toLowerCase();
        string2 = string2.replaceAll("(\\?|\\!|\\,|\\;|\\.|\\/|\\*|\\@|\\#|\\\")", "");
        string2 = string2.replaceAll("(\u00e1|\u00e0|\u00e2|\u00e4|\u00e3)", "a");
        string2 = string2.replaceAll("(\u00e8|\u00ea|\u00eb|\u00e9)", "e");
        string2 = string2.replaceAll("(\u00ed|\u00ec|\u00ef|\u00ee)", "i");
        string2 = string2.replaceAll("(\u00f3|\u00f2|\u00f6|\u00f4)", "o");
        string2 = string2.replaceAll("(\u00fa|\u00f9|\u00fc|\u00fb)", "u");
        string2 = string2.replaceAll("(\u00f1)", "n");
        string2 = string2.replaceAll("(\u00e7)", "c");
        string2 = string2.replaceAll("(-)", " ");
        string2 = string2.replaceAll("(')", "' ");
        string2 = string2.replaceAll("([ ]+)", " ");
        string2 = string2.replaceAll("(<[^>]+>)", "");
        string2 = string2.trim();
        return string2;
    }

    private static float a(String string, String string2) {
        int n = StringUtils.getLevenshteinDistance((CharSequence)string, (CharSequence)string2);
        return 1.0f - (float)n / (float)Math.max(string.length(), string2.length());
    }
}

