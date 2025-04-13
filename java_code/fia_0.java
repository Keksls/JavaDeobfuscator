/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.impl.HashFunctions
 *  gnu.trove.map.hash.TByteIntHashMap
 *  gnu.trove.map.hash.TIntIntHashMap
 *  gnu.trove.map.hash.TLongIntHashMap
 */
import gnu.trove.impl.HashFunctions;
import gnu.trove.map.hash.TByteIntHashMap;
import gnu.trove.map.hash.TIntIntHashMap;
import gnu.trove.map.hash.TLongIntHashMap;
import java.nio.ByteBuffer;
import java.util.List;

/*
 * Renamed from fiA
 */
public class fia_0 {
    private TIntIntHashMap a;
    private TIntIntHashMap b;
    private TLongIntHashMap c;
    private TByteIntHashMap d;
    private boolean e = false;

    public void a() {
        if (this.b != null) {
            this.b.clear();
        }
        if (this.c != null) {
            this.c.clear();
        }
    }

    public int a(int n) {
        if (this.a == null) {
            return -1;
        }
        if (this.a.containsKey(n)) {
            return this.a.get(n);
        }
        return -1;
    }

    private void c(epq_2 epq_22, fio_0 fio_02, int n) {
        if (!this.e && this.a(epq_22, fio_02) == 0) {
            return;
        }
        this.g();
        this.a.put(fio_02.aT_(), n);
    }

    private void b(epq_2 epq_22, fio_0 fio_02) {
        if (!this.e && fio_02.b(epq_22, null, epq_22.Q_()) <= 0) {
            return;
        }
        this.h();
        this.b.adjustOrPutValue(fio_02.aT_(), 1, 1);
    }

    public void a(epq_2 epq_22, byte by, int n) {
        this.j();
        this.d.put(by, n);
    }

    private void a(epq_2 epq_22, fio_0 fio_02, apq_2 apq_22) {
        if (apq_22 == null || !this.e && ((fin_0)fio_02.r()).a(fio_02, epq_22, (Object)apq_22, epq_22.Q_()) <= 0) {
            return;
        }
        if (apq_22 instanceof ekk_0 && !((ekk_0)apq_22).ad()) {
            return;
        }
        this.i();
        long l = fia_0.a(fio_02, apq_22);
        this.c.adjustOrPutValue(l, 1, 1);
    }

    public void a(epq_2 epq_22, fio_0 fio_02, int n, List<? extends Su> list) {
        this.c(epq_22, fio_02, n);
        this.b(epq_22, fio_02);
        for (Su su : list) {
            this.a(epq_22, fio_02, su);
        }
    }

    public int a(epq_2 epq_22, fio_0 fio_02, int n) {
        if (this.a(epq_22, fio_02) == 0) {
            return 0;
        }
        if (this.a == null) {
            return 0;
        }
        if (!this.a.contains(fio_02.aT_())) {
            return 0;
        }
        return this.a(epq_22, fio_02) - (n - this.a.get(fio_02.aT_()));
    }

    public fir_0 b(epq_2 epq_22, fio_0 fio_02, int n) {
        return this.a(epq_22, fio_02, n, (apq_2)null);
    }

    public fir_0 a(epq_2 epq_22, fio_0 fio_02, int n, apq_2 apq_22) {
        long l;
        Integer n2;
        int n3;
        So<efh_0> so = epq_22.Q_();
        if (this.a(epq_22, fio_02) != 0 && this.a != null && this.a.contains(fio_02.aT_())) {
            if (this.a(epq_22, fio_02) < 0 || n - this.a.get(fio_02.aT_()) < this.a(epq_22, fio_02)) {
                return fir_0.o;
            }
            this.a.remove(fio_02.aT_());
        }
        if (fio_02.b(epq_22, apq_22, so) > 0 && this.b != null && this.b.contains(fio_02.aT_()) && (n3 = this.b.get(fio_02.aT_())) >= fio_02.b(epq_22, apq_22, so)) {
            return fir_0.n;
        }
        if (apq_22 != null && ((fin_0)fio_02.r()).a(fio_02, epq_22, (Object)apq_22, so) > 0 && this.c != null && (n2 = Integer.valueOf(this.c.get(l = fia_0.a(fio_02, apq_22)))) >= ((fin_0)fio_02.r()).a(fio_02, epq_22, (Object)apq_22, so)) {
            return fir_0.m;
        }
        return fir_0.a;
    }

    public int b(epq_2 epq_22, byte by, int n) {
        if (this.d == null || !this.d.containsKey(by)) {
            return 0;
        }
        int n2 = this.d.get(by);
        epa_1 epa_12 = epq_22.gP().b(eps_0.aw);
        if (epa_12 == null) {
            return 0;
        }
        return Math.max(epa_12.a() - (n - n2), 0);
    }

    protected byte a(epq_2 epq_22, fio_0 fio_02) {
        return ((fin_0)fio_02.r()).d(fio_02, epq_22, null, (Object)epq_22.ck().h());
    }

    private static long a(fio_0 fio_02, apq_2 apq_22) {
        return Hw.c(((fin_0)fio_02.r()).i(), HashFunctions.hash((Object)apq_22));
    }

    TIntIntHashMap b() {
        return this.a;
    }

    TIntIntHashMap c() {
        return this.b;
    }

    TLongIntHashMap d() {
        return this.c;
    }

    TByteIntHashMap e() {
        return this.d;
    }

    public byte[] f() {
        return fiw.a(this);
    }

    public void a(ByteBuffer byteBuffer) {
        fiw.a(byteBuffer, this);
    }

    public void a(boolean bl) {
        this.e = bl;
    }

    void g() {
        if (this.a == null) {
            this.a = new TIntIntHashMap(3);
        }
    }

    void h() {
        if (this.b == null) {
            this.b = new TIntIntHashMap(3);
        }
    }

    void i() {
        if (this.c == null) {
            this.c = new TLongIntHashMap(3);
        }
    }

    void j() {
        if (this.d == null) {
            this.d = new TByteIntHashMap(10);
        }
    }

    public void k() {
        if (this.a != null) {
            this.a.clear();
        }
        if (this.b != null) {
            this.b.clear();
        }
        if (this.c != null) {
            this.c.clear();
        }
        if (this.d != null) {
            this.d.clear();
        }
    }
}

