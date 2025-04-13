/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from cxS
 */
public class cxs_2
extends ps_0 {
    private long a;
    private fhD b;
    private boolean c;

    @Override
    public boolean a(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.a = byteBuffer.getLong();
        this.b = fhD.a(byteBuffer.get());
        this.c = byteBuffer.get() == 1;
        return false;
    }

    public long b() {
        return this.a;
    }

    public fhD c() {
        return this.b;
    }

    public boolean d() {
        return this.c;
    }

    @Override
    public int a() {
        return 12138;
    }
}

