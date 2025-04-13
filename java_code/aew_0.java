/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.cache.CacheBuilder
 *  com.google.common.cache.CacheLoader
 *  com.google.common.cache.LoadingCache
 *  gnu.trove.map.hash.TLongObjectHashMap
 *  gnu.trove.procedure.TObjectProcedure
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
import com.ankamagames.baseImpl.graphics.isometric.particles.CellParticleSystem;
import com.google.common.cache.CacheBuilder;
import com.google.common.cache.CacheLoader;
import com.google.common.cache.LoadingCache;
import gnu.trove.map.hash.TLongObjectHashMap;
import gnu.trove.procedure.TObjectProcedure;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import org.apache.log4j.Logger;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from aeW
 */
public class aew_0 {
    private static final boolean f = false;
    static final Logger g = Logger.getLogger(aew_0.class);
    private long h = Integer.MIN_VALUE;
    private ams_1 i;
    private aik_0 j;
    protected aev_0 a;
    protected String b;
    protected afb c;
    private final xw_0 k = new xw_0("EnvMap loader");
    protected final TLongObjectHashMap<aet_0> d = new TLongObjectHashMap();
    private static final LoadingCache<String, byte[]> l = CacheBuilder.newBuilder().expireAfterAccess(30L, TimeUnit.SECONDS).build((CacheLoader)new aex_0());
    private static final aew_0 m = new aew_0();

    private aew_0() {
    }

    public static aew_0 a() {
        return m;
    }

    public final void a(String string) {
        this.b = string;
    }

    public final void a(afb afb2) {
        this.c = afb2;
    }

    protected static long a(long l, long l2, long l3) {
        assert (l > -32768L && l < 32767L) : "faut pas d\u00e9conner non plus un short \u00e7a suffit pour la taille du monde";
        assert (l2 > -32768L && l2 < 32767L) : "faut pas d\u00e9conner non plus un short \u00e7a suffit pour la taille du monde";
        return (l += 32767L) << 48 | (l2 += 32767L) << 32 | (l3 & 0xFFFFL) << 16;
    }

    private static String a(String string, long l, short s2, short s3) {
        assert (string != null && string.contains("%d") && string.endsWith("/"));
        return String.format(string, l) + s2 + "_" + s3;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Nullable
    public final aet_0 a(short s2, short s3, long l) {
        long l2 = aew_0.a(s2, s3, l);
        this.k.a(l2);
        TLongObjectHashMap<aet_0> tLongObjectHashMap = this.d;
        synchronized (tLongObjectHashMap) {
            return (aet_0)this.d.get(l2);
        }
    }

    @Nullable
    public final aet_0 a(int n, int n2, long l) {
        short s2 = (short)XY.a(n);
        short s3 = (short)XY.b(n2);
        return this.a(s2, s3, l);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public final void b(short s2, short s3, long l) {
        aet_0 aet_02;
        byte[] byArray;
        boolean bl;
        assert (this.c != null) : "Il faut d'abord appeler setMapFactory";
        long l2 = aew_0.a(s2, s3, l);
        Object object = this.d;
        synchronized (object) {
            bl = this.d.contains(l2);
        }
        if (bl) {
            this.b(l2);
            return;
        }
        object = aew_0.a(this.b, l, s2, s3);
        try {
            byArray = (byte[])aew_0.l.get(object);
        }
        catch (ExecutionException executionException) {
            g.error((Object)("Unable to load map (" + object + ") in CACHE"));
            return;
        }
        if (byArray == null) {
            g.error((Object)("Unable to load map (" + object + ")"));
            return;
        }
        arf_1 arf_12 = arf_1.a(byArray);
        byte by = arf_12.a();
        if (by != (aet_02 = this.c.createMap()).d()) {
            g.warn((Object)"version de map d'enviornenemt client incorrect");
        }
        this.a(aet_02, arf_12);
        TLongObjectHashMap<aet_0> tLongObjectHashMap = this.d;
        synchronized (tLongObjectHashMap) {
            this.d.put(l2, (Object)aet_02);
        }
    }

    public void a(@Nullable ams_1 ams_12) {
        this.i = ams_12;
    }

    public void a(@Nullable aik_0 aik_02) {
        this.j = aik_02;
    }

    public void a(long l) {
        this.h = l;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private void b(long l) {
        aet_0 aet_02;
        TLongObjectHashMap<aet_0> tLongObjectHashMap = this.d;
        synchronized (tLongObjectHashMap) {
            aet_02 = (aet_0)this.d.get(l);
        }
        if (aet_02 != null && !aet_02.j) {
            this.b(aet_02);
        }
    }

    protected void a(@NotNull aet_0 aet_02, @NotNull arf_1 arf_12) {
        aet_02.a(arf_12);
        this.b(aet_02);
    }

    private void b(@NotNull aet_0 aet_02) {
        if (aet_02.j) {
            g.error((Object)("chargement d'une map d\u00e9j\u00e0 charg\u00e9e  " + this.e(aet_02)));
            return;
        }
        this.d(aet_02);
        this.c(aet_02);
        aet_02.j = true;
        if (this.a != null) {
            this.a.a(aet_02);
        }
    }

    private void c(aet_0 aet_02) {
        afs[] afsArray = aet_02.f();
        if (afsArray == null || this.i == null) {
            return;
        }
        for (int k = 0; k < afsArray.length; ++k) {
            try {
                afs afs2 = afsArray[k];
                agt agt2 = ags.a().a(afs2.f);
                int n = aet_02.a(afs2.a);
                int n2 = aet_02.b(afs2.b);
                assert (afs2.e == null);
                afs2.e = this.i.a(agt2, n, n2, afs2.c);
                continue;
            }
            catch (Exception exception) {
                g.error((Object)"", (Throwable)exception);
            }
        }
    }

    private void d(aet_0 aet_02) {
        afo[] afoArray = aet_02.e();
        if (afoArray == null || this.j == null) {
            return;
        }
        for (int k = 0; k < afoArray.length; ++k) {
            this.a(aet_02, afoArray[k]);
        }
    }

    private void a(aet_0 aet_02, afo afo2) {
        try {
            CellParticleSystem cellParticleSystem = aij_0.a().b(afo2.f, afo2.g);
            if (cellParticleSystem == null) {
                g.warn((Object)("Erreur de cr\u00e9ation du systeme de particule " + afo2));
                return;
            }
            float f2 = (float)aet_02.a(afo2.a) + (float)afo2.i / 100.0f;
            float f3 = (float)aet_02.b(afo2.b) + (float)afo2.j / 100.0f;
            float f4 = (float)afo2.c + (float)afo2.k / 10.0f;
            cellParticleSystem.a(f2, f3, f4);
            cellParticleSystem.b(afo2.h);
            cellParticleSystem.a(afo2.l);
            assert (afo2.e == null);
            afo2.e = cellParticleSystem;
            this.j.a(cellParticleSystem);
        }
        catch (Exception exception) {
            g.error((Object)"", (Throwable)exception);
        }
    }

    public void a(short s2, short s3) {
        long l = aew_0.a(s2, s3, this.h);
        this.k.a(l, new aey_0(this, s2, s3));
    }

    public void b(short s2, short s3) {
        assert (this.h != Integer.MIN_VALUE) : "il faut d'abord appler setWorldId";
        this.b(s2, s3, this.h);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void c(short s2, short s3) {
        long l = aew_0.a(s2, s3, this.h);
        this.e(s2, s3);
        TLongObjectHashMap<aet_0> tLongObjectHashMap = this.d;
        synchronized (tLongObjectHashMap) {
            this.d.remove(l);
            this.k.b(l);
        }
    }

    protected void a(@NotNull aet_0 aet_02) {
        afs[] afsArray;
        if (!aet_02.j) {
            return;
        }
        afo[] afoArray = aet_02.e();
        if (afoArray != null && this.j != null) {
            for (int k = 0; k < afoArray.length; ++k) {
                CellParticleSystem cellParticleSystem = afoArray[k].e;
                if (cellParticleSystem == null) continue;
                cellParticleSystem.aa();
                afoArray[k].e = null;
            }
        }
        if ((afsArray = aet_02.f()) != null && this.i != null) {
            for (int k = 0; k < afsArray.length; ++k) {
                alw_1 alw_12 = afsArray[k].e;
                if (alw_12 == null) continue;
                alw_12.c();
                afsArray[k].e = null;
            }
        }
        aet_02.j = false;
        if (this.a != null) {
            this.a.b(aet_02);
        }
    }

    private void e(short s2, short s3) {
        aet_0 aet_02 = this.d(s2, s3);
        if (aet_02 == null) {
            g.warn((Object)("D\u00e9chargement d'une map non charg\u00e9e (" + s2 + " " + s3 + ")"));
            return;
        }
        this.a(aet_02);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public final void b() {
        TLongObjectHashMap<aet_0> tLongObjectHashMap = this.d;
        synchronized (tLongObjectHashMap) {
            this.d.forEachValue((TObjectProcedure)new aez_0(this));
        }
    }

    @Nullable
    public final aet_0 d(short s2, short s3) {
        assert (this.h != Integer.MIN_VALUE) : "il faut d'abord appeler setWorldId";
        return this.a(s2, s3, this.h);
    }

    @Nullable
    public final aet_0 a(int n, int n2) {
        assert (this.h != Integer.MIN_VALUE) : "il faut d'abord appeler setWorldId";
        return this.a(n, n2, this.h);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void c() {
        TLongObjectHashMap<aet_0> tLongObjectHashMap = this.d;
        synchronized (tLongObjectHashMap) {
            this.d.forEachValue((TObjectProcedure)new afa(this));
            this.d.clear();
        }
        this.h = Integer.MIN_VALUE;
    }

    private String e(@NotNull aet_0 aet_02) {
        return "(" + aet_02.a() + " " + aet_02.b() + " @" + this.h + ")";
    }

    public void a(aev_0 aev_02) {
        this.a = aev_02;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void a(short s2, short s3, aet_0 aet_02) {
        long l = aew_0.a(s2, s3, this.h);
        TLongObjectHashMap<aet_0> tLongObjectHashMap = this.d;
        synchronized (tLongObjectHashMap) {
            this.d.put(l, (Object)aet_02);
            this.b(aet_02);
        }
    }
}

