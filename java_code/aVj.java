/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.map.hash.TIntObjectHashMap
 */
import gnu.trove.map.hash.TIntObjectHashMap;

public abstract class aVj {
    private final TIntObjectHashMap<aVi> a = new TIntObjectHashMap();

    protected aVj() {
    }

    public void a(int n, aVi aVi2) {
        this.a.put(n, (Object)aVi2);
    }

    public void a(int n, aVg aVg2) {
        aVi aVi2 = (aVi)this.a.get(n);
        if (aVi2 != null) {
            aVi2.a(aVg2);
        }
    }

    public void a(int n, Iterable<aVg> iterable) {
        aVi aVi2 = (aVi)this.a.get(n);
        if (aVi2 != null) {
            aVi2.a(iterable);
        }
    }

    public boolean b(int n, aVg aVg2) {
        if (aVg2 != null) {
            return this.a(n, aVg2.g());
        }
        return false;
    }

    public boolean a(int n, String string) {
        aVi aVi2 = (aVi)this.a.get(n);
        return aVi2 != null && aVi2.a(string);
    }

    public aVi a(int n) {
        return (aVi)this.a.get(n);
    }
}

