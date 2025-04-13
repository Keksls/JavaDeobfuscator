/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 */
import com.google.common.collect.Lists;
import java.util.List;

/*
 * Renamed from Fv
 */
public class fv_0
extends Ft {
    private final int[] b;

    public fv_0(int ... nArray) {
        this.b = (int[])nArray.clone();
    }

    @Override
    public final int a() {
        return this.b[this.a++];
    }

    @Override
    public List<Integer> b() {
        return Lists.newArrayList((Object[])Cg.a(this.b));
    }
}

