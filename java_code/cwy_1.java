/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from cwY
 */
public class cwy_1
extends ps_0 {
    private un_2 a;

    public un_2 b() {
        return this.a;
    }

    @Override
    public boolean a(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.a = new un_2();
        this.a.b(byteBuffer);
        return true;
    }

    @Override
    public int a() {
        return 12023;
    }
}

