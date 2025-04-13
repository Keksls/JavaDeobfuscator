/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.procedure.TByteFloatProcedure
 */
import gnu.trove.procedure.TByteFloatProcedure;
import java.nio.ByteBuffer;

/*
 * Renamed from cqq
 */
class cqq_0
implements TByteFloatProcedure {
    final /* synthetic */ ByteBuffer a;
    final /* synthetic */ cqp_0 b;

    cqq_0(cqp_0 cqp_02, ByteBuffer byteBuffer) {
        this.b = cqp_02;
        this.a = byteBuffer;
    }

    public boolean execute(byte by, float f2) {
        this.a.put(by);
        this.a.putFloat(f2);
        return true;
    }
}

