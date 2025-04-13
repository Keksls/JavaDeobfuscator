/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.iterator.TIntObjectIterator
 *  gnu.trove.map.hash.TIntObjectHashMap
 *  org.apache.log4j.Logger
 */
import gnu.trove.iterator.TIntObjectIterator;
import gnu.trove.map.hash.TIntObjectHashMap;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.URL;
import java.util.Collection;
import java.util.stream.Collectors;
import org.apache.log4j.Logger;

/*
 * Renamed from bUp
 */
public class bup_0 {
    private static final Logger a = Logger.getLogger(bup_0.class);
    private static final bup_0 b = new bup_0();
    private final TIntObjectHashMap<buo_0> c = new TIntObjectHashMap();
    private static final int d = 1;
    private int e = 0;

    private bup_0() {
    }

    public static bup_0 a() {
        return b;
    }

    private void a(buo_0 buo_02, TIntObjectHashMap<buo_0> tIntObjectHashMap) {
        buo_02.a(this.e++);
        tIntObjectHashMap.put(buo_02.a(), (Object)buo_02);
    }

    private static void a(long l, TIntObjectHashMap<buo_0> tIntObjectHashMap) {
        String string = bup_0.b(l);
        try {
            FileOutputStream fileOutputStream = gi_0.o(string);
            gk_0 gk_02 = new gk_0(fileOutputStream);
            Collection collection = tIntObjectHashMap.valueCollection().stream().filter(buo_02 -> !buo_02.g()).collect(Collectors.toList());
            gk_02.a(-1);
            gk_02.a(1);
            gk_02.a(collection.size());
            for (buo_0 buo_03 : collection) {
                buo_03.a(gk_02, 1);
            }
            gk_02.d();
            fileOutputStream.close();
        }
        catch (IOException iOException) {
            a.warn((Object)("probl\u00e8me \u00e0 la sauvegarde des notes de carte :" + iOException.getMessage()));
        }
    }

    public boolean a(buo_0 buo_02) {
        boolean bl;
        boolean bl2 = bl = this.c.remove(buo_02.a()) != null;
        if (bl) {
            this.c();
        }
        return bl;
    }

    public boolean a(int n) {
        boolean bl;
        boolean bl2 = bl = this.c.remove(n) != null;
        if (bl) {
            this.c();
        }
        return bl;
    }

    private static String b(long l) {
        return azr_0.a().b(l) + "/notes.dat";
    }

    public void b() {
        this.b(this.e(), this.c);
    }

    public void c() {
        bup_0.a(this.e(), this.c);
    }

    public TIntObjectHashMap<buo_0> a(long l) {
        long l2 = this.c(l);
        if (l2 == this.e()) {
            return this.c;
        }
        TIntObjectHashMap tIntObjectHashMap = new TIntObjectHashMap();
        this.b(l2, (TIntObjectHashMap<buo_0>)tIntObjectHashMap);
        return tIntObjectHashMap;
    }

    public buo_0 a(int n, int n2, int n3, String string, int n4, boolean bl) {
        buo_0 buo_02 = new buo_0(this.e++, n, n2, n3, string, n4, bl);
        this.a(buo_02, this.c);
        this.c();
        return buo_02;
    }

    private void b(long l, TIntObjectHashMap<buo_0> tIntObjectHashMap) {
        tIntObjectHashMap.clear();
        if (l == 0L) {
            return;
        }
        String string = bup_0.b(l);
        try {
            URL uRL = gi_0.a(string);
            if (!cd_0.a(uRL)) {
                return;
            }
            arf_1 arf_12 = arf_1.a(gg_0.b(string));
            int n = -1;
            if (arf_12.c() == -1) {
                n = arf_12.c();
            } else {
                arf_12.f(0);
            }
            int n2 = arf_12.c();
            for (int k = 0; k < n2; ++k) {
                buo_0 buo_02 = new buo_0();
                buo_02.a(arf_12, n);
                this.a(buo_02, tIntObjectHashMap);
            }
        }
        catch (IOException iOException) {
            a.warn((Object)("probl\u00e8me \u00e0 l'ouverture des notes de carte : " + iOException.getMessage()));
        }
    }

    public TIntObjectIterator<buo_0> d() {
        return this.c.iterator();
    }

    public String toString() {
        return "LandMarkNoteManager{}";
    }

    private long e() {
        long l = YX.a();
        if (ble_1.E().s()) {
            return l;
        }
        return this.c(l);
    }

    private long c(long l) {
        cct_1 cct_12 = ccs_1.a().a(l);
        return cct_12 == null ? l : cct_12.c;
    }
}

