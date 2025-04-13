/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from faz
 */
public class faz_0 {
    public static final List<faL> a = Collections.nCopies(4, faL.g);
    public static final List<Integer> b = Collections.nCopies(4, faL.g.a());
    private static final byte[] c = new faz_0().b();
    private int d;
    private long e;
    private int f;
    @Nullable
    private faO g;
    private short h = (short)-1;
    @Nullable
    private List<faL> i;
    private boolean j = false;
    private int k = -1;
    private int l = -1;

    public void a() {
        this.b(ByteBuffer.wrap(c));
    }

    public byte[] b() {
        abx_2 abx_22 = new abx_2(this.l());
        abx_22.a(this.d);
        abx_22.a(this.e);
        abx_22.a(this.f);
        abx_22.a(this.g == null ? (byte)-1 : this.g.a());
        abx_22.a(this.h);
        if (this.i == null) {
            abx_22.a((byte)-1);
        } else {
            abx_22.a((byte)this.i.size());
            for (faL faL2 : this.i) {
                abx_22.a((byte)faL2.a());
            }
        }
        abx_22.a(this.j);
        abx_22.a(this.k);
        abx_22.a(this.l);
        return abx_22.c();
    }

    public static faz_0 a(ByteBuffer byteBuffer) {
        faz_0 faz_02 = new faz_0();
        faz_02.b(byteBuffer);
        return faz_02;
    }

    private void b(ByteBuffer byteBuffer) {
        this.a(byteBuffer.getInt());
        this.a(byteBuffer.getLong());
        this.b(byteBuffer.getInt());
        this.a((faO)faO.a(byteBuffer.get()).orElse(null));
        this.a(byteBuffer.getShort());
        int n = byteBuffer.get();
        if (n > 0) {
            ArrayList<faL> arrayList = new ArrayList<faL>(n);
            for (int k = 0; k < n; ++k) {
                arrayList.add(faL.a(byteBuffer.get()));
            }
            this.a(arrayList);
        } else {
            this.a((List<faL>)null);
        }
        this.a(byteBuffer.get() > 0);
        this.c(byteBuffer.getInt());
        this.d(byteBuffer.getInt());
    }

    private int l() {
        return 20 + (this.i == null ? 0 : this.i.size() * 1) + 1 + 4 + 4;
    }

    public int c() {
        return this.d;
    }

    public long d() {
        return this.e;
    }

    public int e() {
        return this.f;
    }

    @Nullable
    public faO f() {
        return this.g;
    }

    public short g() {
        return this.h;
    }

    @Nullable
    public List<faL> h() {
        return this.i;
    }

    public boolean i() {
        return this.j;
    }

    public int j() {
        return this.k;
    }

    public int k() {
        return this.l;
    }

    public faz_0 a(int n) {
        this.d = n;
        return this;
    }

    public faz_0 a(long l) {
        this.e = l;
        return this;
    }

    public faz_0 b(int n) {
        this.f = n;
        return this;
    }

    public faz_0 a(@Nullable faO faO2) {
        this.g = faO2;
        return this;
    }

    public faz_0 a(short s2) {
        this.h = s2;
        return this;
    }

    public faz_0 a(@Nullable List<faL> list) {
        this.i = list;
        return this;
    }

    public faz_0 a(boolean bl) {
        this.j = bl;
        return this;
    }

    public faz_0 c(int n) {
        this.k = n;
        return this;
    }

    public faz_0 d(int n) {
        this.l = n;
        return this;
    }

    public String toString() {
        return "ClientMarketOfferCriteria(m_itemRefId=" + this.c() + ", m_unitPrice=" + this.d() + ", m_quantity=" + this.e() + ", m_sellDuration=" + this.f() + ", m_itemLevel=" + this.g() + ", m_slotColors=" + this.h() + ", m_slotFixedOrder=" + this.i() + ", m_sublimationId=" + this.j() + ", m_specialSublimationId=" + this.k() + ")";
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof faz_0)) {
            return false;
        }
        faz_0 faz_02 = (faz_0)object;
        if (!faz_02.a(this)) {
            return false;
        }
        if (this.c() != faz_02.c()) {
            return false;
        }
        if (this.d() != faz_02.d()) {
            return false;
        }
        if (this.e() != faz_02.e()) {
            return false;
        }
        if (this.g() != faz_02.g()) {
            return false;
        }
        if (this.i() != faz_02.i()) {
            return false;
        }
        if (this.j() != faz_02.j()) {
            return false;
        }
        if (this.k() != faz_02.k()) {
            return false;
        }
        faO faO2 = this.f();
        faO faO3 = faz_02.f();
        if (faO2 == null ? faO3 != null : !((Object)((Object)faO2)).equals((Object)faO3)) {
            return false;
        }
        List<faL> list = this.h();
        List<faL> list2 = faz_02.h();
        return !(list == null ? list2 != null : !((Object)list).equals(list2));
    }

    protected boolean a(Object object) {
        return object instanceof faz_0;
    }

    public int hashCode() {
        int n = 59;
        int n2 = 1;
        n2 = n2 * 59 + this.c();
        long l = this.d();
        n2 = n2 * 59 + (int)(l >>> 32 ^ l);
        n2 = n2 * 59 + this.e();
        n2 = n2 * 59 + this.g();
        n2 = n2 * 59 + (this.i() ? 79 : 97);
        n2 = n2 * 59 + this.j();
        n2 = n2 * 59 + this.k();
        faO faO2 = this.f();
        n2 = n2 * 59 + (faO2 == null ? 43 : ((Object)((Object)faO2)).hashCode());
        List<faL> list = this.h();
        n2 = n2 * 59 + (list == null ? 43 : ((Object)list).hashCode());
        return n2;
    }
}

