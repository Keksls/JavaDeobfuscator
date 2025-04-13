/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

public class fhs
extends fhx {
    private short a;

    public fhs(ByteBuffer byteBuffer) {
        this.a(byteBuffer);
    }

    public fhs(int n, int n2, short s2) {
        super(n, n2);
        this.a = s2;
    }

    public short b() {
        return this.a;
    }

    @Override
    void a(abx_2 abx_22) {
        super.a(abx_22);
        abx_22.a(this.a);
    }

    @Override
    final void a(ByteBuffer byteBuffer) {
        super.a(byteBuffer);
        this.a = byteBuffer.getShort();
    }

    @Override
    public fhu a() {
        return fhu.b;
    }

    public String toString() {
        return "EntriesByBreed{m_breedId=" + this.a + "}";
    }
}

