/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;
import java.util.List;

public class cBe
extends ps_0 {
    private List<fhe_0> a;

    public List<fhe_0> b() {
        return this.a;
    }

    @Override
    public boolean a(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.a = fhm.b(byteBuffer);
        return true;
    }

    @Override
    public int a() {
        return 15485;
    }
}

