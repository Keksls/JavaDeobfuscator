/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.commons.pool.ObjectPool
 *  org.apache.commons.pool.PoolableObjectFactory
 *  org.apache.commons.pool.impl.StackObjectPoolFactory
 *  org.apache.log4j.Logger
 */
import com.ankamagames.framework.kernel.core.common.MemoryObjectPool$2;
import org.apache.commons.pool.ObjectPool;
import org.apache.commons.pool.PoolableObjectFactory;
import org.apache.commons.pool.impl.StackObjectPoolFactory;
import org.apache.log4j.Logger;

/*
 * Renamed from aBj
 */
public class abj_1 {
    private static final boolean a = false;
    public static final Logger b = Logger.getLogger(abj_1.class);
    private ObjectPool<abh_1> c = new StackObjectPoolFactory((PoolableObjectFactory)new abk_1(this)).createPool();
    private final Class d;
    final abi_1 e;
    private final int f;

    public static abi_1 a(Class clazz) {
        return new MemoryObjectPool$2(clazz, clazz);
    }

    public abj_1(int n, Class clazz, abi_1 abi_12) {
        abj_1.a(abi_12, clazz);
        this.e = abi_12;
        this.d = clazz;
        this.f = abh_1.a(clazz);
        abl_1.b().a(this);
    }

    private static boolean a(abi_1<?> abi_12, Class clazz) {
        if (abi_12.e() != clazz) {
            throw new IllegalArgumentException("Invalid factory : should be a " + clazz);
        }
        return true;
    }

    public final abh_1 a() {
        try {
            abh_1 abh_12 = (abh_1)this.c.borrowObject();
            abh_12.ax();
            abh_12.n_();
            acl_1.a(abh_12);
            return abh_12;
        }
        catch (Exception exception) {
            throw new RuntimeException("Unable to extract an object from pool, classType : " + this.d.getName());
        }
    }

    public final void a(abh_1 abh_12) {
        try {
            this.c.returnObject((Object)abh_12);
            acl_1.b(abh_12);
        }
        catch (Exception exception) {
            b.error((Object)("Error releasing MemoryObject : " + abh_12));
        }
    }

    public final int b() {
        return this.f;
    }

    public final Class c() {
        return this.d;
    }

    public final int d() {
        return this.c.getNumActive();
    }

    public final int e() {
        return this.c.getNumActive() + this.c.getNumIdle();
    }
}

