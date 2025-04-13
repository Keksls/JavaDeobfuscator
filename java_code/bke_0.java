/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.Arrays;

/*
 * Renamed from bke
 */
public class bke_0
extends bjg_0 {
    final boolean a;
    final String[] b;

    public bke_0(efh_0 efh_02, boolean bl, String[] stringArray) {
        super(efh_02);
        this.a = bl;
        ArrayList<String> arrayList = new ArrayList<String>(stringArray.length);
        for (int k = 0; k < stringArray.length; ++k) {
            String[] stringArray2;
            for (String string : stringArray2 = atn_2.a(stringArray[k])) {
                if (arrayList.contains(string)) continue;
                arrayList.add(string);
            }
        }
        this.b = arrayList.toArray(new String[arrayList.size()]);
    }

    private bke_0(bke_0 bke_02) {
        super(bke_02.c);
        this.a = bke_02.a;
        this.b = bke_02.b;
    }

    public bke_0 a() {
        return new bke_0(this);
    }

    @Override
    public void a(biI biI2) {
        biI2.a(this.b, this.a);
        biI2.bJ();
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object == null || this.getClass() != object.getClass()) {
            return false;
        }
        if (!super.equals(object)) {
            return false;
        }
        bke_0 bke_02 = (bke_0)object;
        if (this.a != bke_02.a) {
            return false;
        }
        return Arrays.equals(this.b, bke_02.b);
    }

    @Override
    public int hashCode() {
        int n = super.hashCode();
        n = 31 * n + (this.a ? 1 : 0);
        n = 31 * n + (this.b != null ? Arrays.hashCode(this.b) : 0);
        return n;
    }

    public /* synthetic */ bjg_0 c() {
        return this.a();
    }
}

