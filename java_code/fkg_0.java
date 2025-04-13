/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.util.ArrayList;
import org.apache.log4j.Logger;

/*
 * Renamed from fkG
 */
public abstract class fkg_0<T> {
    private static final Logger b = Logger.getLogger(fkg_0.class);
    private final ArrayList<fkN> c = new ArrayList();
    protected final T a;

    protected fkg_0(T t) {
        this.a = t;
    }

    protected final void a(fkt_0 fkt_02) {
        this.a(new fkT(fkt_02));
    }

    protected final void a(fkN fkN2) {
        for (fkN fkN3 : this.c) {
            if (!fkN3.a(fkN2)) continue;
            return;
        }
        this.c.add(fkN2);
    }

    public final ArrayList<fkN> a() {
        return this.c;
    }

    public final fkN a(fkO fkO2) {
        for (int k = 0; k < this.c.size(); ++k) {
            if (this.c.get(k).a() != fkO2) continue;
            return this.c.get(k);
        }
        return null;
    }

    public final boolean b() {
        return !this.c.isEmpty();
    }

    public final boolean b(fkO fkO2) {
        for (int k = 0; k < this.c.size(); ++k) {
            if (this.c.get(k).a() != fkO2) continue;
            return true;
        }
        return false;
    }

    protected void c() {
        this.c.clear();
    }
}

