/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.commons.lang3.ArrayUtils
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
import java.util.ArrayList;
import java.util.List;
import org.apache.commons.lang3.ArrayUtils;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from bkv
 */
public class bkv_2
extends bzw_2 {
    public static final String a = "leftCategories";
    public static final String b = "rightCategories";
    public static final String d = "currentAptitudeSheet";
    public static final String e = "hasAnyPoints";
    private static final String[] f = (String[])ArrayUtils.addAll((Object[])bzw_2.q, (Object[])new String[]{"leftCategories", "rightCategories", "currentAptitudeSheet", "hasAnyPoints"});
    private static final String g = "aptitudes";
    @NotNull
    private bkq_2 h;
    private final List<bkw_2> i = new ArrayList<bkw_2>();

    public bkv_2(@NotNull bkq_2 bkq_22) {
        this.h = bkq_22;
        this.f();
    }

    @Override
    protected int a() {
        return 2;
    }

    @Override
    protected String b() {
        return g;
    }

    @Override
    @Nullable
    public Object b(String string) {
        switch (string) {
            case "leftCategories": {
                int n = this.i.size() / 2 + this.i.size() % 2;
                return this.i.subList(0, n);
            }
            case "rightCategories": {
                int n = this.i.size() / 2 + this.i.size() % 2;
                return this.i.subList(n, this.i.size());
            }
            case "currentAptitudeSheet": {
                return this.h;
            }
            case "hasAnyPoints": {
                return this.i.stream().anyMatch(bkw_2::b);
            }
        }
        return super.b(string);
    }

    private void f() {
        this.i.clear();
        ezi_2.a.a((ezw_2 ezw_22) -> {
            bkw_2 bkw_22 = new bkw_2((ezw_2)ezw_22, (ezx_2)this.h.a());
            this.i.add(bkw_22);
        });
        this.i.sort(bkw_2.i);
        fis_1.a().a((ajf_1)this, a, b, d, e);
    }

    public void a(bkq_2 bkq_22) {
        this.h = bkq_22;
        this.f();
    }

    public void c() {
        for (bkw_2 bkw_22 : this.i) {
            bkw_22.e();
        }
        fis_1.a().a((ajf_1)this, e);
    }

    public void e() {
        fis_1.a().a((ajf_1)this.h, "sheetCode");
        fis_1.a().a((ajf_1)this, e);
    }

    @Override
    public String[] d() {
        return f;
    }
}

