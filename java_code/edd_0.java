/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
import java.util.ArrayList;
import java.util.Iterator;
import java.util.NoSuchElementException;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from eDD
 */
public class edd_0
implements Iterator<efh_0> {
    private final ArrayList<efh_0> a = new ArrayList();
    private int b;

    public edd_0(Iterator<efh_0> iterator) {
        this.a(iterator);
    }

    private void a(Iterator<efh_0> iterator) {
        while (iterator.hasNext()) {
            efh_0 efh_02 = iterator.next();
            if (this.a(efh_02)) {
                efh_0 efh_03 = this.a(efh_02.j());
                if (efh_03 != null) {
                    float[] fArray = efh_02.E();
                    float[] fArray2 = efh_03.E();
                    int n = fArray2.length;
                    for (int k = 0; k < n; k += 2) {
                        int n2 = k;
                        fArray2[n2] = fArray2[n2] + fArray[k];
                    }
                    continue;
                }
                this.a.add(efh_02.K());
                continue;
            }
            this.a.add(efh_02);
        }
    }

    @Nullable
    private efh_0 a(int n) {
        int n2 = this.a.size();
        for (int k = 0; k < n2; ++k) {
            efh_0 efh_02 = this.a.get(k);
            if (efh_02.j() != n) continue;
            return efh_02;
        }
        return null;
    }

    private boolean a(Sl sl) {
        ejh_0 ejh_02 = (ejh_0)efc_0.a().b(sl.j());
        return ejh_02 instanceof ege_0 || ejh_02 instanceof egf_0;
    }

    @Override
    public boolean hasNext() {
        return this.b < this.a.size();
    }

    public efh_0 a() {
        if (!this.hasNext()) {
            throw new NoSuchElementException("Il n'y a plus d'\u00e9l\u00e9ments");
        }
        return this.a.get(this.b++);
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException("Remove non support\u00e9");
    }

    @Override
    public /* synthetic */ Object next() {
        return this.a();
    }
}

