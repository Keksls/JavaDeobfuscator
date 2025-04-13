/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.commons.pool.PoolableObjectFactory
 */
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import org.apache.commons.pool.PoolableObjectFactory;

/*
 * Renamed from aAZ
 */
public class aaz_2
extends abm_1 {
    private final Queue<Object> e = new ConcurrentLinkedQueue<Object>();

    public aaz_2(PoolableObjectFactory poolableObjectFactory) {
        super(poolableObjectFactory);
    }

    private void c() {
        if (this.e != null) {
            Object object;
            while ((object = this.e.poll()) != null) {
                try {
                    super.returnObject(object);
                }
                catch (Exception exception) {
                    a.error((Object)"Exception during performPendingCheckins", (Throwable)exception);
                }
            }
        }
    }

    @Override
    public synchronized Object borrowObject() {
        this.c();
        return super.borrowObject();
    }

    @Override
    public void returnObject(Object object) {
        if (this.e != null) {
            this.e.offer(object);
        }
    }
}

