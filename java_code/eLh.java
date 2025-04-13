/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Sets
 *  com.google.protobuf.InvalidProtocolBufferException
 *  org.apache.log4j.Logger
 */
import com.google.common.collect.Sets;
import com.google.protobuf.InvalidProtocolBufferException;
import java.nio.ByteBuffer;
import java.util.HashSet;
import java.util.Set;
import org.apache.log4j.Logger;

public class eLh
implements emy_0 {
    private final Set<hJ> a = new HashSet<hJ>();
    private static final Logger b = Logger.getLogger(eLh.class);

    @Override
    public void a(long l, ByteBuffer byteBuffer) {
        try {
            byte[] byArray = new byte[byteBuffer.getInt()];
            byteBuffer.get(byArray);
            hN hN2 = hN.a(byArray);
            this.a.clear();
            this.a.addAll(hN2.b());
        }
        catch (InvalidProtocolBufferException invalidProtocolBufferException) {
            b.error((Object)"[EMOTES] Failed to deserialize emotes account data. Keeping old value.", (Throwable)invalidProtocolBufferException);
        }
    }

    @Override
    public byte[] d() {
        abx_2 abx_22 = new abx_2();
        hN hN2 = hN.f().a(this.a).g();
        byte[] byArray = hN2.toByteArray();
        abx_22.a(byArray.length);
        abx_22.b(byArray);
        return abx_22.c();
    }

    @Override
    public end_0 e() {
        return end_0.j;
    }

    public Set<hJ> a() {
        return Sets.newHashSet(this.a);
    }

    public boolean a(int n) {
        if (this.c(n)) {
            return false;
        }
        return this.a.add(hJ.e().a(n).f());
    }

    public boolean b(int n) {
        return this.a.removeIf(hJ2 -> hJ2.c() == n);
    }

    public boolean c(int n) {
        return this.a.stream().anyMatch(hJ2 -> hJ2.c() == n);
    }
}

