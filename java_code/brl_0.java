/*
 * Decompiled with CFR 0.152.
 */
import java.util.Comparator;

/*
 * Renamed from bRL
 */
public class brl_0
implements Comparator<bNS> {
    private static final brl_0 a = new brl_0();

    public int a(bNS bNS2, bNS bNS3) {
        return bNS2.b() - bNS3.b();
    }

    @Override
    public /* synthetic */ int compare(Object object, Object object2) {
        return this.a((bNS)object, (bNS)object2);
    }
}

