/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from cyF
 */
public class cyf_1
extends ps_0 {
    private Ae a;

    @Override
    public boolean a(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.a = Ae.a(byteBuffer);
        return true;
    }

    @Override
    public int a() {
        return 13996;
    }

    public Ae b() {
        return this.a;
    }
}

