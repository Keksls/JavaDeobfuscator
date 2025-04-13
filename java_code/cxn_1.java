/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from cxn
 */
public class cxn_1
extends ps_0 {
    private zs_1 a;

    public zs_1 b() {
        return this.a;
    }

    @Override
    public boolean a(byte[] byArray) {
        this.a = new zs_1();
        return this.a.b(ByteBuffer.wrap(byArray));
    }

    @Override
    public int a() {
        return 12751;
    }
}

