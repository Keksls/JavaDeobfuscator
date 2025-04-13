/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Function
 *  com.google.common.collect.Lists
 */
import com.ankama.wakfu.utils.criterion.doc.Criterion;
import com.google.common.base.Function;
import com.google.common.collect.Lists;
import java.util.List;
import java.util.stream.Collectors;

/*
 * Renamed from aoU
 */
class aou_1
implements Function<Criterion, List<aov_1[]>> {
    aou_1() {
    }

    public List<aov_1[]> a(Criterion criterion) {
        return Lists.newArrayList((Object[])criterion.signatures()).stream().map(signature -> (aov_1[])Lists.newArrayList((Object[])signature.params()).stream().map(parameter -> aov_1.a(parameter.type())).toArray(aov_1[]::new)).collect(Collectors.toList());
    }

    public /* synthetic */ Object apply(Object object) {
        return this.a((Criterion)object);
    }
}

