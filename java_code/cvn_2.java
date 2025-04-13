/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from cvN
 */
public class cvn_2
extends ps_0 {
    private fhy a;
    private oM b;

    @Override
    public boolean a(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.a = fhy.a(byteBuffer.get());
        if (this.a.b()) {
            return true;
        }
        byte[] byArray2 = new byte[byteBuffer.remaining()];
        byteBuffer.get(byArray2);
        this.b = oM.a(byArray2);
        return true;
    }

    @Override
    public int a() {
        return 12568;
    }

    public oM b() {
        return this.b;
    }

    public fhy c() {
        return this.a;
    }
}

