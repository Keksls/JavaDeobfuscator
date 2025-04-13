/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.commons.pool.BasePoolableObjectFactory
 */
import org.apache.commons.pool.BasePoolableObjectFactory;

/*
 * Renamed from aBk
 */
class abk_1
extends BasePoolableObjectFactory<abh_1> {
    final /* synthetic */ abj_1 a;

    abk_1(abj_1 abj_12) {
        this.a = abj_12;
    }

    public abh_1 a() {
        try {
            Object t = this.a.e.b();
            ((abh_1)t).a(this.a);
            return t;
        }
        catch (Exception exception) {
            abj_1.b.error((Object)"Failed to create object", (Throwable)exception);
            return null;
        }
    }

    public /* synthetic */ Object makeObject() {
        return this.a();
    }
}

