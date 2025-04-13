/*
 * Decompiled with CFR 0.152.
 */
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.function.Consumer;

/*
 * Renamed from bIe
 */
public final class bie_0 {
    private static final Comparator<Integer> a = Comparator.comparing(n -> Cz.e(bae.h().a(15, (long)n.intValue(), new Object[0])));
    private static final bie_0 b = new bie_0();
    private final Map<Integer, ezf_0> c = new TreeMap<Integer, ezf_0>(a);
    private final Collection<Integer> d = new TreeSet<Integer>(a);
    private final Collection<Integer> e = new TreeSet<Integer>(a);

    public static bie_0 a() {
        return b;
    }

    private bie_0() {
    }

    public void a(int n, ezf_0 ezf_02) {
        if (ezf_02.b() == ezh_0.c) {
            this.c.put(n, ezf_02);
        } else if (ezf_02.b() == ezh_0.b) {
            this.d.add(n);
        } else if (ezf_02.b() == ezh_0.a) {
            this.e.add(n);
        }
    }

    public Collection<Integer> b() {
        return Collections.unmodifiableCollection(this.d);
    }

    public Collection<Integer> c() {
        return Collections.unmodifiableCollection(this.e);
    }

    public void a(faL[] faLArray, boolean bl, Consumer<Map.Entry<Integer, ezf_0>> consumer) {
        tc_0[] tc_0Array = bie_0.a(faLArray);
        for (Map.Entry<Integer, ezf_0> entry : this.c.entrySet()) {
            if (!bie_0.a(entry.getValue().a(), tc_0Array, bl)) continue;
            consumer.accept(entry);
        }
    }

    private static tc_0[] a(faL[] faLArray) {
        tc_0[] tc_0Array = new tc_0[faLArray.length];
        block4: for (int k = 0; k < tc_0Array.length; ++k) {
            switch (faLArray[k]) {
                case f: 
                case g: {
                    tc_0Array[k] = tc_0.e;
                    continue block4;
                }
                case a: 
                case b: 
                case c: 
                case d: 
                case e: {
                    tc_0Array[k] = faLArray[k].b();
                    continue block4;
                }
            }
        }
        return tc_0Array;
    }

    private static boolean a(tc_0[] tc_0Array, tc_0[] tc_0Array2, boolean bl) {
        if (bl) {
            for (int k = 0; k <= tc_0Array2.length - tc_0Array.length; ++k) {
                if (!bie_0.a(tc_0Array, tc_0Array2, k)) continue;
                return true;
            }
            return false;
        }
        return bie_0.a(tc_0Array, tc_0Array2);
    }

    private static boolean a(tc_0[] tc_0Array, tc_0[] tc_0Array2, int n) {
        for (int k = 0; k < tc_0Array.length; ++k) {
            if (tc_0Array2[n + k] == tc_0.e && tc_0Array[k] != tc_0.a || tc_0Array[k] == tc_0Array2[n + k]) continue;
            return false;
        }
        return true;
    }

    private static boolean a(tc_0[] tc_0Array, tc_0[] tc_0Array2) {
        byte by;
        int[] nArray = bie_0.a(tc_0Array);
        int[] nArray2 = bie_0.a(tc_0Array2);
        if (nArray2[by = tc_0.e.a()] < nArray[by]) {
            return false;
        }
        byte by2 = by;
        nArray2[by2] = nArray2[by2] - nArray[by];
        int n = 0;
        for (tc_0 tc_02 : tc_0.f) {
            n += Math.max(0, nArray[tc_02.a()] - nArray2[tc_02.a()]);
        }
        return n <= nArray2[by];
    }

    private static int[] a(tc_0[] tc_0Array) {
        int[] nArray = new int[tc_0.g];
        for (tc_0 tc_02 : tc_0Array) {
            byte by = tc_02.a();
            nArray[by] = nArray[by] + 1;
        }
        return nArray;
    }
}

