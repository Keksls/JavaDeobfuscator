/*
 * Decompiled with CFR 0.152.
 */
import java.util.Comparator;

/*
 * Renamed from box
 */
public class box_1
implements Comparator<efh_0> {
    public static final box_1 a = new box_1();

    public int a(efh_0 efh_02, efh_0 efh_03) {
        return efh_02.j() - efh_03.j();
    }

    @Override
    public /* synthetic */ int compare(Object object, Object object2) {
        return this.a((efh_0)object, (efh_0)object2);
    }
}

