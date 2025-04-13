/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from aMA
 */
public class ama_2 {
    private boolean a;
    private byte[] b;
    private amc_2 c;

    public ama_2(amc_2 amc_22) {
        this.c = amc_22;
        this.a = false;
    }

    public boolean a() {
        int n;
        long l = this.c.r();
        if (l > Integer.MAX_VALUE) {
            throw new UnsupportedOperationException("Impossible de charger un son de plus de 2147483647 octets");
        }
        this.b = new byte[(int)l];
        ByteBuffer byteBuffer = ByteBuffer.wrap(this.b);
        int n2 = 0;
        do {
            n = this.c.a(byteBuffer, n2);
            n2 += n;
        } while (n > 0);
        this.c.f();
        this.a = true;
        return true;
    }

    public void b() {
        this.c.f();
        this.b = null;
        this.c = null;
        this.a = false;
    }

    public amc_2 c() {
        return this.c;
    }

    public byte[] d() {
        return this.b;
    }

    public int e() {
        return this.b.length;
    }

    public boolean f() {
        return this.a;
    }

    public String toString() {
        return String.valueOf(this.c) + "\ninitialized=" + this.a;
    }
}

