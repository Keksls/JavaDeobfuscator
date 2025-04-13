/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.protobuf.InvalidProtocolBufferException
 */
import com.google.protobuf.InvalidProtocolBufferException;
import java.nio.ByteBuffer;

/*
 * Renamed from csB
 */
public class csb_0
extends ps_0 {
    private long a;
    private gj_2 b;

    @Override
    public boolean a(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.a = byteBuffer.getLong();
        byte[] byArray2 = new byte[byteBuffer.getInt()];
        byteBuffer.get(byArray2);
        try {
            this.b = gj_2.a(byArray2);
            return true;
        }
        catch (InvalidProtocolBufferException invalidProtocolBufferException) {
            A.error((Object)"Error unserializing secureCraft informations", (Throwable)invalidProtocolBufferException);
            return false;
        }
    }

    @Override
    public int a() {
        return 12101;
    }

    public long b() {
        return this.a;
    }

    public gj_2 c() {
        return this.b;
    }
}

