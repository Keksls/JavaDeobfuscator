/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.list.TLinkable
 *  org.apache.commons.pool.ObjectPool
 *  org.apache.log4j.Logger
 */
import gnu.trove.list.TLinkable;
import java.util.List;
import org.apache.commons.pool.ObjectPool;
import org.apache.log4j.Logger;

/*
 * Renamed from aCZ
 */
public final class acz_1
implements abo_1,
TLinkable {
    protected static final Logger a = Logger.getLogger(acz_1.class);
    static final ObjectPool b = new abm_1(new ada_1());
    private long c;
    private acx_1 d;
    private adg_2 e;
    private List f;
    private Iterable<? extends acy_1> g;
    private Object[] h;
    private boolean i;
    private TLinkable j;
    private TLinkable k;
    private ObjectPool l;
    private static long m;
    private long n = m++;

    public String toString() {
        return this.n + " " + (this.d == null ? " Event=null" : this.d.a(this.h));
    }

    acz_1() {
    }

    public static acz_1 a() {
        try {
            acz_1 acz_12 = (acz_1)b.borrowObject();
            acz_12.l = b;
            return acz_12;
        }
        catch (Exception exception) {
            a.error((Object)"Erreur lors du checkout d'un EventSchedule:", (Throwable)exception);
            return new acz_1();
        }
    }

    public void b() {
        try {
            if (this.l != null) {
                this.l.returnObject((Object)this);
                this.l = null;
            }
        }
        catch (Exception exception) {
            a.error((Object)"Exception during EventSchedule release", (Throwable)exception);
        }
    }

    public TLinkable getNext() {
        return this.k;
    }

    public TLinkable getPrevious() {
        return this.j;
    }

    public void setNext(TLinkable tLinkable) {
        this.k = tLinkable;
    }

    public void setPrevious(TLinkable tLinkable) {
        this.j = tLinkable;
    }

    @Override
    public void onCheckOut() {
        this.l();
        this.n = m++;
    }

    @Override
    public void onCheckIn() {
        this.l();
    }

    private void l() {
        this.a((acx_1)null);
        this.a((Iterable<? extends acy_1>)null);
        this.a((Object[])null);
        this.a((adg_2)null);
        this.a((List)null);
        this.setPrevious(null);
        this.setNext(null);
        this.a(false);
    }

    public ObjectPool c() {
        return b;
    }

    public void a(ObjectPool objectPool) {
    }

    public long d() {
        return this.c;
    }

    void a(long l) {
        this.c = l;
    }

    public acx_1 e() {
        return this.d;
    }

    void a(acx_1 acx_12) {
        this.d = acx_12;
    }

    public adg_2 f() {
        return this.e;
    }

    void a(adg_2 adg_22) {
        this.e = adg_22;
    }

    public List g() {
        return this.f;
    }

    void a(List list) {
        this.f = list;
    }

    public Iterable<? extends acy_1> h() {
        return this.g;
    }

    void a(Iterable<? extends acy_1> iterable) {
        this.g = iterable;
    }

    public Object[] i() {
        return this.h;
    }

    void a(Object[] objectArray) {
        this.h = objectArray;
    }

    public boolean j() {
        return this.i;
    }

    public void a(boolean bl) {
        this.i = bl;
    }

    @Deprecated
    public long k() {
        return this.n;
    }

    @Deprecated
    public void b(long l) {
        this.n = l;
    }
}

