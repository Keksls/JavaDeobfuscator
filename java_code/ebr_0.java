/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.protobuf.InvalidProtocolBufferException
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.NotNull
 */
import com.google.protobuf.InvalidProtocolBufferException;
import java.nio.ByteBuffer;
import org.apache.log4j.Logger;
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from eBR
 */
public class ebr_0
implements emy_0 {
    private static final Logger a = Logger.getLogger(ebr_0.class);
    @NotNull
    private final ece_0 b = new ebu_0();

    public ebr_0() {
    }

    public ebr_0(@NotNull ece_0 ece_02) {
        this.b.a(ece_02.g(), false);
    }

    @Override
    public void a(long l, ByteBuffer byteBuffer) {
        int n = byteBuffer.getInt();
        byte[] byArray = new byte[n];
        byteBuffer.get(byArray);
        try {
            this.b.a(dc_1.a(byArray), false);
        }
        catch (InvalidProtocolBufferException invalidProtocolBufferException) {
            a.error((Object)"[CRAFT] Failed to deserialize craft account data. Keeping old value.", (Throwable)invalidProtocolBufferException);
        }
    }

    @Override
    public byte[] d() {
        dc_1 dc_12 = this.b.g();
        byte[] byArray = dc_12.toByteArray();
        abx_2 abx_22 = new abx_2(4 + byArray.length);
        abx_22.a(byArray.length);
        abx_22.b(byArray);
        return abx_22.c();
    }

    @Override
    public end_0 e() {
        return end_0.n;
    }

    @NotNull
    public ece_0 a() {
        return this.b;
    }
}

