/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.map.hash.TByteObjectHashMap
 *  gnu.trove.procedure.TObjectIntProcedure
 *  gnu.trove.procedure.TObjectProcedure
 *  gnu.trove.set.hash.TIntHashSet
 *  org.apache.log4j.Logger
 */
import gnu.trove.map.hash.TByteObjectHashMap;
import gnu.trove.procedure.TObjectIntProcedure;
import gnu.trove.procedure.TObjectProcedure;
import gnu.trove.set.hash.TIntHashSet;
import org.apache.log4j.Logger;

public class biZ {
    private static final Logger a = Logger.getLogger(biZ.class);
    private static final TByteObjectHashMap<bjd> b = new TByteObjectHashMap();

    private static bjd b() {
        bjd bjd2 = new bjd();
        bjc_0 bjc_02 = new bjc_0(exh_2.a, 1349907);
        bjd2.a(30, bjc_02, new bjc_0(exh_2.n, 1329924));
        bjd2.a(31, bjc_02, new bjc_0(exh_2.n, 1329925));
        bjd2.a(32, bjc_02, new bjc_0(exh_2.n, 1329926));
        bjd2.a(33, bjc_02, new bjc_0(exh_2.n, 13210733));
        return bjd2;
    }

    private static bjd c() {
        bjd bjd2 = new bjd();
        bjd2.a(30, new bjc_0(exh_2.n, 0x149919));
        bjd2.a(31, new bjc_0(exh_2.n, 1349912));
        bjd2.a(32, new bjc_0(exh_2.n, 1349911));
        bjd2.a(33, new bjc_0(exh_2.n, 13410435));
        return bjd2;
    }

    private static bjd d() {
        bjd bjd2 = new bjd();
        bjd2.a(30, new bjc_0(exh_2.n, 1349909));
        bjd2.a(31, new bjc_0(exh_2.n, 0x149914));
        bjd2.a(32, new bjc_0(exh_2.n, 1349910));
        bjd2.a(33, new bjc_0(exh_2.n, 13410434));
        return bjd2;
    }

    private static bjd a(bjc_0 ... bjc_0Array) {
        bjd bjd2 = new bjd();
        bjd2.a(30, bjc_0Array);
        bjd2.a(31, bjc_0Array);
        bjd2.a(32, bjc_0Array);
        bjd2.a(33, bjc_0Array);
        return bjd2;
    }

    public static void a(fcu_0 fcu_02, int n, TObjectIntProcedure<exh_2> tObjectIntProcedure) {
        bjd bjd2 = (bjd)b.get(fcu_02.g());
        if (bjd2 == null) {
            a.error((Object)("Pas d'equiepement d\u00e9fini pour le rank " + fcu_02));
            return;
        }
        bjc_0[] bjc_0Array = bjd2.a(n);
        if (bjc_0Array == null) {
            a.error((Object)("Pas d'equiepement d\u00e9fini pour le rank " + fcu_02 + " pour la nation " + n));
            return;
        }
        int n2 = bjc_0Array.length;
        for (int k = 0; k < n2; ++k) {
            if (tObjectIntProcedure.execute((Object)bjc_0Array[k].a, bjc_0Array[k].b)) continue;
            return;
        }
    }

    public static int a(fcu_0 fcu_02) {
        if (fcu_02 == null) {
            return -1;
        }
        switch (fcu_02) {
            case a: {
                return 800205;
            }
            case b: {
                return 800216;
            }
            case d: {
                return 800215;
            }
            case c: {
                return 800214;
            }
            case f: {
                return 800217;
            }
            case g: {
                return 800218;
            }
            case e: {
                return 800219;
            }
            case j: {
                return 800221;
            }
        }
        return -1;
    }

    public static int[] a() {
        TIntHashSet tIntHashSet = new TIntHashSet();
        b.forEachValue((TObjectProcedure)new bja(tIntHashSet));
        return tIntHashSet.toArray();
    }

    static {
        b.put(fcu_0.a.g(), (Object)biZ.b());
        b.put(fcu_0.b.g(), (Object)biZ.a(new bjc_0(exh_2.a, 1349921)));
        b.put(fcu_0.d.g(), (Object)biZ.c());
        b.put(fcu_0.c.g(), (Object)biZ.d());
        b.put(fcu_0.e.g(), (Object)biZ.a(new bjc_0(exh_2.a, 1349917)));
        b.put(fcu_0.j.g(), (Object)biZ.a(new bjc_0(exh_2.a, 1349918)));
        b.put(fcu_0.f.g(), (Object)biZ.a(new bjc_0(exh_2.a, 1349920)));
        b.put(fcu_0.g.g(), (Object)biZ.a(new bjc_0(exh_2.a, 1349922)));
    }
}

