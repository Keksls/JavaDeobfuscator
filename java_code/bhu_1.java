/*
 * Decompiled with CFR 0.152.
 */
import java.util.Comparator;

/*
 * Renamed from bHu
 */
public final class bhu_1 {
    public static final Comparator<exk_2> a = Comparator.comparing(exk_22 -> Cz.e(exk_22.N()));
    public static final Comparator<exk_2> b = Comparator.comparing(exk_22 -> {
        short s2 = exk_22.c();
        return s2 != 0 ? s2 : exk_22.T().G();
    });
    public static final Comparator<exk_2> c = Comparator.comparing(exk_22 -> bjo_1.a().a((exk_2)exk_22, 0L));
    public static final Comparator<exk_2> d = Comparator.comparing(exk_2::e);

    private bhu_1() {
    }
}

