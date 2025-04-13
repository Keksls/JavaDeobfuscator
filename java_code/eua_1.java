/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.HashBasedTable
 *  com.google.common.collect.Table
 */
import com.google.common.collect.HashBasedTable;
import com.google.common.collect.Table;
import java.util.Optional;

/*
 * Renamed from eUA
 */
public final class eua_1 {
    public static final eua_1 a = new eua_1();
    private final Table<Integer, Short, abe_2> b = HashBasedTable.create();

    public void a(int n, short s2, int n2, short s3) {
        this.b.put((Object)n, (Object)s2, (Object)new abe_2(n2, s3));
    }

    public Optional<abe_2> a(int n, short s2) {
        return Optional.ofNullable((abe_2)this.b.get((Object)n, (Object)s2));
    }
}

