/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Function
 *  com.google.common.collect.Ordering
 */
import com.google.common.base.Function;
import com.google.common.collect.Ordering;

/*
 * Renamed from bjB
 */
public class bjb_0
extends bjf_0<bjd_0> {
    public bjd_0 a() {
        return (bjd_0)Ordering.natural().onResultOf((Function)bjC.a).max((Iterable)this.b);
    }

    @Override
    protected void a(biI biI2, bjd_0 bjd_02) {
    }

    @Override
    public void a(bjd_0 bjd_02, bjd_0 bjd_03, biI biI2) {
        biI2.bI().aQ();
    }
}

