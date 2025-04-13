/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Strings
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
import com.google.common.base.Strings;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from bJw
 */
public class bjw_2
extends bgz_0
implements Comparable<bjw_2> {
    public static final String w = "selectedItem";
    public static final String x = "listFilter";
    public static final String y = "categoryStyle";
    public static final String z = "cosmetic";
    public static final String A = String.format("%s.%s", "collapsedView", "cosmetic");
    private final ft_1 C;
    private final List<bjx_2> D = new abq_2<bjx_2>(bjx_2::a);
    protected fwl B = new fwl();
    private String E;

    public bjw_2(ft_1 ft_12) {
        this.C = ft_12;
        this.i();
        this.l();
        this.D.addAll(bol_1.a(this.C).stream().map(n -> new bjx_2(ft_12, (int)n)).filter(bjx_22 -> bjx_22.a() != null).collect(Collectors.toList()));
    }

    public void a(Collection<Integer> collection) {
        for (bjx_2 bjx_22 : this.D) {
            if (bjx_22.b()) {
                if (collection.contains(bjx_22.c())) continue;
                bjx_22.a(false);
                fis_1.a().a((ajf_1)bjx_22, "isActive", "backgroundStyle");
                continue;
            }
            if (!collection.contains(bjx_22.c())) continue;
            bjx_22.a(true);
            fis_1.a().a((ajf_1)bjx_22, "isActive", "backgroundStyle");
        }
    }

    public ft_1 o() {
        return this.C;
    }

    @Override
    public String[] d() {
        return b_;
    }

    @Override
    @Nullable
    public Object b(String string) {
        switch (string) {
            case "bagInventory": {
                return this.p();
            }
            case "bagSize": {
                return this.p().size();
            }
            case "bagNameSize": 
            case "bagName": {
                return bol_1.e(this.C);
            }
            case "canBeSorted": {
                return false;
            }
            case "collapsingIgnoreSize": {
                return false;
            }
            case "bagPosition": {
                return bol_1.d(this.C);
            }
            case "categoryStyle": {
                return bol_1.c(this.C);
            }
            case "listFilter": {
                return this.B;
            }
            case "collapsible": {
                return true;
            }
        }
        return super.b(string);
    }

    public void a(String string) {
        this.E = string;
    }

    private List<bjx_2> p() {
        if (Strings.isNullOrEmpty((String)this.E)) {
            return Collections.unmodifiableList(this.D);
        }
        return this.D.stream().filter(bjx_22 -> bjx_22.a() != null).filter(bjx_22 -> Cz.o(bjx_22.a().e()).contains(this.E) || bjx_22.b()).collect(Collectors.toList());
    }

    public int a(@NotNull bjw_2 bjw_22) {
        return bol_1.d(this.o()) - bol_1.d(bjw_22.o());
    }

    @Override
    protected ags_0 b() {
        return ags_0.b;
    }

    @Override
    protected String e() {
        return String.format("%s.%s", A, this.C.getNumber());
    }

    @Override
    public /* synthetic */ int compareTo(@NotNull Object object) {
        return this.a((bjw_2)object);
    }
}

