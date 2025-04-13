/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Sets
 *  org.jetbrains.annotations.NotNull
 */
import com.google.common.collect.Sets;
import java.lang.invoke.LambdaMetafactory;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Consumer;
import java.util.function.Predicate;
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from eDF
 */
public class edf_0 {
    private final eZw a;
    private final Set<exh_2> b;

    public edf_0(eZw eZw2, @NotNull exh_2[] exh_2Array) {
        this.a = eZw2;
        this.b = Sets.newHashSet((Object[])exh_2Array);
    }

    public edf_0(eZw eZw2, exh_2 exh_22) {
        this.a = eZw2;
        this.b = exh_22 == null ? new HashSet() : Sets.newHashSet((Object[])new exh_2[]{exh_22});
    }

    @NotNull
    public List<String> a() {
        ezf_0 ezf_02;
        Map<ext_1, Integer> map;
        ArrayList<String> arrayList = new ArrayList<String>();
        if (this.a == null) {
            return arrayList;
        }
        boolean bl = enp_2.a.d(ens_2.aL);
        this.a.c().forEach((arg_0, arg_1) -> this.a(bl, arrayList, arg_0, arg_1));
        if (this.a.m() && (map = eyo_1.g().d(this.a.l())) != null && (ezf_02 = ((ezr_0)((Object)map)).aa()) != null && eZy.a(this.a, ezf_02)) {
            edf_0.a(map, arrayList);
        }
        map = this.a.k();
        if (this.a.o() && map.isEmpty() && (ezf_02 = eyo_1.g().d(this.a.n())) != null) {
            edf_0.a(ezf_02, arrayList);
        }
        if (!map.isEmpty() && !this.a.o()) {
            map.entrySet().stream().filter(entry -> entry.getKey() == ext_1.s || entry.getKey() == ext_1.t).forEach(entry -> {
                Object r2 = eyo_1.g().d((Integer)entry.getValue());
                if (r2 != null) {
                    edf_0.a(r2, arrayList);
                }
            });
        }
        return arrayList;
    }

    @NotNull
    public static eDq<eDw> a(ezr_0<?> ezr_02, boolean bl, short s2) {
        eDw eDw2 = new eDw(ezr_02);
        return new ede_0(eDw2, 0, s2, bl);
    }

    private static void a(ezr_0<?> ezr_02, ArrayList<String> arrayList) {
        eDw eDw2 = new eDw(ezr_02);
        eDq<eDw> eDq2 = new eDq<eDw>(eDw2, 0, 1);
        arrayList.addAll(eDq2.a());
    }

    /*
     * Unable to fully structure code
     */
    private /* synthetic */ void a(boolean var1_1, ArrayList var2_2, Byte var3_3, eze_0 var4_4) {
        var5_5 = var4_4.e();
        if (var5_5.isEmpty()) {
            return;
        }
        if (var4_4.c() == tc_0.a && !var1_1) {
            return;
        }
        var6_6 = var5_5.get();
        var7_7 = var6_6.ab();
        if (var7_7 == null) ** GOTO lbl-1000
        if (var7_7.b().stream().anyMatch((Predicate<exh_2>)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)Z, contains(java.lang.Object ), (LeXH;)Z)(this.b))) {
            v0 = true;
        } else lbl-1000:
        // 2 sources

        {
            v0 = false;
        }
        var8_8 = v0;
        var9_9 = edf_0.a(var6_6, var8_8, var4_4.f());
        var10_10 = var4_4.c() == tc_0.a ? azf_2.f : azf_2.v;
        var9_9.a().forEach((Consumer<String>)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)V, a(java.util.ArrayList azf_2 java.lang.String ), (Ljava/lang/String;)V)((ArrayList)var2_2, (azf_2)var10_10));
    }

    private static /* synthetic */ void a(ArrayList arrayList, azf_2 azf_22, String string) {
        arrayList.add(new ani_2().a(azf_22).a((CharSequence)string).r());
    }
}

