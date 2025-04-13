/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Function
 *  com.google.common.collect.Iterables
 */
import com.google.common.base.Function;
import com.google.common.collect.Iterables;

class Gw
implements Function<Gu, Iterable<Gu>> {
    Gw() {
    }

    public Iterable<Gu> a(Gu gu) {
        return Iterables.transform(gu.a(), Gq.a);
    }

    public /* synthetic */ Object apply(Object object) {
        return this.a((Gu)object);
    }
}

