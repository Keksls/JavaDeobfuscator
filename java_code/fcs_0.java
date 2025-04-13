/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.iterator.TLongLongIterator
 *  gnu.trove.iterator.TLongObjectIterator
 *  gnu.trove.map.hash.TLongLongHashMap
 *  gnu.trove.map.hash.TLongObjectHashMap
 *  org.jetbrains.annotations.Nullable
 */
import gnu.trove.iterator.TLongLongIterator;
import gnu.trove.iterator.TLongObjectIterator;
import gnu.trove.map.hash.TLongLongHashMap;
import gnu.trove.map.hash.TLongObjectHashMap;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from fcs
 */
public class fcs_0 {
    protected final faX a;
    private final TLongObjectHashMap<fcq_0> b = new TLongObjectHashMap();
    private final TLongLongHashMap c = new TLongLongHashMap();
    private final ArrayList<fcr_0> d = new ArrayList();

    public fcs_0(faX faX2) {
        this.a = faX2;
    }

    public void a(fcr_0 fcr_02) {
        if (!this.d.contains(fcr_02)) {
            this.d.add(fcr_02);
        }
    }

    public void b(fcr_0 fcr_02) {
        this.d.remove(fcr_02);
    }

    public void a(fcq_0 fcq_02) {
        if (this.c.contains(fcq_02.a()) || this.b.contains(fcq_02.b().a())) {
            this.a(fcq_02.a());
        }
        this.b.put(fcq_02.b().a(), (Object)fcq_02);
        this.c.put(fcq_02.a(), fcq_02.b().a());
        for (int k = 0; k < this.d.size(); ++k) {
            this.d.get(k).a(fcq_02);
        }
    }

    public void a(long l) {
        long l2 = this.c.remove(l);
        fcq_0 fcq_02 = (fcq_0)this.b.remove(l2);
        for (int k = 0; k < this.d.size(); ++k) {
            this.d.get(k).b(fcq_02);
        }
    }

    public void a(fcu_0 fcu_02) {
        fcq_0 fcq_02 = (fcq_0)this.b.get(fcu_02.a());
        if (fcq_02 != null) {
            this.a(fcq_02.a());
        }
    }

    public void a() {
        TLongLongIterator tLongLongIterator = this.c.iterator();
        while (tLongLongIterator.hasNext()) {
            tLongLongIterator.advance();
            fcq_0 fcq_02 = (fcq_0)this.b.remove(tLongLongIterator.value());
            tLongLongIterator.remove();
            for (int k = 0; k < this.d.size(); ++k) {
                this.d.get(k).b(fcq_02);
            }
        }
    }

    public void b() {
        this.b.clear();
        this.c.clear();
    }

    @Nullable
    public fcq_0 c() {
        return (fcq_0)this.b.get(fcu_0.a.a());
    }

    @Nullable
    public fcq_0 b(long l) {
        return (fcq_0)this.b.get(this.c.get(l));
    }

    @Nullable
    public fcq_0 b(fcu_0 fcu_02) {
        return (fcq_0)this.b.get(fcu_02.a());
    }

    public TLongObjectIterator<fcq_0> d() {
        return this.b.iterator();
    }

    public void a(ByteBuffer byteBuffer) {
        byteBuffer.putInt(this.b.size());
        TLongObjectIterator tLongObjectIterator = this.b.iterator();
        while (tLongObjectIterator.hasNext()) {
            tLongObjectIterator.advance();
            ((fcq_0)tLongObjectIterator.value()).a(byteBuffer);
        }
    }

    public void b(ByteBuffer byteBuffer) {
        int n = byteBuffer.getInt();
        for (int k = 0; k < n; ++k) {
            fcq_0 fcq_02 = fcq_0.b(byteBuffer);
            this.b.put(fcq_02.b().a(), (Object)fcq_02);
            this.c.put(fcq_02.a(), fcq_02.b().a());
        }
    }

    public int e() {
        int n = 4;
        TLongObjectIterator tLongObjectIterator = this.b.iterator();
        while (tLongObjectIterator.hasNext()) {
            tLongObjectIterator.advance();
            n += ((fcq_0)tLongObjectIterator.value()).e();
        }
        return n;
    }
}

