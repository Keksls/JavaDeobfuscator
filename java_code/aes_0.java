/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.iterator.TIntObjectIterator
 *  gnu.trove.map.hash.TIntObjectHashMap
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.NotNull
 */
import gnu.trove.iterator.TIntObjectIterator;
import gnu.trove.map.hash.TIntObjectHashMap;
import java.io.IOException;
import org.apache.log4j.Logger;
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from aeS
 */
public class aes_0 {
    private static final Logger b = Logger.getLogger(aes_0.class);
    private final TIntObjectHashMap<aeo_0> c = new TIntObjectHashMap();
    private long d;
    private String e;
    private static final aes_0 f = new aes_0();

    public static aes_0 a() {
        return f;
    }

    private aes_0() {
    }

    public String b() {
        return this.e;
    }

    public void a(String string) {
        this.e = string;
    }

    public void a(long l) {
        this.d = l;
    }

    public void c() {
        this.d();
        if (this.e == null) {
            return;
        }
        String string = String.format(this.e, this.d);
        try {
            arf_1 arf_12 = arf_1.a(gg_0.b(string));
            this.a(arf_12);
            arf_12.close();
        }
        catch (IOException iOException) {
            b.error((Object)("Error while loading AmbianceZone file : " + this.e + " (world " + this.d + ") : " + string), (Throwable)iOException);
        }
    }

    public void a(@NotNull arf_1 arf_12) {
        int n = arf_12.c();
        this.c.ensureCapacity(n);
        for (int k = 0; k < n; ++k) {
            aeo_0 aeo_02 = new aeo_0();
            aeo_02.a(arf_12);
            assert (!this.c.contains(aeo_02.a));
            this.c.put(aeo_02.a, (Object)aeo_02);
        }
    }

    public void a(@NotNull gk_0 gk_02) {
        TIntObjectIterator tIntObjectIterator = this.c.iterator();
        gk_02.a(this.c.size());
        while (tIntObjectIterator.hasNext()) {
            tIntObjectIterator.advance();
            ((aeo_0)tIntObjectIterator.value()).a(gk_02);
        }
    }

    public final void a(aeo_0 aeo_02) {
        assert (!this.c.contains(aeo_02.a));
        this.c.put(aeo_02.a, (Object)aeo_02);
    }

    public aeo_0 a(int n) {
        return (aeo_0)this.c.get(n);
    }

    public void d() {
        this.c.clear();
    }
}

