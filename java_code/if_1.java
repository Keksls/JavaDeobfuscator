/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Function
 *  com.google.common.base.Predicate
 */
import com.google.common.base.Function;
import com.google.common.base.Predicate;

/*
 * Renamed from IF
 */
final class if_1 {
    private if_1() {
    }

    static Predicate<lk_2> a(kl_1 ... kl_1Array) {
        return new ig_1(kl_1Array);
    }

    static Function<lk_2, kk_1> a() {
        return new ih_1();
    }

    static Function<kk_1, Iterable<lk_2>> b() {
        return new ii_1();
    }

    static <T extends ll_2> Function<lk_2, T> c() {
        return new ij_1();
    }
}

