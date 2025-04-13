/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from cul
 */
public class cul_1
extends ps_0 {
    private int a;
    private eos_1 b;

    @Override
    public boolean a(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.a = byteBuffer.getInt();
        this.b = eos_1.a(byteBuffer.get());
        return true;
    }

    public int b() {
        return this.a;
    }

    public eos_1 c() {
        return this.b;
    }

    @Override
    public int a() {
        return 12937;
    }
}

