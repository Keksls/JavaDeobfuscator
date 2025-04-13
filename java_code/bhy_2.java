/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.iterator.TIntObjectIterator
 *  gnu.trove.map.hash.TIntObjectHashMap
 *  org.apache.commons.lang3.builder.ToStringBuilder
 *  org.apache.log4j.Logger
 */
import gnu.trove.iterator.TIntObjectIterator;
import gnu.trove.map.hash.TIntObjectHashMap;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.BufferUnderflowException;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.log4j.Logger;

/*
 * Renamed from bhY
 */
public class bhy_2 {
    public static final bhy_2 a = new bhy_2();
    private static final Logger b = Logger.getLogger(bhy_2.class);
    private static final int c = 1;
    private final TIntObjectHashMap<bhz_2> d = new TIntObjectHashMap();

    private bhy_2() {
    }

    private static String c() {
        return azr_0.a().l() + "/questConfig.dat";
    }

    public void a() {
        this.d.clear();
        String string = bhy_2.c();
        try {
            arf_1 arf_12 = arf_1.a(gg_0.b(string));
            int n = arf_12.c();
            int n2 = arf_12.c();
            for (int k = 0; k < n2; ++k) {
                bhz_2 bhz_22 = new bhz_2();
                int n3 = arf_12.c();
                bhz_22.a(arf_12, n);
                this.d.put(n3, (Object)bhz_22);
            }
        }
        catch (IOException iOException) {
            b.warn((Object)("probl\u00e8me \u00e0 l'ouverture des configs de qu\u00eates: " + iOException.getMessage()));
        }
        catch (BufferUnderflowException bufferUnderflowException) {
            b.warn((Object)("probl\u00e8me \u00e0 l'ouverture des configs de qu\u00eates: " + bufferUnderflowException.getMessage()));
        }
    }

    public void b() {
        String string = bhy_2.c();
        try {
            FileOutputStream fileOutputStream = gi_0.o(string);
            gk_0 gk_02 = new gk_0(fileOutputStream);
            gk_02.a(1);
            gk_02.a(this.d.size());
            TIntObjectIterator tIntObjectIterator = this.d.iterator();
            while (tIntObjectIterator.hasNext()) {
                tIntObjectIterator.advance();
                gk_02.a(tIntObjectIterator.key());
                ((bhz_2)tIntObjectIterator.value()).a(gk_02, 1);
            }
            gk_02.d();
            fileOutputStream.close();
        }
        catch (IOException iOException) {
            b.warn((Object)("probl\u00e8me \u00e0 la sauvegarde des configs de qu\u00eates :" + iOException.getMessage()));
        }
    }

    public void a(int n, boolean bl) {
        bhz_2 bhz_22 = (bhz_2)this.d.get(n);
        if (bhz_22 == null) {
            bhz_22 = new bhz_2();
            this.d.put(n, (Object)bhz_22);
        }
        bhz_22.a(bl);
        this.b();
    }

    public boolean a(int n) {
        bhz_2 bhz_22 = (bhz_2)this.d.get(n);
        return bhz_22 == null ? true : bhz_22.a();
    }

    public void b(int n) {
        this.d.remove(n);
        this.b();
    }

    public String toString() {
        return new ToStringBuilder((Object)this).append("m_configs", this.d).toString();
    }
}

