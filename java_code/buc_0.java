/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.impl.hash.TIntHash
 *  gnu.trove.iterator.TIntIterator
 *  gnu.trove.procedure.TIntProcedure
 *  gnu.trove.set.hash.TIntHashSet
 *  org.apache.log4j.Logger
 */
import gnu.trove.impl.hash.TIntHash;
import gnu.trove.iterator.TIntIterator;
import gnu.trove.procedure.TIntProcedure;
import gnu.trove.set.hash.TIntHashSet;
import org.apache.log4j.Logger;

/*
 * Renamed from buc
 */
public final class buc_0 {
    private static final Logger b = Logger.getLogger(buc_0.class);
    public static final String a = "( \\d+,)*";

    public static void a() {
        TIntHashSet tIntHashSet;
        TIntHashSet tIntHashSet2;
        bvx_0 bvx_02 = (bvx_0)ans_0.D().h();
        String string = bvx_02.f(bWe.aj);
        String string2 = bvx_02.f(bWe.ak);
        try {
            tIntHashSet2 = buc_0.a(string);
            tIntHashSet = buc_0.a(string2);
        }
        catch (Exception exception) {
            b.error((Object)"Exception levee, on reinitialise \u00e0 0 les pr\u00e9f\u00e9rences", (Throwable)exception);
            bvx_02.a((agp_0)bWe.aj, "");
            bvx_02.a((agp_0)bWe.ak, "");
            return;
        }
        buc_0.a(tIntHashSet2, bWe.aj);
        buc_0.a(tIntHashSet, bWe.ak);
        buc_0.a(tIntHashSet2, tIntHashSet);
        buc_0.a((TIntHash)tIntHashSet2, true);
        buc_0.a((TIntHash)tIntHashSet, false);
    }

    private static void a(TIntHash tIntHash, boolean bl) {
        tIntHash.forEach((TIntProcedure)new bud_0(bl));
    }

    private static void a(TIntHashSet tIntHashSet, TIntHashSet tIntHashSet2) {
        TIntIterator tIntIterator = tIntHashSet.iterator();
        while (tIntIterator.hasNext()) {
            int n = tIntIterator.next();
            if (!tIntHashSet2.contains(n)) continue;
            tIntIterator.remove();
            tIntHashSet2.remove(n);
            buc_0.b(bWe.aj, buc_0.a(n));
            buc_0.b(bWe.ak, buc_0.a(n));
        }
    }

    private static void a(TIntHashSet tIntHashSet, agp_0 agp_02) {
        TIntIterator tIntIterator = tIntHashSet.iterator();
        while (tIntIterator.hasNext()) {
            int n = tIntIterator.next();
            if (bua_0.a.a(n) != null) continue;
            buc_0.b(agp_02, buc_0.a(n));
            tIntIterator.remove();
        }
    }

    private static TIntHashSet a(String string) {
        boolean bl;
        boolean bl2 = bl = string == null || string.matches(a);
        if (!bl) {
            throw new IllegalArgumentException("Mauvais formatage des pr\u00e9f\u00e9rences");
        }
        String[] stringArray = string != null && string.length() > 0 ? string.split(",") : new String[]{};
        TIntHashSet tIntHashSet = new TIntHashSet();
        for (int k = 0; k < stringArray.length; ++k) {
            String string2 = stringArray[k].replaceAll(" ", "");
            int n = Integer.parseInt(string2);
            tIntHashSet.add(n);
        }
        return tIntHashSet;
    }

    public static void a(btZ btZ2) {
        String string = buc_0.a(btZ2.f());
        if (btZ2.g()) {
            buc_0.a(bWe.aj, string);
            buc_0.b(bWe.ak, string);
        } else {
            buc_0.a(bWe.ak, string);
            buc_0.b(bWe.aj, string);
        }
    }

    private static String a(int n) {
        return " " + Integer.toString(n) + ",";
    }

    private static void a(agp_0 agp_02, String string) {
        bvx_0 bvx_02 = (bvx_0)ans_0.D().h();
        String string2 = bvx_02.f(agp_02);
        if (string2 == null || string2.length() == 0) {
            bvx_02.a(agp_02, string);
        } else if (!string2.contains(string)) {
            String string3 = string2.concat(string);
            bvx_02.a(agp_02, string3);
        }
    }

    private static void b(agp_0 agp_02, String string) {
        bvx_0 bvx_02 = (bvx_0)ans_0.D().h();
        String string2 = bvx_02.f(agp_02);
        if (string2 == null || string2.length() == 0) {
            return;
        }
        if (!string2.contains(string)) {
            return;
        }
        String string3 = string2.replaceAll(string, "");
        bvx_02.a(agp_02, string3);
    }

    public static void a(String[] stringArray) {
        String string = a;
        String string2 = "";
        buc_0.a(a, "");
        buc_0.a(a, "qsfd");
        buc_0.a(a, "125");
        buc_0.a(a, "125, 123");
        buc_0.a(a, "125, 1231,");
        buc_0.a(a, "125, 1231, ");
        buc_0.a(a, " 125, 1231, ");
        buc_0.a(a, " 125, 1231,");
        buc_0.a(a, "125, 1231, n, ");
    }

    private static void a(String string, String string2) {
        System.err.println(string2 + " -> " + string2.matches(string));
    }
}

