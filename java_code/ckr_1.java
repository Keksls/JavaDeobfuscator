/*
 * Decompiled with CFR 0.152.
 */
import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicReference;

/*
 * Renamed from ckR
 */
public class ckr_1
extends ps_0 {
    private byte a;
    private final AtomicReference<cks_1> b = new AtomicReference();

    @Override
    public boolean a(byte[] byArray) {
        try {
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(byArray);
            try (DataInputStream dataInputStream = new DataInputStream(byteArrayInputStream);){
                this.a = dataInputStream.readByte();
                if (dataInputStream.readBoolean()) {
                    this.b.set(cks_1.a(dataInputStream));
                }
            }
            return true;
        }
        catch (IOException iOException) {
            throw new IllegalStateException("Decoding exception", iOException);
        }
    }

    @Override
    public int a() {
        return 542;
    }

    public byte b() {
        return this.a;
    }

    public long c() {
        return this.b.get().a();
    }

    public long d() {
        return this.b.get().b();
    }

    public xz_0 e() {
        return this.b.get().c();
    }

    public Optional<emn_0> f() {
        return this.b.get().d();
    }

    public oj_1 g() {
        return this.b.get().e();
    }

    public String h() {
        return this.b.get().f();
    }
}

