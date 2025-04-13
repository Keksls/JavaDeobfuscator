/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.iterator.TLongObjectIterator
 *  gnu.trove.map.hash.TLongByteHashMap
 *  gnu.trove.map.hash.TLongObjectHashMap
 *  org.apache.log4j.Logger
 */
import gnu.trove.iterator.TLongObjectIterator;
import gnu.trove.map.hash.TLongByteHashMap;
import gnu.trove.map.hash.TLongObjectHashMap;
import java.util.ArrayList;
import org.apache.log4j.Logger;

/*
 * Renamed from fwI
 */
public class fwi_0
extends fwu<fxc_0> {
    private static final Logger f = Logger.getLogger(fwi_0.class);
    private fww g;
    private fww h;

    public fwi_0(fxc_0 fxc_02) {
        super(fxc_02);
    }

    public fww a(int n, int n2) {
        TLongObjectIterator tLongObjectIterator = this.d.iterator();
        while (tLongObjectIterator.hasNext()) {
            tLongObjectIterator.advance();
            fwz fwz2 = (fwz)tLongObjectIterator.value();
            ArrayList<fww> arrayList = fwz2.b();
            int n3 = arrayList.size();
            for (int k = 0; k < n3; ++k) {
                fww fww2 = arrayList.get(k);
                if (!fww2.a(n, n2)) continue;
                return fww2;
            }
        }
        return null;
    }

    public fww b(int n, int n2) {
        return this.a(XZ.a(n), XZ.b(n2));
    }

    @Override
    public void b() {
        super.b();
        this.a(null);
    }

    public fww d() {
        return this.g;
    }

    public void c(int n, int n2) {
        if (this.g != null && this.g.a(n, n2)) {
            return;
        }
        this.a(this.a(n, n2));
    }

    public void a(fww fww2) {
        if (this.g == fww2) {
            return;
        }
        if (this.g != null) {
            this.g.b(false);
        }
        this.g = fww2;
        if (this.g != null) {
            this.g.b(true);
        }
        if (this.c != null) {
            ((fxc_0)this.c).a(this.g != null ? (int)this.g.w().aZ_() : -1);
        }
    }

    public void d(int n, int n2) {
        fww fww2 = this.b(n, n2);
        if (fww2 == this.h) {
            return;
        }
        if (this.h != null) {
            this.h.a(1.0f);
            ((fxc_0)this.c).a(this.h.k(), 1.0f);
        }
        this.h = fww2;
        if (this.h != null) {
            this.h.a(3.0f);
            ((fxc_0)this.c).a(this.h.k(), 5.0f);
        }
    }

    public void e() {
        if (this.h != null) {
            ((fxc_0)this.c).a(this.h.k(), 5.0f);
        }
    }

    public boolean f() {
        return !this.d.isEmpty();
    }

    @Override
    public void c() {
        super.c();
        this.a(null);
    }

    public void a(float f2, TLongObjectHashMap<azj_2> tLongObjectHashMap, TLongByteHashMap tLongByteHashMap) {
        TLongObjectIterator tLongObjectIterator = this.d.iterator();
        while (tLongObjectIterator.hasNext()) {
            tLongObjectIterator.advance();
            ((fwz)tLongObjectIterator.value()).a(f2);
            ArrayList<fww> arrayList = ((fwz)tLongObjectIterator.value()).b();
            int n = arrayList.size();
            for (int k = 0; k < n; ++k) {
                fww fww2 = arrayList.get(k);
                fwB fwB2 = fww2.w();
                long l = fwB2.j();
                azj_2 azj_22 = fwB2.aX_();
                byte by = fwB2.aZ_();
                tLongObjectHashMap.put(l, (Object)azj_22);
                tLongByteHashMap.put(l, by);
            }
        }
    }

    public boolean a(int n, boolean bl) {
        TLongObjectIterator tLongObjectIterator = this.d.iterator();
        while (tLongObjectIterator.hasNext()) {
            tLongObjectIterator.advance();
            fwz fwz2 = (fwz)tLongObjectIterator.value();
            if (this.e.contains(tLongObjectIterator.key())) continue;
            ArrayList<fww> arrayList = fwz2.b();
            int n2 = arrayList.size();
            for (int k = 0; k < n2; ++k) {
                fww fww2 = arrayList.get(k);
                if (fww2.w().j() != (long)n) continue;
                fww2.c(bl);
                return true;
            }
        }
        return false;
    }
}

