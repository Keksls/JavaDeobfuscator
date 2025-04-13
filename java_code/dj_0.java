/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Function
 *  com.google.common.collect.Ordering
 *  org.jetbrains.annotations.NotNull
 */
import com.google.common.base.Function;
import com.google.common.collect.Ordering;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from Dj
 */
public class dj_0 {
    private int a = -1;
    private di_0[] b;

    public void a(di_0 ... di_0Array) {
        this.b = (di_0[])di_0Array.clone();
        this.a = di_0Array.length == 0 ? -1 : ((di_0)Ordering.natural().onResultOf(dj_0.c()).nullsFirst().max(Arrays.asList(this.b))).g();
    }

    public int a() {
        return this.a;
    }

    public List<di_0> b() {
        return Collections.unmodifiableList(Arrays.asList(this.b));
    }

    @NotNull
    private static Function<di_0, Integer> c() {
        return new dk_0();
    }
}

