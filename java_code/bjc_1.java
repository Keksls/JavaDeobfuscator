/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.EnumMap;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from bJC
 */
public abstract class bjc_1
implements ajh_1 {
    public static final String a = "newItems";
    public static final String[] b = new String[]{"newItems"};
    private static final bja_1[] d = new bja_1[4];
    private final Map<exh_2, bja_1> e = new EnumMap<exh_2, bja_1>(exh_2.class);
    private final List<bja_1> f = new ArrayList<bja_1>();

    public abstract boolean a(long var1);

    void a() {
        this.f.clear();
        this.f.add(this.e.get(exh_2.a));
        Collections.addAll(this.f, d);
        this.f.add(this.e.get(exh_2.n));
        this.f.add(this.e.get(exh_2.e));
        Collections.addAll(this.f, d);
        this.f.add(this.e.get(exh_2.d));
        this.f.add(this.e.get(exh_2.f));
        Collections.addAll(this.f, d);
        this.f.add(this.e.get(exh_2.k));
        this.f.add(this.e.get(exh_2.h));
        Collections.addAll(this.f, d);
        this.f.add(this.e.get(exh_2.i));
        this.f.add(this.e.get(exh_2.m));
        this.f.add(this.e.get(exh_2.q));
        this.f.add(this.e.get(exh_2.p));
        this.f.add(this.e.get(exh_2.r));
        this.f.add(this.e.get(exh_2.y));
        this.f.add(this.e.get(exh_2.w));
    }

    @Override
    @Nullable
    public Object b(String string) {
        switch (string) {
            case "newItems": {
                return this.f;
            }
        }
        return null;
    }

    @Override
    public String[] d() {
        return b;
    }

    protected void a(exh_2 exh_22, bja_1 bja_12) {
        this.e.put(exh_22, bja_12);
    }

    public bja_1 a(exh_2 exh_22) {
        return this.e.get(exh_22);
    }

    public Map<exh_2, bja_1> b() {
        return this.e;
    }

    public void c() {
    }
}

