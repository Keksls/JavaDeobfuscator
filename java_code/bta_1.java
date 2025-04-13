/*
 * Decompiled with CFR 0.152.
 */
import java.util.HashSet;
import java.util.Set;

/*
 * Renamed from btA
 */
public class bta_1 {
    private bta_1() {
    }

    public static String a(eZu eZu2) {
        Set<exh_2> set = eZu2.b();
        ani_2 ani_22 = new ani_2();
        boolean bl = true;
        HashSet<Short> hashSet = new HashSet<Short>();
        for (exh_2 exh_22 : set) {
            if (hashSet.contains(exh_22.b())) continue;
            hashSet.add(exh_22.b());
            if (!bl) {
                ani_22.a(' ');
            }
            bl = false;
            ani_22.a(azs_0.a().a(exh_22.b()), -1, -1, null);
        }
        return ani_22.toString();
    }

    public static String b(eZu eZu2) {
        Set<exh_2> set = eZu2.b();
        StringBuilder stringBuilder = new StringBuilder();
        boolean bl = true;
        for (exh_2 exh_22 : set) {
            if (!bl) {
                stringBuilder.append(", ");
            }
            bl = false;
            stringBuilder.append(bae.h().a(exh_22.B, new Object[0]));
        }
        return bae.h().a("enchantment.double.bonus", stringBuilder.toString());
    }
}

