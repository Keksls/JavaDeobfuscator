/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Predicate
 */
import com.google.common.base.Predicate;

class Gs
implements Predicate<Gq> {
    final /* synthetic */ Gt a;

    Gs(Gt gt) {
        this.a = gt;
    }

    public boolean a(Gq gq) {
        return gq.a() == this.a;
    }

    public /* synthetic */ boolean apply(Object object) {
        return this.a((Gq)object);
    }
}

