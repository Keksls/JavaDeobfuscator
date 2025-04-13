/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.util.Arrays;
import java.util.Comparator;
import org.apache.log4j.Logger;

public class bjw
extends bjf_0<bjy_0> {
    static final Logger a = Logger.getLogger(bjw.class);
    private static final Comparator<? super bjy_0> d = new bjx();

    public bjy_0[] a() {
        bjy_0[] bjy_0Array = new bjy_0[this.b.size()];
        this.b.toArray(bjy_0Array);
        Arrays.sort(bjy_0Array, d);
        return bjy_0Array;
    }

    @Override
    protected void a(biI biI2, bjy_0 bjy_02) {
    }

    @Override
    public void a(bjy_0 bjy_02, bjy_0 bjy_03, biI biI2) {
        biI2.bI().aQ();
    }
}

