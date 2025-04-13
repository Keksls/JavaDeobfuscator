/*
 * Decompiled with CFR 0.152.
 */
import java.util.Collections;
import java.util.Comparator;

/*
 * Renamed from aBX
 */
final class abx_1<T>
extends abw_2<T> {
    final /* synthetic */ abq_2 a;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    abx_1(abq_2 abq_22, Comparator comparator) {
        this.a = abq_22;
        super(comparator);
    }

    @Override
    public int a(abq_2<T> abq_22, T t) {
        return Collections.binarySearch(abq_22, t, ((abw_2)this).a);
    }
}

