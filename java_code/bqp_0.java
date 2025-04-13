/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from bQP
 */
public class bqp_0
implements ajh_1 {
    public static final int a = 10001;
    public static final String b = "island";
    public static final String d = "links";
    private final fjD f;
    protected final List<bqs_0> e = new ArrayList<bqs_0>();

    public bqp_0(fjD fjD2) {
        this.f = fjD2;
    }

    public void a(bqs_0 bqs_02) {
        this.e.add(bqs_02);
        this.e.sort(bqr_0.a);
    }

    public int a() {
        return this.f.a();
    }

    public int b() {
        return this.f.b();
    }

    @Override
    public String[] d() {
        return null;
    }

    @Nullable
    public bqs_0 a(long l) {
        for (bqs_0 bqs_02 : this.e) {
            if (bqs_02.a() != l) continue;
            return bqs_02;
        }
        return null;
    }

    @Override
    public Object b(String string) {
        if (string.equals(b)) {
            return bae.h().a(151, (long)this.a(), new Object[0]);
        }
        if (string.equals(d)) {
            return this.c();
        }
        return null;
    }

    public List<bqs_0> c() {
        if (bqt_0.g == null || bqt_0.g.isEmpty()) {
            return this.e;
        }
        ArrayList<bqs_0> arrayList = new ArrayList<bqs_0>();
        String string = bae.h().a(151, (long)this.a(), new Object[0]).toLowerCase();
        String string2 = Cz.o(bqt_0.g);
        for (bqs_0 bqs_02 : this.e) {
            String string3 = Cz.o(bqs_02.b());
            if (!string3.contains(string2) && !Cz.o(string).contains(string2)) continue;
            arrayList.add(bqs_02);
        }
        return arrayList;
    }
}

