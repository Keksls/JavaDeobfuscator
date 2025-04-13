/*
 * Decompiled with CFR 0.152.
 */
import java.util.Comparator;

/*
 * Renamed from fkX
 */
public class fkx_0
implements Comparator<fkw_0> {
    public static final fkx_0 a = new fkx_0();

    public int a(fkw_0 fkw_02, fkw_0 fkw_03) {
        return Short.compare(fkw_03.c(), fkw_02.c());
    }

    public static fkx_0 a() {
        return a;
    }

    @Override
    public /* synthetic */ int compare(Object object, Object object2) {
        return this.a((fkw_0)object, (fkw_0)object2);
    }
}

