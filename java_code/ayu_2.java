/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.jogamp.opengl.GL2
 *  gnu.trove.iterator.TLongObjectIterator
 *  gnu.trove.map.hash.TLongObjectHashMap
 *  gnu.trove.procedure.TObjectProcedure
 *  org.apache.log4j.Logger
 */
import com.jogamp.opengl.GL2;
import gnu.trove.iterator.TLongObjectIterator;
import gnu.trove.map.hash.TLongObjectHashMap;
import gnu.trove.procedure.TObjectProcedure;
import java.util.ArrayList;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import org.apache.log4j.Logger;

/*
 * Renamed from ayU
 */
public final class ayu_2 {
    private static final Logger b = Logger.getLogger(ayu_2.class);
    private static final ayu_2 c = new ayu_2();
    private static final int d = 131072;
    private final TLongObjectHashMap<ays_2> e;
    private final ArrayList<ays_2> f;
    private float g;
    private float h = 131072.0f;
    private final ayq_2 i = new ayq_2();
    private final ayr_2 j = new ayr_2();
    private final Lock k = new ReentrantLock();

    private ayu_2() {
        this.e = new TLongObjectHashMap(1024);
        this.f = new ArrayList(128);
    }

    public static ayu_2 a() {
        return c;
    }

    public ays_2 a(aui_2 aui_22, long l, String string, boolean bl, boolean bl2) {
        ays_2 ays_22 = this.a(l);
        if (ays_22 == null) {
            ays_22 = aui_22.a(l, string, bl);
            ays_22.b(bl2);
            this.a(l, ays_22);
        }
        return ays_22;
    }

    public ays_2 a(aui_2 aui_22, long l, String string, boolean bl) {
        return this.a(aui_22, l, string, bl, true);
    }

    public ays_2 a(aui_2 aui_22, long l, azk_2 azk_22, boolean bl) {
        ays_2 ays_22 = this.a(l);
        if (ays_22 == null) {
            ays_22 = aui_22.a(l, azk_22, bl);
            this.a(l, ays_22);
        }
        return ays_22;
    }

    public ays_2 b(aui_2 aui_22, long l, azk_2 azk_22, boolean bl) {
        ays_2 ays_22 = this.c(l);
        if (ays_22 != null) {
            return ays_22;
        }
        return this.c(aui_22, l, azk_22, bl);
    }

    public ays_2 b(aui_2 aui_22, long l, String string, boolean bl) {
        ays_2 ays_22 = this.c(l);
        if (ays_22 != null) {
            return ays_22;
        }
        azk_2 azk_22 = new azk_2();
        if (azk_22.c(string)) {
            ays_22 = this.c(aui_22, l, azk_22, bl);
            ays_22.d = string;
        }
        azk_22.u();
        return ays_22;
    }

    public ays_2 b(aui_2 aui_22, long l, String string, boolean bl, boolean bl2) {
        if (!bl2) {
            return this.b(aui_22, l, string, bl);
        }
        ays_2 ays_22 = this.c(l);
        if (ays_22 != null) {
            return ays_22;
        }
        ays_22 = aui_22.a(l, string, bl);
        ays_22.d(true);
        ays_22.b(bl2);
        this.a(l, ays_22);
        return ays_22;
    }

    private void a(long l, ays_2 ays_22) {
        if (ays_22 == null) {
            b.error((Object)("Essaye d'ins\u00e9rer une texture null id=" + l), (Throwable)new Exception());
            return;
        }
        this.k.lock();
        this.e.put(l, (Object)ays_22);
        ays_22.m = ayt_2.c;
        this.k.unlock();
    }

    public ays_2 a(aui_2 aui_22, long l, String string, String string2, boolean bl) {
        ays_2 ays_22 = this.c(l);
        if (ays_22 != null) {
            return ays_22;
        }
        azk_2 azk_22 = new azk_2();
        if (azk_22.c(string2 + string)) {
            ays_22 = this.c(aui_22, l, azk_22, bl);
        }
        azk_22.u();
        return ays_22;
    }

    public ays_2 a(aui_2 aui_22, long l, int n, int n2, boolean bl) {
        return aui_22.a(l, n, n2, bl);
    }

    public int b() {
        return this.e.size();
    }

    public ays_2 a(long l) {
        this.k.lock();
        ays_2 ays_22 = (ays_2)this.e.get(l);
        this.k.unlock();
        return ays_22;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public int a(String string) {
        assert (string != null);
        this.k.lock();
        int n = 0;
        try {
            n = 0;
            TLongObjectIterator tLongObjectIterator = this.e.iterator();
            while (tLongObjectIterator.hasNext()) {
                tLongObjectIterator.advance();
                ays_2 ays_22 = (ays_2)tLongObjectIterator.value();
                if (ays_22.j() || !ays_22.s() || !ays_22.a(string)) continue;
                ++n;
            }
        }
        catch (Exception exception) {
            b.error((Object)"Exception raised while loading textures : ", (Throwable)exception);
        }
        finally {
            this.k.unlock();
        }
        return n;
    }

    public void a(GL2 gL2) {
        this.k.lock();
        try {
            this.i.a(gL2);
            this.e.forEachValue((TObjectProcedure)this.i);
            this.g += this.i.a();
        }
        catch (Exception exception) {
            b.error((Object)"Exception raised while preparing textures : ", (Throwable)exception);
        }
        finally {
            this.k.unlock();
        }
    }

    public void c() {
        this.k.lock();
        TLongObjectIterator tLongObjectIterator = this.e.iterator();
        while (tLongObjectIterator.hasNext()) {
            tLongObjectIterator.advance();
            ays_2 ays_22 = (ays_2)tLongObjectIterator.value();
            if (ays_22 == null || ays_22.aw() != 0) continue;
            for (int k = ays_22.p(); k > 0; --k) {
                ays_22.q();
            }
            assert (ays_22.p() == 0);
        }
        this.k.unlock();
        float f2 = this.h;
        this.h = 0.0f;
        this.d();
        this.h = f2;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void d() {
        float f2 = this.g - this.h;
        if (f2 <= 0.0f) {
            return;
        }
        this.k.lock();
        try {
            this.j.a();
            this.e.forEachValue((TObjectProcedure)this.j);
            float f3 = this.j.a(this.f, f2);
            this.g -= f3;
            int n = this.f.size();
            for (int k = 0; k < n; ++k) {
                ays_2 ays_22 = this.f.get(k);
                ays_22.m = ayt_2.e;
                this.e.remove(ays_22.f());
                ays_22.u();
            }
            this.f.clear();
        }
        catch (Exception exception) {
            b.error((Object)"Exception raised while releasing textures : ", (Throwable)exception);
        }
        finally {
            this.k.unlock();
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void b(long l) {
        this.k.lock();
        try {
            ays_2 ays_22 = (ays_2)this.e.get(l);
            if (ays_22 == null) {
                return;
            }
            float f2 = ays_22.n();
            ays_22.m = ayt_2.e;
            this.e.remove(ays_22.f());
            ays_22.u();
            this.g -= f2;
        }
        catch (Exception exception) {
            b.error((Object)("Error when trying to release texture " + l), (Throwable)exception);
        }
        finally {
            this.k.unlock();
        }
    }

    public float e() {
        return this.g / 1024.0f;
    }

    public void a(float f2) {
        this.h = Math.max(131072.0f, f2);
    }

    private ays_2 c(long l) {
        return this.a(l);
    }

    private ays_2 c(aui_2 aui_22, long l, azk_2 azk_22, boolean bl) {
        afe_1 afe_12 = new afe_1(azk_22.b(0));
        azk_22.y();
        ays_2 ays_22 = this.a(aui_22, l, azk_22, bl);
        ays_22.w().b(afe_12);
        this.a(l, ays_22);
        return ays_22;
    }
}

