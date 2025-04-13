/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from bHc
 */
public class bhc_1
implements ajh_1 {
    private static final bhc_1 d = new bhc_1();
    public static final String a = "allItems";
    public static final String b = "filteredItems";
    private final List<bjw_1> e = new ArrayList<bjw_1>();
    private boolean f = true;

    public static bhc_1 a() {
        return d;
    }

    private bhc_1() {
    }

    @NotNull
    private static Map<String, bjw_1> c() {
        return bhb_0.d().b();
    }

    public void b() {
        if (!this.f) {
            return;
        }
        this.f = false;
        this.e.clear();
        this.e.addAll(bhc_1.c().values());
        this.e();
    }

    public void a(@Nullable String string) {
        if (string == null || string.isEmpty()) {
            this.b();
            return;
        }
        String string2 = Cz.e(string);
        this.a((Map.Entry<String, bjw_1> entry) -> ((String)entry.getKey()).contains(string2));
    }

    public void a(bhd_0 bhd_02) {
        this.e.clear();
        Map<String, bjw_1> map = bhc_1.c();
        for (Map.Entry<String, bjw_1> entry : map.entrySet()) {
            if (!bhd_02.accept(entry)) continue;
            this.e.add(entry.getValue());
        }
        this.f = this.e.size() != map.size();
        this.e();
    }

    private void e() {
        fis_1.a().a((ajf_1)this, b);
    }

    @Override
    @Nullable
    public Object b(String string) {
        if (a.equals(string)) {
            return bhc_1.c();
        }
        if (b.equals(string)) {
            return this.e;
        }
        return null;
    }

    @Override
    public String[] d() {
        return new String[]{a, b};
    }
}

