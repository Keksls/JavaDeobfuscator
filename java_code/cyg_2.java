/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from cyG
 */
public class cyg_2
extends ps_0 {
    private zj_1 a;

    @Override
    public boolean a(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.a = new zj_1();
        this.a.b(byteBuffer);
        return true;
    }

    @Override
    public int a() {
        return 13199;
    }

    public zj_1 b() {
        return this.a;
    }
}

