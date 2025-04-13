/*
 * Decompiled with CFR 0.152.
 */
import java.io.DataOutputStream;
import java.io.OutputStream;

/*
 * Renamed from asl
 */
final class asl_1
extends DataOutputStream {
    private final asm_2 a = new asm_2(null);

    asl_1() {
        super(null);
        this.out = this.a;
    }

    public final void a(OutputStream outputStream) {
        this.a.a(outputStream);
        this.written = 0;
    }

    @Override
    public void close() {
        this.a.close();
    }
}

