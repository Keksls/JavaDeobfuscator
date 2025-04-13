/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.map.hash.TLongObjectHashMap
 *  org.apache.log4j.Logger
 */
import gnu.trove.map.hash.TLongObjectHashMap;
import org.apache.log4j.Logger;

public abstract class TA<T extends TG, C extends TB<T>> {
    protected static final Logger b = Logger.getLogger(TA.class);
    protected C c;
    protected final TLongObjectHashMap<TD> d = new TLongObjectHashMap();

    public final void a(C c2) {
        this.c = c2;
    }

    public C a() {
        return this.c;
    }

    public final boolean a(long l) {
        return this.d.containsKey(l);
    }

    public final TD b(long l) {
        return (TD)this.d.get(l);
    }

    public final void a(TD tD) {
        this.d.put(tD.a(), (Object)tD);
    }

    public final void c(long l) {
        this.d.remove(l);
    }

    public T d(long l) {
        return this.a(l, false);
    }

    public T a(long l, boolean bl) {
        try {
            TD tD = (TD)this.d.get(l);
            if (tD == null) {
                b.error((Object)("Aucune d\u00e9finition trouv\u00e9e pour l'instance d'\u00e9lement interactif " + l));
                return null;
            }
            T t = this.a(l, tD.a, tD.b, bl);
            this.a(t, tD);
            return t;
        }
        catch (RuntimeException runtimeException) {
            b.error((Object)("Exception lors de InteractiveElementFactory.createInteractiveElement(" + l + ")"), (Throwable)runtimeException);
            return null;
        }
    }

    public T a(long l, short s2, byte[] byArray) {
        return this.a(l, s2, byArray, true);
    }

    private T a(long l, short s2, byte[] byArray, boolean bl) {
        abn_1 abn_12 = ((TB)this.c).b(s2);
        if (abn_12 == null) {
            b.error((Object)("Aucune factory d'enregistr\u00e9e pour un \u00e9l\u00e9ment interactif de type " + s2));
            return null;
        }
        TG tG = (TG)abn_12.b();
        if (bl) {
            tG.ah();
        }
        tG.b(l);
        tG.b(s2);
        tG.a_(byArray);
        return (T)tG;
    }

    protected abstract void a(T var1, TD var2);
}

