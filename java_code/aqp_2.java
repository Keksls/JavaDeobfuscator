/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 */
import java.util.Iterator;
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from aqP
 */
public class aqp_2
extends aqo_2
implements Iterable<aqo_2> {
    private final aqo_2[] a;

    public aqp_2(String string, aqo_2 ... aqo_2Array) {
        super(string);
        this.a = aqo_2Array;
    }

    @Override
    @NotNull
    public Iterator<aqo_2> iterator() {
        return new aby_1<aqo_2>(this.a, false);
    }
}

