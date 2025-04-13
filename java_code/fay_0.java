/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
import java.nio.ByteBuffer;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from fay
 */
public class fay_0
extends faB {
    private static final byte[] a = new fay_0().b();
    @Nullable
    private String b = null;
    @Nullable
    private Ow c = null;
    @Nullable
    private faJ d = null;
    private long e = -1L;
    private long f = -1L;
    @Nullable
    private faP g = null;

    public void a() {
        this.c(ByteBuffer.wrap(a));
    }

    public byte[] b() {
        byte[] byArray = Cz.a(this.b);
        abx_2 abx_22 = new abx_2(fay_0.a(byArray));
        this.a(abx_22);
        byte by = Hw.b((long)byArray.length);
        abx_22.a(by);
        abx_22.a(byArray, by);
        abx_22.a(this.c == null ? (byte)-1 : this.c.c());
        abx_22.a(this.d == null ? (byte)-1 : this.d.a());
        abx_22.a(this.e);
        abx_22.a(this.f);
        abx_22.a(this.g == null ? (byte)-1 : this.g.a());
        return abx_22.c();
    }

    public static fay_0 a(ByteBuffer byteBuffer) {
        fay_0 fay_02 = new fay_0();
        fay_02.c(byteBuffer);
        return fay_02;
    }

    private void c(ByteBuffer byteBuffer) {
        this.b(byteBuffer);
        this.a(Cz.b(byteBuffer));
        this.a((Ow)Ow.b(byteBuffer.get()).orElse(null));
        byte by = byteBuffer.get();
        this.a(by == -1 ? null : faJ.a(by));
        this.a(byteBuffer.getLong());
        this.b(byteBuffer.getLong());
        byte by2 = byteBuffer.get();
        this.a(by2 == -1 ? null : faP.a(by2));
    }

    private static int a(byte[] byArray) {
        return fay_0.i() + 1 + byArray.length + 1 + 8 + 8 + 1;
    }

    @Nullable
    public String c() {
        return this.b;
    }

    @Nullable
    public Ow d() {
        return this.c;
    }

    @Nullable
    public faJ e() {
        return this.d;
    }

    public long f() {
        return this.e;
    }

    public long g() {
        return this.f;
    }

    @Nullable
    public faP h() {
        return this.g;
    }

    public fay_0 a(@Nullable String string) {
        this.b = string;
        return this;
    }

    public fay_0 a(@Nullable Ow ow) {
        this.c = ow;
        return this;
    }

    public fay_0 a(@Nullable faJ faJ2) {
        this.d = faJ2;
        return this;
    }

    public fay_0 a(long l) {
        this.e = l;
        return this;
    }

    public fay_0 b(long l) {
        this.f = l;
        return this;
    }

    public fay_0 a(@Nullable faP faP2) {
        this.g = faP2;
        return this;
    }

    @Override
    public String toString() {
        return "ClientHistorySearchParameters(m_name=" + this.c() + ", m_language=" + this.d() + ", m_elementType=" + this.e() + ", m_minPrice=" + this.f() + ", m_maxPrice=" + this.g() + ", m_timespan=" + this.h() + ")";
    }

    @Override
    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof fay_0)) {
            return false;
        }
        fay_0 fay_02 = (fay_0)object;
        if (!fay_02.a(this)) {
            return false;
        }
        if (!super.equals(object)) {
            return false;
        }
        if (this.f() != fay_02.f()) {
            return false;
        }
        if (this.g() != fay_02.g()) {
            return false;
        }
        String string = this.c();
        String string2 = fay_02.c();
        if (string == null ? string2 != null : !string.equals(string2)) {
            return false;
        }
        Ow ow = this.d();
        Ow ow2 = fay_02.d();
        if (ow == null ? ow2 != null : !((Object)((Object)ow)).equals((Object)ow2)) {
            return false;
        }
        faJ faJ2 = this.e();
        faJ faJ3 = fay_02.e();
        if (faJ2 == null ? faJ3 != null : !((Object)((Object)faJ2)).equals((Object)faJ3)) {
            return false;
        }
        faP faP2 = this.h();
        faP faP3 = fay_02.h();
        return !(faP2 == null ? faP3 != null : !((Object)((Object)faP2)).equals((Object)faP3));
    }

    @Override
    protected boolean a(Object object) {
        return object instanceof fay_0;
    }

    @Override
    public int hashCode() {
        int n = 59;
        int n2 = super.hashCode();
        long l = this.f();
        n2 = n2 * 59 + (int)(l >>> 32 ^ l);
        long l2 = this.g();
        n2 = n2 * 59 + (int)(l2 >>> 32 ^ l2);
        String string = this.c();
        n2 = n2 * 59 + (string == null ? 43 : string.hashCode());
        Ow ow = this.d();
        n2 = n2 * 59 + (ow == null ? 43 : ((Object)((Object)ow)).hashCode());
        faJ faJ2 = this.e();
        n2 = n2 * 59 + (faJ2 == null ? 43 : ((Object)((Object)faJ2)).hashCode());
        faP faP2 = this.h();
        n2 = n2 * 59 + (faP2 == null ? 43 : ((Object)((Object)faP2)).hashCode());
        return n2;
    }
}

