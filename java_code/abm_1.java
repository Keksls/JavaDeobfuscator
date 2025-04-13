/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.commons.pool.PoolableObjectFactory
 *  org.apache.commons.pool.impl.SoftReferenceObjectPool
 *  org.apache.log4j.Logger
 */
import java.util.HashMap;
import org.apache.commons.pool.PoolableObjectFactory;
import org.apache.commons.pool.impl.SoftReferenceObjectPool;
import org.apache.log4j.Logger;

/*
 * Renamed from aBm
 */
public class abm_1
extends SoftReferenceObjectPool {
    protected static final Logger a = Logger.getLogger(abm_1.class);
    protected String b;
    protected static final Object c = new Object();
    protected static final HashMap<String, abm_1> d = new HashMap();

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static abm_1 a(String string) {
        Object object = c;
        synchronized (object) {
            return d.get(string);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static Iterable<String> a() {
        Object object = c;
        synchronized (object) {
            return d.keySet();
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static void a(String string, abm_1 abm_12) {
        Object object = c;
        synchronized (object) {
            int n = 0;
            Object object2 = string;
            while (d.containsKey(object2)) {
                object2 = string + " #" + n++;
            }
            abm_12.b = object2;
            d.put((String)object2, abm_12);
        }
    }

    public abm_1(PoolableObjectFactory poolableObjectFactory) {
        super(poolableObjectFactory);
        try {
            Object object = this.borrowObject();
            this.b = object.getClass().getName();
            abm_1.a(this.b, this);
            this.returnObject(object);
        }
        catch (Exception exception) {
            a.error((Object)"Exception lev\u00e9e : ", (Throwable)exception);
        }
    }

    public String b() {
        return this.b;
    }

    public abm_1(PoolableObjectFactory poolableObjectFactory, int n) {
        super(poolableObjectFactory);
        int n2 = n;
        if (n2 < 1) {
            n2 = 1;
        }
        try {
            int n3;
            Object[] objectArray = new Object[n2];
            for (n3 = 0; n3 < n2; ++n3) {
                objectArray[n3] = this.borrowObject();
            }
            for (n3 = 0; n3 < n2; ++n3) {
                this.returnObject(objectArray[n3]);
                objectArray[n3] = null;
            }
            Object object = this.borrowObject();
            this.returnObject(object);
            this.b = object.getClass().getName();
            abm_1.a(this.b, this);
        }
        catch (Exception exception) {
            a.error((Object)"Exception lev\u00e9e : ", (Throwable)exception);
        }
    }

    public synchronized Object borrowObject() {
        Object object = super.borrowObject();
        acl_1.a(object);
        return object;
    }

    public synchronized void returnObject(Object object) {
        super.returnObject(object);
        acl_1.b(object);
    }
}

