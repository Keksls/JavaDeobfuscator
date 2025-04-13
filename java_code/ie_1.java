/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Maps
 */
import com.google.common.collect.Maps;
import java.awt.Dimension;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

/*
 * Renamed from IE
 */
public class ie_1 {
    private final kh_1 a;
    private final mo_2 b;
    private final mn_2 c;
    private final Dimension d;
    private final HashMap<Integer, float[]> e;
    private final HashMap<Integer, int[]> f;
    private final HashMap<Integer, int[]> g;

    public ie_1(kh_1 kh_12, mo_2 mo_22, mn_2 mn_22, Dimension dimension, HashMap<Integer, float[]> hashMap, HashMap<Integer, int[]> hashMap2, HashMap<Integer, int[]> hashMap3) {
        this.a = kh_12;
        this.b = mo_22;
        this.c = mn_22;
        this.d = dimension;
        this.e = Maps.newHashMap(hashMap);
        this.f = Maps.newHashMap(hashMap2);
        this.g = Maps.newHashMap(hashMap3);
    }

    public final void a() {
        List list = this.a.b().a().stream().filter(arg_0 -> if_1.a(kl_1.w).apply(arg_0)).map(arg_0 -> if_1.a().apply(arg_0)).flatMap(kk_12 -> StreamSupport.stream(((Iterable)if_1.b().apply(kk_12)).spliterator(), false)).filter(arg_0 -> if_1.a(kl_1.x).apply(arg_0)).map(arg_0 -> if_1.c().apply(arg_0)).collect(Collectors.toList());
        for (lw_2 lw_22 : list) {
            this.a(lw_22);
        }
    }

    private void a(lw_2 lw_22) {
        List list3;
        List list2 = lw_22.b().a().stream().filter(arg_0 -> if_1.a(kl_1.d).apply(arg_0)).map(arg_0 -> if_1.c().apply(arg_0)).collect(Collectors.toList());
        for (List list3 : list2) {
            this.a((lp_2)((Object)list3));
        }
        List list4 = lw_22.b().a().stream().filter(arg_0 -> if_1.a(kl_1.p).apply(arg_0)).map(arg_0 -> if_1.c().apply(arg_0)).collect(Collectors.toList());
        list3 = list4.iterator();
        while (list3.hasNext()) {
            lq_2 lq_22 = (lq_2)list3.next();
            this.a(lq_22);
        }
        list3 = lw_22.b().a().stream().filter(arg_0 -> if_1.a(kl_1.x).apply(arg_0)).map(arg_0 -> if_1.c().apply(arg_0)).collect(Collectors.toList());
        for (lw_2 lw_23 : list3) {
            this.a(lw_23);
        }
    }

    private void a(lp_2 lp_22) {
        int n = lp_22.a();
        float[] fArray = this.e.get(n);
        if (fArray == null) {
            return;
        }
        lp_22.a(fArray[0]);
        lp_22.b(fArray[1]);
        lp_22.c(fArray[2]);
        lp_22.d(fArray[3]);
        int[] nArray = this.f.get(n);
        if (nArray == null) {
            return;
        }
        lp_22.c(nArray[0] / 2);
        lp_22.b(nArray[1] / 2);
        int[] nArray2 = this.g.get(n);
        if (nArray2 == null) {
            return;
        }
        lp_22.a(lp_22.b()[0] - (float)nArray2[0], lp_22.b()[1] - (float)nArray2[0]);
        lp_22.b(lp_22.c()[0] - (float)nArray2[1], lp_22.c()[1] - (float)nArray2[1]);
    }

    private void a(lq_2 lq_22) {
        int n = lq_22.a();
        float[] fArray = this.e.get(n);
        if (fArray == null) {
            return;
        }
        lq_22.a(fArray[0]);
        lq_22.b(fArray[1]);
        lq_22.c(fArray[2]);
        lq_22.d(fArray[3]);
        int[] nArray = this.f.get(n);
        if (nArray == null) {
            return;
        }
        lq_22.c(nArray[0] / 2);
        lq_22.b(nArray[1] / 2);
        int[] nArray2 = this.g.get(n);
        if (nArray2 == null) {
            return;
        }
        lq_22.a(lq_22.b()[0] - (float)nArray2[0], lq_22.b()[1] - (float)nArray2[0]);
        lq_22.b(lq_22.c()[0] - (float)nArray2[1], lq_22.c()[1] - (float)nArray2[1]);
        mp_2 mp_22 = this.b.a(lq_22.a());
        short s2 = mp_22.a();
        short s3 = mp_22.b();
        short s4 = (short)this.d.getWidth();
        short s5 = (short)this.d.getHeight();
        short[] sArray = mp_22.g();
        float f2 = fArray[1] * (float)s4;
        float f3 = fArray[0] * (float)s5;
        short[] sArray2 = mp_22.e();
        for (int k = 0; k < sArray2.length; k += 2) {
            int n2 = k;
            sArray2[n2] = (short)((float)sArray2[n2] + f2);
            int n3 = k + 1;
            sArray2[n3] = (short)((float)sArray2[n3] + f3);
        }
        mp_2 mp_23 = new mp_2();
        mp_23.a(s2);
        mp_23.b(s3);
        mp_23.c(s4);
        mp_23.d(s5);
        mp_23.a(mp_22.f());
        mp_23.b(sArray);
        mp_23.a(sArray2);
        this.c.a(n, mp_23);
    }
}

