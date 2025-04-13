/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Objects;
import java.util.stream.Collectors;
import org.apache.log4j.Logger;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from Uf
 */
public abstract class uf_0<C extends ts_0, R>
extends tr_0<C> {
    private static final Logger k = Logger.getLogger(uf_0.class);
    protected final HashMap<Long, C> a;
    protected final tv_0<C, R> b;
    protected tt_0<C> c;
    protected final boolean d;
    protected final boolean e;

    public uf_0(short s2, tv_0<C, R> tv_02, tt_0<C> tt_02, boolean bl, boolean bl2, boolean bl3) {
        super(bl2, s2);
        this.a = bl ? new LinkedHashMap() : new HashMap();
        this.a((C)s2);
        this.b = tv_02;
        this.c = tt_02;
        this.d = bl;
        this.e = bl3;
    }

    public tv_0<C, R> a() {
        return this.b;
    }

    private String f() {
        if (this.a == null) {
            return "NULL_CONTENT";
        }
        return this.a.values().stream().filter(Objects::nonNull).map(ts_02 -> {
            try {
                return String.valueOf(ts_02.aT_());
            }
            catch (Exception exception) {
                return "NULL_SPELL";
            }
        }).collect(Collectors.joining(","));
    }

    @Override
    public boolean a(C c2) {
        if (c2 == null) {
            return false;
        }
        if (c2.e() <= 0) {
            k.warn((Object)("Impossile d'ajouter un item avec un quantit\u00e9e de " + c2.e()));
            return false;
        }
        if (this.a == null) {
            k.error((Object)("Adding a " + c2.getClass().getSimpleName() + " in a " + this.getClass().getSimpleName() + " but content is null"));
            return false;
        }
        if (!this.h) {
            if (this.l()) {
                throw new uz_0("Cannot add item : maximum size of inventory is reached (" + this.k() + "), inventory content is " + this.f());
            }
            if (this.a.containsKey(c2.a())) {
                throw new Uy("Item with uniqueID " + c2.a() + " is already present in the inventory (content : " + this.f() + ")", (ts_0)c2, (ts_0)this.a.get(c2.a()));
            }
            if (this.c != null && this.c.a(this, c2) < 0) {
                return false;
            }
            this.a.put(c2.a(), c2);
            this.a(um_0.a(this.i, c2));
            return true;
        }
        int n = c2.e();
        for (ts_0 ts_02 : this.a.values()) {
            int n2;
            if (!c2.a(ts_02) || (n2 = ts_02.aR_() - ts_02.e()) <= 0) continue;
            short s2 = (short)(n < n2 ? n : n2);
            n = (short)(n - s2);
            ts_02.b(s2);
            this.a(um_0.b(this.i, ts_02, s2));
            if (n > 0) continue;
            break;
        }
        Object object = c2;
        while (n > 0) {
            int n3 = n < c2.aR_() ? n : c2.aR_();
            object.a((short)n3);
            n = (short)(n - n3);
            if (this.c != null && this.c.a(this, object) < 0) {
                return false;
            }
            this.a.put(object.a(), object);
            this.a(um_0.a(this.i, object));
            if (n <= 0) continue;
            object = object.aP_();
        }
        return true;
    }

    @Override
    public boolean a(long l, short s2) {
        C c2 = this.e(l);
        if (c2 == null) {
            return false;
        }
        if (c2.e() + s2 <= 0) {
            return this.c(c2);
        }
        c2.b(s2);
        this.a(um_0.b(this.i, c2, s2));
        return true;
    }

    @Override
    public short a(long l) {
        C c2 = this.e(l);
        if (c2 == null) {
            return 0;
        }
        return c2.e();
    }

    @Override
    public boolean b(C c2) {
        if (c2 == null) {
            return false;
        }
        if (this.c != null && this.c.b(this, c2) < 0) {
            return false;
        }
        if (this.a.remove(c2.a()) == null) {
            return false;
        }
        this.a(um_0.b(this.i, c2));
        return true;
    }

    @Override
    public boolean c(C c2) {
        if (c2 == null) {
            return false;
        }
        if (this.c != null && this.c.b(this, c2) < 0) {
            return false;
        }
        if (this.a.remove(c2.a()) == null) {
            return false;
        }
        this.a(um_0.b(this.i, c2));
        c2.release();
        return true;
    }

    @Override
    @Nullable
    public C c(long l) {
        ts_0 ts_02 = (ts_0)this.a.get(l);
        if (ts_02 == null) {
            return null;
        }
        if (this.c != null && this.c.b(this, ts_02) < 0) {
            return null;
        }
        this.a.remove(l);
        this.a(um_0.b(this.i, ts_02));
        return (C)ts_02;
    }

    @Override
    @NotNull
    public Iterator<C> iterator() {
        return this.a.values().iterator();
    }

    @Override
    public boolean e(C c2) {
        return c2 != null && this.a.containsKey(c2.a());
    }

    @Override
    public boolean d(long l) {
        return this.a.containsKey(l);
    }

    @Override
    public boolean b(int n) {
        for (ts_0 ts_02 : this.a.values()) {
            if (ts_02.aT_() != n) continue;
            return true;
        }
        return false;
    }

    @Override
    @Nullable
    public C e(long l) {
        return (C)((ts_0)this.a.get(l));
    }

    @Override
    @Nullable
    public C c(int n) {
        for (ts_0 ts_02 : this.a.values()) {
            if (ts_02.aT_() != n) continue;
            return (C)ts_02;
        }
        return null;
    }

    @Override
    public C a(int n, tw_0<C> tw_02) {
        for (ts_0 ts_02 : this.a.values()) {
            if (ts_02.aT_() != n || !tw_02.isValid(ts_02)) continue;
            return (C)ts_02;
        }
        return null;
    }

    @Override
    public ArrayList<C> d(int n) {
        ArrayList<ts_0> arrayList = new ArrayList<ts_0>();
        for (ts_0 ts_02 : this.a.values()) {
            if (ts_02.aT_() != n && n != -1) continue;
            arrayList.add(ts_02);
        }
        return arrayList;
    }

    @Override
    public ArrayList<C> b(int n, tw_0<C> tw_02) {
        ArrayList<ts_0> arrayList = new ArrayList<ts_0>();
        for (ts_0 ts_02 : this.a.values()) {
            if (ts_02.aT_() != n && n != -1 || !tw_02.isValid(ts_02)) continue;
            arrayList.add(ts_02);
        }
        return arrayList;
    }

    @Override
    public ArrayList<C> b(tw_0<C> tw_02) {
        ArrayList<ts_0> arrayList = new ArrayList<ts_0>();
        for (ts_0 ts_02 : this.a.values()) {
            if (ts_02 == null || !tw_02.isValid(ts_02)) continue;
            arrayList.add(ts_02);
        }
        return arrayList;
    }

    @Override
    public int b() {
        return this.a.size();
    }

    @Override
    public int c() {
        int n = this.b();
        this.a.clear();
        return n;
    }

    @Override
    public int aO_() {
        int n = this.b();
        for (ts_0 ts_02 : this.a.values()) {
            ts_02.release();
        }
        this.a.clear();
        return n;
    }

    @Override
    public tt_0<C> e() {
        return this.c;
    }

    @Override
    public void a(tt_0<C> tt_02) {
        this.c = tt_02;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("StackInventory = ");
        for (ts_0 ts_02 : this.a.values()) {
            stringBuilder.append(ts_02.a()).append(' ');
        }
        return stringBuilder.toString();
    }
}

