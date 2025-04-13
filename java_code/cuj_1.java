/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from cuJ
 */
public class cuj_1
extends ps_0 {
    private esz_2 a;

    @Override
    public boolean a(byte ... byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.a = esz_2.a(byteBuffer.get());
        return true;
    }

    public esz_2 b() {
        return this.a;
    }

    @Override
    public int a() {
        return 14831;
    }
}

