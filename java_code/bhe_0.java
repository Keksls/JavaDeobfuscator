/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.map.hash.TIntObjectHashMap
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
import gnu.trove.map.hash.TIntObjectHashMap;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.apache.log4j.Logger;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from bHE
 */
public class bhe_0
extends exp_1<bjw_1, bhd_1> {
    static final Logger c = Logger.getLogger(bhe_0.class);
    private static final bhe_0 d = new bhe_0();
    private asy_2<asq_0> e = new asz_2<asq_0>(new asq_0());

    public static bhe_0 a() {
        return d;
    }

    private bhe_0() {
    }

    @Override
    public void a(@NotNull asy_2<asq_0> asy_22) {
        this.e = asy_22;
    }

    @Override
    @Nullable
    public bhd_1 a(short s2) {
        if (s2 <= 0) {
            return null;
        }
        bhd_1 bhd_12 = (bhd_1)this.b.get(s2);
        if (bhd_12 == null && !this.b.contains(s2)) {
            asq_0 asq_02 = this.e.a(s2);
            if (asq_02 == null) {
                return null;
            }
            bhd_12 = bhe_0.a(asq_02);
            this.a(bhd_12);
        }
        return bhd_12;
    }

    static bhd_1 a(asq_0 asq_02) {
        ArrayList<bjw_1> arrayList = new ArrayList<bjw_1>();
        int[] nArray = asq_02.e();
        int n = nArray == null ? 0 : nArray.length;
        for (int k = 0; k < n; ++k) {
            int n2 = nArray[k];
            bjw_1 bjw_12 = (bjw_1)eyo_1.g().d(n2);
            if (bjw_12 == null) {
                c.warn((Object)("item inconnu itemId=" + n2 + " pour la panop " + asq_02.c()));
                continue;
            }
            arrayList.add(bjw_12);
        }
        bhd_1 bhd_12 = new bhd_1(asq_02.c(), asq_02.d(), (List<bjw_1>)arrayList);
        bhe_0.a(asq_02, bhd_12);
        bhd_12.c();
        return bhd_12;
    }

    public static void a(asq_0 asq_02, exo_2 exo_22) {
        HashMap<Integer, int[]> hashMap = asq_02.f();
        if (hashMap != null && !hashMap.isEmpty()) {
            for (Map.Entry<Integer, int[]> entry : hashMap.entrySet()) {
                for (int n : entry.getValue()) {
                    efh_0 efh_02 = bgh_0.a().c(n);
                    if (efh_02 != null) {
                        Integer n2 = entry.getKey();
                        exo_22.a((int)n2, efh_02);
                        continue;
                    }
                    c.error((Object)("Probl\u00e8me lors de chargemetn de itemSEt " + exo_22.h()));
                }
            }
        }
    }

    public TIntObjectHashMap<bhd_1> b() {
        TIntObjectHashMap tIntObjectHashMap = new TIntObjectHashMap();
        try {
            asw_2.a().a(new asq_0(), new bhf_0(this, tIntObjectHashMap));
        }
        catch (Exception exception) {
            c.error((Object)"", (Throwable)exception);
        }
        return tIntObjectHashMap;
    }

    @Override
    @Nullable
    public /* synthetic */ exo_2 b(short s2) {
        return this.a(s2);
    }
}

