/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from cuA
 */
public class cua_1
extends ps_0 {
    private esl_1 a;
    private esz_1 b;

    @Override
    public boolean a(byte ... byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.b = esz_1.a(byteBuffer.getInt());
        this.a = esw_2.a(byteBuffer);
        return true;
    }

    public esl_1 b() {
        return this.a;
    }

    public esz_1 c() {
        return this.b;
    }

    @Override
    public int a() {
        return 13254;
    }
}

