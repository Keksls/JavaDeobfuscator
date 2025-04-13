/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.commons.pool.ObjectPool
 *  org.apache.log4j.Logger
 */
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.OutputStream;
import org.apache.commons.pool.ObjectPool;
import org.apache.log4j.Logger;

/*
 * Renamed from aso
 */
public abstract class aso_2
implements abo_1 {
    protected static final Logger a = Logger.getLogger(aso_2.class);
    public static final ObjectPool b = new abm_1(new asp_2());
    public static final ObjectPool c = new abm_1(new asr_2());
    protected final asl_1 d = new asl_1();
    protected final asj_1 e = new asj_1();
    private ObjectPool f;

    aso_2() {
    }

    public abstract DataOutputStream a(OutputStream var1);

    public abstract DataInputStream a(FileInputStream var1);

    public static synchronized aso_2 a(ObjectPool objectPool) {
        aso_2 aso_22 = null;
        try {
            aso_22 = (aso_2)objectPool.borrowObject();
            aso_22.b(objectPool);
        }
        catch (Exception exception) {
            a.error((Object)"Exception during checkOut", (Throwable)exception);
        }
        return aso_22;
    }

    public void b(ObjectPool objectPool) {
        this.f = objectPool;
    }

    public void a() {
        try {
            this.f.returnObject((Object)this);
            this.f = null;
        }
        catch (Exception exception) {
            a.error((Object)"Exception during release IOStreamWrapper", (Throwable)exception);
        }
    }
}

