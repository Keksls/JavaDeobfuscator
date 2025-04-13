/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.commons.pool.PoolableObjectFactory
 *  org.apache.log4j.Logger
 */
import java.util.ArrayList;
import org.apache.commons.pool.PoolableObjectFactory;
import org.apache.log4j.Logger;

/*
 * Renamed from aBn
 */
public abstract class abn_1<E extends abo_1>
implements PoolableObjectFactory {
    private static final boolean a = false;
    private static final int b = -1;
    private static final Logger c = Logger.getLogger(abn_1.class);
    private final ArrayList<abo_1> d = new ArrayList(0);

    public abstract E b();

    public void activateObject(Object object) {
        try {
            ((abo_1)object).onCheckOut();
        }
        catch (Exception exception) {
            c.error((Object)"Exception on checkOut : ", (Throwable)exception);
        }
    }

    public void passivateObject(Object object) {
        try {
            ((abo_1)object).onCheckIn();
        }
        catch (Exception exception) {
            c.error((Object)"Exception on checkIn : ", (Throwable)exception);
            throw new RuntimeException(exception.toString());
        }
    }

    public void destroyObject(Object object) {
    }

    public boolean validateObject(Object object) {
        return true;
    }

    private int a(Object object) {
        int n = this.d.size();
        for (int k = 0; k < n; ++k) {
            if (this.d.get(k) != object) continue;
            return k;
        }
        return -1;
    }

    public /* synthetic */ Object makeObject() {
        return this.b();
    }
}

