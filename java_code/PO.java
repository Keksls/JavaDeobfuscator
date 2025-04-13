/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;
import java.util.List;

public abstract class PO
extends ps_0 {
    private String a;
    private List<Ow> b;
    private xz_0 c;
    private long d;
    private boolean e;
    private String f;

    public long c() {
        return this.d;
    }

    public boolean d() {
        return this.e;
    }

    public String e() {
        return this.a;
    }

    public List<Ow> f() {
        return this.b;
    }

    public xz_0 g() {
        return this.c;
    }

    public String h() {
        return this.f;
    }

    @Override
    public boolean a(byte[] byArray) {
        return this.a(byArray, 0);
    }

    public boolean a(byte[] byArray, int n) {
        if (byArray.length == 0) {
            return false;
        }
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        byteBuffer.position(n);
        byte[] byArray2 = new byte[byteBuffer.get() & 0xFF];
        byteBuffer.get(byArray2);
        this.a = Cz.a(byArray2);
        this.b = Ow.c(byteBuffer.get());
        this.c = xz_0.a(byteBuffer.get());
        this.d = byteBuffer.getLong();
        this.e = byteBuffer.get() == 1;
        short s2 = byteBuffer.getShort();
        int n2 = byteBuffer.remaining();
        if (s2 != n2) {
            A.error((Object)String.format("[%s] Indicated chat message content length is different from the real size: %s != %s", this.getClass().getSimpleName(), s2, n2));
            this.f = null;
            return false;
        }
        byte[] byArray3 = new byte[s2];
        byteBuffer.get(byArray3);
        this.f = Cz.a(byArray3);
        return true;
    }
}

