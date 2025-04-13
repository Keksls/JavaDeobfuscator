/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.map.hash.TIntIntHashMap
 *  org.apache.log4j.Logger
 */
import gnu.trove.map.hash.TIntIntHashMap;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.apache.log4j.Logger;

/*
 * Renamed from aGn
 */
public abstract class agn_2 {
    private static final boolean o = false;
    protected static final Logger a = Logger.getLogger(agn_2.class);
    protected agz_2[] b;
    protected final TIntIntHashMap c = new TIntIntHashMap();
    protected abm_1[] d;
    protected abm_1[] e;
    protected final Object f = new Object();
    protected final Object g = new Object();
    protected final Object h = new Object();
    protected final HashMap<agw_2, agx_2> i = new HashMap();
    protected final ArrayList<agx_2> j = new ArrayList();
    protected int k;
    protected int l = 5;
    protected final List<aga_2> m = new ArrayList<aga_2>();
    private final List<aga_2> p = new ArrayList<aga_2>();
    private final List<aga_2> q = new ArrayList<aga_2>();
    protected final boolean n = true;

    public agn_2(agz_2[] agz_2Array, boolean bl) {
        if (agz_2Array == null) {
            return;
        }
        this.b = agz_2Array;
        this.d = new abm_1[this.b.length];
        this.e = new abm_1[this.b.length];
        for (int k = 0; k < agz_2Array.length; ++k) {
            this.d[k] = new abm_1(this.b[k].b());
            this.e[k] = new abm_1(this.b[k].c());
            this.c.put(this.b[k].a(), k);
        }
        this.k = 0;
        if (bl) {
            ado_1.a().a(() -> {
                try {
                    this.b();
                }
                catch (Exception exception) {
                    a.error((Object)"Exception during BaseResourceManager creation", (Throwable)exception);
                }
            }, 1000L, -1);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public agx_2 a(int n) {
        int n2 = this.c.get(n);
        agw_2 agw_22 = this.c(n2);
        agx_2 agx_22 = this.d(n2);
        if (agw_22 == null) {
            if (agx_22 != null) {
                this.a(n2, agx_22);
                agx_22 = null;
            }
        } else if (agx_22 == null) {
            this.a(n2, agw_22);
        } else {
            agx_22.a(true);
            agx_22.a(agw_22);
            agx_22.a(this.k);
            agx_22.b(n);
            Object object = this.g;
            synchronized (object) {
                this.i.put(agw_22, agx_22);
            }
        }
        return agx_22;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public boolean a(agw_2 agw_22) {
        Object object = this.g;
        synchronized (object) {
            return this.i.containsKey(agw_22);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public boolean b(agw_2 agw_22) {
        agx_2 agx_22 = this.i.get(agw_22);
        if (agx_22 != null && agx_22.a() == agw_22) {
            Object object = this.h;
            synchronized (object) {
                if (this.j.contains(agx_22)) {
                    this.j.remove(agx_22);
                }
            }
            object = agx_22.d();
            synchronized (object) {
                agx_22.a(this.k);
                if (agx_22.c()) {
                    try {
                        agw_22.a(agx_22);
                    }
                    catch (Exception exception) {
                        a.error((Object)"Exception during tagResourceInUse", (Throwable)exception);
                    }
                    agx_22.a(false);
                    this.b(agx_22);
                }
                return true;
            }
        }
        return false;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void a(agx_2 agx_22) {
        Object object = this.h;
        synchronized (object) {
            this.j.add(agx_22);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void a() {
        Object object = this.h;
        synchronized (object) {
            Object object2 = this.g;
            synchronized (object2) {
                this.j.clear();
                this.j.addAll(this.i.values());
            }
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private agw_2 c(int n) {
        if (this.c.containsValue(n)) {
            Object object = this.f;
            synchronized (object) {
                try {
                    return (agw_2)this.d[n].borrowObject();
                }
                catch (Exception exception) {
                    a.error((Object)"Exception during checkResourceOut", (Throwable)exception);
                }
            }
        }
        return null;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private void a(int n, agw_2 agw_22) {
        if (this.c.containsValue(n)) {
            Object object = this.f;
            synchronized (object) {
                try {
                    this.d[n].returnObject(agw_22);
                }
                catch (Exception exception) {
                    a.error((Object)"Exception during checkResourceIn", (Throwable)exception);
                }
            }
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private agx_2 d(int n) {
        if (this.c.containsValue(n)) {
            Object object = this.f;
            synchronized (object) {
                try {
                    return (agx_2)this.e[n].borrowObject();
                }
                catch (Exception exception) {
                    a.error((Object)"Exception during checkContextOut", (Throwable)exception);
                }
            }
        }
        return null;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private void a(int n, agx_2 agx_22) {
        if (this.c.containsValue(n)) {
            Object object = this.f;
            synchronized (object) {
                try {
                    this.e[n].returnObject(agx_22);
                }
                catch (Exception exception) {
                    a.error((Object)"Exception during checkContextIn", (Throwable)exception);
                }
            }
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void b() {
        Object object;
        ++this.k;
        if (!this.p.isEmpty()) {
            for (aga_2 object2 : this.p) {
                this.m.remove(object2);
            }
            this.p.clear();
        }
        if (!this.q.isEmpty()) {
            for (aga_2 aga_22 : this.q) {
                if (this.m.contains(aga_22)) continue;
                this.m.add(aga_22);
            }
            this.q.clear();
        }
        Object[] objectArray = null;
        Object object2 = this.h;
        synchronized (object2) {
            objectArray = this.j.toArray();
            this.j.clear();
        }
        if (objectArray != null) {
            for (Object object3 : objectArray) {
                Object object4 = (agx_2)object3;
                object = ((agx_2)object4).d();
                synchronized (object) {
                    ((agx_2)object4).a(-2 * this.l);
                    ((agx_2)object4).b(true);
                }
            }
        }
        Object object5 = this.g;
        synchronized (object5) {
            for (Object object4 : this.i.values().toArray()) {
                object = (agx_2)object4;
                Object object6 = ((agx_2)object).d();
                synchronized (object6) {
                    int n = this.k - ((agx_2)object).b();
                    if (n >= this.l && ((agx_2)object).f()) {
                        if (!((agx_2)object).c()) {
                            this.c((agx_2)object);
                            ((agx_2)object).a().b((agx_2)object);
                            ((agx_2)object).a(true);
                        }
                        if (((agx_2)object).g()) {
                            try {
                                int n2 = this.c.get(((agx_2)object).e());
                                Object object7 = this.f;
                                synchronized (object7) {
                                    Object object8 = this.g;
                                    synchronized (object8) {
                                        agw_2 agw_22 = ((agx_2)object).a();
                                        this.d[n2].returnObject(agw_22);
                                        this.e[n2].returnObject(object);
                                        this.i.remove(agw_22);
                                    }
                                }
                            }
                            catch (Exception exception) {
                                a.error((Object)"Exception during BaseResourceManager update", (Throwable)exception);
                            }
                        }
                    }
                }
            }
        }
    }

    public int c() {
        return this.l;
    }

    public void b(int n) {
        this.l = n;
    }

    public String d() {
        long l = 0L;
        for (agw_2 agz_2Array : this.i.keySet()) {
            l += agz_2Array.w_();
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.getClass().getName()).append(" stats\n");
        for (agz_2 agz_22 : this.b) {
            int n = agz_22.a();
            int n2 = this.c.get(n);
            stringBuilder.append("\tNb objects out  = ").append(this.d[n2].getNumActive()).append("\n");
            stringBuilder.append("\tNb objects in   = ").append(this.d[n2].getNumIdle()).append("\n");
            stringBuilder.append("\tNb contexts out = ").append(this.e[n2].getNumActive()).append("\n");
            stringBuilder.append("\tNb contexts in  = ").append(this.e[n2].getNumIdle()).append("\n");
            stringBuilder.append("\tMemory usage    = ").append((float)l / 1024000.0f).append(" MByte(s)");
        }
        return stringBuilder.toString();
    }

    public int e() {
        return this.k;
    }

    protected void b(agx_2 agx_22) {
        for (aga_2 aga_22 : this.m) {
            aga_22.b(agx_22);
        }
    }

    protected void c(agx_2 agx_22) {
        for (aga_2 aga_22 : this.m) {
            aga_22.a(agx_22);
        }
    }
}

