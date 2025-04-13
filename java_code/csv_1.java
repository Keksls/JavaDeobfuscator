/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from csV
 */
public class csv_1
extends ps_0 {
    private long a;
    private long b;
    private ell_0 c;
    private long d;

    @Override
    public boolean a(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.a = byteBuffer.getLong();
        this.b = byteBuffer.getLong();
        this.c = ell_0.a(byteBuffer.get());
        this.d = byteBuffer.getLong();
        return true;
    }

    public long b() {
        return this.a;
    }

    public long c() {
        return this.b;
    }

    public ell_0 d() {
        return this.c;
    }

    public long e() {
        return this.d;
    }

    @Override
    public int a() {
        return 13061;
    }
}

