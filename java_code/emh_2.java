/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;
import java.time.Duration;
import java.time.Instant;

/*
 * Renamed from eMh
 */
public class emh_2
implements emy_0 {
    private long a;
    private long b;
    private int c;

    @Override
    public byte[] d() {
        abx_2 abx_22 = new abx_2();
        abx_22.a(this.a);
        abx_22.a(this.b);
        abx_22.a(this.c);
        return abx_22.c();
    }

    @Override
    public void a(long l, ByteBuffer byteBuffer) {
        this.a = byteBuffer.getLong();
        this.b = byteBuffer.getLong();
        this.c = byteBuffer.getInt();
    }

    public boolean a() {
        return this.c > enp_2.a.b(ens_2.bF);
    }

    public void b() {
        if (Instant.now().isAfter(Instant.ofEpochMilli(this.a).plus(Duration.ofDays(1L)))) {
            this.c = 0;
            this.a = Instant.now().toEpochMilli();
        }
        ++this.c;
        this.b = Instant.now().toEpochMilli();
    }

    @Override
    public boolean f() {
        return Instant.now().isAfter(Instant.ofEpochMilli(this.b).plus(Duration.ofDays(1L)));
    }

    @Override
    public end_0 e() {
        return end_0.f;
    }
}

