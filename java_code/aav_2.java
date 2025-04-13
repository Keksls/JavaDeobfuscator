/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.NotNull
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.apache.log4j.Logger;
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from aAV
 */
public class aav_2
implements adv_1 {
    private static final Logger a = Logger.getLogger(aav_2.class);
    private final ArrayList<ahr_1> b = new ArrayList();
    private final List<ahr_1> c = new ArrayList<ahr_1>();
    private final List<ahr_1> d = new ArrayList<ahr_1>();
    private final List<ahr_1> e = new ArrayList<ahr_1>();
    private final List<ahr_1> f = new ArrayList<ahr_1>();
    private boolean g = false;
    private long h = 0L;

    @Override
    public long a_() {
        return this.h;
    }

    @Override
    public void a(long l) {
        this.h = l;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public boolean a(adt_1 adt_12) {
        boolean bl = true;
        this.d();
        ArrayList<ahr_1> arrayList = this.b;
        synchronized (arrayList) {
            this.g = true;
            int n = this.b.size();
            if (n > 0) {
                for (int k = 0; k < n; ++k) {
                    ahr_1 ahr_12 = this.b.get(k);
                    if (ahr_12 == null) continue;
                    try {
                        bl = ahr_12.a(adt_12);
                    }
                    catch (RuntimeException runtimeException) {
                        a.error((Object)("Exception lev\u00e9e lors du traitement d'un message (id : " + adt_12.a() + ") : " + adt_12), (Throwable)runtimeException);
                    }
                    if (bl) {
                        continue;
                    }
                    break;
                }
            } else {
                a.warn((Object)("L'entit\u00e9 destinataire du message n'a pas de frames, message : " + adt_12.getClass().getSimpleName()));
                bl = true;
            }
            this.g = false;
        }
        if (bl) {
            this.b(adt_12);
        }
        this.e();
        return false;
    }

    protected void b(@NotNull adt_1 adt_12) {
        a.warn((Object)String.format("[NETWORK] Unhandled Message (%s) , id %d, Handler=%s (id=%s)", adt_12.getClass().getSimpleName(), adt_12.a(), this.getClass().getSimpleName(), this.a_()));
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private void d() {
        ArrayList<ahr_1> arrayList = this.b;
        synchronized (arrayList) {
            ahr_1 ahr_12;
            int n;
            int n2;
            List<ahr_1> list = this.d;
            synchronized (list) {
                n2 = this.d.size();
                for (n = 0; n < n2; ++n) {
                    ahr_12 = this.d.get(n);
                    if (this.b.contains(ahr_12)) continue;
                    this.b.add(0, ahr_12);
                    ahr_12.a(this, false);
                }
                this.d.clear();
            }
            list = this.c;
            synchronized (list) {
                n2 = this.c.size();
                for (n = 0; n < n2; ++n) {
                    ahr_12 = this.c.get(n);
                    if (!this.b.remove(ahr_12)) continue;
                    ahr_12.b(this, false);
                }
                this.c.clear();
            }
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private void e() {
        ArrayList<ahr_1> arrayList = this.b;
        synchronized (arrayList) {
            ahr_1 ahr_12;
            int n;
            int n2;
            List<ahr_1> list = this.f;
            synchronized (list) {
                n2 = this.f.size();
                for (n = 0; n < n2; ++n) {
                    ahr_12 = this.f.get(n);
                    if (this.b.contains(ahr_12)) continue;
                    this.b.add(0, ahr_12);
                    ahr_12.a(this, false);
                }
                this.f.clear();
            }
            list = this.e;
            synchronized (list) {
                n2 = this.e.size();
                for (n = 0; n < n2; ++n) {
                    ahr_12 = this.e.get(n);
                    if (!this.b.remove(ahr_12)) continue;
                    ahr_12.b(this, false);
                }
                this.e.clear();
            }
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void a(ahr_1 ahr_12) {
        if (this.g) {
            boolean bl;
            List<ahr_1> list = this.e;
            synchronized (list) {
                bl = this.e.contains(ahr_12);
            }
            if (bl) {
                list = this.d;
                synchronized (list) {
                    if (!this.d.contains(ahr_12)) {
                        this.d.add(ahr_12);
                    }
                    ahr_12.a(this, true);
                }
                list = this.c;
                synchronized (list) {
                    this.c.remove(ahr_12);
                }
            }
            list = this.f;
            synchronized (list) {
                this.f.add(ahr_12);
                ahr_12.a(this, true);
            }
        }
        ArrayList<ahr_1> arrayList = this.b;
        synchronized (arrayList) {
            if (!this.b.contains(ahr_12)) {
                this.b.add(0, ahr_12);
                ahr_12.a(this, false);
            }
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void b(ahr_1 ahr_12) {
        if (this.g) {
            boolean bl;
            List<ahr_1> list = this.f;
            synchronized (list) {
                bl = this.f.contains(ahr_12);
            }
            if (bl) {
                list = this.c;
                synchronized (list) {
                    if (!this.c.contains(ahr_12)) {
                        this.c.add(ahr_12);
                    }
                }
                list = this.d;
                synchronized (list) {
                    if (this.d.remove(ahr_12)) {
                        ahr_12.b(this, false);
                    }
                }
            }
            list = this.e;
            synchronized (list) {
                if (!this.e.contains(ahr_12)) {
                    this.e.add(ahr_12);
                    ahr_12.b(this, true);
                }
            }
        }
        ArrayList<ahr_1> arrayList = this.b;
        synchronized (arrayList) {
            if (this.b.remove(ahr_12)) {
                ahr_12.b(this, false);
            }
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void a() {
        Object[] objectArray;
        Object[] objectArray2 = this.b;
        synchronized (objectArray2) {
            objectArray = this.b.toArray();
        }
        if (this.g) {
            objectArray2 = this.e;
            synchronized (objectArray2) {
                for (Object object : objectArray) {
                    ahr_1 ahr_12 = (ahr_1)object;
                    if (this.e.contains(ahr_12)) continue;
                    this.e.add(ahr_12);
                    ahr_12.b(this, true);
                }
            }
        }
        objectArray2 = this.b;
        synchronized (objectArray2) {
            this.b.clear();
        }
        for (Object object : objectArray) {
            ahr_1 ahr_13 = (ahr_1)object;
            ahr_13.b(this, false);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public boolean c(ahr_1 ahr_12) {
        List<ahr_1> list;
        boolean bl;
        if (this.g) {
            bl = this.b.contains(ahr_12);
        } else {
            list = this.b;
            synchronized (list) {
                bl = this.b.contains(ahr_12);
            }
        }
        if (!bl) {
            list = this.d;
            synchronized (list) {
                bl = this.d.contains(ahr_12);
            }
        }
        if (!bl) {
            list = this.f;
            synchronized (list) {
                bl = this.f.contains(ahr_12);
            }
        }
        return bl;
    }

    public void a(boolean bl) {
        this.g = bl;
    }

    public List<ahr_1> c() {
        return Collections.unmodifiableList(this.b);
    }
}

