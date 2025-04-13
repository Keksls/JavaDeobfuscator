/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;
import java.util.EnumMap;
import java.util.Map;
import java.util.Set;

/*
 * Renamed from emr
 */
public class emr_0 {
    private final EnumMap<emt_0, ems_0> a;

    public emr_0() {
        this.a = new EnumMap(emt_0.class);
    }

    public emr_0(emr_0 emr_02) {
        this.a = new EnumMap<emt_0, ems_0>(emr_02.a);
    }

    public void a(ems_0 ems_02) {
        this.a.put(ems_02.a(), ems_02);
    }

    public boolean a(emt_0 emt_02) {
        return this.a.containsKey((Object)emt_02);
    }

    public ems_0 b(emt_0 emt_02) {
        return this.a.get((Object)emt_02);
    }

    public int a() {
        return 2 + this.a.size() * ems_0.c();
    }

    public void a(ByteBuffer byteBuffer) {
        byteBuffer.putShort((short)this.a.size());
        for (Map.Entry<emt_0, ems_0> entry : this.a.entrySet()) {
            byteBuffer.put(entry.getKey().a());
            byteBuffer.putLong(entry.getValue().b());
        }
    }

    public void b(ByteBuffer byteBuffer) {
        int n = byteBuffer.getShort();
        for (int k = 0; k < n; ++k) {
            byte by = byteBuffer.get();
            long l = byteBuffer.getLong();
            emt_0 emt_02 = emt_0.a(by);
            if (emt_02 == null) continue;
            this.a.put(emt_02, new ems_0(emt_02, l));
        }
    }

    public Set<Map.Entry<emt_0, ems_0>> b() {
        return this.a.entrySet();
    }

    public void c() {
        this.a.clear();
    }
}

