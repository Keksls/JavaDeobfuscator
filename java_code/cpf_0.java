/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from cpf
 */
public abstract class cpf_0
extends ps_0 {
    private faG a;

    protected void a(ByteBuffer byteBuffer) {
    }

    @Override
    public final boolean a(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.a = faG.a(byteBuffer.get());
        if (this.a.b()) {
            this.a(byteBuffer);
        }
        return false;
    }

    public faG g() {
        return this.a;
    }

    public int h() {
        return 11000 + this.a.a();
    }
}

