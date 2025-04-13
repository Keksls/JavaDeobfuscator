/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.nio.ByteBuffer;
import org.apache.log4j.Logger;

/*
 * Renamed from eKX
 */
public class ekx_0
extends rs_0 {
    protected static final Logger a = Logger.getLogger(ekx_0.class);
    private final eky_0 h;
    public static final byte b = 12;
    protected int c;
    protected int d;
    protected int e;
    protected int f;
    protected int g;

    public ekx_0(byte by, ByteBuffer byteBuffer) {
        this.h = eky_0.a(by);
        this.b(byteBuffer);
        if (this.h == null) {
            throw new IllegalArgumentException("Erreur dans la d\u00e9s\u00e9rialisation de la Charact\u00e9ristique, Type inconnu : " + by);
        }
    }

    public ekx_0(eky_0 eky_02, int n, int n2) {
        this.h = eky_02;
        this.a(n, n2);
    }

    public eky_0 t() {
        return this.h;
    }

    @Override
    public int a() {
        if (this.c > this.d) {
            return this.c();
        }
        if (this.c < this.e) {
            return this.e();
        }
        return this.c;
    }

    @Override
    public int b() {
        return this.c;
    }

    @Override
    public int c() {
        return this.d;
    }

    @Override
    public int d() {
        return this.d;
    }

    @Override
    public int e() {
        return this.e;
    }

    @Override
    public int a(int n) {
        return 0;
    }

    @Override
    public int f() {
        return 0;
    }

    @Override
    public void b(int n) {
        this.a(n, true);
    }

    private void a(int n, boolean bl) {
        int n2 = this.d < n ? this.d : n;
        int n3 = this.c = this.e > n2 ? this.e : n2;
        if (bl) {
            this.s();
        }
    }

    @Override
    public int c(int n) {
        this.b(this.c + n);
        this.s();
        return this.c;
    }

    @Override
    public int d(int n) {
        this.b(this.c - n);
        this.s();
        return this.c;
    }

    @Override
    public void g(int n) {
        this.b(n, true);
    }

    private void b(int n, boolean bl) {
        int n2 = this.f < n ? this.f : n;
        this.d = this.g > n2 ? this.g : n2;
        int n3 = this.d = this.d > this.e ? this.d : this.e;
        if (this.c > this.d) {
            this.c = this.d;
        }
        if (bl) {
            this.s();
        }
    }

    @Override
    public void h(int n) {
        this.c(n, true);
    }

    private void c(int n, boolean bl) {
        int n2 = this.g > n ? this.g : n;
        this.e = this.f < n2 ? this.f : n2;
        int n3 = this.e = this.d < this.e ? this.d : this.e;
        if (this.c < this.e) {
            this.c = this.e;
        }
        if (bl) {
            this.s();
        }
    }

    @Override
    public int e(int n) {
        if (this.d == Integer.MAX_VALUE) {
            return this.d;
        }
        this.g(this.d + n);
        return this.d;
    }

    @Override
    public int f(int n) {
        if (this.e == Integer.MIN_VALUE) {
            return this.e;
        }
        this.h(this.e + n);
        return this.e;
    }

    private void a(int n, int n2) {
        this.g = n < n2 ? n : n2;
        int n3 = this.f = n > n2 ? n : n2;
        if (this.d > this.f) {
            this.g(this.f);
        }
        if (this.e < this.g) {
            this.h(this.g);
        }
    }

    public void a(ByteBuffer byteBuffer) {
        byteBuffer.putInt(this.c);
        byteBuffer.putInt(this.e);
        byteBuffer.putInt(this.d);
    }

    public void b(ByteBuffer byteBuffer) {
        this.c = byteBuffer.getInt();
        this.e = byteBuffer.getInt();
        this.d = byteBuffer.getInt();
    }

    @Override
    public void g() {
        this.c(this.h.h(), false);
        this.b(this.h.i(), false);
        this.a(this.h.j(), false);
        this.s();
    }

    @Override
    public /* synthetic */ ru_0 p() {
        return this.t();
    }
}

