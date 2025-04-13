/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  org.apache.commons.lang3.StringUtils
 */
import com.ankama.wakfu.utils.criterion.doc.Criterion;
import com.google.common.collect.Lists;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import org.apache.commons.lang3.StringUtils;

/*
 * Renamed from aoT
 */
public abstract class aot_2 {
    private static final aou_1 a = new aou_1();
    private boolean b = true;
    private String c;

    public boolean g() {
        return this.b;
    }

    public void a(boolean bl) {
        this.b = bl;
    }

    public String h() {
        return this.c;
    }

    public void a(String string) {
        this.c = StringUtils.substring((String)string, (int)1, (int)(string.length() - 1));
    }

    protected List<aov_1[]> i() {
        return Lists.newArrayList();
    }

    public byte a(List<aot_2> list) {
        List<aov_1[]> list2 = Optional.ofNullable(this.getClass().getAnnotation(Criterion.class)).map(a::a).orElse(this.i());
        if (list == null) {
            return -1;
        }
        for (byte by = 0; by < list2.size(); by = (byte)(by + 1)) {
            aov_1[] aov_1Array = list2.get(by);
            boolean bl = true;
            boolean bl2 = false;
            int n = 0;
            int n2 = aov_1Array.length - 1;
            for (int n3 = 0; n3 < list.size(); n3 = (int)((byte)(n3 + 1))) {
                boolean bl3;
                if (n > n2) {
                    bl2 = true;
                    break;
                }
                aov_1 aov_12 = list.get(n3).t_();
                if (aov_1Array[n] == aov_1.d && aov_12 != aov_1.d) {
                    bl = false;
                    bl3 = true;
                    while (n3 < list.size()) {
                        if (aov_12 != aov_1.b) {
                            bl3 = false;
                            break;
                        }
                        n3 = (byte)(n3 + 1);
                    }
                    if (bl3) {
                        if (n != n2) {
                            bl2 = true;
                            break;
                        }
                        return by;
                    }
                    n3 = (byte)(n3 - 1);
                    n = (byte)(n + 1);
                    continue;
                }
                if (aov_1Array[n] == aov_1.e) {
                    bl = false;
                    bl3 = true;
                    while (n3 < list.size()) {
                        if (aov_12 != aov_1.a) {
                            bl3 = false;
                            break;
                        }
                        n3 = (byte)(n3 + 1);
                    }
                    if (bl3) {
                        if (n != n2) {
                            bl2 = true;
                            break;
                        }
                        return by;
                    }
                    n3 = (byte)(n3 - 1);
                    n = (byte)(n + 1);
                    continue;
                }
                if (aov_12 != aov_1Array[n]) {
                    bl2 = true;
                    break;
                }
                n = (byte)(n + 1);
            }
            if (bl2 || bl && list.size() != aov_1Array.length) continue;
            return by;
        }
        throw new aos_2(String.format("La fonction %s n'est pas utilis\u00e9e avec le bon nombre (ou type) d'arguments : %s", this.getClass().getName(), list.stream().map(aot_22 -> aot_22.t_().name()).collect(Collectors.toList())));
    }

    public abstract aov_1 t_();

    public abstract Enum c();
}

