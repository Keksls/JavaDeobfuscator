/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.map.hash.THashMap
 */
import gnu.trove.map.hash.THashMap;
import java.util.Optional;

/*
 * Renamed from ayI
 */
public class ayi_2 {
    private static final THashMap<ayn_2, ayf_2> a = new THashMap();

    public static ayn_2 a(ayo_1 ayo_12, String string, boolean bl) {
        return ayt_1.a(ayo_12, string, bl);
    }

    public static ayf_2 a(ayn_2 ayn_22) {
        ayf_2 ayf_22 = (ayf_2)a.get((Object)ayn_22);
        if (ayf_22 != null) {
            return ayf_22;
        }
        if (ayn_22.getClass() == ayg_2.class) {
            ayj_1 ayj_12 = new ayj_1();
            ayj_12.a((ayg_2)ayn_22);
            a.put((Object)ayn_22, (Object)ayj_12);
            return ayj_12;
        }
        if (ayn_22.getClass() == axu_1.class) {
            axy_1 axy_12 = new axy_1();
            axy_12.a((axu_1)ayn_22);
            a.put((Object)ayn_22, (Object)axy_12);
            return axy_12;
        }
        if (ayn_22 instanceof axt_1) {
            axt_1 axt_12 = (axt_1)ayn_22;
            ays_1 ays_12 = ayi_2.a(axt_12.f()).map(aye_12 -> new ays_1(axt_12.d(), axt_12.e(), false, (aye_1)aye_12, axt_12.g(), axt_12.h())).orElseGet(() -> new ays_1(axt_12.d(), axt_12.e(), false, axt_12.g(), axt_12.h()));
            ays_12.o();
            ays_12.a(false);
            a.put((Object)ayn_22, (Object)ays_12);
            return ays_12;
        }
        return null;
    }

    private static Optional<aye_1> a(ayr_1 ayr_12) {
        if (ayr_12 == ayr_1.b) {
            return Optional.of(axz_1.a);
        }
        if (ayr_12 == ayr_1.c) {
            return Optional.of(aya_2.a);
        }
        return Optional.empty();
    }
}

