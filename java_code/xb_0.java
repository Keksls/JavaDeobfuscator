/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.map.hash.TIntObjectHashMap
 *  org.jetbrains.annotations.NotNull
 */
import gnu.trove.map.hash.TIntObjectHashMap;
import java.util.Iterator;
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from XB
 */
public class xb_0<O>
implements Iterable<xa_0<O>> {
    private final TIntObjectHashMap<xa_0<O>> a = new TIntObjectHashMap();

    public void a(xa_0<O> xa_02) {
        this.a.put(xa_02.a(), xa_02);
    }

    public final xa_0<O> a(int n) {
        return (xa_0)this.a.get(n);
    }

    public final O b(int n) {
        xa_0 xa_02 = (xa_0)this.a.get(n);
        if (xa_02 != null) {
            return (O)xa_02.b();
        }
        return null;
    }

    @Override
    @NotNull
    public Iterator<xa_0<O>> iterator() {
        return new aci_1<xa_0<O>>(this.a);
    }
}

