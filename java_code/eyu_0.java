/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;
import java.util.Collection;

/*
 * Renamed from eYU
 */
public class eyu_0
implements emy_0 {
    private eyv_0 a;

    @Override
    public byte[] d() {
        abx_2 abx_22 = new abx_2();
        Collection<eyt_0> collection = this.a.a();
        abx_22.a(collection.size());
        for (eyt_0 eyt_02 : collection) {
            byte[] byArray = eyy_0.a(eyt_02);
            abx_22.a(byArray.length);
            abx_22.a(eyt_02.c());
            abx_22.b(byArray);
        }
        return abx_22.c();
    }

    @Override
    public void a(long l, ByteBuffer byteBuffer) {
        this.a = new eyv_0();
        int n = byteBuffer.getInt();
        for (int k = 0; k < n; ++k) {
            byte[] byArray = new byte[byteBuffer.getInt()];
            long l2 = byteBuffer.getLong();
            byteBuffer.get(byArray);
            this.a.b(l2, eyy_0.a(l2, byArray));
        }
    }

    @Override
    public end_0 e() {
        return end_0.c;
    }

    public void a(eyv_0 eyv_02) {
        this.a = eyv_02;
    }

    public eyv_0 a() {
        return this.a;
    }
}

