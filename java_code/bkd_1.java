/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from bKd
 */
public class bkd_1
implements ajh_1 {
    private static final String a = "instance";
    private static final String b = "zones";
    private long d;
    private final List<Integer> e = new ArrayList<Integer>();
    private String f;

    @Override
    public String[] d() {
        return new String[]{a, b};
    }

    @Override
    @Nullable
    public Object b(String string) {
        if (string.equals(a)) {
            return this.f;
        }
        if (string.equals(b)) {
            return this.e.stream().flatMap(n -> afr.a().a((int)n).stream()).map(bke_1::new).collect(Collectors.toList());
        }
        return null;
    }

    bkd_1 a(long l) {
        this.d = l;
        this.f = bae.h().a(77, this.d, new Object[0]);
        return this;
    }

    bkd_1 a(int n) {
        this.e.add(n);
        return this;
    }

    public List<Integer> a() {
        return this.e;
    }

    String b() {
        return this.f;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object == null || this.getClass() != object.getClass()) {
            return false;
        }
        bkd_1 bkd_12 = (bkd_1)object;
        return this.d == bkd_12.d;
    }
}

