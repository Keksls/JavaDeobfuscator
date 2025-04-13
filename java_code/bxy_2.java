/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from bxy
 */
public class bxy_2
implements ajh_1 {
    public static final String a = "furnitureCategoryList";
    private static final String[] b = new String[]{"furnitureCategoryList"};
    @NotNull
    private final List<bxx_2> d = new ArrayList<bxx_2>();

    public bxy_2() {
    }

    public bxy_2(List<bxx_2> list) {
        this.d.addAll(list);
    }

    @Override
    public String[] d() {
        return b;
    }

    @Override
    @Nullable
    public Object b(String string) {
        if (string.equals(a)) {
            return this.d;
        }
        return null;
    }

    @NotNull
    public List<bxx_2> a() {
        return this.d;
    }

    public void a(bxx_2 bxx_22) {
        this.d.add(bxx_22);
        fis_1.a().a((ajf_1)this, a);
    }
}

