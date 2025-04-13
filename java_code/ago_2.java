/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.commons.pool.PoolableObjectFactory
 */
import org.apache.commons.pool.PoolableObjectFactory;

/*
 * Renamed from aGo
 */
public abstract class ago_2<E extends agx_2>
implements PoolableObjectFactory {
    public abstract E a();

    public void activateObject(Object object) {
        ((abo_1)object).onCheckOut();
    }

    public void passivateObject(Object object) {
        ((abo_1)object).onCheckIn();
    }

    public void destroyObject(Object object) {
    }

    public boolean validateObject(Object object) {
        return true;
    }

    public /* synthetic */ Object makeObject() {
        return this.a();
    }
}

