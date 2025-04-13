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
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import org.apache.log4j.Logger;

public class ffd
implements emy_0 {
    private final Set<jG> a = new HashSet<jG>();
    private static final Logger b = Logger.getLogger(ffd.class);

    public boolean a(int n) {
        if (this.a.stream().anyMatch(jG2 -> jG2.c() == n)) {
            return false;
        }
        jG jG3 = jG.e().a(n).f();
        return this.a.add(jG3);
    }

    public boolean b(int n) {
        return this.a.removeIf(jG2 -> jG2.c() == n);
    }

    public boolean c(int n) {
        return this.a.stream().anyMatch(jG2 -> jG2.c() == n);
    }

    public List<Integer> a() {
        return this.a.stream().map(jG::c).collect(Collectors.toList());
    }

    @Override
    public void a(long l, ByteBuffer byteBuffer) {
        try {
            byte[] byArray = new byte[byteBuffer.getInt()];
            byteBuffer.get(byArray);
            jJ jJ2 = jJ.a(byArray);
            this.a.clear();
            this.a.addAll(jJ2.b());
        }
        catch (InvalidProtocolBufferException invalidProtocolBufferException) {
            b.error((Object)"[EMOTES] Failed to deserialize emotes account data. Keeping old value.", (Throwable)invalidProtocolBufferException);
        }
    }

    @Override
    public byte[] d() {
        abx_2 abx_22 = new abx_2();
        jJ jJ2 = jJ.f().a(this.a).g();
        byte[] byArray = jJ2.toByteArray();
        abx_22.a(byArray.length);
        abx_22.b(byArray);
        return abx_22.c();
    }

    public void b() {
        this.a.clear();
    }

    @Override
    public end_0 e() {
        return end_0.k;
    }
}

