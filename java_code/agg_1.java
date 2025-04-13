/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Maps
 *  gnu.trove.iterator.TIntObjectIterator
 *  gnu.trove.map.hash.TIntObjectHashMap
 *  org.apache.log4j.Logger
 */
import com.google.common.collect.Maps;
import gnu.trove.iterator.TIntObjectIterator;
import gnu.trove.map.hash.TIntObjectHashMap;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import javax.sql.DataSource;
import org.apache.log4j.Logger;

/*
 * Renamed from aGG
 */
public final class agg_1
extends Thread
implements afm_2,
agh_1 {
    private static final Logger c = Logger.getLogger(agg_1.class);
    private static final int d = 10;
    private static final long e = 5000L;
    private static final long f = 5000L;
    private final DataSource g;
    private Connection h;
    private final Queue<agf_1> i = new ConcurrentLinkedQueue<agf_1>();
    private final Lock j = new ReentrantLock();
    private final Condition k = this.j.newCondition();
    public volatile boolean a;
    private int l;
    private String m;
    public int b;
    private long n;
    private long o;
    private boolean p;
    private boolean q = true;
    private final TIntObjectHashMap<PreparedStatement> r;
    private HashMap<String, Class<?>> s = new HashMap();
    private static final AtomicBoolean t = new AtomicBoolean(true);

    public void a(HashMap<String, Class<?>> hashMap) {
        this.s = Maps.newHashMap(hashMap);
    }

    @Override
    public boolean a() {
        return this.p;
    }

    public void a(boolean bl) {
        this.p = bl;
    }

    public void b(boolean bl) {
        this.q = bl;
    }

    public static void c(boolean bl) {
        t.set(bl);
    }

    public agg_1(DataSource dataSource) {
        this.setName("SqlRequestChannel");
        this.g = dataSource;
        this.h = null;
        this.a = false;
        this.b = 0;
        this.r = new TIntObjectHashMap();
        this.p = false;
    }

    @Override
    public synchronized void start() {
        this.a = true;
        super.start();
    }

    public boolean b() {
        return this.a;
    }

    public void d(boolean bl) {
        this.a = bl;
        this.h();
    }

    private void h() {
        this.j.lock();
        this.k.signal();
        this.j.unlock();
    }

    public void a(agf_1 agf_12) {
        if (agf_12 != null) {
            agf_12.a();
            this.i.offer(agf_12);
            this.h();
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private agf_1 i() {
        agf_1 agf_12;
        long l = System.currentTimeMillis();
        if (this.i.isEmpty()) {
            try {
                if (this.h != null && l - this.o > 5000L) {
                    if (this.p) {
                        this.h.commit();
                    }
                    this.o = l;
                }
            }
            catch (SQLException sQLException) {
                c.error((Object)"Exception during autocommit", (Throwable)sQLException);
            }
            if (this.j.tryLock()) {
                try {
                    this.k.await(1000L, TimeUnit.MILLISECONDS);
                }
                catch (InterruptedException interruptedException) {
                    c.warn((Object)"Interrupted", (Throwable)interruptedException);
                }
                finally {
                    this.j.unlock();
                }
            }
        }
        if ((agf_12 = this.i.peek()) != null && agf_12.b()) {
            this.j();
            return this.i();
        }
        return agf_12;
    }

    private void j() {
        this.i.poll();
    }

    public int c() {
        return this.i.size();
    }

    @Override
    public Connection d() {
        return this.h;
    }

    @Override
    public final void a(int n, PreparedStatement preparedStatement) {
        this.r.put(n, (Object)preparedStatement);
    }

    @Override
    public final PreparedStatement b(int n) {
        return (PreparedStatement)this.r.get(n);
    }

    private void k() {
        TIntObjectIterator tIntObjectIterator = this.r.iterator();
        while (tIntObjectIterator.hasNext()) {
            tIntObjectIterator.advance();
            try {
                ((PreparedStatement)tIntObjectIterator.value()).close();
            }
            catch (SQLException sQLException) {
                c.error((Object)"Exception during releaseStatements", (Throwable)sQLException);
            }
        }
        this.r.clear();
    }

    public void e() {
        try {
            if (this.h == null || this.h.isClosed()) {
                if (this.h != null) {
                    if (this.p) {
                        this.h.commit();
                    }
                    this.h.close();
                    this.o = System.currentTimeMillis();
                }
                this.h = this.g.getConnection();
                this.h.setTypeMap(this.s);
                this.k();
                if (this.p) {
                    this.h.setAutoCommit(false);
                }
            }
        }
        catch (SQLException sQLException) {
            c.warn((Object)("[" + this.m + "] Connection error : "), (Throwable)sQLException);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public adt_1 b(agf_1 agf_12) {
        agi_1 agi_12 = agf_12.e();
        agc_1 agc_12 = new agc_1();
        agf_12.a(agc_12);
        agc_12.c();
        try {
            this.a(agf_12);
            agc_12.e();
        }
        finally {
            agc_12.d();
        }
        agf_12.a(agi_12);
        if (agc_12.h()) {
            throw agc_12.i();
        }
        return agc_12.f();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public void run() {
        if (t.get()) {
            c.info((Object)("SqlRequestChannel [" + this.m + "] started "));
        }
        int n = 0;
        try {
            while (this.a || !this.i.isEmpty()) {
                long l;
                block15: {
                    agf_1 agf_12 = this.i();
                    l = System.currentTimeMillis();
                    if (agf_12 == null) break block15;
                    this.n = l;
                    String string = agf_12.getClass().getSimpleName();
                    agi_1 agi_12 = agf_12.e();
                    try {
                        block18: {
                            block16: {
                                block17: {
                                    if (++n >= 10) break block16;
                                    this.e();
                                    if (!agf_12.d() && agf_12.c()) break block17;
                                    adt_1 adt_12 = agf_12.a(this);
                                    if (adt_12 != null) {
                                        adt_12.a(agf_12.e());
                                        add_2.b().a(adt_12);
                                        break block18;
                                    } else if (agi_12 != null) {
                                        agi_12.a(null);
                                    }
                                    break block18;
                                }
                                c.warn((Object)("[" + this.m + "] Le destinataire de la r\u00e9ponse \u00e0 cette requete n'est plus valide : requestType = " + agf_12.getClass().getSimpleName() + " - " + agf_12.d() + " - " + agf_12.c()));
                                break block18;
                            }
                            c.warn((Object)("[" + this.m + "] Request (" + agf_12.getClass().getSimpleName() + ") canceled (too much retries) : " + agf_12));
                            if (agi_12 != null) {
                                agi_12.a(agf_12, new Exception("Request canceled (too much retries)"));
                            }
                        }
                        this.j();
                        agf_12.f();
                        n = 0;
                        continue;
                    }
                    catch (SQLException sQLException) {
                        c.error((Object)("[" + this.m + "] SQLException lev\u00e9e lors de l'\u00e9x\u00e9cution d'une requ\u00eate de type : " + agf_12.getClass().getSimpleName()), (Throwable)sQLException);
                        ++this.b;
                        continue;
                    }
                    catch (Throwable throwable) {
                        c.error((Object)("[" + this.m + "] Throwable capt\u00e9 lors de l'\u00e9x\u00e9cution d'une requ\u00eate de type : " + agf_12.getClass().getSimpleName()), throwable);
                        ++this.b;
                        continue;
                    }
                }
                if (this.h == null || this.h.isClosed() || l - this.n < 5000L || !this.q || !this.i.isEmpty()) continue;
                if (this.p) {
                    this.h.commit();
                }
                this.h.close();
                this.h = null;
                this.k();
                this.o = l;
            }
            if (this.h != null) {
                if (this.p) {
                    this.h.commit();
                }
                this.h.close();
                this.h = null;
            }
        }
        catch (Throwable throwable) {
            c.error((Object)("[" + this.m + "] Throwable capt\u00e9 lors de la connexion \u00e0 la base"), throwable);
            ++this.b;
        }
        if (t.get()) {
            c.info((Object)"SqlRequestChannel stopped ");
        }
    }

    @Override
    public String f() {
        return this.m;
    }

    public void a(String string) {
        this.m = string;
    }

    @Override
    public int g() {
        return this.l;
    }

    @Override
    public void a(int n) {
        this.l = n;
    }
}

