/*
 * Decompiled with CFR 0.152.
 */
import com.ankama.wakfu.utils.criterion.doc.Criterion;
import java.util.ArrayList;

@Criterion(description="Renvoie la position du caster")
public class eui
extends eyD {
    public eui(ArrayList<aot_2> arrayList) {
        this.a(arrayList);
    }

    @Override
    public boolean a() {
        return true;
    }

    @Override
    public long a(Object object, Object object2, Object object3, Object object4) {
        epq_2 epq_22 = object instanceof epq_2 ? (epq_2)object : (object2 instanceof epq_2 ? (epq_2)object2 : (object3 instanceof eyc_0 ? ((eyc_0)object3).b() : erQ.a(false, object, object2, object4, object3)));
        if (epq_22 == null) {
            throw new aob_1("On cherche la position dans un contexte sans Personnage");
        }
        return super.c(object, object2, object3, object4) * apb_2.a(epq_22.P_());
    }

    @Override
    public double b(Object object, Object object2, Object object3, Object object4) {
        return Double.longBitsToDouble(apb_2.a(((epq_2)object).P_()));
    }

    @Override
    public Enum c() {
        return eyO.G;
    }
}

