/*
 * Decompiled with CFR 0.152.
 */
import com.ankama.wakfu.utils.criterion.doc.Criterion;
import java.util.ArrayList;
import java.util.Optional;

/*
 * Renamed from euo
 */
@Criterion(description="Get the global protector satisfaction level (@see ProtectorSatisfactionLevel.java)")
public class euo_0
extends esi_0 {
    @Override
    public boolean a() {
        return true;
    }

    public euo_0(ArrayList<aot_2> arrayList) {
    }

    @Override
    public long a(Object object, Object object2, Object object3, Object object4) {
        Optional<fgv_0> optional = erQ.b(object, object2, object3, object4);
        Optional<fgk_0> optional2 = optional.map(arg_0 -> erQ.f.apply(arg_0)).map(arg_0 -> erQ.h.apply(arg_0));
        if (optional2.isEmpty()) {
            throw new aob_1("Unable to retrieve territory");
        }
        return this.e() * (long)optional2.get().a();
    }

    @Override
    public Enum c() {
        return eyO.bt;
    }
}

