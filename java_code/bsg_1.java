/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.iterator.TIntIterator
 *  gnu.trove.set.hash.TIntHashSet
 */
import gnu.trove.iterator.TIntIterator;
import gnu.trove.set.hash.TIntHashSet;
import java.util.EnumMap;
import java.util.stream.Stream;

/*
 * Renamed from bsG
 */
public class bsg_1
implements aqn_2 {
    private static final bsg_1 d = new bsg_1();
    public static final int a = -1;
    public static final int b = 0;
    private static final EnumMap<ffk, bsi_1> e;
    public static final fat<UH<Integer>> c;

    private static void a(ffk ffk2, bsj_0 bsj_02, bsf_1 bsf_12) {
        e.put(ffk2, new bsi_1(bsf_12, bsj_02));
    }

    public static bsi_1 a(ffk ffk2) {
        return e.get(ffk2);
    }

    public static bsi_1 b() {
        return e.get(ffk.c());
    }

    @Override
    public TIntHashSet a() {
        TIntHashSet tIntHashSet = new TIntHashSet();
        for (bsi_1 bsi_12 : e.values()) {
            bsi_12.a(tIntHashSet);
        }
        c.b().forEachValue(uH -> tIntHashSet.add(((Integer)uH.b()).intValue()));
        return tIntHashSet;
    }

    public static bsg_1 c() {
        return d;
    }

    public static void a(String[] stringArray) {
        TIntHashSet tIntHashSet = bsg_1.c().a();
        TIntIterator tIntIterator = tIntHashSet.iterator();
        while (tIntIterator.hasNext()) {
            System.out.print(" " + tIntIterator.next());
        }
    }

    static {
        c = new fat();
        bsf_1 bsf_12 = new bsf_1(56340, 56339, 56338, 56341, 56342, 56343);
        c.a(new UH<Integer>(56348, 150));
        Stream.of(56366, 56367, 56365, 56361, 56364, 56371, 56372, 56370, 56368, 56369, 56353, 56350, 56349, 56176, 56352, 56356, 56357, 56355, 56351, 56354, 56374, 56376, 56375, 56362, 56363, 56373).forEach(n -> c.a(new UH<Integer>((Integer)n, 1)));
        e = new EnumMap(ffk.class);
        bsg_1.a(ffk.a, new bso_0(34350, 34351), bsf_12);
        bsg_1.a(ffk.b, new bso_0(34352, 34353, 56432), bsf_12);
        bsg_1.a(ffk.c, new bso_0(56313, 56314, 56315, 56316, 56317, 56318), bsf_12);
        bsg_1.a(ffk.d, new bso_0(56319), bsf_12);
        bsg_1.a(ffk.e, new bso_0(34354, 34355, 56312), bsf_12);
        bsg_1.a(ffk.f, new bso_0(56320, 56321, 56322, 56323, 56324, 56325, 56326, 56327), bsf_12);
        bsg_1.a(ffk.g, new bso_0(56334, 56335, 56336, 56337), bsf_12);
        bsg_1.a(ffk.h, new bso_0(56328, 56329, 56330, 56331, 56332, 56333), bsf_12);
    }
}

