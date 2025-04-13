/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Strings
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.Nullable
 */
import com.google.common.base.Strings;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;
import org.apache.log4j.Logger;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from bfL
 */
public class bfl_2 {
    private static final Logger a = Logger.getLogger(bfl_2.class);

    protected static void a() {
        asw_2.a().a(new aTG(), aTG2 -> {
            int n = aTG2.c();
            evv_1 evv_12 = evv_1.a().a(n).b(aTG2.d()).a(ezy_1.a).c(0).a(bfl_2.a(aTG2.g())).b(bfl_2.a(aTG2.h())).a(aTG2.e()).a(bfl_2.a(aTG2.i())).b(bfl_2.a(aTG2.j(), n)).c(bfl_2.a(aTG2.k(), n)).a(bfl_2.a(aTG2.f())).a();
            evl_1.a.a(evv_12);
        });
    }

    @Nullable
    private static apc_2 a(@Nullable String string) {
        if (Strings.isNullOrEmpty((String)string)) {
            return null;
        }
        try {
            return eyS.c(string);
        }
        catch (Exception exception) {
            return null;
        }
    }

    private static List<evb_1> a(atk_0[] atk_0Array, int n) {
        if (atk_0Array == null || atk_0Array.length == 0) {
            return Collections.emptyList();
        }
        return Arrays.stream(atk_0Array).map(atk_02 -> evb_1.a().a(atk_02.a()).b(atk_02.b()).c(atk_02.c()).b(bfl_2.a(atk_02.f(), n)).a(bfl_2.a(atk_02.e(), n)).a()).collect(Collectors.toList());
    }

    private static List<evz_1> a(aTJ[] aTJArray, int n) {
        if (aTJArray == null || aTJArray.length == 0) {
            return Collections.emptyList();
        }
        abq_2<evz_1> abq_22 = new abq_2<evz_1>(Comparator.comparingInt(evz_1::e));
        for (aTJ aTJ2 : aTJArray) {
            int n2 = aTJ2.a();
            int n3 = aTJ2.b();
            int n4 = aTJ2.c();
            int n5 = aTJ2.e();
            if (n3 <= 0) {
                a.error((Object)("[DATA][STELE] Stele reward " + n2 + " from stele " + n + " uses a bad item " + n3));
                continue;
            }
            @Nullable exk_2 exk_22 = eyo_1.g().g(n3);
            if (exk_22 == null) {
                a.error((Object)("[DATA][STELE] Stele reward from stele " + n + " uses item " + n3 + " that doesn't exist"));
                continue;
            }
            abq_22.add(evz_1.a().a(n2).b(n3).c(n4).d(n5).a());
        }
        return abq_22;
    }

    private static List<evx_1> a(ath_0[] ath_0Array) {
        if (ath_0Array == null || ath_0Array.length == 0) {
            a.warn((Object)"[DATA][STELE] A stele is loaded without difficulties");
            return Collections.emptyList();
        }
        return Arrays.stream(ath_0Array).map(ath_02 -> new evx_1(ath_02.a(), ath_02.b(), ath_02.c())).collect(Collectors.toList());
    }

    private static evy_1 a(ati_0[] ati_0Array) {
        if (ati_0Array == null) {
            return new evy_1(new HashMap<Integer, Integer>(), 0L);
        }
        long l = 0L;
        HashMap<Integer, Integer> hashMap = new HashMap<Integer, Integer>();
        for (ati_0 ati_02 : ati_0Array) {
            l += ati_02.c();
            hashMap.merge(ati_02.a(), ati_02.b(), Integer::sum);
        }
        return new evy_1(hashMap, l);
    }
}

