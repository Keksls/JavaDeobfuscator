/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.protobuf.InvalidProtocolBufferException
 *  org.apache.log4j.Logger
 */
import com.google.protobuf.InvalidProtocolBufferException;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import org.apache.log4j.Logger;

/*
 * Renamed from eVM
 */
public class evm_2
implements emy_0 {
    private static final Logger a = Logger.getLogger(evm_2.class);
    private Map<Integer, Integer> b = new HashMap<Integer, Integer>();

    public int a(int n) {
        return this.b.getOrDefault(n, 0);
    }

    public int a(int n, int n2) {
        this.b.merge(n, n2, Integer::sum);
        int n3 = this.a(n);
        if (n3 <= 0) {
            this.b.remove(n);
        }
        return Math.max(0, n3);
    }

    @Override
    public void a(long l, ByteBuffer byteBuffer) {
        int n = byteBuffer.getInt();
        byte[] byArray = new byte[n];
        byteBuffer.get(byArray);
        try {
            df_1 df_12 = df_1.a(byArray);
            this.b.clear();
            df_12.b().forEach(dj_22 -> this.b.put(dj_22.c(), dj_22.e()));
        }
        catch (InvalidProtocolBufferException invalidProtocolBufferException) {
            a.error((Object)("[ACCOUNT_INVENTORY] Failed to deserialize account inventory for account " + l), (Throwable)invalidProtocolBufferException);
            this.b.clear();
        }
    }

    @Override
    public byte[] d() {
        dl_2 dl_22 = dj_2.g();
        List list = this.b.entrySet().stream().map(entry -> dl_22.a((Integer)entry.getKey()).b((Integer)entry.getValue()).h()).collect(Collectors.toList());
        df_1 df_12 = df_1.f().a(list).g();
        byte[] byArray = df_12.toByteArray();
        abx_2 abx_22 = new abx_2(4 + byArray.length);
        abx_22.a(byArray.length);
        abx_22.b(byArray);
        return abx_22.c();
    }

    @Override
    public end_0 e() {
        return end_0.e;
    }

    public Map<Integer, Integer> a() {
        return this.b;
    }

    public void a(Map<Integer, Integer> map) {
        this.b = map;
    }
}

