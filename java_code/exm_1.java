/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.nio.ByteBuffer;
import org.apache.log4j.Logger;

/*
 * Renamed from eXM
 */
public class exm_1
extends rs_0 {
    protected static final Logger a = Logger.getLogger(exm_1.class);
    private final exn_2 h;
    public static final byte b = 12;
    protected int c;
    protected int d;
    protected int e;
    protected int f;
    protected int g;

    public exm_1(byte by, ByteBuffer byteBuffer) {
        this.h = exn_2.a(by);
        this.b(byteBuffer);
        if (this.h == null) {
            throw new IllegalArgumentException("Erreur dans la d\u00e9s\u00e9rialisation de la Charact\u00e9ristique, Type inconnu : " + by);
        }
    }

    public exm_1(exn_2 exn_22, int n, int n2) {
        this.h = exn_22;
        this.a(n, n2);
        if (exn_22 != null) {
            this.c = exn_22.j();
        }
    }

    public exn_2 t() {
        return this.h;
    }

    @Override
    public int b() {
        return this.c;
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
        this.c = Math.max(this.e, Math.min(this.d, n));
        if (bl) {
            this.s();
        }
    }

    @Override
    public int c(int n) {
        this.b(this.c + n);
        return this.c;
    }

    @Override
    public int d(int n) {
        this.b(this.c - n);
        return this.c;
    }

    @Override
    public void g(int n) {
        this.b(n, true);
    }

    private void b(int n, boolean bl) {
        this.d = Math.max(this.g, Math.min(this.f, n));
        this.d = Math.max(this.d, this.e);
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
        this.e = Math.min(this.f, Math.max(this.g, n));
        this.e = Math.min(this.d, this.e);
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
        this.g = Math.min(n, n2);
        this.f = Math.max(n, n2);
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

