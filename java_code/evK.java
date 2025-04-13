/*
 * Decompiled with CFR 0.152.
 */
import com.ankama.wakfu.utils.criterion.doc.Criterion;
import java.util.ArrayList;
import java.util.Optional;

@Criterion(description="Is there a protector in the current zone?")
public class evK
extends esf {
    @Deprecated
    public evK() {
    }

    public evK(ArrayList<aot_2> arrayList) {
        this.a(arrayList);
    }

    @Override
    public int a(Object object, Object object2, Object object3, Object object4) {
        Optional<fgv_0> optional = erQ.b(object, object2, object4, object3);
        return optional.map(arg_0 -> erQ.g.apply(arg_0)).orElse(false) != false ? 0 : -1;
    }

    @Override
    public Enum c() {
        return eyO.gz;
    }
}

