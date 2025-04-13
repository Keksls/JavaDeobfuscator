/*
 * Decompiled with CFR 0.152.
 */
import com.ankama.wakfu.utils.criterion.doc.Criterion;
import java.util.ArrayList;

/*
 * Renamed from etL
 */
@Criterion(description="Retourne la position d'un IE")
public class etl_0
extends eyD {
    public etl_0(ArrayList<aot_2> arrayList) {
        this.a(arrayList);
    }

    @Override
    public boolean a() {
        return true;
    }

    @Override
    public long a(Object object, Object object2, Object object3, Object object4) {
        TG tG;
        if (object instanceof TG) {
            tG = (TG)object;
        } else if (object2 instanceof TG) {
            tG = (TG)object2;
        } else if (object3 instanceof eyL && ((eyL)object3).b() instanceof TG) {
            tG = (TG)((Object)((eyL)object3).b());
        } else {
            throw new aob_1("On cherche la position dans un contexte sans ie");
        }
        return super.c(object, object2, object3, object4) * apb_2.a(tG.P_());
    }

    @Override
    public double b(Object object, Object object2, Object object3, Object object4) {
        return Double.longBitsToDouble(apb_2.a(((epq_2)object).P_()));
    }

    @Override
    public Enum c() {
        return eyO.H;
    }
}

