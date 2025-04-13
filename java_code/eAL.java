/*
 * Decompiled with CFR 0.152.
 */
public class eAL {
    public static boolean a() {
        return enp_2.a.d(ens_2.bY);
    }

    public static int b() {
        return enp_2.a.b(ens_2.bZ);
    }

    public static boolean a(long l) {
        if (!eAL.a()) {
            return true;
        }
        int n = eAL.b();
        return ena_0.a().a(l, end_0.a).flatMap(emy_02 -> ((eaf_0)emy_02).a()).map(s2 -> s2 >= n).orElse(false);
    }
}

