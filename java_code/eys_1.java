/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

/*
 * Renamed from eYS
 */
public class eys_1
implements emy_0 {
    private List<eZb> a = new ArrayList<eZb>();

    @Override
    public byte[] d() {
        byte[] byArray = eyy_0.a(this.a);
        abx_2 abx_22 = new abx_2();
        abx_22.a(byArray.length);
        abx_22.b(byArray);
        return abx_22.c();
    }

    @Override
    public void a(long l, ByteBuffer byteBuffer) {
        int n = byteBuffer.getInt();
        byte[] byArray = new byte[n];
        byteBuffer.get(byArray);
        this.a = eyy_0.b(byArray);
    }

    @Override
    public end_0 e() {
        return end_0.d;
    }

    public void a(eZb eZb2) {
        this.a.add(eZb2);
    }

    public List<eZb> a() {
        return this.a;
    }
}

