/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Function
 */
import com.google.common.base.Function;

class GB
implements Function<Gz, Iterable<T>> {
    final /* synthetic */ GM a;
    final /* synthetic */ GA b;

    GB(GA gA, GM gM) {
        this.b = gA;
        this.a = gM;
    }

    public Iterable<T> a(Gz gz) {
        return this.a.a(gz);
    }

    public /* synthetic */ Object apply(Object object) {
        return this.a((Gz)object);
    }
}

