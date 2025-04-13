/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from bzr
 */
public class bzr_2
implements ajh_1,
bHp {
    public static final String a = "items";
    public static final String b = "isCollapsed";
    public static final String d = "categoryName";
    public static final String e = "categoryIcon";
    public static final String f = "size";
    private static final String[] g = new String[]{"items", "isCollapsed", "categoryName", "categoryIcon", "size"};
    @Nullable
    private final exh_2 h;
    private final String i;
    private final List<exk_2> j = new ArrayList<exk_2>();
    private boolean k;

    public bzr_2(String string) {
        this.h = null;
        this.i = string;
    }

    public bzr_2(exh_2 exh_22) {
        this.h = exh_22;
        this.i = bae.h().a(exh_22.B, new Object[0]);
    }

    @Override
    @Nullable
    public Object b(String string) {
        switch (string) {
            case "items": {
                return this.j;
            }
            case "isCollapsed": {
                return this.k;
            }
            case "categoryName": {
                return this.i;
            }
            case "categoryIcon": {
                if (this.h == null) {
                    return null;
                }
                return azs_0.a().a(this.h.b());
            }
            case "size": {
                return this.j.size();
            }
        }
        return null;
    }

    public void a(List<exk_2> list) {
        this.j.clear();
        this.j.addAll(list);
    }

    public void a(exk_2 exk_22) {
        this.j.add(exk_22);
    }

    public List<exk_2> b() {
        return Collections.unmodifiableList(this.j);
    }

    @Override
    public boolean a() {
        return this.k;
    }

    @Override
    public void a(boolean bl) {
        this.k = bl;
    }

    @Override
    public void ak_() {
        bHp.super.ak_();
        fis_1.a().a((ajf_1)this, b);
    }

    @Override
    public String[] d() {
        return g;
    }
}

