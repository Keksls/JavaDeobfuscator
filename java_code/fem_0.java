/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from feM
 */
public class fem_0 {
    private final int a;
    private final long b;
    private faX c;
    private long d;
    private float e;
    private int f;
    private final int g;
    private boolean h;
    private final String i;

    protected fem_0(int n, long l, faX faX2, boolean bl, long l2, float f2, int n2, int n3) {
        this(n, l, faX2, bl, l2, f2, n2, n3, null);
    }

    protected fem_0(int n, long l, faX faX2, boolean bl, long l2, float f2, int n2, int n3, String string) {
        this.a = n;
        this.b = l;
        this.c = faX2;
        this.h = bl;
        this.a(l2);
        this.e = f2;
        this.f = n2;
        this.g = n3;
        this.i = string;
    }

    public int a() {
        return this.a;
    }

    public static fem_0 a(ByteBuffer byteBuffer) {
        int n = byteBuffer.getInt();
        long l = byteBuffer.getLong();
        faX faX2 = fbc_0.a.a(byteBuffer.getInt());
        return new fem_0(n, l, faX2, byteBuffer.get() != 0, byteBuffer.getLong(), byteBuffer.getFloat(), byteBuffer.getInt(), byteBuffer.getInt());
    }

    public faX b() {
        return this.c;
    }

    public int c() {
        return this.c.c();
    }

    public void a(faX faX2) {
        this.c = faX2;
    }

    public boolean d() {
        return this.h;
    }

    public void a(boolean bl) {
        this.h = bl;
    }

    public long e() {
        return this.d;
    }

    public void a(long l) {
        this.d = Math.min(1000000000L, this.d + l);
    }

    public void a(int n) {
        this.f = n;
    }

    public float f() {
        return this.e;
    }

    public void a(fjb_0 fjb_02, float f2) {
        switch (fjb_02) {
            case a: {
                this.e = f2;
                break;
            }
            default: {
                throw new UnsupportedOperationException("Context de taxe non g\u00e9r\u00e9 : " + fjb_02);
            }
        }
    }

    public int g() {
        return this.f;
    }

    public int h() {
        return this.g;
    }

    public String i() {
        return this.i;
    }

    public static int j() {
        return 37;
    }

    public String toString() {
        return "NationProtectorInfo{m_id=" + this.a + ", m_territoryId=" + this.b + ", m_nation=" + this.c + ", m_isChaos=" + this.h + ", m_cash=" + this.d + ", m_marketTaxValue=" + this.e + ", m_currentSatisfaction=" + this.f + " / " + this.g + ", m_serverIdString=" + this.i + "}";
    }

    public long k() {
        return this.b;
    }

    public void b(ByteBuffer byteBuffer) {
        byteBuffer.putInt(this.a);
        byteBuffer.putLong(this.b);
        byteBuffer.putInt(this.c.c());
        byteBuffer.put(this.h ? (byte)1 : 0);
        byteBuffer.putLong(this.d);
        byteBuffer.putFloat(this.e);
        byteBuffer.putInt(this.f);
        byteBuffer.putInt(this.g);
    }
}

