/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.map.hash.TByteFloatHashMap
 *  gnu.trove.procedure.TByteFloatProcedure
 */
import gnu.trove.map.hash.TByteFloatHashMap;
import gnu.trove.procedure.TByteFloatProcedure;
import java.nio.ByteBuffer;

/*
 * Renamed from cqp
 */
public class cqp_0
extends Pw {
    private int a;
    private final TByteFloatHashMap b = new TByteFloatHashMap();

    public void b(int n) {
        this.a = n;
    }

    public void a(fja_0 fja_02) {
        this.b.put(fja_02.b().b, fja_02.a());
    }

    @Override
    public byte[] b() {
        ByteBuffer byteBuffer = ByteBuffer.allocate(6 + 5 * this.b.size());
        byteBuffer.putInt(this.a);
        byteBuffer.putShort((short)this.b.size());
        this.b.forEachEntry((TByteFloatProcedure)new cqq_0(this, byteBuffer));
        return this.a((byte)3, byteBuffer.array());
    }

    @Override
    public int a() {
        return 13995;
    }
}

