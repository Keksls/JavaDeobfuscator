/*
 * Decompiled with CFR 0.152.
 */
import java.util.EnumMap;

/*
 * Renamed from bMp
 */
public class bmp_0 {
    private static boolean a() {
        bmr_1 bmr_12 = azu_0.j().k();
        return bmr_12 == null || !bmr_12.f(erl_2.ad);
    }

    public static void a(ani_2 ani_22, bMn bMn2) {
        fem_0 fem_02;
        bmf_0 bmf_02 = (bmf_0)bMn2.E();
        if (bmf_02 == null) {
            return;
        }
        boolean bl = bmp_0.a();
        if (bae.h().a(66, (long)bmf_02.e()) && (fem_02 = bMn2.D().E().b(bMn2.B())) != null) {
            boolean bl2 = fem_02.d();
            String string = bae.h().a(66, (long)bmf_02.e(), new Object[0]);
            if (string.length() > 0) {
                if (bl && bl2) {
                    ani_22.i().a(bmi_0.b.w());
                }
                ani_22.a().a((CharSequence)string);
                if (bl2 && bl) {
                    ani_22.a((CharSequence)(" " + bae.h().a("chaos.label", new Object[0])));
                }
                ani_22.b().m();
                if (bl2 && bl) {
                    ani_22.j();
                }
                if (bl) {
                    short s2 = bmf_02.c();
                    short s3 = bmf_02.d();
                    if (s2 != -1 && s3 != -1) {
                        ani_22.a((CharSequence)Cr.a(bae.h().a("recommended.level", s2, s3), new Object[0])).m();
                    }
                }
            }
        }
        bmp_0.a(ani_22, bMn2, bl);
    }

    private static void a(ani_2 ani_22, bMn bMn2, boolean bl) {
        bae bae2 = bae.h();
        if (bMn2 == null) {
            ani_22.a((CharSequence)bae2.a("map.territories.noProtector", new Object[0]));
        } else {
            ani_22.a((CharSequence)bae2.a("map.territories.protectorName", bMn2.d()));
            if (bl) {
                if (bMn2.F() != -1) {
                    ani_22.a((CharSequence)" - ").a((CharSequence)bae2.a(39, (long)bMn2.F(), new Object[0]));
                } else {
                    ani_22.a((CharSequence)" - ").a((CharSequence)bae2.a("map.territories.noNation", new Object[0]));
                }
            }
            if (bl) {
                Object object;
                EnumMap<fjb_0, fja_0> enumMap = bMn2.u();
                if (enumMap != null && !enumMap.isEmpty()) {
                    ani_22.m().m().a().a((CharSequence)bae2.a("protector.tax.desc", new Object[0])).b();
                    object = enumMap.get((Object)fjb_0.a);
                    ani_22.m().a((CharSequence)bhg_1.b((fja_0)object));
                    ani_22.m().a((CharSequence)bhg_1.a((fja_0)object));
                }
                if ((object = bMn2.g()) != null && ((int[])object).length != 0) {
                    ani_22.m().m().a().a((CharSequence)bae2.a("protector.craft", new Object[0])).b();
                    int n = ((int[])object).length;
                    for (int k = 0; k < n; ++k) {
                        ani_22.m().a((CharSequence)bae2.a(43, (long)object[k], new Object[0]));
                    }
                }
            }
        }
    }
}

