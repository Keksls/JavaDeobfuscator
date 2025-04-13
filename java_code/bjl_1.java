/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
import java.util.List;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from bJL
 */
public class bjl_1<T extends bgy_0>
implements ajh_1 {
    public static final String a = "inventoryCategories";
    public static final String[] b = new String[]{"inventoryCategories"};
    private List<T> d;

    public bjl_1(List<T> list) {
        this.d = list;
    }

    @Override
    public String[] d() {
        return b;
    }

    @Override
    @Nullable
    public Object b(String string) {
        switch (string) {
            case "inventoryCategories": {
                return this.a();
            }
        }
        return null;
    }

    public List<T> a() {
        return this.d;
    }

    public boolean b() {
        return this.d == null || this.d.isEmpty();
    }

    public void a(List<T> list) {
        this.d = list;
        fis_1.a().a((ajf_1)this, a);
    }
}

