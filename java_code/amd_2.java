/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicInteger;

/*
 * Renamed from aMD
 */
public class amd_2
implements amv_1 {
    private final AtomicInteger a = new AtomicInteger(0);
    private int b = 0;
    private final ama_2 c;

    public amd_2(ama_2 ama_22) {
        this.c = ama_22;
    }

    @Override
    public boolean a() {
        this.b = 0;
        return true;
    }

    @Override
    public boolean a(amx_1 amx_12) {
        this.b = 0;
        return true;
    }

    @Override
    public String b() {
        return this.c.c().b();
    }

    @Override
    public String p() {
        return this.c.c().p();
    }

    @Override
    public int a(ByteBuffer byteBuffer, int n) {
        if (!this.c.f()) {
            return 0;
        }
        byteBuffer.position(n);
        byte[] byArray = this.c.d();
        int n2 = Math.min(byteBuffer.limit() - n, byArray.length - this.b);
        n2 = Math.max(0, n2 - n2 % this.c.c().k());
        byteBuffer.put(byArray, this.b, n2);
        this.b += n2;
        if (this.b >= byArray.length) {
            return -n2;
        }
        return n2;
    }

    @Override
    public int c() {
        return this.c.c().c();
    }

    @Override
    public int d() {
        return this.c.c().d();
    }

    @Override
    public void a(boolean bl) {
    }

    @Override
    public void e() {
        this.b = 0;
    }

    @Override
    public void f() {
    }

    @Override
    public int g() {
        return this.c.c().g();
    }

    @Override
    public long h() {
        throw new UnsupportedOperationException("JOrbisVirtualStream.rawTell");
    }

    @Override
    public long i() {
        return this.b;
    }

    @Override
    public float j() {
        throw new UnsupportedOperationException("JOrbisVirtualStream.timeTell");
    }

    @Override
    public int a(float f2) {
        throw new UnsupportedOperationException("Impossible de seek sur un son non stream\u00e9 \u00e0 la seconds=" + f2);
    }

    @Override
    public int a(long l) {
        if (l > Integer.MAX_VALUE) {
            throw new UnsupportedOperationException("Impossible de pcmSeek sur un son non stream\u00e9 \u00e0 la position offset=" + l);
        }
        this.b = (int)l;
        return 0;
    }

    @Override
    public int b(long l) {
        throw new UnsupportedOperationException("Impossible de rawSeek sur un son non stream\u00e9 \u00e0 la position offset=" + l);
    }

    @Override
    public int k() {
        return this.c.c().k();
    }

    @Override
    public int l() {
        return this.c.c().l();
    }

    @Override
    public void a(int n) {
    }

    @Override
    public int m() {
        return this.a.get();
    }

    @Override
    public void n() {
        this.a.incrementAndGet();
    }

    @Override
    public void o() {
        this.a.decrementAndGet();
    }
}

