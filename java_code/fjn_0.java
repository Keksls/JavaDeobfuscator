/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.protobuf.InvalidProtocolBufferException
 *  org.apache.log4j.Logger
 */
import com.google.protobuf.InvalidProtocolBufferException;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import org.apache.log4j.Logger;

/*
 * Renamed from fjn
 */
public class fjn_0
implements emy_0 {
    private static final Logger a = Logger.getLogger(fjn_0.class);
    private final Set<Integer> b = new HashSet<Integer>();
    private final Set<Integer> c = new HashSet<Integer>();

    public Set<Integer> a(ay_0 ay_02) {
        switch (ay_02) {
            case a: {
                return this.c;
            }
            case b: {
                return this.b;
            }
        }
        return Collections.emptySet();
    }

    @Override
    public void a(long l, ByteBuffer byteBuffer) {
        this.b.clear();
        this.c.clear();
        int n = byteBuffer.getInt();
        byte[] byArray = new byte[n];
        byteBuffer.get(byArray);
        try {
            aa_0 aa_02 = aa_0.a(byArray);
            aa_02.b().forEach(this::a);
        }
        catch (InvalidProtocolBufferException invalidProtocolBufferException) {
            a.error((Object)("[TRANSPORT] Failed to parse transports for account " + l));
        }
    }

    @Override
    public byte[] d() {
        ae_0 ae_02 = ae_0.g().a(ay_0.a).a(this.c).h();
        ae_0 ae_03 = ae_0.g().a(ay_0.b).a(this.b).h();
        aa_0 aa_02 = aa_0.f().a(ae_03).a(ae_02).g();
        byte[] byArray = aa_02.toByteArray();
        abx_2 abx_22 = new abx_2(4 + byArray.length);
        abx_22.a(byArray.length);
        abx_22.b(byArray);
        return abx_22.c();
    }

    public void a(ae_0 ae_02) {
        switch (ae_02.c()) {
            case a: {
                this.c.addAll(ae_02.d());
                break;
            }
            case b: {
                this.b.addAll(ae_02.d());
                break;
            }
            default: {
                a.info((Object)("[TRANSPORT] Unknown travel type " + ae_02.c()));
            }
        }
    }

    @Override
    public end_0 e() {
        return end_0.l;
    }

    public Set<Integer> a() {
        return this.b;
    }

    public Set<Integer> b() {
        return this.c;
    }
}

