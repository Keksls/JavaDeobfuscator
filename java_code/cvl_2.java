/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from cvL
 */
public class cvl_2
extends ps_0 {
    private fhy a;
    private oE b;

    @Override
    public boolean a(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.a = fhy.a(byteBuffer.get());
        if (this.a.b()) {
            return true;
        }
        byte[] byArray2 = new byte[byteBuffer.remaining()];
        byteBuffer.get(byArray2);
        this.b = oE.a(byArray2);
        return true;
    }

    @Override
    public int a() {
        return 13102;
    }

    public fhy b() {
        return this.a;
    }

    public oE c() {
        return this.b;
    }
}

