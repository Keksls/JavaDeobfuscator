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
 * Renamed from apZ
 */
public final class apz_2 {
    private static final Table<Integer, Integer, int[]> a = HashBasedTable.create();

    private apz_2() {
    }

    public static int[] a(int n, int n2) {
        return Optional.ofNullable((int[])a.get((Object)n, (Object)n2)).orElseGet(() -> {
            int[] nArray = new int[]{n, n2};
            a.put((Object)n, (Object)n2, (Object)nArray);
            return nArray;
        });
    }
}

