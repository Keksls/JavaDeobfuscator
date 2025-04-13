/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.commons.pool.ObjectPool
 *  org.apache.log4j.Logger
 */
import java.sql.Timestamp;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;
import org.apache.commons.pool.ObjectPool;
import org.apache.log4j.Logger;

/*
 * Renamed from aGF
 */
public abstract class agf_1
implements abo_1 {
    protected static final Logger a = Logger.getLogger(agf_1.class);
    protected ObjectPool b = null;
    protected agj_1 c = null;
    private HashMap<String, Object> d;
    private long e;

    protected agf_1() {
    }

    void a() {
        this.e = System.currentTimeMillis();
    }

    boolean b() {
        if (ot_2.a.b("dispatch")) {
            return System.currentTimeMillis() - this.e > TimeUnit.MINUTES.toMillis(2L);
        }
        return false;
    }

    @Override
    public void onCheckOut() {
        this.d = null;
        this.c = null;
    }

    @Override
    public void onCheckIn() {
        this.d = null;
        this.c = null;
    }

    public void a(ObjectPool objectPool) {
        this.b = objectPool;
    }

    public void a(agi_1 agi_12) {
        this.c = new agj_1();
        this.c.a(agi_12);
    }

    public boolean c() {
        return this.c != null;
    }

    public boolean d() {
        return this.c != null && this.c.b();
    }

    public agi_1 e() {
        if (this.c == null) {
            return null;
        }
        return (agi_1)this.c.c();
    }

    public void f() {
        if (this.b != null) {
            try {
                this.c = null;
                this.d = null;
                this.b.returnObject((Object)this);
            }
            catch (Exception exception) {
                a.error((Object)("Exception lev\u00e9e lors du release d'une SqlRequest (" + this.getClass().getSimpleName() + "): "), (Throwable)exception);
            }
        }
    }

    public abstract adt_1 a(agh_1 var1);

    public abstract int g();

    public void a(String string, Object object) {
        if (this.d == null) {
            this.d = new HashMap();
        }
        this.d.put(string, object);
    }

    public int a(String string) {
        if (this.d != null && this.d.containsKey(string)) {
            return (Integer)this.d.get(string);
        }
        throw new agd_1(string);
    }

    public long b(String string) {
        if (this.d != null && this.d.containsKey(string)) {
            return (Long)this.d.get(string);
        }
        throw new agd_1(string);
    }

    public float c(String string) {
        if (this.d != null && this.d.containsKey(string)) {
            return ((Float)this.d.get(string)).floatValue();
        }
        throw new agd_1(string);
    }

    public double d(String string) {
        if (this.d != null && this.d.containsKey(string)) {
            return (Double)this.d.get(string);
        }
        throw new agd_1(string);
    }

    public String e(String string) {
        if (this.d != null && this.d.containsKey(string)) {
            return (String)this.d.get(string);
        }
        throw new agd_1(string);
    }

    public Timestamp f(String string) {
        if (this.d != null && this.d.containsKey(string)) {
            return (Timestamp)this.d.get(string);
        }
        throw new agd_1(string);
    }

    public String toString() {
        return "SqlRequest{" + this.getClass().getSimpleName() + "}";
    }
}

