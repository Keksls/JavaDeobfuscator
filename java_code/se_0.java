/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.util.ConcurrentModificationException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import java.util.function.Function;
import org.apache.log4j.Logger;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from SE
 */
public abstract class se_0
implements WS<sd_0>,
Iterable<sd_0> {
    protected static final Logger a = Logger.getLogger(se_0.class);
    private static final Consumer<sd_0<?, ?>> t = sd_0::q;
    protected final Map<Long, sd_0> b = new LinkedHashMap<Long, sd_0>();
    public static final byte c = 1;
    public static final byte d = 10;
    public static final byte e = 11;
    public static final byte f = 2;
    public static final byte g = 20;
    public static final byte h = 21;
    public static final byte i = 3;
    public static final byte j = 30;
    public static final byte k = 31;
    public static final byte l = 4;
    public static final byte m = 40;
    public static final byte n = 41;
    public static final byte o = 5;
    public static final byte p = 6;
    public static final byte q = 60;
    public static final byte r = 61;
    private boolean u = false;

    public void a() {
        HashSet<Long> hashSet = new HashSet<Long>(this.b.keySet());
        Iterator iterator = hashSet.iterator();
        while (iterator.hasNext()) {
            long l = (Long)iterator.next();
            sd_0 sd_02 = this.b.get(l);
            if (sd_02 == null) continue;
            try {
                sd_02.b(false);
            }
            catch (Exception exception) {
                a.error((Object)("Failed to unapply effect with id " + l + " for user " + this.f()), (Throwable)exception);
            }
        }
        this.b.clear();
    }

    public void c() {
        this.a(t);
        this.b.clear();
    }

    public void d() {
        if (this.g() != null) {
            this.g().a(false);
        }
    }

    public void e() {
        if (this.g() != null) {
            this.g().a(true);
        }
    }

    public Su f() {
        return null;
    }

    public sd_0 g_(long l) {
        return this.b.get(l);
    }

    public void a(sd_0 sd_02) {
        if (!this.b.containsKey(sd_02.c())) {
            this.b.put(sd_02.c(), sd_02);
            sd_02.a(this);
        } else assert (sd_02 == this.b.get(sd_02.c()));
    }

    public boolean b(sd_0 sd_02) {
        return this.b(sd_02.c());
    }

    public void a(sd_0 ... sd_0Array) {
        if (sd_0Array != null && sd_0Array.length > 0) {
            for (sd_0 sd_02 : sd_0Array) {
                this.b(sd_02);
            }
        }
    }

    public void c(sd_0 sd_02) {
        sd_02.ak();
    }

    public boolean b(long l) {
        sd_0 sd_02 = this.b.remove(l);
        if (sd_02 != null) {
            this.c(sd_02);
            return true;
        }
        return false;
    }

    protected void a(@NotNull Consumer<sd_0<?, ?>> consumer) {
        if (this.b.isEmpty()) {
            return;
        }
        for (sd_0 sd_02 : this.b.values()) {
            consumer.accept(sd_02);
        }
    }

    @Nullable
    protected <T> T a(@NotNull Function<sd_0<?, ?>, T> function) {
        if (this.b.isEmpty()) {
            return null;
        }
        for (sd_0 sd_02 : this.b.values()) {
            @Nullable T t = function.apply(sd_02);
            if (t == null) continue;
            return t;
        }
        return null;
    }

    public List<sd_0> a(int n) {
        ArrayList<sd_0> arrayList = new ArrayList<sd_0>();
        this.a((sd_0<?, ?> sd_02) -> {
            if (sd_02.k() != null && sd_02.k().G_() == n) {
                arrayList.add((sd_0)sd_02);
            }
        });
        return arrayList;
    }

    public List<sd_0> b(int n) {
        if (this.b.isEmpty()) {
            return Collections.emptyList();
        }
        ArrayList<sd_0> arrayList = new ArrayList<sd_0>();
        this.a((sd_0<?, ?> sd_02) -> {
            Object FX = sd_02.f();
            if (FX != null && FX.j() == n) {
                arrayList.add((sd_0)sd_02);
            }
        });
        return arrayList;
    }

    public List<sd_0> c(int n) {
        if (this.b.isEmpty()) {
            return Collections.emptyList();
        }
        ArrayList<sd_0> arrayList = new ArrayList<sd_0>();
        this.a((sd_0<?, ?> sd_02) -> {
            if (sd_02.bt_() == n) {
                arrayList.add((sd_0)sd_02);
            }
        });
        return arrayList;
    }

    public List<sd_0> d(int n) {
        ArrayList<sd_0> arrayList = new ArrayList<sd_0>();
        this.a((sd_0<?, ?> sd_02) -> {
            Object FX = sd_02.f();
            if (FX != null && FX.i() == n) {
                arrayList.add((sd_0)sd_02);
            }
        });
        return arrayList;
    }

    protected so_0 a(Su su) {
        return so_0.a(this, this.iterator(), su, false);
    }

    public so_0 b(Su su) {
        return so_0.a(this, this.iterator(), su, true);
    }

    protected sn_0 a(Sm sm) {
        return new sn_0(this, this.iterator(), sm);
    }

    public void d(sd_0 sd_02) {
        try {
            Iterator<sd_0> iterator = this.iterator();
            while (iterator.hasNext()) {
                sd_0 sd_03 = iterator.next();
                if (sd_03.v() != sd_02) continue;
                iterator.remove();
                sd_03.ak();
            }
        }
        catch (ConcurrentModificationException concurrentModificationException) {
            this.d(sd_02);
        }
    }

    public void c(Su su) {
        try {
            Iterator<sd_0> iterator = this.iterator();
            while (iterator.hasNext()) {
                sd_0 sd_02 = iterator.next();
                if (sd_02.h() != su && sd_02.i() != su) continue;
                iterator.remove();
                sd_02.ak();
            }
        }
        catch (ConcurrentModificationException concurrentModificationException) {
            this.c(su);
        }
    }

    public void a(Sm sm, boolean bl) {
        try {
            Iterator<sd_0> iterator = this.iterator();
            while (iterator.hasNext()) {
                sd_0 sd_02 = iterator.next();
                if (sd_02.k() != sm) continue;
                iterator.remove();
                if (!bl) continue;
                sd_02.ak();
            }
        }
        catch (ConcurrentModificationException concurrentModificationException) {
            this.a(sm, bl);
        }
    }

    public void a(Sm sm, boolean bl, boolean bl2) {
        throw new UnsupportedOperationException("Ne devrait pas \u00eatre appel\u00e9 si n'est pas impl\u00e9ment\u00e9");
    }

    public void a(int n, boolean bl) {
        try {
            Iterator<sd_0> iterator = this.iterator();
            while (iterator.hasNext()) {
                sd_0 sd_02 = iterator.next();
                if (sd_02.k() == null || sd_02.k().G_() != n) continue;
                iterator.remove();
                if (!bl) continue;
                sd_02.ak();
            }
        }
        catch (ConcurrentModificationException concurrentModificationException) {
            this.a(n, bl);
        }
    }

    public void a(Sl sl) {
        try {
            Iterator<sd_0> iterator = this.iterator();
            while (iterator.hasNext()) {
                sd_0 sd_02 = iterator.next();
                if (sd_02.f() != sl) continue;
                iterator.remove();
                sd_02.ak();
            }
        }
        catch (ConcurrentModificationException concurrentModificationException) {
            this.a(sl);
        }
    }

    @Override
    @NotNull
    public Iterator<sd_0> iterator() {
        return this.b.values().iterator();
    }

    public abstract sj_0 g();

    @Override
    public boolean a(BitSet bitSet, sd_0 sd_02, byte by) {
        if (this.g() == null) {
            return false;
        }
        return this.g().a(bitSet, sd_02, by);
    }

    public boolean h() {
        return this.b.isEmpty();
    }

    public int i() {
        return this.b.size();
    }

    public boolean e(int n) {
        for (sd_0 sd_02 : this) {
            if (sd_02.f() == null || sd_02.f().i() != n) continue;
            return true;
        }
        return false;
    }

    public void a(boolean bl) {
        this.u = bl;
    }

    public boolean j() {
        return this.u;
    }

    public String toString() {
        return this.b.toString();
    }
}

