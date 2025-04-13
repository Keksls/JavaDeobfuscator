/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 */
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from aod
 */
public abstract class aod_2
implements Iterable<aol_1> {
    protected final List<aol_1> a = new ArrayList<aol_1>();

    public void a(aol_1 aol_12) {
        this.a.add(aol_12);
    }

    @Override
    @NotNull
    public Iterator<aol_1> iterator() {
        return this.a.iterator();
    }

    public apy_1 a(String string) {
        for (aol_1 aol_12 : this.a) {
            if (!aol_12.a(string)) continue;
            return aol_12.b(string);
        }
        return null;
    }

    public abstract String a();
}

