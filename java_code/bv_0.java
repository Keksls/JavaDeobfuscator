/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from BV
 */
public final class bv_0
extends ars_1 {
    private static final short b = 1;
    private int c;
    private int d;
    private Long[] e;
    private int f;
    private int g;

    public int b() {
        return this.d;
    }

    public void a(int n) {
        this.d = n;
    }

    public Long[] c() {
        return this.e;
    }

    public void a(Long[] longArray) {
        this.e = longArray;
    }

    public int d() {
        return this.f;
    }

    public void b(int n) {
        this.f = n;
    }

    public int g() {
        return this.g;
    }

    public void c(int n) {
        this.g = n;
    }

    public int h() {
        return this.c;
    }

    public void d(int n) {
        this.c = n;
    }

    public bv_0() {
        super((short)1);
    }

    @Override
    public int f() {
        return enK.ag.a();
    }

    @Override
    public byte[] e() {
        ByteBuffer byteBuffer = ByteBuffer.allocate(20 + (this.e == null ? 0 : this.e.length * 8));
        byteBuffer.putInt(this.c);
        byteBuffer.putInt(this.d);
        byteBuffer.putInt(this.f);
        byteBuffer.putInt(this.g);
        if (this.e != null) {
            byteBuffer.putInt(this.e.length);
            Long[] longArray = this.e;
            int n = longArray.length;
            for (int k = 0; k < n; ++k) {
                long l = longArray[k];
                byteBuffer.putLong(l);
            }
        } else {
            byteBuffer.putInt(0);
        }
        return byteBuffer.array();
    }

    @Override
    public void a(ByteBuffer byteBuffer, int n, short s2) {
        this.e(n);
        if (s2 == 1) {
            this.c = byteBuffer.getInt();
            this.d = byteBuffer.getInt();
            this.f = byteBuffer.getInt();
            this.g = byteBuffer.getInt();
            int n2 = byteBuffer.getInt();
            this.e = new Long[n2];
            for (int k = 0; k < n2; ++k) {
                this.e[k] = byteBuffer.getLong();
            }
        } else {
            a.error((Object)"Tentative de d\u00e9s\u00e9rialisation d'un objet avec une version non prise en charge");
        }
    }

    @Override
    public ars_1 a() {
        return new bv_0();
    }
}

