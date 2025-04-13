/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.map.hash.TIntObjectHashMap
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.NotNull
 */
import gnu.trove.map.hash.TIntObjectHashMap;
import org.apache.log4j.Logger;
import org.jetbrains.annotations.NotNull;

public final class ZI {
    private static final Logger b = Logger.getLogger(ZI.class);
    public static final ZI a = new ZI();
    private final TIntObjectHashMap<ZG> c = new TIntObjectHashMap();
    private final ZJ d = new ZJ();

    private ZI() {
    }

    public void a(@NotNull ZV zV, acb_0 acb_02) {
        this.d.a(zV, acb_02);
    }

    public void a(int n) {
        this.d.a(n);
    }

    public boolean a(int n, ZG zG) {
        if (zG == null) {
            return false;
        }
        this.c.put(n, (Object)zG);
        this.d.a(zG);
        return true;
    }

    public boolean b(int n) {
        ZG zG = (ZG)this.c.get(n);
        if (zG == null) {
            return false;
        }
        this.d.b(zG);
        return true;
    }

    public void a() {
        this.c.clear();
        this.d.a();
    }

    public void b() {
        this.a();
        this.d.b();
    }
}

