/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Function
 */
import com.google.common.base.Function;

class Gv
implements Function<Gu, Iterable<Gq>> {
    Gv() {
    }

    public Iterable<Gq> a(Gu gu) {
        return gu.a();
    }

    public /* synthetic */ Object apply(Object object) {
        return this.a((Gu)object);
    }
}

