/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.Nullable
 */
import java.util.ArrayList;
import java.util.Iterator;
import org.apache.log4j.Logger;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from bjF
 */
public abstract class bjf_0<T extends bjg_0>
implements Iterable<T> {
    private static final Logger a = Logger.getLogger(bjf_0.class);
    protected final ArrayList<T> b = new ArrayList();

    public final boolean b() {
        return this.b.isEmpty();
    }

    public void b(biI biI2, T t) {
        this.a(biI2, t);
        this.b.add(t);
        ((bjg_0)t).a(biI2);
    }

    public final T c() {
        if (this.b()) {
            return null;
        }
        return (T)((bjg_0)this.b.get(this.b.size() - 1));
    }

    public final T a(T t) {
        return this.a(t, true);
    }

    public boolean b(T t) {
        return this.b.contains(t);
    }

    @Override
    public final Iterator<T> iterator() {
        return this.b.iterator();
    }

    public final T a(T t, boolean bl) {
        if (this.b()) {
            a.error((Object)"changement d'apparance mais liste vide");
            return null;
        }
        T t2 = this.c();
        assert (t2 != null);
        bjg_0 bjg_02 = null;
        int n = 0;
        Iterator<T> iterator = this.b.iterator();
        while (iterator.hasNext()) {
            bjg_0 bjg_03 = (bjg_0)iterator.next();
            if (!bjg_03.equals(t)) continue;
            ++n;
            iterator.remove();
            bjg_02 = bjg_03;
            if (bl) continue;
            break;
        }
        if (n == 0) {
            a.info((Object)"Appearance change remove requested, but no entry found for the linked Object");
        }
        return (T)bjg_02;
    }

    public void c(biI biI2, T t) {
        this.a(biI2, t, true);
    }

    public void a(biI biI2, T t, boolean bl) {
        T t2 = this.c();
        T t3 = this.a(t, bl);
        this.a(t2, t3, biI2);
    }

    public void a(biI biI2) {
        this.b.clear();
    }

    public int d() {
        return this.b.size();
    }

    public T e() {
        return (T)this.a((bjg_0)this.b.get(0));
    }

    protected abstract void a(biI var1, T var2);

    public abstract void a(T var1, T var2, biI var3);

    public void a(biI biI2, bjf_0<T> bjf_02) {
        this.a(biI2, bjf_02, (bje_0<T>)null);
    }

    public void a(biI biI2, bjf_0<T> bjf_02, @Nullable bje_0<T> bje_02) {
        try {
            if (biI2 == null) {
                return;
            }
            for (bjg_0 bjg_02 : this) {
                if (bje_02 != null && !bje_02.a(bjg_02)) continue;
                bjf_02.b(biI2, bjg_02.c());
            }
        }
        catch (Exception exception) {
            a.error((Object)("Error while recopying HMIActions of type " + this + " : "), (Throwable)exception);
        }
    }
}

