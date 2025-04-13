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
import java.io.File;
import java.io.IOException;
import org.apache.log4j.Logger;
import org.jetbrains.annotations.NotNull;

public class ags {
    private static final Logger b = Logger.getLogger(ags.class);
    private final TIntObjectHashMap<agt> c = new TIntObjectHashMap();
    private String d;
    private static final ags e = new ags();

    public static ags a() {
        return e;
    }

    private ags() {
    }

    public String b() {
        return this.d;
    }

    public void a(String string) {
        this.d = string;
    }

    public void c() {
        try {
            assert (this.d != null && !new File(this.d).isDirectory());
            arf_1 arf_12 = arf_1.a(gg_0.b(this.d));
            this.a(arf_12);
            arf_12.close();
        }
        catch (IOException iOException) {
            b.error((Object)"", (Throwable)iOException);
        }
    }

    private void a(@NotNull arf_1 arf_12) {
        int n = arf_12.c();
        for (int k = 0; k < n; ++k) {
            agt agt2 = new agt();
            agt2.a(arf_12);
            if (this.c.put(agt2.a(), (Object)agt2) == null) continue;
            b.error((Object)("SoundBank already loaded : " + agt2.a()));
        }
    }

    public void a(@NotNull gk_0 gk_02) {
        TIntObjectIterator tIntObjectIterator = this.c.iterator();
        gk_02.a(this.c.size());
        while (tIntObjectIterator.hasNext()) {
            tIntObjectIterator.advance();
            ((agt)tIntObjectIterator.value()).a(gk_02);
        }
    }

    public final agt a(agt agt2) {
        assert (!this.c.contains(agt2.a()));
        return (agt)this.c.put(agt2.a(), (Object)agt2);
    }

    public final agt a(int n) {
        return (agt)this.c.get(n);
    }

    public final void d() {
        this.c.clear();
    }
}

