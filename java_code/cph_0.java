/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from cph
 */
public class cph_0
extends cpf_0 {
    private int a;

    @Override
    protected void a(ByteBuffer byteBuffer) {
        this.a = byteBuffer.getInt();
    }

    @Override
    public int a() {
        return 13893;
    }

    public int b() {
        return this.a;
    }
}

