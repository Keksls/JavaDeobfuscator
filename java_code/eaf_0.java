/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Ordering
 *  org.apache.log4j.Logger
 */
import com.google.common.collect.Ordering;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import org.apache.log4j.Logger;

/*
 * Renamed from eAf
 */
public class eaf_0
implements emy_0 {
    private static final Logger e = Logger.getLogger(eaf_0.class);
    public static final int a = 50;
    public static final String b = "newPlayer_32";
    public static final String c = "newPlayer_41";
    public static final String d = "newPlayer_64";
    private final HashMap<Long, Short> f = new HashMap();

    @Override
    public void a(long l, ByteBuffer byteBuffer) {
        int n = byteBuffer.getInt();
        for (int k = 0; k < n; ++k) {
            this.f.put(byteBuffer.getLong(), byteBuffer.getShort());
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public byte[] d() {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try (DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);){
                dataOutputStream.writeInt(this.f.size());
                for (Map.Entry<Long, Short> entry : this.f.entrySet()) {
                    dataOutputStream.writeLong(entry.getKey());
                    dataOutputStream.writeShort(entry.getValue().shortValue());
                }
            }
            return byteArrayOutputStream.toByteArray();
        }
        catch (IOException iOException) {
            e.error((Object)"Serialization exception", (Throwable)iOException);
            return new byte[]{0, 0, 0, 0};
        }
    }

    public long a(long l) {
        return this.f.get(l).shortValue();
    }

    public void a(long l, short s2) {
        this.f.put(l, s2);
    }

    public void b(long l, short s2) {
        this.f.put(l, (short)(this.f.get(l) + s2));
    }

    public Optional<Short> a() {
        return this.f.isEmpty() ? Optional.empty() : Optional.of((Short)Ordering.natural().max(this.f.values()));
    }

    public Collection<Short> b() {
        return this.f.values();
    }

    @Override
    public end_0 e() {
        return end_0.a;
    }
}

