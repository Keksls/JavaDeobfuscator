/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.HashBasedTable
 *  com.google.common.collect.Table
 *  org.apache.log4j.Logger
 */
import com.google.common.collect.HashBasedTable;
import com.google.common.collect.Table;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;
import org.apache.log4j.Logger;

/*
 * Renamed from ena
 */
public final class ena_0 {
    private static final Logger a = Logger.getLogger(ena_0.class);
    private static final ena_0 b = new ena_0(emz_0.a);
    private emz_0 c;
    private final Table<Long, end_0, emy_0> d = HashBasedTable.create();
    private final Collection<enb_0> e = new ArrayList<enb_0>();

    public static ena_0 a() {
        return b;
    }

    protected ena_0(emz_0 emz_02) {
        this.c = emz_02;
    }

    public Optional<emy_0> a(long l, end_0 end_02) {
        emy_0 emy_02 = (emy_0)this.d.get((Object)l, (Object)end_02);
        return Optional.ofNullable(emy_02);
    }

    public <T extends emy_0> Optional<T> b(long l, end_0 end_02) {
        return this.a(l, end_02).map(emy_02 -> emy_02);
    }

    public Map<end_0, emy_0> a(long l) {
        return this.d.row((Object)l);
    }

    public Map<Long, emy_0> a(end_0 end_02) {
        return this.d.column((Object)end_02);
    }

    public void a(long l, emy_0 ... emy_0Array) {
        for (emy_0 emy_02 : emy_0Array) {
            emy_0 emy_03 = (emy_0)this.d.get((Object)l, (Object)emy_02.e());
            if (emy_03 != null) {
                emy_03.g();
            }
            this.d.put((Object)l, (Object)emy_02.e(), (Object)emy_02);
            this.a(l, emy_02);
        }
    }

    public void a(long l, end_0 ... end_0Array) {
        for (end_0 end_02 : end_0Array) {
            this.a(l, (emy_0)this.d.get((Object)l, (Object)end_02));
        }
    }

    public byte[] a(long l, enc_0 enc_02) {
        Set<end_0> set = enc_02.a();
        List<emy_0> list = this.a(l, set);
        return ena_0.a(list);
    }

    public static byte[] a(emy_0 emy_02) {
        return ena_0.a(Collections.singleton(emy_02));
    }

    private static byte[] a(Collection<emy_0> collection) {
        abx_2 abx_22 = new abx_2();
        abx_22.a(collection.size());
        for (emy_0 emy_02 : collection) {
            abx_22.a(emy_02.e().ordinal());
            abx_22.b(emy_02.d());
        }
        return abx_22.c();
    }

    private List<emy_0> a(long l, Iterable<end_0> iterable) {
        return StreamSupport.stream(iterable.spliterator(), false).map(end_02 -> {
            Optional<emy_0> optional = this.a(l, (end_0)((Object)end_02));
            return optional.orElse(null);
        }).filter(Objects::nonNull).collect(Collectors.toList());
    }

    public void a(long l, byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        int n = byteBuffer.getInt();
        for (int k = 0; k < n; ++k) {
            end_0 end_02 = end_0.values()[byteBuffer.getInt()];
            emy_0 emy_02 = end_02.a();
            if (emy_02 == null) continue;
            try {
                emy_02.a(l, byteBuffer);
            }
            catch (RuntimeException runtimeException) {
                a.error((Object)("Error while unserializing GameAccountData of type " + end_02 + " for account " + l), (Throwable)runtimeException);
            }
            this.a(l, new emy_0[]{emy_02});
        }
    }

    public boolean a(enb_0 enb_02) {
        if (this.e.contains(enb_02)) {
            return false;
        }
        return this.e.add(enb_02);
    }

    public boolean b(enb_0 enb_02) {
        return this.e.remove(enb_02);
    }

    private void a(long l, emy_0 emy_02) {
        for (enb_0 enb_02 : this.e) {
            try {
                enb_02.a(l, emy_02);
            }
            catch (Exception exception) {
                a.error((Object)String.format("Exception thrown during onDataSet invocation for following listener class %s and following account %s", enb_02.getClass(), l), (Throwable)exception);
            }
        }
    }

    public void c(long l, end_0 end_02) {
        a.info((Object)("Cleaning type " + end_02 + " for account " + l));
        emy_0 emy_02 = (emy_0)this.d.remove((Object)l, (Object)end_02);
        if (emy_02 != null) {
            emy_02.g();
        }
    }

    public void b(long l) {
        a.info((Object)("Cleaning GameAccountData for " + l));
        for (end_0 end_02 : end_0.values()) {
            emy_0 emy_02;
            if (!end_02.b() || (emy_02 = (emy_0)this.d.remove((Object)l, (Object)end_02)) == null) continue;
            emy_02.g();
        }
    }

    public void b() {
        HashMap<Long, Map> hashMap = new HashMap<Long, Map>();
        this.d.rowMap().forEach((l, map2) -> {
            if (ena_0.a(map2)) {
                return;
            }
            hashMap.put((Long)l, (Map)map2);
        });
        hashMap.forEach(this::a);
    }

    private static boolean a(Map<end_0, emy_0> map) {
        return map.entrySet().stream().anyMatch(entry -> ((end_0)((Object)((Object)entry.getKey()))).b());
    }

    private void a(Long l, Map<end_0, emy_0> map) {
        HashSet hashSet = new HashSet();
        map.forEach((end_02, emy_02) -> {
            if (end_02 == end_0.f && emy_02.f()) {
                hashSet.add(end_02);
            }
        });
        hashSet.forEach(end_02 -> {
            emy_0 emy_02 = (emy_0)this.d.remove((Object)l, (Object)end_02);
            if (emy_02 != null) {
                emy_02.g();
            }
        });
    }

    public int c() {
        return this.d.rowMap().size();
    }

    public String toString() {
        return "GameAccountManager{m_data size =" + this.d.size() + "}";
    }

    public emz_0 d() {
        return this.c;
    }

    public void a(emz_0 emz_02) {
        this.c = emz_02;
    }
}

