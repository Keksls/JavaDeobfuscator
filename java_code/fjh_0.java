/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.protobuf.InvalidProtocolBufferException
 *  org.apache.log4j.Logger
 */
import com.google.protobuf.InvalidProtocolBufferException;
import java.nio.ByteBuffer;
import java.util.HashSet;
import java.util.Set;
import org.apache.log4j.Logger;

/*
 * Renamed from fjH
 */
public class fjh_0
implements emy_0 {
    private static final Logger a = Logger.getLogger(fjh_0.class);
    private final Set<Integer> b = new HashSet<Integer>();
    private final Set<Integer> c = new HashSet<Integer>();

    @Override
    public void a(long l, ByteBuffer byteBuffer) {
        this.b.clear();
        this.c.clear();
        int n = byteBuffer.getInt();
        byte[] byArray = new byte[n];
        byteBuffer.get(byArray);
        try {
            ak_0 ak_02 = ak_0.a(byArray);
            this.b.addAll(ak_02.b());
            this.c.addAll(ak_02.d());
        }
        catch (InvalidProtocolBufferException invalidProtocolBufferException) {
            a.error((Object)("[TUTORIAL] Failed to parse tutorial account data for account " + l), (Throwable)invalidProtocolBufferException);
        }
    }

    @Override
    public byte[] d() {
        byte[] byArray = ak_0.g().a(this.b).b(this.c).h().toByteArray();
        abx_2 abx_22 = new abx_2(4 + byArray.length);
        abx_22.a(byArray.length);
        abx_22.b(byArray);
        return abx_22.c();
    }

    @Override
    public end_0 e() {
        return end_0.m;
    }

    public Set<Integer> a() {
        return this.b;
    }

    public Set<Integer> b() {
        return this.c;
    }
}

