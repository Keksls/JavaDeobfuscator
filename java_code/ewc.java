/*
 * Decompiled with CFR 0.152.
 */
import com.ankama.wakfu.utils.criterion.doc.Criterion;
import com.ankama.wakfu.utils.criterion.doc.Parameter;
import com.ankama.wakfu.utils.criterion.doc.Signature;
import com.ankama.wakfu.utils.criterion.doc.VarType;
import java.util.ArrayList;

@Criterion(description="Renvoie true si le client possede deja le MM pass\u00e9 en parametre", signatures={@Signature(params={@Parameter(name="breedId", type=VarType.NUMBER)})})
public final class ewc
extends esf {
    private final long a;

    public ewc(ArrayList<aot_2> arrayList) {
        this.a(arrayList);
        this.a = ((aoq_1)arrayList.get(0)).a(null, null, null, null);
    }

    @Override
    public int a(Object object, Object object2, Object object3, Object object4) {
        eqq_1 eqq_12 = erQ.b(false, object, object2, object4, object3);
        if (!(eqq_12 instanceof epq_2)) {
            return -1;
        }
        epq_2 epq_22 = (epq_2)eqq_12;
        if (eBo.a.b(epq_22.U_(), (int)this.a)) {
            return 0;
        }
        return -1;
    }

    @Override
    public Enum c() {
        return eyO.fu;
    }

    public short b() {
        return (short)this.a;
    }
}

